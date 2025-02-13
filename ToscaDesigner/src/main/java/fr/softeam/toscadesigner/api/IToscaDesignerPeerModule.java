package fr.softeam.toscadesigner.api;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IPeerModule;

@objid ("1dc24328-a397-490e-9df9-150f7b3f742f")
public interface IToscaDesignerPeerModule extends IPeerModule {
    @objid ("f937c7da-40c3-478c-b588-74b666fcecd9")
    public static final String MODULE_NAME = "ToscaDesigner";

    @objid ("bbeb78ba-dc64-4ac1-9085-5a559e18d7ca")
    public static final String TOSCA_STYLE = "ToscaStyle";
}

