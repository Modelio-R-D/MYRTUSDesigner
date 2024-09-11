package fr.softeam.toscadesigner.api;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IPeerModule;

@objid ("5c7f53bd-3f13-46f6-844a-597e7d912a8f")
public interface IToscaDesignerPeerModule extends IPeerModule {
    @objid ("9d3d705b-21b6-4f57-9c6c-5547875049c5")
    public static final String MODULE_NAME = "ToscaDesigner";

    @objid ("35d4cbd5-1a65-4c86-abf7-07c1dcfecf0e")
    public static final String TOSCA_STYLE = "ToscaStyle";
}

