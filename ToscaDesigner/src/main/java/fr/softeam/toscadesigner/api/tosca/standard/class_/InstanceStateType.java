/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 15/05/2025 11:44 by Modelio Studio.
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
@objid ("64df21e3-4931-4736-a427-7dd8c51ab34c")
public class InstanceStateType implements IMdaProxy {
    @objid ("95b39214-c267-4859-9830-7e8c25c540cf")
    public static final String STEREOTYPE_NAME = "InstanceStateType";

    @objid ("629bedd4-396b-4258-bf56-95caf9fd554f")
    public static final String STATE_PROPERTY = "state";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("bb5c920f-7de8-4d6f-a6e1-5bff5e9d8f0d")
    protected final Class elt;

    /**
     * Tells whether a {@link InstanceStateType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << InstanceStateType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("49e2929b-71ab-4392-8d62-2763255ae732")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (InstanceStateType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(InstanceStateType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << InstanceStateType >> then instantiate a {@link InstanceStateType} proxy.
     * 
     * @return a {@link InstanceStateType} proxy on the created {@link Class}.
     */
    @objid ("66b7d6e6-9a1c-4be2-b71d-a21b1d6cf80f")
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
    @objid ("18146e54-8dcb-4dec-847c-09b8c490ea98")
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
    @objid ("49fff166-a054-4b85-b782-704443bc2bd0")
    public static InstanceStateType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (InstanceStateType.canInstantiate(obj))
        	return new InstanceStateType(obj);
        else
        	throw new IllegalArgumentException("InstanceStateType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f8667ced-b4a8-4115-977b-5d841b7149f3")
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
    @objid ("b7c6cc1c-f0ec-476c-a48c-101f43bcdd5b")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'InstanceStateType.state'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5f95a45c-468c-4f13-8d39-1a7c4888cbfa")
    public String getState() {
        String value = this.elt.getProperty(InstanceStateType.MdaTypes.STEREOTYPE_ELT,
                                            InstanceStateType.MdaTypes.STATE_PROPERTY_ELT.getName());
        if (value == null) {
          value = InstanceStateType.MdaTypes.STATE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(InstanceStateType.MdaTypes.STATE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("8c399356-f592-4f75-bc6c-d4bb8f9a2fe0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'InstanceStateType.state'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ce09041f-820a-4e2a-8b02-159d722588b9")
    public void setState(final String value) {
        this.elt.setProperty(InstanceStateType.MdaTypes.STEREOTYPE_ELT,
                             InstanceStateType.MdaTypes.STATE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(InstanceStateType.MdaTypes.STATE_PROPERTY_ELT, value));
    }

    @objid ("7b93c163-2033-4680-918c-dfabe14ada81")
    protected  InstanceStateType(final Class elt) {
        this.elt = elt;
    }

    @objid ("c160905c-011b-4081-b3fa-3c482814dda5")
    public static final class MdaTypes {
        @objid ("0d2b7d6e-3a0e-4011-8ac2-31e280d88f9c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("129ff182-bdc9-4c66-a10e-d50178cc724d")
        public static PropertyDefinition STATE_PROPERTY_ELT;

        @objid ("817d9bfb-c8c0-486b-b747-ec3b44e5630c")
        private static Stereotype MDAASSOCDEP;

        @objid ("6425d7f7-1188-47b8-8c67-d32344c93fb9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("55b8ec76-2ca7-47ca-8e64-8551cf1417ac")
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
