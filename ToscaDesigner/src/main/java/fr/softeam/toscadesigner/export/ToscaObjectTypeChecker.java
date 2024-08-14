package fr.softeam.toscadesigner.export;

import org.modelio.api.module.context.log.ILogService;
import org.modelio.vcore.smkernel.mapi.MObject;

public interface ToscaObjectTypeChecker {
	  boolean isTypeOf(MObject object);

	AbstractToscaFileGenerator createGenerator(ILogService logger);


}
