package fr.softeam.toscadesigner.export;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType;
import org.modelio.api.module.context.log.ILogService;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("c425a235-6412-4fb2-928a-a17a5d0760e1")
public class NodeTypeChecker implements ToscaObjectTypeChecker {
    @objid ("c6c72e70-0564-4426-a3f8-621492b641d1")
    @Override
    public boolean isTypeOf(MObject object) {
        if(!(object instanceof ModelElement)) {
            return false;
        }
        ModelElement element = (ModelElement) object;
        return element.isStereotyped(IToscaDesignerPeerModule.MODULE_NAME, TNodeType.STEREOTYPE_NAME);
    }

    @objid ("939e69a5-f927-4f1b-94db-72d98f42697e")
    @Override
    public AbstractToscaFileGenerator createGenerator(ILogService logger) {
        return new ToscaFileGenerator(logger);
    }

}
