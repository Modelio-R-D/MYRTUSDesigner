/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/04/2024 16:51 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << RelationshipOperationType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("06ea21f0-1682-427b-a117-4bb3fb43239f")
public class RelationshipOperationType implements IMdaProxy {
    @objid ("de5548a7-9a2e-4c92-ba8c-d54089ad7ae3")
    public static final String STEREOTYPE_NAME = "RelationshipOperationType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("7fb18d9c-e1e8-4619-ba68-521af33f6d44")
    protected final Class elt;

    /**
     * Tells whether a {@link RelationshipOperationType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RelationshipOperationType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9c545e7e-bc39-4043-b2f3-eb45cdfbbc29")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RelationshipOperationType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RelationshipOperationType >> then instantiate a {@link RelationshipOperationType} proxy.
     * 
     * @return a {@link RelationshipOperationType} proxy on the created {@link Class}.
     */
    @objid ("43ab28bd-555d-4e35-a86d-1f6997978644")
    public static RelationshipOperationType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT);
        return RelationshipOperationType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RelationshipOperationType} proxy from a {@link Class} stereotyped << RelationshipOperationType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RelationshipOperationType} proxy or <i>null</i>.
     */
    @objid ("558c814d-096e-4a3b-8848-00911e090b9c")
    public static RelationshipOperationType instantiate(final Class obj) {
        return RelationshipOperationType.canInstantiate(obj) ? new RelationshipOperationType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RelationshipOperationType} proxy from a {@link Class} stereotyped << RelationshipOperationType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RelationshipOperationType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("286460b9-c1d9-4443-b750-deb6b8705e32")
    public static RelationshipOperationType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RelationshipOperationType.canInstantiate(obj))
        	return new RelationshipOperationType(obj);
        else
        	throw new IllegalArgumentException("RelationshipOperationType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("925e71f1-3242-45e5-a175-30c1db4b478b")
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
        RelationshipOperationType other = (RelationshipOperationType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("4a10337d-4370-41d7-9061-1973e38dfb20")
    public Class getElement() {
        return this.elt;
    }

    @objid ("a8a4cef2-722a-49b2-80ac-e00133c9c50b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("1e9b9d46-e87b-47fb-864e-370557b53cad")
    protected  RelationshipOperationType(final Class elt) {
        this.elt = elt;
    }

    @objid ("0281d496-fe1e-425d-85af-3ca427e20b06")
    public static final class MdaTypes {
        @objid ("17580858-7b40-4d13-9f5d-58ae3cc7bed8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bb964fe7-a1da-44b7-8e4e-7e29eae5ec3c")
        private static Stereotype MDAASSOCDEP;

        @objid ("a1379aa3-91a3-4f2a-bb81-4e67f3fb8abd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("956dfd65-542b-41d3-adea-6efa98654169")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "283533e7-c53c-4104-a644-9d71d040726f", "RelationshipOperationType");
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
