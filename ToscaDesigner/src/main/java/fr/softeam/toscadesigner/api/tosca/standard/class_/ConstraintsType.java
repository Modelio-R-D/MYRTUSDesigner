/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 03/09/2024 17:56 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << ConstraintsType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b8c912de-7b5a-4f56-8d5c-2717c559f6ec")
public class ConstraintsType implements IMdaProxy {
    @objid ("be112b84-6d7b-4d62-9fc5-138eb0f2f332")
    public static final String STEREOTYPE_NAME = "ConstraintsType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("72a15bfb-882f-4b6b-8c98-97b2d2d718ec")
    protected final Class elt;

    /**
     * Tells whether a {@link ConstraintsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ConstraintsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9ede8fa1-1f47-41b0-8b62-88e6da85d99e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (ConstraintsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(ConstraintsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << ConstraintsType >> then instantiate a {@link ConstraintsType} proxy.
     * 
     * @return a {@link ConstraintsType} proxy on the created {@link Class}.
     */
    @objid ("f74743f3-1e20-478b-844b-95edc44ded6a")
    public static ConstraintsType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(ConstraintsType.MdaTypes.STEREOTYPE_ELT);
        return ConstraintsType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ConstraintsType} proxy from a {@link Class} stereotyped << ConstraintsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ConstraintsType} proxy or <i>null</i>.
     */
    @objid ("0b480e94-2c2f-414a-8228-e5f1e770915a")
    public static ConstraintsType instantiate(final Class obj) {
        return ConstraintsType.canInstantiate(obj) ? new ConstraintsType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConstraintsType} proxy from a {@link Class} stereotyped << ConstraintsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ConstraintsType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7e1b4955-4478-438b-b133-9d6c7d9fcd50")
    public static ConstraintsType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ConstraintsType.canInstantiate(obj))
        	return new ConstraintsType(obj);
        else
        	throw new IllegalArgumentException("ConstraintsType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("33110d8c-1f2f-4bb1-aeed-76376ddd92c2")
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
        ConstraintsType other = (ConstraintsType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("480baad7-de47-4a02-b5ab-a2552d2867e7")
    public Class getElement() {
        return this.elt;
    }

    @objid ("d76cba20-790f-4ab3-95e0-d6b2da29a5f0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("f2343ac8-b8ab-431b-95bc-15af6d7b5aa2")
    protected  ConstraintsType(final Class elt) {
        this.elt = elt;
    }

    @objid ("b620f3dc-0a84-43cd-b627-7cdfed83f029")
    public static final class MdaTypes {
        @objid ("a2072b9e-e9a6-4f1d-a207-e04784b3c6fa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d37dffdf-e073-4688-af7a-d313a54bbeb5")
        private static Stereotype MDAASSOCDEP;

        @objid ("e895c6d0-a0d7-492d-8a13-5bf27e3b5f36")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6c929de2-00ec-4910-9394-d3821ac31b3f")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "2404a629-b23f-4c4c-be56-f244dd2e9495", "ConstraintsType");
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
