/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 11:56 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

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
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << TCapabilityRef >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("01985fb6-f34b-46d6-b317-f33249925f88")
public class TCapabilityRef implements IMdaProxy {
    @objid ("55b5b932-2b49-4cd2-b1ac-af083a89302c")
    public static final String STEREOTYPE_NAME = "TCapabilityRef";

    @objid ("520c7cd4-d6cc-415c-b783-b9567b9115e1")
    public static final String NAME_PROPERTY = "name";

    @objid ("7a880a23-3783-4688-9806-64d97d254680")
    public static final String REF_PROPERTY = "ref";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("27c786d3-e76e-46c9-b97b-06be63002039")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TCapabilityRef proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TCapabilityRef >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e8468cbc-4c5c-47cc-a6b7-8fb2595b6763")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TCapabilityRef.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TCapabilityRef.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TCapabilityRef >> then instantiate a {@link TCapabilityRef} proxy.
     * 
     * @return a {@link TCapabilityRef} proxy on the created {@link ModelElement}.
     */
    @objid ("df226f64-0511-4f84-a618-2951a87311f5")
    public static TCapabilityRef create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TCapabilityRef.MdaTypes.STEREOTYPE_ELT);
        return TCapabilityRef.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TCapabilityRef} proxy from a {@link ModelElement} stereotyped << TCapabilityRef >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TCapabilityRef} proxy or <i>null</i>.
     */
    @objid ("2e94a9e4-828f-4ec9-9d8d-5ae097b1f5a5")
    public static TCapabilityRef instantiate(final ModelElement obj) {
        return TCapabilityRef.canInstantiate(obj) ? new TCapabilityRef(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TCapabilityRef} proxy from a {@link ModelElement} stereotyped << TCapabilityRef >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TCapabilityRef} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ad8c5ac0-b2e6-4319-b368-6c4b5d0dcd32")
    public static TCapabilityRef safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TCapabilityRef.canInstantiate(obj))
        	return new TCapabilityRef(obj);
        else
        	throw new IllegalArgumentException("TCapabilityRef: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c5a65685-e4e1-4d60-b031-fb524c9e6970")
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
        TCapabilityRef other = (TCapabilityRef) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("76ce824c-6201-423c-821f-2202113e2036")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TCapabilityRef.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("15e8dcaa-bb15-49f5-8a07-828fe36b698c")
    public String getName() {
        String value = this.elt.getProperty(TCapabilityRef.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityRef.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityRef.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCapabilityRef.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TCapabilityRef.ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8b37e9b2-6d8b-4edc-9040-76759af3c100")
    public String getRef() {
        String value = this.elt.getProperty(TCapabilityRef.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityRef.MdaTypes.REF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityRef.MdaTypes.REF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCapabilityRef.MdaTypes.REF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("36011a9e-de93-493d-b459-8b91e8d222b3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TCapabilityRef.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cb320c4c-8140-421e-9382-56dbb7d55bc8")
    public void setName(final String value) {
        this.elt.setProperty(TCapabilityRef.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityRef.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityRef.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TCapabilityRef.ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("33dcb13c-b6e9-420d-a3a7-4058f2719db5")
    public void setRef(final String value) {
        this.elt.setProperty(TCapabilityRef.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityRef.MdaTypes.REF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityRef.MdaTypes.REF_PROPERTY_ELT, value));
    }

    @objid ("7a75a4df-af65-4e64-b829-9004f3b40233")
    protected  TCapabilityRef(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("d180ef36-e5f0-4f93-9d6d-12cd79a2beeb")
    public static final class MdaTypes {
        @objid ("86b3f119-3a6a-425b-9a8e-cabc6b4e881b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bdb9805d-78c0-416a-bc87-69af07350e10")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("74ecf467-845d-47d3-a56c-e246fc66d43e")
        public static PropertyDefinition REF_PROPERTY_ELT;

        @objid ("57c7bd44-bef0-4fd3-85a6-5586d655601c")
        private static Stereotype MDAASSOCDEP;

        @objid ("1b5edf49-c591-41cb-84b2-0d2024825768")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7746351f-1a85-47e7-a486-e6a74feeea23")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "ca7c07e5-454b-4d20-8f3d-6949dc4be7fd", "TCapabilityRef");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "cd1cff1f-be76-441b-98a5-771bdff3c02b", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "fc4c56a2-5405-4410-8ce2-b12a6d2480ec", "ref");
            REF_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (REF_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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
