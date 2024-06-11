/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/06/2024 17:18 by Modelio Studio.
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
@objid ("4d7a5381-f890-4582-a1ee-eff4058f9333")
public class InstanceStateType implements IMdaProxy {
    @objid ("c233cd8a-9036-44d0-8311-a4ab4e761e93")
    public static final String STEREOTYPE_NAME = "InstanceStateType";

    @objid ("2648c614-5b0d-41f9-8cc0-6b1903fb9d25")
    public static final String STATE_TAGTYPE = "state";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("67a71c88-e5d6-4ef8-bf3c-8ef12698ec52")
    protected final Class elt;

    /**
     * Tells whether a {@link InstanceStateType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << InstanceStateType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("094de5c5-98f4-4086-b3d9-9e4251d8d427")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (InstanceStateType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(InstanceStateType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << InstanceStateType >> then instantiate a {@link InstanceStateType} proxy.
     * 
     * @return a {@link InstanceStateType} proxy on the created {@link Class}.
     */
    @objid ("d3cd7117-0291-4245-833e-180c242df3af")
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
    @objid ("d1f41447-d533-4f3f-8120-30634634a3c5")
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
    @objid ("6c11d20c-5b22-4731-8165-3c57d2114876")
    public static InstanceStateType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (InstanceStateType.canInstantiate(obj))
        	return new InstanceStateType(obj);
        else
        	throw new IllegalArgumentException("InstanceStateType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c5196eea-e208-4758-86ad-559291576540")
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
    @objid ("0b291fcf-3175-4714-9594-006fc3412ce9")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'state'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c15496b1-d4d9-45a4-b2b0-bb602c4355cc")
    public String getState() {
        return this.elt.getTagValue(InstanceStateType.MdaTypes.STATE_TAGTYPE_ELT);
    }

    @objid ("50fdb692-2e69-483c-ad6a-4b9d744df78e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'state'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("96a3c13e-5964-4d11-9020-73ce070794cb")
    public void setState(final String value) {
        this.elt.putTagValue(InstanceStateType.MdaTypes.STATE_TAGTYPE_ELT, value);
    }

    @objid ("04d9ac9a-f554-4281-b1f5-95aa0b647582")
    protected  InstanceStateType(final Class elt) {
        this.elt = elt;
    }

    @objid ("01db84a6-ec85-44d1-9bc6-7ea58d33f723")
    public static final class MdaTypes {
        @objid ("688088ff-2b0d-4550-827a-8276b4a4ca45")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("07e65095-d397-410e-b4aa-2b0318005b74")
        public static TagType STATE_TAGTYPE_ELT;

        @objid ("2fefc17d-9313-4199-91e0-85b7f7468bcb")
        private static Stereotype MDAASSOCDEP;

        @objid ("b8b75821-9f94-4fe4-b9fb-8a014ca76a1e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("104c8ddb-bd85-423a-a715-96ad5306343b")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "17542f25-7d53-4414-ad44-cda8dcefd24c", "InstanceStateType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "3b1a149f-4f8f-4b4f-9e19-9b01218d74ba", "state");
            STATE_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (STATE_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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
