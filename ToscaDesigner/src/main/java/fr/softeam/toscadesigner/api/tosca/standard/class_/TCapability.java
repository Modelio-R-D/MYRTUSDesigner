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
 * Proxy class to handle a {@link Class} with << TCapability >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("8dd3a55e-6cab-44c4-bee3-2cccc1943d31")
public class TCapability implements IMdaProxy {
    @objid ("4f86b3ea-df70-47d0-bf8c-4cdcfd51aaf1")
    public static final String STEREOTYPE_NAME = "TCapability";

    @objid ("12121551-fc12-4fb4-9946-d704d4b76df1")
    public static final String NAME_TAGTYPE = "name";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("b6649477-6d76-4953-8ca5-93cfd5cb5d92")
    protected final Class elt;

    /**
     * Tells whether a {@link TCapability proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TCapability >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("930a26f5-7b54-470a-8cef-65fe6343160c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TCapability.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TCapability.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TCapability >> then instantiate a {@link TCapability} proxy.
     * 
     * @return a {@link TCapability} proxy on the created {@link Class}.
     */
    @objid ("dd625f7b-7c01-4f2a-b049-10bbd9e4ffed")
    public static TCapability create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TCapability.MdaTypes.STEREOTYPE_ELT);
        return TCapability.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TCapability} proxy from a {@link Class} stereotyped << TCapability >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TCapability} proxy or <i>null</i>.
     */
    @objid ("ed0779f8-d09b-420d-a746-ad8e8a602e1e")
    public static TCapability instantiate(final Class obj) {
        return TCapability.canInstantiate(obj) ? new TCapability(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TCapability} proxy from a {@link Class} stereotyped << TCapability >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TCapability} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c519e42a-902c-46f0-8703-928a063fbbcf")
    public static TCapability safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TCapability.canInstantiate(obj))
        	return new TCapability(obj);
        else
        	throw new IllegalArgumentException("TCapability: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d081411e-21c3-411b-8fbd-6e320a1c0480")
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
        TCapability other = (TCapability) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("590e9274-35ee-4695-85f8-d17991bd08b1")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3d109db1-27bb-4a3b-9cc2-7f499793ace3")
    public String getName() {
        return this.elt.getTagValue(TCapability.MdaTypes.NAME_TAGTYPE_ELT);
    }

    @objid ("606411d6-14f9-4dfe-984e-e2bde56fba49")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("33039e03-0f7a-40a7-b108-dc01c4e7c55b")
    public void setName(final String value) {
        this.elt.putTagValue(TCapability.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    @objid ("868a257a-6268-44f7-a81b-10eefbc76264")
    protected  TCapability(final Class elt) {
        this.elt = elt;
    }

    @objid ("341e74b4-a4fe-47cf-b970-6c6d6af7c3b2")
    public static final class MdaTypes {
        @objid ("557bacc8-56aa-4392-87b5-328e69d12e75")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("45fb39ca-6186-49e5-8f7b-88980e35a26d")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("7d2ca772-47c0-4e37-bfaa-3ee030bf5976")
        private static Stereotype MDAASSOCDEP;

        @objid ("0cfb56c0-53a6-4d09-bf43-874fe2bea76e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6c73bba3-2b84-4964-89fb-c6cf67065f18")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "92831533-b614-4124-8961-3cd7ebcad536", "TCapability");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "224dc1e1-9646-43bf-8a70-4e84323d4dde", "name");
            NAME_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (NAME_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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
