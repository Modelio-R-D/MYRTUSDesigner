import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.standard.DiagramCreationStandardHandler;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("5907998c-bfb4-4619-853a-38bfb03ae5ef")
public class  CreateDiagramCommand extends DiagramCreationStandardHandler {
    @objid ("3d5304a6-ce22-4e3d-95b3-4ffa78aafc2c")
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

    @objid ("0835ecb8-2f91-44d6-a2c2-c19a136d2baf")
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
