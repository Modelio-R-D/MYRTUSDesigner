/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:52 by Modelio Studio.
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
@objid ("b418a233-8146-4c16-8763-3c89867e0119")
public class ConstraintsType implements IMdaProxy {
    @objid ("e5d025b9-5c04-477d-bd57-cde2aa816504")
    public static final String STEREOTYPE_NAME = "ConstraintsType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("c61c91b3-fd6d-4f62-8f4a-52997608a65e")
    protected final Class elt;

    /**
     * Tells whether a {@link ConstraintsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ConstraintsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ec6f1223-94cf-4fae-91e6-a37049d4c097")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (ConstraintsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(ConstraintsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << ConstraintsType >> then instantiate a {@link ConstraintsType} proxy.
     * 
     * @return a {@link ConstraintsType} proxy on the created {@link Class}.
     */
    @objid ("621a3f68-7b33-421c-beba-0d4b7ac0cec7")
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
    @objid ("9910b3be-058e-4164-a479-77b22133e483")
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
    @objid ("ef5a74fd-8ffa-4dfb-8366-f2fa29c86d49")
    public static ConstraintsType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ConstraintsType.canInstantiate(obj))
        	return new ConstraintsType(obj);
        else
        	throw new IllegalArgumentException("ConstraintsType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f31a9695-b7e0-4d24-8aaf-3ca79d5d8307")
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
    @objid ("4f5a2156-7c27-40f8-b31a-546dd47364d1")
    public Class getElement() {
        return this.elt;
    }

    @objid ("e941289b-b7eb-40bf-86a2-526beea30f1a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("1431dfde-0627-4780-a902-77ba8bfb0997")
    protected  ConstraintsType(final Class elt) {
        this.elt = elt;
    }

    @objid ("93f058b5-7a02-47bf-9cdf-c2141383fce2")
    public static final class MdaTypes {
        @objid ("41dcf949-fd77-47d5-b034-bc976d248022")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b851b178-df67-4dc9-9781-d01a0632e07e")
        private static Stereotype MDAASSOCDEP;

        @objid ("981f20a1-4618-4c14-aaad-2317bb170fc8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e9615fbc-5eaf-4042-b4b4-ea5e33f4908b")
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
