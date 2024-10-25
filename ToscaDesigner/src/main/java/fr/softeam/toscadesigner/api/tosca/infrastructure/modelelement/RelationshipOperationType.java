/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 25/10/2024 11:40 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << RelationshipOperationType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("775c7fc7-b3a5-4ad9-a6c6-17915885c932")
public class RelationshipOperationType implements IMdaProxy {
    @objid ("356fd36a-302d-4875-b598-501dba7496f3")
    public static final String STEREOTYPE_NAME = "RelationshipOperationType";

    @objid ("2103c20a-2b76-4265-9663-b812cc6bc98b")
    public static final String INTERFACENAME_PROPERTY = "interfaceName";

    @objid ("9b452054-eee3-4512-b934-f8e33d7a2f45")
    public static final String OPERATIONNAME_PROPERTY = "operationName";

    @objid ("658d3dc3-f22b-43c5-9f3c-647eb0c68006")
    public static final String RELATIONSHIPREF_PROPERTY = "relationshipRef";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("1251c64a-c689-4eda-84ab-75c13d4c8f57")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link RelationshipOperationType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << RelationshipOperationType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cbb645a5-8cd8-42fa-8793-270389e5b820")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (RelationshipOperationType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << RelationshipOperationType >> then instantiate a {@link RelationshipOperationType} proxy.
     * 
     * @return a {@link RelationshipOperationType} proxy on the created {@link ModelElement}.
     */
    @objid ("c7383201-b7c5-46ae-8d75-d5a639a411fc")
    public static RelationshipOperationType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT);
        return RelationshipOperationType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link RelationshipOperationType} proxy from a {@link ModelElement} stereotyped << RelationshipOperationType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link RelationshipOperationType} proxy or <i>null</i>.
     */
    @objid ("7cebc1aa-29af-47cb-8236-2a1f5f1574c1")
    public static RelationshipOperationType instantiate(final ModelElement obj) {
        return RelationshipOperationType.canInstantiate(obj) ? new RelationshipOperationType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RelationshipOperationType} proxy from a {@link ModelElement} stereotyped << RelationshipOperationType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link RelationshipOperationType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cb5c88b4-ee32-40bb-8e63-f2b2d712437f")
    public static RelationshipOperationType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (RelationshipOperationType.canInstantiate(obj))
        	return new RelationshipOperationType(obj);
        else
        	throw new IllegalArgumentException("RelationshipOperationType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f3070cd3-94d1-4252-8fc8-b274a7f1688f")
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
        RelationshipOperationType other = (RelationshipOperationType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("b8c8907d-779b-444f-a402-519c97749209")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'RelationshipOperationType.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a9d8a1a0-b880-4041-9fa6-9007f81d8f8e")
    public String getInterfaceName() {
        String value = this.elt.getProperty(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT,
                                            RelationshipOperationType.MdaTypes.INTERFACENAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = RelationshipOperationType.MdaTypes.INTERFACENAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(RelationshipOperationType.MdaTypes.INTERFACENAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'RelationshipOperationType.operationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1659616b-5d98-4188-a264-85851374e749")
    public String getOperationName() {
        String value = this.elt.getProperty(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT,
                                            RelationshipOperationType.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = RelationshipOperationType.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(RelationshipOperationType.MdaTypes.OPERATIONNAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'RelationshipOperationType.relationshipRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5fbe5b4b-e50e-452e-bb17-a4493b7941d9")
    public String getRelationshipRef() {
        String value = this.elt.getProperty(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT,
                                            RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("efa669c8-ef51-4a0b-bd63-f1186196e8e2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'RelationshipOperationType.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6d3dc5ce-a938-4003-a0c3-dff0eafbcb4a")
    public void setInterfaceName(final String value) {
        this.elt.setProperty(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT,
                             RelationshipOperationType.MdaTypes.INTERFACENAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(RelationshipOperationType.MdaTypes.INTERFACENAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'RelationshipOperationType.operationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8be760ce-5b82-46d1-8bda-310da79b0a1f")
    public void setOperationName(final String value) {
        this.elt.setProperty(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT,
                             RelationshipOperationType.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(RelationshipOperationType.MdaTypes.OPERATIONNAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'RelationshipOperationType.relationshipRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3aa0edcc-1ff8-493a-8e1c-de7722015d86")
    public void setRelationshipRef(final String value) {
        this.elt.setProperty(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT,
                             RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT, value));
    }

    @objid ("fc9c3239-f836-4c7a-8e06-ffd6cd3a6719")
    protected  RelationshipOperationType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("e41d38b7-be83-4767-ba9a-be3ecf59e0ec")
    public static final class MdaTypes {
        @objid ("f6f6cd38-112e-429b-8745-341149269fda")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("300a4bdc-24c7-44e1-9b6f-dc94f1e39bc8")
        public static PropertyDefinition INTERFACENAME_PROPERTY_ELT;

        @objid ("ab92777d-7c34-48b1-8157-bac01a5a879c")
        public static PropertyDefinition OPERATIONNAME_PROPERTY_ELT;

        @objid ("d831c8b3-2023-4e68-902b-290e7555869c")
        public static PropertyDefinition RELATIONSHIPREF_PROPERTY_ELT;

        @objid ("9e4b0f70-86af-48b4-bf89-118225730e25")
        private static Stereotype MDAASSOCDEP;

        @objid ("f06562f2-3bf2-48da-a159-37b42a6c329c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("df0a8764-a4ea-4335-aba2-2b9a676268d2")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "3c72ea09-dd33-44fb-8b15-11129ae48daa", "RelationshipOperationType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "767ef417-6727-4c4b-8e92-adbfb451993a", "interfaceName");
            INTERFACENAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (INTERFACENAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "67fdb777-1a5a-4bd9-841a-d3ec36dc32e8", "operationName");
            OPERATIONNAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (OPERATIONNAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "f8e7eab5-146d-42e5-aad3-8be5b2e07868", "relationshipRef");
            RELATIONSHIPREF_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (RELATIONSHIPREF_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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
