package fr.softeam.toscadesigner.export;

import org.modelio.api.module.context.log.ILogService;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MObject;

import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;
import fr.softeam.toscadesigner.api.tosca.standard.package_.ToscaModel;

public class ToscaModelChecker implements ToscaObjectTypeChecker {
	@Override
	public boolean isTypeOf(MObject object) {
		if(!(object instanceof ModelElement)) {
			return false;
		}
		ModelElement element = (ModelElement) object;
		return element.isStereotyped(IToscaDesignerPeerModule.MODULE_NAME, ToscaModel.STEREOTYPE_NAME);
	}
	
	@Override
	public AbstractToscaFileGenerator createGenerator(ILogService logger) {
		
		return new CsarFileGenerator(logger);
	}
}