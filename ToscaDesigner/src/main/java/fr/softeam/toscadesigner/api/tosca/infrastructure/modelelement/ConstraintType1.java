/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 20/08/2024 17:06 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

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
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << ConstraintType1 >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e6be320a-e47e-454e-bd9f-70d0d5b87a7b")
public class ConstraintType1 implements IMdaProxy {
    @objid ("05103409-3ef8-41c1-ab3b-53cd378bd31b")
    public static final String STEREOTYPE_NAME = "ConstraintType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("c734999a-ec6e-4d67-b133-370a74894e9a")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ConstraintType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ConstraintType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bc781f2c-7eda-4da4-b5cf-bbb2950f85a2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ConstraintType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ConstraintType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ConstraintType1 >> then instantiate a {@link ConstraintType1} proxy.
     * 
     * @return a {@link ConstraintType1} proxy on the created {@link ModelElement}.
     */
    @objid ("f94d1566-8434-4d7c-901e-cfcd28834582")
    public static ConstraintType1 create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(ConstraintType1.MdaTypes.STEREOTYPE_ELT);
        return ConstraintType1.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link ConstraintType1} proxy from a {@link ModelElement} stereotyped << ConstraintType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link ConstraintType1} proxy or <i>null</i>.
     */
    @objid ("1c4d7a0a-bdc6-4fc0-aa23-b8a6371e9aae")
    public static ConstraintType1 instantiate(final ModelElement obj) {
        return ConstraintType1.canInstantiate(obj) ? new ConstraintType1(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConstraintType1} proxy from a {@link ModelElement} stereotyped << ConstraintType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link ConstraintType1} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0a5f9810-8cce-4e0b-a1d2-5b5d9f0469eb")
    public static ConstraintType1 safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ConstraintType1.canInstantiate(obj))
        	return new ConstraintType1(obj);
        else
        	throw new IllegalArgumentException("ConstraintType1: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("acc7a23f-f5ec-4e5b-8392-cfecea386605")
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
        ConstraintType1 other = (ConstraintType1) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("efd9e7db-4030-40d2-b4de-4c2fa1c486cd")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("82699416-26de-4526-9801-a4fcf311f7e9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("7e23deb0-4633-4f0b-aac9-c88180a520ff")
    protected  ConstraintType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("0d57c2b9-e5cf-402d-9d64-9e015a784c81")
    public static final class MdaTypes {
        @objid ("a2f70ebd-2dac-4960-8d96-768b0196b72b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("92b10f69-cc2d-4f2e-b490-0620bb00e21b")
        private static Stereotype MDAASSOCDEP;

        @objid ("9a74d6d9-dd33-49e7-9595-f00a4a94f35c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2020a758-c757-4bb4-87aa-b47c3a6a527e")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "167e6d59-234e-44f0-b3b9-f845efc8ec75", "ConstraintType1");
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
