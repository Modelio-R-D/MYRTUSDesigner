/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/09/2024 12:01 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TArtifactReference >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ade7041c-8bd5-4b95-9fed-82b770d7e5b1")
public class TArtifactReference implements IMdaProxy {
    @objid ("2b95fa74-8d06-4522-9188-70788de20622")
    public static final String STEREOTYPE_NAME = "TArtifactReference";

    @objid ("7881cd79-13cc-4241-b4b6-a840f4a30735")
    public static final String EXCLUDE_PROPERTY = "exclude";

    @objid ("feb440d0-4f73-4f30-acc5-1b22e92c00d3")
    public static final String GROUP_PROPERTY = "group";

    @objid ("43484df7-36cb-48fa-a9b3-fdecb65e2b3a")
    public static final String INCLUDE_PROPERTY = "include";

    @objid ("915edb50-0106-4a7d-bd87-3eca73d1d0e1")
    public static final String REFERENCE_PROPERTY = "reference";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("5f70f493-0a67-4256-af47-d572015c94e1")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TArtifactReference proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TArtifactReference >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("671910f6-6856-46c7-9be2-3ebb777282e8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TArtifactReference.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TArtifactReference.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TArtifactReference >> then instantiate a {@link TArtifactReference} proxy.
     * 
     * @return a {@link TArtifactReference} proxy on the created {@link ModelElement}.
     */
    @objid ("98ae1e77-fb87-4b61-b62b-819a508e1e75")
    public static TArtifactReference create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TArtifactReference.MdaTypes.STEREOTYPE_ELT);
        return TArtifactReference.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TArtifactReference} proxy from a {@link ModelElement} stereotyped << TArtifactReference >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TArtifactReference} proxy or <i>null</i>.
     */
    @objid ("2b92063c-6ff9-4dbb-9a0c-9eae4f9bf192")
    public static TArtifactReference instantiate(final ModelElement obj) {
        return TArtifactReference.canInstantiate(obj) ? new TArtifactReference(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TArtifactReference} proxy from a {@link ModelElement} stereotyped << TArtifactReference >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TArtifactReference} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("498e65d2-b4cf-4c2f-bdc0-d55908bb8d00")
    public static TArtifactReference safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TArtifactReference.canInstantiate(obj))
        	return new TArtifactReference(obj);
        else
        	throw new IllegalArgumentException("TArtifactReference: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5705d321-8fa8-4845-95b1-0cbd9a5e0bd5")
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
        TArtifactReference other = (TArtifactReference) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("1a737e32-469b-4ac0-abd2-c3cb24fde93b")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TArtifactReference.exclude'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("420a8cea-a9b5-4cd6-aba9-4f7611d08f41")
    public String getExclude() {
        String value = this.elt.getProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                                            TArtifactReference.MdaTypes.EXCLUDE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TArtifactReference.MdaTypes.EXCLUDE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TArtifactReference.MdaTypes.EXCLUDE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TArtifactReference.group'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("01f83937-bf18-46de-89cb-1d3d065505fe")
    public String getGroup() {
        String value = this.elt.getProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                                            TArtifactReference.MdaTypes.GROUP_PROPERTY_ELT.getName());
        if (value == null) {
          value = TArtifactReference.MdaTypes.GROUP_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TArtifactReference.MdaTypes.GROUP_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TArtifactReference.include'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("73849b07-1084-4af9-9f5b-a4848a967a21")
    public String getInclude() {
        String value = this.elt.getProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                                            TArtifactReference.MdaTypes.INCLUDE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TArtifactReference.MdaTypes.INCLUDE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TArtifactReference.MdaTypes.INCLUDE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TArtifactReference.reference'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5e720d12-727b-4d29-8c41-a1116b3d370f")
    public String getReference() {
        String value = this.elt.getProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                                            TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("eafa22be-461c-4834-a0fc-73c073a4ce70")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TArtifactReference.exclude'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ca4b4278-08c1-405e-bbf6-7f3034b7dca2")
    public void setExclude(final String value) {
        this.elt.setProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                             TArtifactReference.MdaTypes.EXCLUDE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TArtifactReference.MdaTypes.EXCLUDE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TArtifactReference.group'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b694932b-3905-48b0-a059-114af04cbf47")
    public void setGroup(final String value) {
        this.elt.setProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                             TArtifactReference.MdaTypes.GROUP_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TArtifactReference.MdaTypes.GROUP_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TArtifactReference.include'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3663461b-543c-4265-8d38-5a16032630c3")
    public void setInclude(final String value) {
        this.elt.setProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                             TArtifactReference.MdaTypes.INCLUDE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TArtifactReference.MdaTypes.INCLUDE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TArtifactReference.reference'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6547e2e4-497a-4b45-99e6-e283b892bdfc")
    public void setReference(final String value) {
        this.elt.setProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                             TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT, value));
    }

    @objid ("67f4d095-0b99-4eae-b692-43d614dd55e0")
    protected  TArtifactReference(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("0a7cfc21-11fd-4a0d-9c2d-1136690e339c")
    public static final class MdaTypes {
        @objid ("443a29d4-d03e-4bee-818a-6ddfd7ed12e5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fa027e6d-f21d-4994-b81b-1fb8b6fff79e")
        public static PropertyDefinition REFERENCE_PROPERTY_ELT;

        @objid ("9e73689a-e554-4d53-b10d-cbb702c5144c")
        public static PropertyDefinition GROUP_PROPERTY_ELT;

        @objid ("8bc704fe-ce5f-46bd-93a6-f9cb8d5af170")
        public static PropertyDefinition INCLUDE_PROPERTY_ELT;

        @objid ("27a12a28-7d66-47b3-9f7e-2b639cb79c61")
        public static PropertyDefinition EXCLUDE_PROPERTY_ELT;

        @objid ("45f526af-db6d-4524-b264-cfeca61fd6ae")
        private static Stereotype MDAASSOCDEP;

        @objid ("70c7fcbc-e46e-453b-84e0-797d6c210dbc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e8b29483-188c-401b-b8ce-be2a8d1d5a4f")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "53c24e9e-c0ae-4a12-85d4-2841ed84c97f", "TArtifactReference");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "b26c714b-31ed-4e47-8998-393302759e77", "reference");
            REFERENCE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (REFERENCE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "1aabb42c-63ec-4139-8d3b-3e1ac92bdb57", "group");
            GROUP_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (GROUP_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "50ace3e1-cad2-4eca-87b1-f8158e5f4b61", "include");
            INCLUDE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (INCLUDE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "a558d040-6e3b-46c9-8fce-7cfd072c9c49", "exclude");
            EXCLUDE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (EXCLUDE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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
