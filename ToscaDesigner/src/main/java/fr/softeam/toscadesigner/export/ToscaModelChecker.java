package fr.softeam.toscadesigner.export;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;
import fr.softeam.toscadesigner.api.tosca.standard.package_.ToscaModel;
import org.modelio.api.module.context.log.ILogService;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("fa654dcc-b744-475b-b125-699f9be474de")
public class ToscaModelChecker implements ToscaObjectTypeChecker {
    @objid ("6a15a6e6-a185-400a-a00b-1b60665bf1a1")
    @Override
    public boolean isTypeOf(MObject object) {
        if(!(object instanceof ModelElement)) {
            return false;
        }
        ModelElement element = (ModelElement) object;
        return element.isStereotyped(IToscaDesignerPeerModule.MODULE_NAME, ToscaModel.STEREOTYPE_NAME);
    }

    @objid ("88cdbfca-34c0-4f2c-a2a4-2ce603c3e2a6")
    @Override
    public AbstractToscaFileGenerator createGenerator(ILogService logger) {
        return new CsarFileGenerator(logger);
    }

}
