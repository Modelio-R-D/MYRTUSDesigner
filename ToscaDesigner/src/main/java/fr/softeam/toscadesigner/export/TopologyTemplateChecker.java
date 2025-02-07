package fr.softeam.toscadesigner.export;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;
import fr.softeam.toscadesigner.api.tosca.standard.package_.TTopologyTemplate;
import org.modelio.api.module.context.log.ILogService;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("47e8d2e9-9e69-402e-b7c6-7e4acd3876e9")
public class TopologyTemplateChecker implements ToscaObjectTypeChecker {
    @objid ("6e72b82b-fa50-442d-9f74-4032835b6000")
    @Override
    public boolean isTypeOf(MObject object) {
        if(!(object instanceof ModelElement)) {
            return false;
        }
        ModelElement element = (ModelElement) object;
        return element.isStereotyped(IToscaDesignerPeerModule.MODULE_NAME, TTopologyTemplate.STEREOTYPE_NAME);
    }

    @objid ("afbd66ba-520d-48d2-8544-2155c773d941")
    @Override
    public AbstractToscaFileGenerator createGenerator(ILogService logger) {
        return new ToscaFileGenerator(logger);
    }

}
