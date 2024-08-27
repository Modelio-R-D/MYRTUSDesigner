package fr.softeam.toscadesigner.handlers.commands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.standard.DiagramCreationStandardHandler;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("3f96b675-50dd-40ba-9977-16d6cf5453a6")
public class CreateDiagramCommand extends DiagramCreationStandardHandler {
    @objid ("4eeca7f2-703f-4167-bce1-a39d8a40b41e")
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        // Generated call to the super method will check the scope conditions defined in
        // Studio.
        // Do not remove this call unless you need to take full control on the checks to
        // be carried out.
        // However you can safely extends the checked conditions by adding custom code.
        if (super.accept(selectedElements, module) == false) {
            return false;
        }
        return true;
    }

    @objid ("59754ec2-6f67-4186-8ef6-a6ab7d4e44d8")
    @Override
    protected void postConfigureElement(final MObject newDiagram, final IModule module) {
        // This method is a hook called once the element is created and configured and
        // before the transaction is committed.
        // The super method applies the diagram style and open the diagram is needed and
        // should be first called in most cases.
        // Sub classes may redefine this method to make additional modifications.
        
        // Call the super method to apply the diagram style and open the diagram if
        // asked for.
        super.postConfigureElement(newDiagram, module);
        if (newDiagram instanceof AbstractDiagram) {
            AbstractDiagram diagram = (AbstractDiagram) newDiagram;
        
            IModuleContext moduleContext = module.getModuleContext();
            // moduleContext.getModelingSession().getModel().getDefaultNameService().setDefaultName(diagram,
            // diagram.getOrigin().getName() + " diagram");
            moduleContext.getModelioServices().getEditionService().openEditor(diagram);
        }
        // TODO Add additional behavior below
    }

}
