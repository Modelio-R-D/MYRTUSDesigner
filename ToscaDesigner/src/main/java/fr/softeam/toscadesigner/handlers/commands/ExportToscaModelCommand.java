package fr.softeam.toscadesigner.handlers.commands;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.vcore.smkernel.mapi.MObject;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;

public class ExportToscaModelCommand extends DefaultModuleCommandHandler {

    @Override
    public void actionPerformed(List<MObject> selectedObjects, IModule module) {
        Handlebars handlebars = new Handlebars();
        MyObject data = new MyObject("John Doe", 30);
        String templateContent = "{{name}} is {{age}} years old.";
        try (StringWriter writer = new StringWriter()) {
            Template template = handlebars.compileInline(templateContent);

            template.apply(selectedObjects.get(0), writer);
            
            FileDialog fileDialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.SAVE);
            fileDialog.setFilterExtensions(new String[]{"*.tosca"}); // Optional filter
            
            String filePath = fileDialog.open();
            if (filePath != null) {
                
                    try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(writer.toString());
        
                    // Handle success or show a message dialog
                } catch (IOException ex) {
                    // Handle error or show an error message dialog
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
    
        public String getName(){
            return name;
        }
    
        public Integer getAge(){
            return age;
        }
    }

}
