/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 16:04 by Modelio Studio.
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
    @objid ("bea29542-925e-4ebd-97ba-267dc8b1f54a")
    public static final String STEREOTYPE_NAME = "PropertyDefinitionType";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("d13d6b20-db22-4121-a8f9-498115c89f55")
    protected final Attribute elt;

    /**
     * Tells whether a {@link PropertyDefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << PropertyDefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c87c75e6-1eaa-4db2-9912-04f33c357d95")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << PropertyDefinitionType >> then instantiate a {@link PropertyDefinitionType} proxy.
     * 
     * @return a {@link PropertyDefinitionType} proxy on the created {@link Attribute}.
     */
    @objid ("de1859ee-31cd-4cd4-a0c1-de4b15beea59")
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
    @objid ("ce3b6d46-dec5-427d-9e63-b450ce80877c")
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
    @objid ("b45fd5f7-be25-4075-85a6-436e2e340f99")
    public static PropertyDefinitionType safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (PropertyDefinitionType.canInstantiate(obj))
        	return new PropertyDefinitionType(obj);
        else
        	throw new IllegalArgumentException("PropertyDefinitionType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("64099a43-8248-4e31-aa6d-662823a42161")
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
    @objid ("1086963a-26bb-4ff2-9946-16a485a96a19")
    public Attribute getElement() {
        return this.elt;
    }

    @objid ("b4b39561-8b9a-4504-820d-09f9d671dc43")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("844f7f2d-1394-4d7b-8940-2f12a5a5fcdb")
    protected  PropertyDefinitionType(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("38c8a372-6aa0-4ce3-b40c-e298b66a4193")
    public static final class MdaTypes {
        @objid ("edd8e399-2f74-4274-b947-646c46c5f524")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("929b1198-8b71-4942-8020-a5dc832cd52b")
        private static Stereotype MDAASSOCDEP;

        @objid ("abe0b234-cede-4257-b95e-e4df3800ae42")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bb743dbf-94a8-4c4f-bcec-ad55b03081b8")
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
