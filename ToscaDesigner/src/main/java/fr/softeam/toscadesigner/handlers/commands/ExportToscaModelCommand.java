package fr.softeam.toscadesigner.handlers.commands;

import java.io.IOException;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.export.AbstractToscaFileGenerator;
import fr.softeam.toscadesigner.export.NodeTypeChecker;
import fr.softeam.toscadesigner.export.TopologyTemplateChecker;
import fr.softeam.toscadesigner.export.ToscaModelChecker;
import fr.softeam.toscadesigner.export.ToscaObjectTypeChecker;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.api.module.context.log.ILogService;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("2d92cb62-7c2c-4018-a6c4-9827e6fce96d")
public class ExportToscaModelCommand extends DefaultModuleCommandHandler {
    @objid ("a70d26bf-fbd4-4a6f-b63c-1111d4cae85e")
    private ILogService logger;

    @objid ("e1e45886-a5ca-425e-a51b-dae8b2632629")
    private final ToscaObjectTypeChecker[] checkers = { new ToscaModelChecker(), new NodeTypeChecker(),
    			new TopologyTemplateChecker() };

    @objid ("0344fafe-de20-40fe-b77b-225c67cfd682")
    @Override
    public void actionPerformed(List<MObject> selectedObjects, IModule module) {
        IModuleContext moduleContext = module.getModuleContext();
        logger = moduleContext.getLogService();
        if (selectedObjects == null || selectedObjects.isEmpty()) {
            logger.error("No objects selected");
            MessageDialog.openError(Display.getCurrent().getActiveShell(), "Error", "No objects selected");
            return;
        }
        if (selectedObjects.size() > 1) {
            logger.error("Multiple objects selected");
            MessageDialog.openError(Display.getCurrent().getActiveShell(), "Error",
                    "Select only one: TOSCA model, node type, or topology template");
            return;
        }
        
        MObject object = selectedObjects.get(0);
        AbstractToscaFileGenerator generator = null;
        for (ToscaObjectTypeChecker checker : checkers) {
            if (checker.isTypeOf(object)) {
                generator = checker.createGenerator(logger); // Choose appropriate generator based on type
                break;
            }
        }
        
        if (generator != null) {
            try {
                generator.generateContent(object);
            } catch (IOException e) {
                logger.error(e);
                MessageDialog.openError(Display.getCurrent().getActiveShell(), "Error",
                        "Generation unfortunately failed");
                return;
            }
        } else {
            logger.error("No suitable generator found");
            MessageDialog.openError(Display.getCurrent().getActiveShell(), "Error",
                    "Generation unfortunately failed, no suitable generator found ");
            return;
        }
    }

}
