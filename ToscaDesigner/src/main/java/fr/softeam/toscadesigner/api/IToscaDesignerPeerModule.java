package fr.softeam.toscadesigner.api;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IPeerModule;

@objid ("fe7b5563-5ea7-4747-aa28-f7ff8df6e5a3")
public interface IToscaDesignerPeerModule extends IPeerModule {
    @objid ("4529ac2e-7f87-48db-a68b-049c08512402")
    public static final String MODULE_NAME = "ToscaDesigner";

    @objid ("c4f2df2a-3e56-43ae-abac-aa53c666605c")
    public static final String TOSCA_STYLE = "ToscaStyle";
}

