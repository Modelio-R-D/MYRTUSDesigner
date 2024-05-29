package fr.softeam.toscadesigner.handlers.commands.submodel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.standard.ElementCreationStandardHandler;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("56da9175-5d1e-4e5a-8786-0e169b72b789")
public class CreateToscaModelCommand extends ElementCreationStandardHandler {
    @objid ("8aeeb78c-e6fc-4b2d-949f-660307e63921")
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

    @objid ("4055bd7f-341b-483d-93c6-1c776e7085a7")
    @Override
    protected void postConfigureElement(final MObject newElement, final IModule module) {
        // This method is a hook called once the element is created and configured and before the transaction is committed.
        // The super method should be first called in most cases.
        // Sub classes may redefine this method to make additional modifications.
        
        // Call the super method
        super.postConfigureElement(newElement, module);
        
        // TODO Add additional behavior below
    }

}
