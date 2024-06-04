package fr.softeam.toscadesigner.api;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IPeerModule;

@objid ("105df991-0621-4bda-aa85-b8dd3a5595d8")
public interface IToscaDesignerPeerModule extends IPeerModule {
    @objid ("3a68a8c0-4049-43a0-bf59-ce7c4b348f9b")
    public static final String MODULE_NAME = "ToscaDesigner";

    @objid ("de1cfebb-0162-472f-a6e6-c2c50320d325")
    public static final String TOSCA_STYLE = "ToscaStyle";
}

