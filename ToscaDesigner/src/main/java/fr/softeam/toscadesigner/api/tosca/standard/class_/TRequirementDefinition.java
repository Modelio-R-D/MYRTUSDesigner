/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 08/03/2024 09:55 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TRequirementDefinition >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("22af6c94-07de-4f9d-90d7-aaded7466934")
public class TRequirementDefinition extends TExtensibleElements implements IMdaProxy {
    @objid ("26a761fe-e960-4201-8fe6-df3eabe08713")
    public static final String STEREOTYPE_NAME = "TRequirementDefinition";

    /**
     * Tells whether a {@link TRequirementDefinition proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirementDefinition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a57221c2-cfa7-497f-816d-deb950537c95")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirementDefinition.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirementDefinition >> then instantiate a {@link TRequirementDefinition} proxy.
     * 
     * @return a {@link TRequirementDefinition} proxy on the created {@link Class}.
     */
    @objid ("fb74d0a1-99e5-442c-9d51-1d70304a9943")
    public static TRequirementDefinition create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT);
        return TRequirementDefinition.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TRequirementDefinition} proxy from a {@link Class} stereotyped << TRequirementDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TRequirementDefinition} proxy or <i>null</i>.
     */
    @objid ("fe060b86-1758-49d1-997e-0c3835264166")
    public static TRequirementDefinition instantiate(final Class obj) {
        return TRequirementDefinition.canInstantiate(obj) ? new TRequirementDefinition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRequirementDefinition} proxy from a {@link Class} stereotyped << TRequirementDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TRequirementDefinition} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4ae97f8a-aa62-4db2-8926-a8f96b7d9101")
    public static TRequirementDefinition safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRequirementDefinition.canInstantiate(obj))
        	return new TRequirementDefinition(obj);
        else
        	throw new IllegalArgumentException("TRequirementDefinition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b0e42522-c956-4512-b563-9fb76865a520")
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
        TRequirementDefinition other = (TRequirementDefinition) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("2b559706-0578-47ab-a1e9-f50330735023")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("0d36e8ab-a13d-440d-aaa0-2b690897e7e8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("a494269f-c218-4275-a8c0-58fe9799073d")
    protected  TRequirementDefinition(final Class elt) {
        super(elt);
    }

    @objid ("0da5504c-73b1-4222-9ab6-24b2ec0cd21a")
    public static final class MdaTypes {
        @objid ("76278f25-b0d5-45d0-8522-d07b38fbb71c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("62f35110-2381-49ad-b66d-0c85e17c1615")
        private static Stereotype MDAASSOCDEP;

        @objid ("1c8e86dc-04ea-4910-b457-7d732bb5e5ce")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("baecba8b-a18b-4f64-9a03-59fec062dd59")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "2637c4bd-ca93-4012-82ea-8ef2ba5ca444", "TRequirementDefinition");
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
