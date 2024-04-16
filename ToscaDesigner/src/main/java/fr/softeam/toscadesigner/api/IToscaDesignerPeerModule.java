package fr.softeam.toscadesigner.api;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IPeerModule;

@objid ("745e8552-1434-4a52-bbdb-a48099286cb1")
public interface IToscaDesignerPeerModule extends IPeerModule {
    @objid ("d8c00e1c-5e3d-46d0-8c79-bb999667b16d")
    public static final String MODULE_NAME = "ToscaDesigner";

    @objid ("4241d814-168c-43ef-8e0c-0f4c92a4d326")
    public static final String TOSCA_STYLE = "ToscaStyle";
}

