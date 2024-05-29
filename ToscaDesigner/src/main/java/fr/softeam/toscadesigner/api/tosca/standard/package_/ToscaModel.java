/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/04/2024 10:28 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.api.module.MManualAssociationRole;
import com.modeliosoft.modelio.api.module.MManualAttribute;
import com.modeliosoft.modelio.api.module.MManualClass;
import com.modeliosoft.modelio.api.module.MManualImport;
import com.modeliosoft.modelio.api.module.MManualOperation;
import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import com.modeliosoft.modelio.api.module.mda.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.ToscaDesignerProxyFactory;
import fr.softeam.toscadesigner.impl.ToscaDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ModelingSessionRegistry;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Package} with << ToscaModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("5ecc2abf-2512-4f7c-b942-44ddd060ebdf")
public class ToscaModel implements IMdaProxy {
    @objid ("ae8f94d9-9f18-4a45-94ee-9bb8af691059")
    public static final String STEREOTYPE_NAME = "ToscaModel";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     * 
     */
    @objid ("54aadc07-f390-439d-b899-99f4bce21ee4")
    protected final Package elt;

    /**
     * Tells whether a {@link ToscaModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ToscaModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("28f3295f-1de8-4d66-a8cf-c3b779392497")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && (ToscaModel.MdaTypes.STEREOTYPE_ELT!=null) && ((Package) elt).isStereotyped(ToscaModel.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Package} stereotyped << ToscaModel >> then instantiate a {@link ToscaModel} proxy.
     * @return a {@link ToscaModel} proxy on the created {@link Package}.
     */
    @objid ("1f916d6c-fef3-468f-bc97-b6e0b2a8dbfd")
    public static ToscaModel create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Package");
        e.getExtension().add(ToscaModel.MdaTypes.STEREOTYPE_ELT);
        return ToscaModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link ToscaModel} proxy from a {@link Package} stereotyped << ToscaModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link ToscaModel} proxy or <i>null</i>.
     */
    @objid ("da47f75d-d263-4bcd-a28f-f1bfffa80f11")
    public static ToscaModel instantiate(final Package obj) {
        return ToscaModel.canInstantiate(obj) ? new ToscaModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ToscaModel} proxy from a {@link Package} stereotyped << ToscaModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link ToscaModel} proxy.
     */
    @objid ("3f2ee73e-1f36-4f4c-bd19-ce5eccbbb98d")
    public static ToscaModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (ToscaModel.canInstantiate(obj))
            return new ToscaModel(obj);
        else
            throw new IllegalArgumentException("ToscaModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("030190a6-22b6-4ad3-b39c-7a33a71eb9c3")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ToscaModel other = (ToscaModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}.
     * @return the Package represented by this proxy, never null.
     */
    @objid ("923b3f57-8211-4ffa-b817-0d8995b45574")
    public Package getElement() {
        return this.elt;
    }

    @objid ("e8a798f0-4271-47d6-b8ab-9c79003ee538")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("432ab3e0-1207-4299-8559-e0affd23b105")
    protected  ToscaModel(final Package elt) {
        this.elt = elt;
    }

    @objid ("661ddf51-fe32-44c4-bf2f-6ebbc8505a2c")
    public void setDefaultName(String name) {
        ToscaDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(this.elt, name);
    }

    @objid ("9dcc9f93-e85a-40a6-84d0-3d2146180ae9")
    public String getName() {
        return this.elt.getName();
    }

    @objid ("a57ed0da-bf2f-434a-9c59-9e6f7485cbbc")
    public static final class MdaTypes {
        @objid ("9ef0cf16-cd7c-4631-8269-acb49c0fb77d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4f0675b9-a19b-4134-a12d-d9bcb92cc28a")
        private static Stereotype MDAASSOCDEP;

        @objid ("cd7ed809-d3c8-416f-9b97-2fac78506d33")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e624cf23-a062-4d80-a5a3-516ac6978bba")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "20565008-115d-4fad-800f-134ab276f611", "ToscaModel");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(Stereotype.MQNAME, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e", "MDAAssocDep");
            MDAASSOCDEP = (Stereotype) session.findByRef(mRef);
            if (MDAASSOCDEP==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd", "MDAAssocDepRole");
            MDAASSOCDEP_ROLE = (TagType) session.findByRef(mRef);
            if (MDAASSOCDEP_ROLE==null) missingRefs.add(mRef);
            
            if (! missingRefs.isEmpty()) throw new MdaProxyException(MdaProxyException.MdaProxyExceptionReason.MISSING_MDA_ELEMENT, missingRefs);
        }

    }

}
