package fr.softeam.toscadesigner.handlers.commands;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MObject;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Helper;
import com.github.jknack.handlebars.Options;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.io.ClassPathTemplateLoader;

public class ExportToscaModelCommand extends DefaultModuleCommandHandler {

    private final String templatesPath = "/fr/softeam/templates/";

    @Override
    public void actionPerformed(List<MObject> selectedObjects, IModule module) {
        Handlebars handlebars = new Handlebars(new ClassPathTemplateLoader(templatesPath, ".hbs"));
       // handlebars.setInfiniteLoops(true);
        handlebars.setPrettyPrint(true);
        handlebars.registerHelper("getProperty", new Helper<ModelElement>() {
            @Override
            public Object apply(ModelElement context, Options options) throws IOException {
                Stereotype tEntityTypeStereotype = context.getExtension().get(0).getParent();
                String derivedFrom = context.getProperty(tEntityTypeStereotype, (String) options.params[0]);
                return derivedFrom;
            }
        });

        try (StringWriter writer = new StringWriter()) {
            Template mainTemplate = handlebars.compile("_mainTemplate");

            mainTemplate.apply(selectedObjects.get(0), writer);

            FileDialog fileDialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.SAVE);
            fileDialog.setFilterExtensions(new String[]{"*.tosca"}); // Optional filter

            String filePath = fileDialog.open();
            if (filePath != null) {

                try (FileWriter fileWriter = new FileWriter(filePath)) {
                    fileWriter.write(writer.toString());

                    // Handle success or show a message dialog
                } catch (IOException ex) {
                    ex.printStackTrace();
                    MessageDialog.openError(Display.getCurrent().getActiveShell(), "TOSCA export error", ex.getLocalizedMessage() + '\n' + ex.toString());

                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static String renderTemplate(Object data, String templateContent) throws IOException {
        Handlebars handlebars = new Handlebars();
        Template template = handlebars.compileInline(templateContent);
        try (StringWriter writer = new StringWriter()) {

            template.apply(data, writer);
            return writer.toString();
        }

    }

    public static void main(String[] args) throws IOException {
        // Example usage
        MyObject data = new MyObject("John Doe", 30);
        String templateContent = "{{name}} is {{age}} years old.";

        String result = renderTemplate(data, templateContent);
        System.out.println(result); // Output: John Doe is 30 years old.

    }

    static class MyObject {

        String name;
        int age;

        public MyObject(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }
    }

}
