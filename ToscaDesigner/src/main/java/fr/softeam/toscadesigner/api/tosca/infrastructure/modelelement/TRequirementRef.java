/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 20/08/2024 17:06 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TRequirementRef >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c1efd997-4ec3-4dfa-b6ad-e10b8fc4a65a")
public class TRequirementRef implements IMdaProxy {
    @objid ("c10762c5-e53d-4958-9279-a65433f4d9c9")
    public static final String STEREOTYPE_NAME = "TRequirementRef";

    @objid ("bfd06ecb-6fb3-4268-ace0-b11be277e334")
    public static final String NAME_PROPERTY = "name";

    @objid ("56d6c340-7887-419e-a893-31744063f20a")
    public static final String REF_PROPERTY = "ref";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("d557c647-457b-463d-a609-d172ff03b686")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TRequirementRef proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TRequirementRef >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b13955c3-b66a-4cb8-8064-7d7f4baf539b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TRequirementRef.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TRequirementRef.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TRequirementRef >> then instantiate a {@link TRequirementRef} proxy.
     * 
     * @return a {@link TRequirementRef} proxy on the created {@link ModelElement}.
     */
    @objid ("1983f5c5-7c42-4ecd-b2f0-68c19adb6406")
    public static TRequirementRef create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TRequirementRef.MdaTypes.STEREOTYPE_ELT);
        return TRequirementRef.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TRequirementRef} proxy from a {@link ModelElement} stereotyped << TRequirementRef >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TRequirementRef} proxy or <i>null</i>.
     */
    @objid ("652a247a-e0eb-4bf4-8db5-a47b300db678")
    public static TRequirementRef instantiate(final ModelElement obj) {
        return TRequirementRef.canInstantiate(obj) ? new TRequirementRef(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRequirementRef} proxy from a {@link ModelElement} stereotyped << TRequirementRef >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TRequirementRef} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("99aed7b3-a95e-4626-857d-94b86434d1f2")
    public static TRequirementRef safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TRequirementRef.canInstantiate(obj))
        	return new TRequirementRef(obj);
        else
        	throw new IllegalArgumentException("TRequirementRef: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8772cf2e-ae08-4955-994f-2c865051dfed")
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
        TRequirementRef other = (TRequirementRef) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("653e08bc-b44b-48c6-ad87-29c9bdf856c3")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TRequirementRef.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("975e6dc5-b058-493b-8a28-ac15f2ab18cb")
    public String getName() {
        String value = this.elt.getProperty(TRequirementRef.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementRef.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementRef.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementRef.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TRequirementRef.ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8797d538-bf6d-4084-ad59-5637b9c2ef7a")
    public String getRef() {
        String value = this.elt.getProperty(TRequirementRef.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementRef.MdaTypes.REF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementRef.MdaTypes.REF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementRef.MdaTypes.REF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("6dfea8be-5682-41f4-a762-f2ed89f971b4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TRequirementRef.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9da20cd4-4a77-44af-9286-6277ff26fb4c")
    public void setName(final String value) {
        this.elt.setProperty(TRequirementRef.MdaTypes.STEREOTYPE_ELT,
                             TRequirementRef.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementRef.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRequirementRef.ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("97481559-fae9-4a5c-a3b2-b5d7e261b4fb")
    public void setRef(final String value) {
        this.elt.setProperty(TRequirementRef.MdaTypes.STEREOTYPE_ELT,
                             TRequirementRef.MdaTypes.REF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementRef.MdaTypes.REF_PROPERTY_ELT, value));
    }

    @objid ("2ba32c44-e42b-457e-9046-7649e2a3cbdd")
    protected  TRequirementRef(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("ddbc59a7-04ff-40a3-a76f-15ed8a61c9ef")
    public static final class MdaTypes {
        @objid ("b22f82ac-58d4-4ab5-bbc2-41f4a1b2768c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d770e307-a35d-4dff-9c47-ecf51dac12c7")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("e7f40085-02ff-4c76-94cb-772acc8fae70")
        public static PropertyDefinition REF_PROPERTY_ELT;

        @objid ("d82f6e23-9bdd-4589-8f83-96ce9fca4cd9")
        private static Stereotype MDAASSOCDEP;

        @objid ("0eb1984b-e083-46f5-b25e-e18fef578611")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fd50370d-6136-40d2-930a-97095704160a")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "179fadf7-b82d-47bc-ae58-40df62e045ed", "TRequirementRef");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "100afbca-9f3b-49e3-ac91-f1465edc6002", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d9c4cff9-b58a-410a-9b68-f76a8879a37f", "ref");
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
