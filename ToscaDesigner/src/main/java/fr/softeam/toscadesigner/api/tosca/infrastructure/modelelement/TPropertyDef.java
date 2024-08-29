/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 29/08/2024 14:48 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TPropertyDef >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1b95daeb-b55d-4851-b75a-01f1d65245cd")
public class TPropertyDef implements IMdaProxy {
    @objid ("e7c47d32-2a1d-4386-a001-6c7977f956d7")
    public static final String STEREOTYPE_NAME = "TPropertyDef";

    @objid ("a003da4c-1b7c-458a-90fa-d8393424c85e")
    public static final String PROPERTY_PROPERTY = "property";

    @objid ("6be98cdc-52d3-4779-8da4-bce9654ee9b3")
    public static final String VALUE_PROPERTY = "value";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("635a5614-aaac-457e-8c71-c3fd80e3b3e6")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TPropertyDef proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TPropertyDef >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("918a6f79-49b0-4d2d-8442-04d2facfd651")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TPropertyDef.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TPropertyDef.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TPropertyDef >> then instantiate a {@link TPropertyDef} proxy.
     * 
     * @return a {@link TPropertyDef} proxy on the created {@link ModelElement}.
     */
    @objid ("25f89b8a-39b3-4201-a1b0-80768b767ef9")
    public static TPropertyDef create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TPropertyDef.MdaTypes.STEREOTYPE_ELT);
        return TPropertyDef.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TPropertyDef} proxy from a {@link ModelElement} stereotyped << TPropertyDef >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TPropertyDef} proxy or <i>null</i>.
     */
    @objid ("e04a4f7d-4c8a-4aad-96f0-566bdb1b6dd6")
    public static TPropertyDef instantiate(final ModelElement obj) {
        return TPropertyDef.canInstantiate(obj) ? new TPropertyDef(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPropertyDef} proxy from a {@link ModelElement} stereotyped << TPropertyDef >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TPropertyDef} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dc41b479-ede5-4610-b50b-47f6089426c1")
    public static TPropertyDef safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TPropertyDef.canInstantiate(obj))
        	return new TPropertyDef(obj);
        else
        	throw new IllegalArgumentException("TPropertyDef: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d21783f7-1796-46d5-aed7-6f077c8aee5f")
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
        TPropertyDef other = (TPropertyDef) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("b5555f43-fdd3-42ab-8c0a-47704aa41bce")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TPropertyDef.property'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("43b38aa9-2240-473e-a6c6-2fdb2963a160")
    public String getProperty() {
        String value = this.elt.getProperty(TPropertyDef.MdaTypes.STEREOTYPE_ELT,
                                            TPropertyDef.MdaTypes.PROPERTY_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPropertyDef.MdaTypes.PROPERTY_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPropertyDef.MdaTypes.PROPERTY_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TPropertyDef.value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("53524031-3dca-4d7e-8a06-3de53125b502")
    public String getValue() {
        String value = this.elt.getProperty(TPropertyDef.MdaTypes.STEREOTYPE_ELT,
                                            TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("8c447289-9a42-43af-a6e2-cd23062efa85")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TPropertyDef.property'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6618706f-1592-4f61-b16a-273339e454f9")
    public void setProperty(final String value) {
        this.elt.setProperty(TPropertyDef.MdaTypes.STEREOTYPE_ELT,
                             TPropertyDef.MdaTypes.PROPERTY_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPropertyDef.MdaTypes.PROPERTY_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TPropertyDef.value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("55b00d11-bf89-493f-9083-ba2567d082cc")
    public void setValue(final String value) {
        this.elt.setProperty(TPropertyDef.MdaTypes.STEREOTYPE_ELT,
                             TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT, value));
    }

    @objid ("4b3db107-905f-4b1a-8a91-571de7514ac7")
    protected  TPropertyDef(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("077fe0d5-3c38-4eda-803f-3530078a5da2")
    public static final class MdaTypes {
        @objid ("e67138b9-d38f-4342-a507-63789d72203c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7a768be6-e2f2-4cf0-b046-2bf671bbf369")
        public static PropertyDefinition PROPERTY_PROPERTY_ELT;

        @objid ("251651d5-a0ec-487d-bacb-2a25b6d31127")
        public static PropertyDefinition VALUE_PROPERTY_ELT;

        @objid ("5d417cf7-970c-4540-9746-6f07dd54fe4e")
        private static Stereotype MDAASSOCDEP;

        @objid ("a84c46cb-4a2a-4dbb-9d69-bb5f0378b06e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f215ecbd-c39a-4f76-a2fe-f8960141fd47")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "e6fb3511-fe1d-4f8d-b0d0-ef92595660a5", "TPropertyDef");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "b3526409-254e-4ae3-8d08-1cb28df5cec8", "property");
            PROPERTY_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (PROPERTY_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d2597f19-ad2e-4972-8fa0-94aa8d0230a6", "value");
            VALUE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (VALUE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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
