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
 * Proxy class to handle a {@link Class} with << ConstraintsType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("996b343e-a901-4848-a460-fa21946ce07e")
public class ConstraintsType implements IMdaProxy {
    @objid ("0b7d2abd-0dbd-4a08-9d02-6b4759a90c4a")
    public static final String STEREOTYPE_NAME = "ConstraintsType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("17005dff-316f-4e49-b9ab-3c771c19f4e3")
    protected final Class elt;

    /**
     * Tells whether a {@link ConstraintsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ConstraintsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e35f54ff-3cfb-4473-a387-92447eaf9d4b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (ConstraintsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(ConstraintsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << ConstraintsType >> then instantiate a {@link ConstraintsType} proxy.
     * 
     * @return a {@link ConstraintsType} proxy on the created {@link Class}.
     */
    @objid ("3fe35744-5f8f-4752-b7fc-eac9a975c88b")
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
    @objid ("b3a3a943-fd65-4317-9710-cb26e3c6889c")
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
    @objid ("766c3ebb-2ac4-4970-b0fe-f9039c8b4ad4")
    public static ConstraintsType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ConstraintsType.canInstantiate(obj))
        	return new ConstraintsType(obj);
        else
        	throw new IllegalArgumentException("ConstraintsType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e10af8d5-0f67-424a-bc97-06d77c0711eb")
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
    @objid ("5b78beaf-c5a0-46d8-b409-8f4a6e4dd3b4")
    public Class getElement() {
        return this.elt;
    }

    @objid ("830db574-da76-40ee-97b4-ff2c4d21a347")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("96651fc4-b8e1-4aa6-bc7e-b4e28e68608e")
    protected  ConstraintsType(final Class elt) {
        this.elt = elt;
    }

    @objid ("2152a57a-5429-4073-acc5-991c97b743b1")
    public static final class MdaTypes {
        @objid ("90cea068-a212-4a52-8336-70b080f6031e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b0ce2439-a7db-4433-90f4-33666bcf59f9")
        private static Stereotype MDAASSOCDEP;

        @objid ("53d39b04-3e8d-4c59-88eb-6f75e0984d36")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5fa48ace-563b-4913-b222-3ab5c88c8828")
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
