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
    @objid ("d242dff5-91e2-4bb3-bbc5-1f0f33ba6693")
    public static final String STEREOTYPE_NAME = "InstanceStateType";

    @objid ("72523484-73ae-46a6-a939-5035e8af78e8")
    public static final String STATE_PROPERTY = "state";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("bf012c04-c85f-431a-8e5b-e8b91c7b1245")
    protected final Class elt;

    /**
     * Tells whether a {@link InstanceStateType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << InstanceStateType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b2fc9cdb-cf86-4978-bacc-d36c08832385")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (InstanceStateType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(InstanceStateType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << InstanceStateType >> then instantiate a {@link InstanceStateType} proxy.
     * @return a {@link InstanceStateType} proxy on the created {@link Class}.
     */
    @objid ("08b55bcb-dfb9-463b-99c9-cc3fa0330cb9")
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
    @objid ("285a0da9-1a46-4a24-96b6-2371de0ae8fe")
    public static InstanceStateType instantiate(final Class obj) {
        return InstanceStateType.canInstantiate(obj) ? new InstanceStateType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InstanceStateType} proxy from a {@link Class} stereotyped << InstanceStateType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link InstanceStateType} proxy.
     */
    @objid ("ea1d1446-3439-496e-a899-db4b651ef1fa")
    public static InstanceStateType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (InstanceStateType.canInstantiate(obj))
            return new InstanceStateType(obj);
        else
            throw new IllegalArgumentException("InstanceStateType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6c4c2b7e-da5d-45c5-8300-e7bf1d8616fe")
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
    @objid ("6c226e91-640f-4ee6-8d95-ed9b17ca8a6f")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'InstanceStateType.state'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ef704752-7db1-40d8-8c77-12ca09c81fdf")
    public String getState() {
        String value = this.elt.getProperty(InstanceStateType.MdaTypes.STEREOTYPE_ELT,
                                            InstanceStateType.MdaTypes.STATE_PROPERTY_ELT.getName());
        if (value == null) {
          value = InstanceStateType.MdaTypes.STATE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(InstanceStateType.MdaTypes.STATE_PROPERTY_ELT, value, this.elt);
    }

    @objid ("492d379a-0a85-4a76-9d22-495320dffb02")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'InstanceStateType.state'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("622b5d59-4bab-46d4-bc2c-9530b399e645")
    public void setState(final String value) {
        this.elt.setProperty(InstanceStateType.MdaTypes.STEREOTYPE_ELT,
                             InstanceStateType.MdaTypes.STATE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(InstanceStateType.MdaTypes.STATE_PROPERTY_ELT, value));
    }

    @objid ("dc15cf2b-f894-416c-9ad1-a76839149e69")
    protected  InstanceStateType(final Class elt) {
        this.elt = elt;
    }

    @objid ("c160905c-011b-4081-b3fa-3c482814dda5")
    public static final class MdaTypes {
        @objid ("065cc9e1-eb26-43a7-8dbe-30190ff8415f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5fb8d21c-5d58-40e3-8e2f-6d727895119a")
        public static PropertyDefinition STATE_PROPERTY_ELT;

        @objid ("2f090424-3f74-4379-81da-333bffb70d7b")
        private static Stereotype MDAASSOCDEP;

        @objid ("0a060b9c-c146-427a-aa1d-e01396baa020")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c1184328-f586-46ad-b1a0-c72af4346b7a")
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
