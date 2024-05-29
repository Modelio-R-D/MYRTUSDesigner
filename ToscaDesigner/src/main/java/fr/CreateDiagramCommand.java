package fr;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.standard.DiagramCreationStandardHandler;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("ee94dac7-85af-4f31-8bc3-9e641d3a1704")
public class CreateDiagramCommand extends DiagramCreationStandardHandler {
    @objid ("07055804-ffef-4f0d-ab2e-029516cf4101")
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        // Generated call to the super method will check the scope conditions defined in Studio.
        // Do not remove this call unless you need to take full control on the checks to be carried out.
        // However you can safely extends the checked conditions by adding custom code.
        if (super.accept(selectedElements, module) == false) {
            return false;
        }
        return true;
    }

    @objid ("58c4ec31-1102-4bef-a120-2e38990c47b6")
    @Override
    protected void postConfigureElement(final MObject newDiagram, final IModule module) {
        // This method is a hook called once the element is created and configured and before the transaction is committed.
        // The super method applies the diagram style and open the diagram is needed and should be first called in most cases.
        // Sub classes may redefine this method to make additional modifications.
        
        // Call the super method to apply the diagram style and open the diagram if asked for.
        super.postConfigureElement(newDiagram, module);
        
        // TODO Add additional behavior below
    }

}
