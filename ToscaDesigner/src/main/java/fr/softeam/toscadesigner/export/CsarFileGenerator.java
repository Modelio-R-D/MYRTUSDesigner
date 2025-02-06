package fr.softeam.toscadesigner.export;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import com.github.jknack.handlebars.HandlebarsException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.context.log.ILogService;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("77990813-b66d-447d-a282-bb148209c99d")
public class CsarFileGenerator extends AbstractToscaFileGenerator {
    @objid ("7d050698-df5c-4ac2-9011-7183bcea36a8")
    private static final String[] CSAR_FILE_EXTENSIONS = { "*.csar" };

    @objid ("76eb0b74-53cd-41a8-8630-2626778af535")
    private ILogService logger;

    @objid ("7096b6a5-1914-4f3e-bbb6-1ad7fe5b1824")
    public  CsarFileGenerator(ILogService logger) {
        this.logger = logger;
    }

    @objid ("7a7df070-6d55-451a-bb0a-e54b870beba7")
    @Override
    protected String[] getFileExtensions() {
        return CSAR_FILE_EXTENSIONS;
    }

    @objid ("23744444-6e39-482b-99ae-dbc7c6c63e42")
    @Override
    public void generateContent(MObject toscaModel) throws IOException {
        try {
            String filePath = saveToFile(CSAR_FILE_EXTENSIONS, "CSAR file");
        
            if (filePath != null) {
                try (FileOutputStream fos = new FileOutputStream(filePath);
                        ZipOutputStream zos = new ZipOutputStream(fos)) {
        
                    // Create _definitions directory
                    zos.putNextEntry(new ZipEntry("_definitions/"));
                    zos.closeEntry();
        
                    // Create nodetypes directory
                    zos.putNextEntry(new ZipEntry("nodetypes/"));
                    zos.closeEntry();
        
                    // Create servicetemplates directory
                    zos.putNextEntry(new ZipEntry("servicetemplates/"));
                    zos.closeEntry();
        
                    // Create TOSCA-Metadata directory
                    zos.putNextEntry(new ZipEntry("TOSCA-Metadata/"));
                    zos.closeEntry();
        
                    // Add TOSCA-Metadata content
                    addToscaMetadata(zos);
        
                    // Add content to other directories
                    addDefinitions(zos, toscaModel);
                    addNodeTypes(zos, toscaModel);
                    addServiceTemplates(zos, toscaModel);
        
                    MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Success",
                            "CSAR file generated successfully");
                }
            }
        } catch (IOException e) {
            logger.error(e);
            MessageDialog.openError(Display.getCurrent().getActiveShell(), "CSAR export error",
                    e.getLocalizedMessage());
        } catch (HandlebarsException ex) {
               logger.error(ex);
               MessageDialog.openError(Display.getCurrent().getActiveShell(), "Handlebars Error",
                       "An error occurred while rendering the Handlebars template: " + ex.getMessage());
           } catch (NullPointerException ex) {
               logger.error(ex);
               MessageDialog.openError(Display.getCurrent().getActiveShell(), "NullPointerException",
                       ex.getStackTrace().toString());
           }
    }

    @objid ("f4f6cc32-dff9-4640-8232-07c4e91b2beb")
    private void addToscaMetadata(ZipOutputStream zos) throws IOException {
        ZipEntry entry = new ZipEntry("TOSCA-Metadata/TOSCA.meta");
        zos.putNextEntry(entry);
        String metadataContent = "TOSCA-Meta-File-Version: 1.0\n" + "CSAR-Version: 1.1\n"
                + "Created-By: Modelio MYRTUS TOSCA Designer\n" + "Entry-Definitions: _definitions/\n";
        zos.write(metadataContent.getBytes());
        zos.closeEntry();
    }

    @objid ("815501ca-49b4-49ed-b611-838258d5f448")
    private void addDefinitions(ZipOutputStream zos, MObject toscaModel) throws IOException {
        if (!(toscaModel instanceof ModelTree)) {
            logger.error("toscaModel is not an instance of ModelTree");
            return;
        }
        
        ModelTree modelPackage = (ModelTree) toscaModel;
        
        for (MObject element : modelPackage.getCompositionChildren()) {
            if (new NodeTypeChecker().isTypeOf(element) ||
                    new TopologyTemplateChecker().isTypeOf(element)) {
                String toscaContent = renderTemplate(handlebars, element);
                String fileName = element.getName() + ".tosca";
        
                ZipEntry entry = new ZipEntry("_definitions/" + fileName);
                zos.putNextEntry(entry);
                zos.write(toscaContent.getBytes());
                zos.closeEntry();
            }
        }
    }

    @objid ("4c0c4650-0b8e-4aa9-ba1c-75439209f272")
    private void addNodeTypes(ZipOutputStream zos, MObject toscaModel) throws IOException {
        // Implement logic to add node type files
        // @Juan in the TNO example there are only icons in this part of the file
    }

    @objid ("2832f651-f600-4595-b8a8-8b269020dd99")
    private void addServiceTemplates(ZipOutputStream zos, MObject toscaModel) throws IOException {
        // Implement logic to add service template files
        // @Juan in the TNO example there is only an NGIX configuration file
    }

    @objid ("3371ab1f-94ac-4902-a910-a37ccf6d97c0")
    @Override
    protected String getFileType() {
        return "CSAR file";
    }

}
