/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 18:02 by Modelio Studio.
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
    @objid ("97bd6836-377d-4411-92e2-1e798f19b913")
    public static final String STEREOTYPE_NAME = "ConstraintsType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("9047714d-c5f2-44b1-981c-ddb09ffe0517")
    protected final Class elt;

    /**
     * Tells whether a {@link ConstraintsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ConstraintsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("162a33c9-c28a-4fb8-810a-b2865ceed7f4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (ConstraintsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(ConstraintsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << ConstraintsType >> then instantiate a {@link ConstraintsType} proxy.
     * 
     * @return a {@link ConstraintsType} proxy on the created {@link Class}.
     */
    @objid ("2068a137-c31d-4f62-8240-ed705f658e79")
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
    @objid ("13849fc5-643c-4085-b406-5e17b6713faa")
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
    @objid ("9bdb4f79-86ee-49d6-89f9-ef2b4cffbb72")
    public static ConstraintsType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ConstraintsType.canInstantiate(obj))
        	return new ConstraintsType(obj);
        else
        	throw new IllegalArgumentException("ConstraintsType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e700b00a-72a0-4f65-bcaf-2d39c06a44a7")
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
    @objid ("b523ca3f-35ce-4525-aa29-6a37aadfe428")
    public Class getElement() {
        return this.elt;
    }

    @objid ("b545c36d-e3c9-48f0-9972-341a423cf46b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("953be063-c193-4718-9f48-f997cc46b789")
    protected  ConstraintsType(final Class elt) {
        this.elt = elt;
    }

    @objid ("93f058b5-7a02-47bf-9cdf-c2141383fce2")
    public static final class MdaTypes {
        @objid ("3179342a-844a-4aef-bd65-c00a173460b5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bda48a6f-5dda-44ba-8abb-0b7a4914962d")
        private static Stereotype MDAASSOCDEP;

        @objid ("26acb2a9-3526-4560-af82-9affd430b7e3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b1364942-ffa5-4d38-8fc7-4344d4d8f262")
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
