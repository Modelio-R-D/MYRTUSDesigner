package fr.softeam.toscadesigner.impl;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.AbstractJavaModule;
import org.modelio.api.module.IPeerModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.api.module.lifecycle.IModuleLifeCycleHandler;
import org.modelio.api.module.mda.IMdaExpert;
import org.modelio.api.module.parameter.IParameterEditionModel;
import org.modelio.metamodel.uml.infrastructure.Stereotype;

@objid ("76d0c540-ed36-4597-90ed-7c8f8ec4c1c5")
public class ToscaDesignerModule extends AbstractJavaModule {
    @objid ("b3e03ba1-58e4-433b-91ff-d9eed70a9321")
    private static final String MODULE_IMAGE = "/res/icon/module.png";

    @objid ("4d4cb946-fff0-47ee-b769-d5f6ca8b03b9")
    private ToscaDesignerPeerModule peerModule = null;

    @objid ("7857e3be-57db-43d1-b9c1-ffe4d557f87f")
    private ToscaDesignerLifeCycleHandler lifeCycleHandler = null;

    @objid ("6665e3a9-1b85-47f3-9465-84b50ef8b69e")
    private static ToscaDesignerModule instance;

    @objid ("19461964-2849-462e-bf2d-20791e2a6929")
    public  ToscaDesignerModule(final IModuleContext moduleContext) {
        super(moduleContext);
        
        ToscaDesignerModule.instance = this;
        
        this.lifeCycleHandler  = new ToscaDesignerLifeCycleHandler(this);
        this.peerModule = new ToscaDesignerPeerModule(this, moduleContext.getPeerConfiguration());
        init();
    }

    @objid ("5dfbd4a2-782f-43bc-bc16-19bd9631c95e")
    @Override
    public IPeerModule getPeerModule() {
        return this.peerModule;
    }

    /**
     * Return the LifeCycleHandler  attached to the current module. This handler is used to manage the module lifecycle by declaring the desired implementation for the start, select... methods.
     */
    @objid ("38c7cf26-e3f9-42c8-9985-80458a13e98c")
    @Override
    public IModuleLifeCycleHandler getLifeCycleHandler() {
        return this.lifeCycleHandler;
    }

    /**
     * Method automatically called just after the creation of the module. The module is automatically instanciated at the beginning
     * of the MDA lifecycle and constructor implementation is not accessible to the module developer. The <code>init</code> method
     * allows the developer to execute the desired initialization.
     */
    @objid ("0e13fa12-0441-4bb9-91ee-3b33f8938251")
    @Override
    public IParameterEditionModel getParametersEditionModel() {
        return super.getParametersEditionModel();
    }

    @objid ("65a211ef-2783-475b-af22-7cab6db49d25")
    @Override
    public String getModuleImagePath() {
        return ToscaDesignerModule.MODULE_IMAGE;
    }

    @objid ("20b1ec13-c776-4ad6-8541-5ff15476afbf")
    public static ToscaDesignerModule getInstance() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return instance;
    }

    @objid ("71801523-eeb6-48a5-83d0-a9f7e16e435a")
    @Override
    public IMdaExpert getMdaExpert(final Stereotype st) {
        // Generated code, please do not remove it
        IMdaExpert expert = getGeneratedMdaExpert(st);
        if (expert != null) {
            return expert;
        }// End generated code
        return null;
    }

    /**
     * Generated expert looking for a MDA expert in the generated MDA API.
     * @param st a stereotype owned by the current module.
     * @return a MDA expert belonging to the MDA API or <code>null</code>.
     */
    @objid ("a46b8dae-28ae-4eba-aaed-6b65d095530f")
    private IMdaExpert getGeneratedMdaExpert(final Stereotype st) {
        switch (st.getUuid()) {
        	default: return null;
        }
    }

}
