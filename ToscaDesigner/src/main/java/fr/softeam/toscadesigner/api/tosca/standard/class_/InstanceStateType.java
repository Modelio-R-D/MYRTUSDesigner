/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 08/04/2025 14:37 by Modelio Studio.
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
    @objid ("b1c12940-acf8-4ed5-b01a-58efb6d3806c")
    public static final String STEREOTYPE_NAME = "InstanceStateType";

    @objid ("d08846e8-272b-483f-9553-fb6bd2be26bd")
    public static final String STATE_PROPERTY = "state";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("6068c028-551e-4b41-869c-07dae0dc79aa")
    protected final Class elt;

    /**
     * Tells whether a {@link InstanceStateType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << InstanceStateType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a6c3110d-a1ad-475f-bf0e-2b01d0e9fdfe")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (InstanceStateType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(InstanceStateType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << InstanceStateType >> then instantiate a {@link InstanceStateType} proxy.
     * 
     * @return a {@link InstanceStateType} proxy on the created {@link Class}.
     */
    @objid ("5208c700-8969-4876-a321-b8ba139466db")
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
    @objid ("e6ab3a20-bca1-4c40-8caa-439177e98c37")
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
    @objid ("df919cb4-cc69-47ef-a6a6-127ad0c4d60c")
    public static InstanceStateType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (InstanceStateType.canInstantiate(obj))
        	return new InstanceStateType(obj);
        else
        	throw new IllegalArgumentException("InstanceStateType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("99f917c3-7ac8-4cb1-8994-c6f4e37d2cab")
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
    @objid ("6ed7cbad-be15-4d47-a746-9e92d33cd67c")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'InstanceStateType.state'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("775847d8-18e2-4048-b62c-2cae35ab02d8")
    public String getState() {
        String value = this.elt.getProperty(InstanceStateType.MdaTypes.STEREOTYPE_ELT,
                                            InstanceStateType.MdaTypes.STATE_PROPERTY_ELT.getName());
        if (value == null) {
          value = InstanceStateType.MdaTypes.STATE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(InstanceStateType.MdaTypes.STATE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("67a39546-f4db-44f2-a7c5-0a0165a37b5b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'InstanceStateType.state'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ff40dfa3-0017-4339-82a6-0d1ed2567518")
    public void setState(final String value) {
        this.elt.setProperty(InstanceStateType.MdaTypes.STEREOTYPE_ELT,
                             InstanceStateType.MdaTypes.STATE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(InstanceStateType.MdaTypes.STATE_PROPERTY_ELT, value));
    }

    @objid ("119afc5f-8d68-477a-96ca-cfa29e324764")
    protected  InstanceStateType(final Class elt) {
        this.elt = elt;
    }

    @objid ("c160905c-011b-4081-b3fa-3c482814dda5")
    public static final class MdaTypes {
        @objid ("63e409c1-676d-48f8-87b3-5fc007355468")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0df8372a-2fb9-4207-baa2-f80b91b451e5")
        public static PropertyDefinition STATE_PROPERTY_ELT;

        @objid ("eab13758-96e1-4410-9e70-d83bf0bd8185")
        private static Stereotype MDAASSOCDEP;

        @objid ("cb8e20a1-8429-459c-98b7-e5c1439ae825")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("67745562-cafa-4d85-8032-4eee7a58c33c")
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
