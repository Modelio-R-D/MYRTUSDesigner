/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 30/08/2024 17:54 by Modelio Studio.
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
    @objid ("20f8df7a-7f95-4efe-9a79-fde44d710aee")
    public static final String STEREOTYPE_NAME = "ConstraintsType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("d377faa5-e47f-49a5-bfb1-ea6c7c6053e1")
    protected final Class elt;

    /**
     * Tells whether a {@link ConstraintsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ConstraintsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b7d0e577-bac7-42e0-b70d-76c6d7478100")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (ConstraintsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(ConstraintsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << ConstraintsType >> then instantiate a {@link ConstraintsType} proxy.
     * 
     * @return a {@link ConstraintsType} proxy on the created {@link Class}.
     */
    @objid ("cd19b0a8-9380-4d5b-96fd-cce234283ead")
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
    @objid ("0ccddb1b-2bf6-429d-8545-e554ce15ab77")
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
    @objid ("8b3cf704-7a8e-42de-8591-4b6d91b66a91")
    public static ConstraintsType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ConstraintsType.canInstantiate(obj))
        	return new ConstraintsType(obj);
        else
        	throw new IllegalArgumentException("ConstraintsType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c8442141-2b05-42e9-8228-024d8a1759f0")
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
    @objid ("359c91bc-a294-482c-9f5a-2ab975d36fba")
    public Class getElement() {
        return this.elt;
    }

    @objid ("7c6ddeb7-9bca-4852-92e1-bcdb02c1afcb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("f4ce6662-dda9-4f50-bc4e-70979959bb74")
    protected  ConstraintsType(final Class elt) {
        this.elt = elt;
    }

    @objid ("b620f3dc-0a84-43cd-b627-7cdfed83f029")
    public static final class MdaTypes {
        @objid ("4de1521b-7d83-427d-b513-4abcead889f0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2c4fc634-8635-4960-b858-75ac50a25142")
        private static Stereotype MDAASSOCDEP;

        @objid ("73dfdc43-81dc-4a89-8d2b-0a3a8f299619")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d0d1bf9b-7a3f-4fc7-9a31-753042be0029")
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
