/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 10/09/2024 10:28 by Modelio Studio.
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
@objid ("4bf47389-4747-4cf1-96c9-6f1ba3d8bf90")
public class InstanceStateType implements IMdaProxy {
    @objid ("4742a810-a502-471c-a817-c759e322c2af")
    public static final String STEREOTYPE_NAME = "InstanceStateType";

    @objid ("9b0ba23c-fd6a-41d5-a5b2-66c560453591")
    public static final String STATE_PROPERTY = "state";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("84237afd-f5ec-4e3a-8163-8f7c3a22d1ec")
    protected final Class elt;

    /**
     * Tells whether a {@link InstanceStateType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << InstanceStateType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5337d1e3-0333-443e-addd-1fffe0a3bc25")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (InstanceStateType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(InstanceStateType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << InstanceStateType >> then instantiate a {@link InstanceStateType} proxy.
     * 
     * @return a {@link InstanceStateType} proxy on the created {@link Class}.
     */
    @objid ("a4c20b1a-1234-4c3e-be89-e9e0f472761d")
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
    @objid ("f79a8e43-b7bc-4eff-8da3-3e24d6108595")
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
    @objid ("28f53e96-4c8e-4228-a2c8-975a9f85d664")
    public static InstanceStateType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (InstanceStateType.canInstantiate(obj))
        	return new InstanceStateType(obj);
        else
        	throw new IllegalArgumentException("InstanceStateType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8584e404-1644-48bd-8f2c-7b18f72e6491")
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
    @objid ("ae8de247-3096-4279-abbd-2fa796fcb9ca")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'InstanceStateType.state'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("88c89cc8-56fa-4675-a654-487c5dede055")
    public String getState() {
        String value = this.elt.getProperty(InstanceStateType.MdaTypes.STEREOTYPE_ELT,
                                            InstanceStateType.MdaTypes.STATE_PROPERTY_ELT.getName());
        if (value == null) {
          value = InstanceStateType.MdaTypes.STATE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(InstanceStateType.MdaTypes.STATE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("4ab7971d-2e77-4e23-bf92-a51ff2428e06")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'InstanceStateType.state'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6bde3619-424d-45a7-9721-b20edaaf6d57")
    public void setState(final String value) {
        this.elt.setProperty(InstanceStateType.MdaTypes.STEREOTYPE_ELT,
                             InstanceStateType.MdaTypes.STATE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(InstanceStateType.MdaTypes.STATE_PROPERTY_ELT, value));
    }

    @objid ("9843c770-4d80-445f-90cd-96f7727e9038")
    protected  InstanceStateType(final Class elt) {
        this.elt = elt;
    }

    @objid ("25f9a290-c49c-4d3f-b937-7d766c592a11")
    public static final class MdaTypes {
        @objid ("9018f3ed-1b91-4fc6-af57-eae0c4c8ce9e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bfe6562f-1ee1-4719-8e88-dddb3cb95fb1")
        public static PropertyDefinition STATE_PROPERTY_ELT;

        @objid ("d95b7fc1-a3a1-4917-a39c-ec4b0cc7bb0f")
        private static Stereotype MDAASSOCDEP;

        @objid ("2477df2a-6b3f-4917-bcb6-4750fddaa3a9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("da90fb1c-342f-4573-9bd7-97ce5aeca251")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "17542f25-7d53-4414-ad44-cda8dcefd24c", "InstanceStateType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "491a9020-8acc-4c31-adcd-a946142d7160", "state");
            STATE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (STATE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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
