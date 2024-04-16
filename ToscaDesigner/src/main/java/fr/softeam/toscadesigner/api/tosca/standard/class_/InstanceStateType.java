/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/04/2024 16:51 by Modelio Studio.
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
    @objid ("16741f14-0621-4b7e-a842-b373b686505f")
    public static final String STEREOTYPE_NAME = "InstanceStateType";

    @objid ("70b202c1-ec49-4ca3-a611-7ad724358597")
    public static final String STATE_TAGTYPE = "state";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("cddc9080-8b1e-4c2a-91b9-16ed4b720127")
    protected final Class elt;

    /**
     * Tells whether a {@link InstanceStateType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << InstanceStateType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("14372796-c29f-4111-92ce-1df38ee2c063")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (InstanceStateType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(InstanceStateType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << InstanceStateType >> then instantiate a {@link InstanceStateType} proxy.
     * 
     * @return a {@link InstanceStateType} proxy on the created {@link Class}.
     */
    @objid ("3e3302c6-4c31-45dc-aaf2-acf4fc1ca69b")
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
    @objid ("fa472b37-c6e3-43ef-af9b-1731d8c31e2b")
    public static InstanceStateType instantiate(final Class obj) {
        return InstanceStateType.canInstantiate(obj) ? new InstanceStateType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InstanceStateType} proxy from a {@link Class} stereotyped << InstanceStateType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link InstanceStateType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4c4cf6be-b2ad-4101-80af-693304611f7d")
    public static InstanceStateType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (InstanceStateType.canInstantiate(obj))
        	return new InstanceStateType(obj);
        else
        	throw new IllegalArgumentException("InstanceStateType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c6c59eb8-7463-4a93-b8d0-95ea788c8a13")
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
    @objid ("527b60d2-e7a8-4f08-a367-566946ef9b55")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'state'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d571e693-5738-4e65-91fd-974a354c8f09")
    public String getState() {
        return this.elt.getTagValue(InstanceStateType.MdaTypes.STATE_TAGTYPE_ELT);
    }

    @objid ("5fa4f2f1-a574-436a-8294-b46ca7f3da33")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'state'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8da5146c-25fa-475b-92dd-edc69dd80a70")
    public void setState(final String value) {
        this.elt.putTagValue(InstanceStateType.MdaTypes.STATE_TAGTYPE_ELT, value);
    }

    @objid ("f321b6bb-2633-4e85-9dd4-4872cbd12804")
    protected  InstanceStateType(final Class elt) {
        this.elt = elt;
    }

    @objid ("7fe05db2-29e5-4bc8-8aee-e3c1370760c7")
    public static final class MdaTypes {
        @objid ("9e06c23a-bb17-4bc4-8ce7-3b93ff51d002")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("55d0e215-89ba-4108-a934-08cf1dd672b0")
        public static TagType STATE_TAGTYPE_ELT;

        @objid ("83149413-d1c0-42d4-b4ad-70bb45d0fa5a")
        private static Stereotype MDAASSOCDEP;

        @objid ("6f7e191c-e8ee-4cee-918d-a5d697a0bb6f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e45a1d31-a922-4e26-8684-20e6d74bc0b8")
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
