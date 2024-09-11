/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/09/2024 11:45 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Attribute} with << PropertyDefinitionType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4f6d4128-f6ab-4aa6-9e4e-8e3412b6a22b")
public class PropertyDefinitionType implements IMdaProxy {
    @objid ("0c65426f-a30c-46fa-b011-77e8d9c731dd")
    public static final String STEREOTYPE_NAME = "PropertyDefinitionType";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("64e5e845-28c7-4d3f-8cf1-53bcf513b0ff")
    protected final Attribute elt;

    /**
     * Tells whether a {@link PropertyDefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << PropertyDefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e156f351-7156-488f-a115-efc3b7e0de69")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << PropertyDefinitionType >> then instantiate a {@link PropertyDefinitionType} proxy.
     * 
     * @return a {@link PropertyDefinitionType} proxy on the created {@link Attribute}.
     */
    @objid ("7d4a4901-6839-49fe-8c46-e90210060d87")
    public static PropertyDefinitionType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Attribute");
        e.getExtension().add(PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT);
        return PropertyDefinitionType.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link PropertyDefinitionType} proxy from a {@link Attribute} stereotyped << PropertyDefinitionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link PropertyDefinitionType} proxy or <i>null</i>.
     */
    @objid ("2c65a722-dd98-43eb-b257-920e4ce4efe0")
    public static PropertyDefinitionType instantiate(final Attribute obj) {
        return PropertyDefinitionType.canInstantiate(obj) ? new PropertyDefinitionType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PropertyDefinitionType} proxy from a {@link Attribute} stereotyped << PropertyDefinitionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link PropertyDefinitionType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9b6fd7cc-3145-4f8c-951b-828e0d2fa558")
    public static PropertyDefinitionType safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (PropertyDefinitionType.canInstantiate(obj))
        	return new PropertyDefinitionType(obj);
        else
        	throw new IllegalArgumentException("PropertyDefinitionType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("78126570-3fbf-4c70-b66e-fb0163a1fb1e")
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
        PropertyDefinitionType other = (PropertyDefinitionType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("228a2b08-f369-49ba-9884-77ba8b80f6af")
    public Attribute getElement() {
        return this.elt;
    }

    @objid ("e2a141fa-215a-41c5-ae93-052245c83e28")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("2f9f0d57-ef9c-4669-95f0-676489423844")
    protected  PropertyDefinitionType(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("38c8a372-6aa0-4ce3-b40c-e298b66a4193")
    public static final class MdaTypes {
        @objid ("b7b67cf6-9754-40af-8cd4-c4a5d61daf9f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ed0cfdb9-79f4-442e-955e-cd5d4b13bf87")
        private static Stereotype MDAASSOCDEP;

        @objid ("bda3fdaa-7f0a-4a78-8ca2-04d56e33b18c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("668a5397-81b5-420e-932a-32ababe6dafd")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "34943474-c962-4064-b5f1-c6008ebb3c9d", "PropertyDefinitionType");
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
