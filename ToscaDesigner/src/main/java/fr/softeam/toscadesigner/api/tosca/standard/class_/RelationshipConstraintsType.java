/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 04/06/2024 17:23 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << RelationshipConstraintsType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("cbe7813c-ac12-44b4-8f57-4ee2787075b4")
public class RelationshipConstraintsType implements IMdaProxy {
    @objid ("8e8a8e54-3697-4148-9558-f8121ab45ccf")
    public static final String STEREOTYPE_NAME = "RelationshipConstraintsType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("3acdd055-b550-4724-a3a4-d0271d5857ff")
    protected final Class elt;

    /**
     * Tells whether a {@link RelationshipConstraintsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RelationshipConstraintsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("89da6739-e3b4-42e3-93c2-5969f04ae9b5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RelationshipConstraintsType >> then instantiate a {@link RelationshipConstraintsType} proxy.
     * 
     * @return a {@link RelationshipConstraintsType} proxy on the created {@link Class}.
     */
    @objid ("c0738320-3975-4c11-acb5-c661564a745f")
    public static RelationshipConstraintsType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT);
        return RelationshipConstraintsType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RelationshipConstraintsType} proxy from a {@link Class} stereotyped << RelationshipConstraintsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RelationshipConstraintsType} proxy or <i>null</i>.
     */
    @objid ("46af7b89-0b80-4f09-96f2-1700a4e8f577")
    public static RelationshipConstraintsType instantiate(final Class obj) {
        return RelationshipConstraintsType.canInstantiate(obj) ? new RelationshipConstraintsType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RelationshipConstraintsType} proxy from a {@link Class} stereotyped << RelationshipConstraintsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RelationshipConstraintsType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("58e66769-f6c4-4511-9366-00abbbca85c7")
    public static RelationshipConstraintsType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RelationshipConstraintsType.canInstantiate(obj))
        	return new RelationshipConstraintsType(obj);
        else
        	throw new IllegalArgumentException("RelationshipConstraintsType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b8029a4e-7189-4793-a52b-1de63225bc77")
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
        RelationshipConstraintsType other = (RelationshipConstraintsType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("8eb0be5e-6140-401c-bf67-18075d991a7e")
    public Class getElement() {
        return this.elt;
    }

    @objid ("e86f8f1a-3444-4190-bae0-717e142bb31c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("f07f6a37-4a59-4124-832c-cca3f78978f3")
    protected  RelationshipConstraintsType(final Class elt) {
        this.elt = elt;
    }

    @objid ("8f0f3e44-4c9e-47a1-bec5-d3e03a57cdb4")
    public static final class MdaTypes {
        @objid ("776d195d-d213-485a-b00d-faf87ef176fa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d4b10b25-bfd6-418c-8648-65304aeddcc7")
        private static Stereotype MDAASSOCDEP;

        @objid ("5433bb79-b8a1-48eb-9dc0-041ee8b89537")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("24e28edf-6a01-47d1-aa28-9ff6c3ab5b24")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "7956674f-ca58-44ad-86e0-eb4f37747af7", "RelationshipConstraintsType");
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
