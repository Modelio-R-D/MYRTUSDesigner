/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 16:27 by Modelio Studio.
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
@objid ("3ce1a340-c5fd-41f2-a183-c629f35f57eb")
public class InstanceStateType implements IMdaProxy {
    @objid ("861e1e79-2869-4eaa-810b-a615162da848")
    public static final String STEREOTYPE_NAME = "InstanceStateType";

    @objid ("24778fbc-a4de-441a-858a-60d63b08b7f2")
    public static final String STATE_PROPERTY = "state";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("e13b01d0-0bb6-4bf7-a5f5-89a0c16ae9b4")
    protected final Class elt;

    /**
     * Tells whether a {@link InstanceStateType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << InstanceStateType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bd3b4162-879f-49ea-b094-627ceb6af949")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (InstanceStateType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(InstanceStateType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << InstanceStateType >> then instantiate a {@link InstanceStateType} proxy.
     * 
     * @return a {@link InstanceStateType} proxy on the created {@link Class}.
     */
    @objid ("d2a39e7b-195d-4cba-854b-20d5e405d956")
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
    @objid ("80caf029-c594-497b-86ce-18571c48f942")
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
    @objid ("925b1193-44fb-484c-97a4-7a331c69f588")
    public static InstanceStateType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (InstanceStateType.canInstantiate(obj))
        	return new InstanceStateType(obj);
        else
        	throw new IllegalArgumentException("InstanceStateType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6db6871b-e3b3-446f-b7e9-be5484e19f52")
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
    @objid ("61c968ef-6ef2-47d1-8103-acb23a415ef4")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'InstanceStateType.state'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a178410f-e2a4-4567-886f-ff651e539494")
    public String getState() {
        String value = this.elt.getProperty(InstanceStateType.MdaTypes.STEREOTYPE_ELT,
                                            InstanceStateType.MdaTypes.STATE_PROPERTY_ELT.getName());
        if (value == null) {
          value = InstanceStateType.MdaTypes.STATE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(InstanceStateType.MdaTypes.STATE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("6f547294-18bc-463c-bbbb-4d361032aa91")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'InstanceStateType.state'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ec3f6f11-e4ab-4792-84f1-f3c1f8964abe")
    public void setState(final String value) {
        this.elt.setProperty(InstanceStateType.MdaTypes.STEREOTYPE_ELT,
                             InstanceStateType.MdaTypes.STATE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(InstanceStateType.MdaTypes.STATE_PROPERTY_ELT, value));
    }

    @objid ("28a29993-d551-4a10-b9c1-3ec232ee33ab")
    protected  InstanceStateType(final Class elt) {
        this.elt = elt;
    }

    @objid ("2d8e4616-3491-4b79-822a-9bf3531c5ccc")
    public static final class MdaTypes {
        @objid ("f9e85612-6328-4448-99d5-196f36d6af0f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d67dd6e3-64f8-4eb5-8251-c3771d943c19")
        public static PropertyDefinition STATE_PROPERTY_ELT;

        @objid ("c3a907c9-3db3-43a2-b391-297f496b3ea8")
        private static Stereotype MDAASSOCDEP;

        @objid ("e12e3f37-5a55-4718-b406-9f211c1113b0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("44d502ad-700e-4742-8ff8-099dab5067e5")
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
