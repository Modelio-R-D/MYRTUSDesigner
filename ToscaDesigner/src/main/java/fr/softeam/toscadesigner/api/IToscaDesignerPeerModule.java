package fr.softeam.toscadesigner.api;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IPeerModule;

@objid ("74e6670d-6815-4830-a3a6-9bf0d327b10e")
public interface IToscaDesignerPeerModule extends IPeerModule {
    @objid ("9a1e43b5-4c1f-4d75-bf5c-3da290150f48")
    public static final String MODULE_NAME = "ToscaDesigner";

    @objid ("c95d056d-f16a-4546-b993-9a30c980c996")
    public static final String TOSCA_STYLE = "ToscaStyle";
}

