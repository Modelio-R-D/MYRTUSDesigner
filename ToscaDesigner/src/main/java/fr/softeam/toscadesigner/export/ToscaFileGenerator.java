package fr.softeam.toscadesigner.export;

import java.io.FileWriter;
import java.io.IOException;
import com.github.jknack.handlebars.HandlebarsException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.context.log.ILogService;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("34a188dd-a4fd-4b07-ab9a-aeda3b967942")
class ToscaFileGenerator extends AbstractToscaFileGenerator {
    @objid ("48045226-6c10-4d8d-b4ab-1bc5f7e0c1bf")
    private static final String[] TOSCA_FILE_EXTENSIONS = { "*.tosca" };

    @objid ("579fba4a-cff8-4001-9c1d-6853cb3d9c51")
    private ILogService logger;

    @objid ("638eb07c-5695-466c-a724-282b4b9437f1")
    public  ToscaFileGenerator(ILogService logger) {
        this.logger = logger;
    }

    @objid ("018eb7f4-75dd-454b-a3d0-504cc4be82e3")
    @Override
    protected String getFileType() {
        return "TOSCA file";
    }

    @objid ("497dc83d-0f5a-4854-b84f-ba6864ba8dfc")
    @Override
    protected String[] getFileExtensions() {
        return TOSCA_FILE_EXTENSIONS;
    }

    @objid ("e067ea76-2788-40b0-bb1e-ac1edec52cba")
    @Override
    public void generateContent(MObject object) throws IOException {
        String filePath = saveToFile(getFileExtensions(), getFileType());
        if (filePath != null) {
            try (FileWriter fileWriter = new FileWriter(filePath)) {
                String content = renderTemplate(handlebars, object);
                fileWriter.write(content);
                MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Success",
                        getFileType() + " saved successfully");
            } catch (IOException ex) {
                logger.error(ex);
                MessageDialog.openError(Display.getCurrent().getActiveShell(), getFileType() + " export error",
                        ex.getLocalizedMessage());
            } catch (HandlebarsException ex) {
                logger.error(ex);
                MessageDialog.openError(Display.getCurrent().getActiveShell(), "Handlebars Error",
                        "An error occurred while rendering the Handlebars template: " + ex.getMessage());
            } catch (NullPointerException ex) {
                logger.error(ex);
                MessageDialog.openError(Display.getCurrent().getActiveShell(), "NullPointerException",
                        "A NullPointerException occurred. See log for details.");
            }
        }
    }

}
