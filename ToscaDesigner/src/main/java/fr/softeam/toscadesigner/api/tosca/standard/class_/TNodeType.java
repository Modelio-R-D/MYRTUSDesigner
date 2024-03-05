/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 01/03/2024 11:13 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TNodeType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("474f7f8e-8f62-45e2-ae69-11533c10c1a7")
public class TNodeType implements IMdaProxy {
    @objid ("60672a0d-add9-4517-8262-e5c8f2385122")
    public static final String STEREOTYPE_NAME = "TNodeType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("0243005f-ddaa-4c47-80b0-cd7e795345c6")
    protected final Class elt;

    /**
     * Tells whether a {@link TNodeType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TNodeType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6711c5a6-37ac-442e-9c1b-5954f133c391")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TNodeType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TNodeType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TNodeType >> then instantiate a {@link TNodeType} proxy.
     * 
     * @return a {@link TNodeType} proxy on the created {@link Class}.
     */
    @objid ("4f595bec-1b3b-4782-b2b6-78d5f812b9d7")
    public static TNodeType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TNodeType.MdaTypes.STEREOTYPE_ELT);
        return TNodeType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TNodeType} proxy from a {@link Class} stereotyped << TNodeType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TNodeType} proxy or <i>null</i>.
     */
    @objid ("5857de79-9ffa-4ba7-9662-154837448c6c")
    public static TNodeType instantiate(final Class obj) {
        return TNodeType.canInstantiate(obj) ? new TNodeType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TNodeType} proxy from a {@link Class} stereotyped << TNodeType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TNodeType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0b2e3d80-bd49-4a5f-8290-4d7971e1c53c")
    public static TNodeType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TNodeType.canInstantiate(obj))
        	return new TNodeType(obj);
        else
        	throw new IllegalArgumentException("TNodeType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b43796d2-b034-4d02-a674-26dd987b2527")
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
        TNodeType other = (TNodeType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("85240b22-b316-4edf-b86b-6718a25c4dd7")
    public Class getElement() {
        return this.elt;
    }

    @objid ("b797a975-4939-4a7c-8f9b-0584da5eada3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("392a8dbc-dfa0-41ce-a484-dce483e1bbec")
    protected  TNodeType(final Class elt) {
        this.elt = elt;
    }

    @objid ("e32fdd25-cb7e-49a5-9e79-0577a8d5d5f6")
    public static final class MdaTypes {
        @objid ("e4f0c39a-f756-43d4-8d6b-90a71408da21")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d665a6c8-d5d0-45cc-8fa6-db9cecfefb91")
        private static Stereotype MDAASSOCDEP;

        @objid ("1a6c2edf-1802-447d-b151-c42051dd7693")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9731fd34-b665-4929-8903-1df8d48a1e4a")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "47cdd09e-013d-4670-b757-f5736d2bb48c", "TNodeType");
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
