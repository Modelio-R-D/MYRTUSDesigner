package fr.softeam.toscadesigner.impl;

import org.modelio.api.module.IPeerModule;
import org.modelio.api.module.context.configuration.IModuleAPIConfiguration;
import org.modelio.vbasic.version.Version;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("45eae62e-3ca2-4147-9843-7b75b7385a28")
public class ToscaDesignerPeerModule implements IPeerModule {
    @objid ("bf494723-b984-4e79-8900-554994e525d1")
    private IModuleAPIConfiguration peerConfiguration;

    @objid ("44fa402b-3a30-4cac-819f-ea72f30a5a29")
    private ToscaDesignerModule module = null;

    @objid ("b124a821-5687-4b82-996e-370fc7729547")
    public  ToscaDesignerPeerModule(final ToscaDesignerModule module, final IModuleAPIConfiguration peerConfiguration) {
        this.module = module;
        this.peerConfiguration = peerConfiguration;
    }

    @objid ("19af3b88-c744-4496-a320-ed4d82c56baf")
    public IModuleAPIConfiguration getConfiguration() {
        return this.peerConfiguration;
    }

    @objid ("3eb8c31d-f243-4773-a48d-2a85a7666475")
    public String getDescription() {
        return this.module.getDescription();
    }

    @objid ("fa7e2794-6683-4a48-9ff0-8f5f2d7d7b0a")
    public String getName() {
        return this.module.getName();
    }

    @objid ("97387ee1-f3a4-432d-bf1d-6f7664be8d89")
    public Version getVersion() {
        return this.module.getVersion();
    }

    @objid ("9cfeab48-5bcd-4c80-abfd-b551f7d6a39d")
    void init() {
        
    }

}
