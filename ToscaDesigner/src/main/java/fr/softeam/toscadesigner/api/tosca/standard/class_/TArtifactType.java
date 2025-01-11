/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 16:04 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TArtifactType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c8bb4135-3f08-4d6f-9858-b26ac8816f7c")
public class TArtifactType extends TEntityType implements IMdaProxy {
    @objid ("873816a0-1b5b-47f3-b628-34db3ef5f75b")
    public static final String STEREOTYPE_NAME = "TArtifactType";

    /**
     * Tells whether a {@link TArtifactType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TArtifactType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("04e9259c-92f7-4a33-b443-41237e33b5fb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TArtifactType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TArtifactType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TArtifactType >> then instantiate a {@link TArtifactType} proxy.
     * 
     * @return a {@link TArtifactType} proxy on the created {@link Class}.
     */
    @objid ("c043d6d1-b5d2-4e9c-b341-b55cc79b33c1")
    public static TArtifactType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TArtifactType.MdaTypes.STEREOTYPE_ELT);
        return TArtifactType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TArtifactType} proxy from a {@link Class} stereotyped << TArtifactType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TArtifactType} proxy or <i>null</i>.
     */
    @objid ("8ed73c02-7fac-42fe-b0ec-e8405ecd2071")
    public static TArtifactType instantiate(final Class obj) {
        return TArtifactType.canInstantiate(obj) ? new TArtifactType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TArtifactType} proxy from a {@link Class} stereotyped << TArtifactType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TArtifactType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5c83becb-e52d-41c9-b352-c5d90df3f13c")
    public static TArtifactType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TArtifactType.canInstantiate(obj))
        	return new TArtifactType(obj);
        else
        	throw new IllegalArgumentException("TArtifactType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("091bbac8-9d09-4fdb-a0eb-3e0a8396f187")
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
        TArtifactType other = (TArtifactType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("40ad7727-b373-4a77-9980-ed1e5fb73597")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("402b3681-66e3-49ff-ab19-24ecdae413bc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("78f35ca1-cbbc-4c4e-8df4-478a25e43b4b")
    protected  TArtifactType(final Class elt) {
        super(elt);
    }

    @objid ("6997d70c-4755-49ef-b28a-e3397b4b558b")
    public static final class MdaTypes {
        @objid ("794496af-6f3d-4916-ad6d-09d921ac1be4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("16c2aba1-bada-402b-ac4d-650aaa8560a4")
        private static Stereotype MDAASSOCDEP;

        @objid ("7fc65aff-404c-401c-a448-4faaee55b6b8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("aeef9597-f4d6-4366-b83e-4b23e3c11425")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "08c1d0af-1987-4d3f-8dda-3b28c1aadcb9", "TArtifactType");
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
