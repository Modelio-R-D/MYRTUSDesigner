/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/04/2024 10:28 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Class} with << InstanceStateType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b3d52380-7760-478a-ae4b-701cedf5aa04")
public class InstanceStateType implements IMdaProxy {
    @objid ("28870415-8725-46cc-a37a-2e6bca658b2a")
    public static final String STEREOTYPE_NAME = "InstanceStateType";

    @objid ("bd63413e-a5de-45eb-9f7d-4a4df840af05")
    public static final String STATE_TAGTYPE = "state";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("23ecd873-efea-4b47-a96c-b466baa3ac94")
    protected final Class elt;

    /**
     * Tells whether a {@link InstanceStateType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << InstanceStateType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("74bd6ac6-c82a-4fc2-ace1-e4dea4000d07")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (InstanceStateType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(InstanceStateType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << InstanceStateType >> then instantiate a {@link InstanceStateType} proxy.
     * @return a {@link InstanceStateType} proxy on the created {@link Class}.
     */
    @objid ("cda68ab8-dcba-4960-8dfb-d5bef8ef024c")
    public static InstanceStateType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(InstanceStateType.MdaTypes.STEREOTYPE_ELT);
        return InstanceStateType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link InstanceStateType} proxy from a {@link Class} stereotyped << InstanceStateType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link InstanceStateType} proxy or <i>null</i>.
     */
    @objid ("5a9884d6-366a-4b76-a716-0f9f9b9ed4af")
    public static InstanceStateType instantiate(final Class obj) {
        return InstanceStateType.canInstantiate(obj) ? new InstanceStateType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InstanceStateType} proxy from a {@link Class} stereotyped << InstanceStateType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link InstanceStateType} proxy.
     */
    @objid ("7f601093-1416-4896-96e6-134d0284831b")
    public static InstanceStateType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (InstanceStateType.canInstantiate(obj))
            return new InstanceStateType(obj);
        else
            throw new IllegalArgumentException("InstanceStateType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c6ad354f-06e7-4cac-96fb-c666b57ff94d")
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
        InstanceStateType other = (InstanceStateType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("b15c9901-6238-4e8b-8862-d0382070a3dd")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'state'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d00a4880-e565-43b2-a234-4dfbcb660812")
    public String getState() {
        return this.elt.getTagValue(InstanceStateType.MdaTypes.STATE_TAGTYPE_ELT);
    }

    @objid ("0b8bcdaa-d14f-4d7f-90b4-c11e0d5705d2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'state'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fcdc49c1-e842-47ef-b75f-498b22a5af22")
    public void setState(final String value) {
        this.elt.putTagValue(InstanceStateType.MdaTypes.STATE_TAGTYPE_ELT, value);
    }

    @objid ("47771815-ff8f-4a28-bb47-415de85bc95a")
    protected  InstanceStateType(final Class elt) {
        this.elt = elt;
    }

    @objid ("7fe05db2-29e5-4bc8-8aee-e3c1370760c7")
    public static final class MdaTypes {
        @objid ("66cde83f-e6d6-4e59-b3e2-5a25cd66f821")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8c930514-0f6d-4af4-a299-7836a285f242")
        public static TagType STATE_TAGTYPE_ELT;

        @objid ("95d8938c-ef44-424d-8d43-9a7d59ecbf70")
        private static Stereotype MDAASSOCDEP;

        @objid ("34a0717a-f0e8-427f-9f94-ec1a9c2e6251")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("89179c64-d5e7-4c95-ae85-90159d6fad94")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "17542f25-7d53-4414-ad44-cda8dcefd24c", "InstanceStateType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "3b1a149f-4f8f-4b4f-9e19-9b01218d74ba", "state");
            STATE_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (STATE_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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
