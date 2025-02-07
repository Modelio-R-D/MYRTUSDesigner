package fr.softeam.toscadesigner.export;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.context.log.ILogService;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("3355ecad-1c29-4bf5-a867-77eaa7921422")
public interface ToscaObjectTypeChecker {
    @objid ("a072dc24-a50f-4bff-b3d3-50288159b87d")
    boolean isTypeOf(MObject object);

    @objid ("5dbeb04f-6ef9-4198-a89d-f89b91813858")
    AbstractToscaFileGenerator createGenerator(ILogService logger);
}

