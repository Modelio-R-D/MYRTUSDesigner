/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 14:48 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("8b1e14c2-eef0-4fe7-a3d8-fe99a41635af")
public class TConstraint implements IMdaProxy {
    @objid ("7e820b46-b81f-4a4b-b454-5a4e93e9b2b6")
    public static final String STEREOTYPE_NAME = "TConstraint";

    @objid ("9a97163d-c5cc-4013-bbf5-a9ba5ebc4071")
    public static final String ANY_PROPERTY = "any";

    @objid ("fa14191a-6f28-488a-91d7-e299f9b0f7b3")
    public static final String CONSTRAINTTYPE_PROPERTY = "constraintType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("fd451aac-5f09-4a9a-9576-63b52aea0b5e")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b8abbc81-6bca-4079-9ed4-462e4c363a4e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TConstraint.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TConstraint.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TConstraint >> then instantiate a {@link TConstraint} proxy.
     * 
     * @return a {@link TConstraint} proxy on the created {@link ModelElement}.
     */
    @objid ("5c4871f7-d5ed-4525-82db-d049c976d0fb")
    public static TConstraint create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TConstraint.MdaTypes.STEREOTYPE_ELT);
        return TConstraint.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TConstraint} proxy from a {@link ModelElement} stereotyped << TConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TConstraint} proxy or <i>null</i>.
     */
    @objid ("18c39b6b-7ce0-4723-a316-f22b4f087255")
    public static TConstraint instantiate(final ModelElement obj) {
        return TConstraint.canInstantiate(obj) ? new TConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TConstraint} proxy from a {@link ModelElement} stereotyped << TConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cee41aac-c3c9-4e28-a82a-148c49897e50")
    public static TConstraint safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TConstraint.canInstantiate(obj))
        	return new TConstraint(obj);
        else
        	throw new IllegalArgumentException("TConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c9b9e49e-6c78-45ae-b5fa-a2d1386702cb")
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
        TConstraint other = (TConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TConstraint.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d051e151-f621-4008-bb44-c0ad9e54019b")
    public String getAny() {
        String value = this.elt.getProperty(TConstraint.MdaTypes.STEREOTYPE_ELT,
                                            TConstraint.MdaTypes.ANY_PROPERTY_ELT.getName());
        if (value == null) {
          value = TConstraint.MdaTypes.ANY_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TConstraint.MdaTypes.ANY_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TConstraint.constraintType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1d37d101-d260-480b-af7c-e745ea79cf5d")
    public String getConstraintType() {
        String value = this.elt.getProperty(TConstraint.MdaTypes.STEREOTYPE_ELT,
                                            TConstraint.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TConstraint.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TConstraint.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("adf77bb4-add8-4f22-961e-3ea306bb54f5")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("e6ed7f3f-d629-4ecb-a99a-ee47f0f60a98")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TConstraint.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("68a5c387-6a98-4ef0-90e6-54a8826b0301")
    public void setAny(final String value) {
        this.elt.setProperty(TConstraint.MdaTypes.STEREOTYPE_ELT,
                             TConstraint.MdaTypes.ANY_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TConstraint.MdaTypes.ANY_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TConstraint.constraintType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2b9382b3-dc1a-4904-a6b8-36af09b36684")
    public void setConstraintType(final String value) {
        this.elt.setProperty(TConstraint.MdaTypes.STEREOTYPE_ELT,
                             TConstraint.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TConstraint.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT, value));
    }

    @objid ("07df0b6d-f5b1-459b-b257-3a94e631f8ad")
    protected  TConstraint(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("22a574a6-4a82-487b-a1e9-752c9e8b5b46")
    public static final class MdaTypes {
        @objid ("31924a09-05ae-4071-9126-73de55adaea4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("79899ec4-f73f-47d4-afd0-f40671b283f9")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("0b7956a1-be22-42d8-990f-de0b279bec88")
        public static PropertyDefinition CONSTRAINTTYPE_PROPERTY_ELT;

        @objid ("b11aaf30-0f51-4927-bcc7-de82de24e3d2")
        private static Stereotype MDAASSOCDEP;

        @objid ("3774f170-ba5f-4c8c-b6d0-f5c1b42b2647")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("daf75e18-051a-41c6-a1f3-dbc2a2741539")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "78fc63ae-0ad0-45f4-840f-4dbadc0922cb", "TConstraint");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "919faa40-beb7-4c4d-81e3-95ffcaf681a3", "any");
            ANY_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ANY_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "e6d29f3f-38de-4a5f-b204-5e04f31c4ada", "constraintType");
            CONSTRAINTTYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CONSTRAINTTYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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
