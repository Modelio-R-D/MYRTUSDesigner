/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 15/05/2025 11:44 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.package_;

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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Package} with << ToscaModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7ef2ed8d-45e8-4fa4-8c82-66de98aaf650")
public class ToscaModel implements IMdaProxy {
    @objid ("b7ece3fb-fa45-4e05-b652-aaa7a1703b9f")
    public static final String STEREOTYPE_NAME = "ToscaModel";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     */
    @objid ("c9fd3735-4fa0-4a02-9f40-11b6793347f5")
    protected final Package elt;

    /**
     * Tells whether a {@link ToscaModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ToscaModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1a20e64f-5cdb-408a-9ed8-bb8ae0130860")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && (ToscaModel.MdaTypes.STEREOTYPE_ELT!=null) && ((Package) elt).isStereotyped(ToscaModel.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Package} stereotyped << ToscaModel >> then instantiate a {@link ToscaModel} proxy.
     * 
     * @return a {@link ToscaModel} proxy on the created {@link Package}.
     */
    @objid ("25c620de-c63a-460b-b830-00dcee3456c8")
    public static ToscaModel create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Package");
        e.getExtension().add(ToscaModel.MdaTypes.STEREOTYPE_ELT);
        return ToscaModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link ToscaModel} proxy from a {@link Package} stereotyped << ToscaModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link ToscaModel} proxy or <i>null</i>.
     */
    @objid ("cb0549b5-6da4-4ff8-8d22-af8b5bb24b62")
    public static ToscaModel instantiate(final Package obj) {
        return ToscaModel.canInstantiate(obj) ? new ToscaModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ToscaModel} proxy from a {@link Package} stereotyped << ToscaModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link ToscaModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ce17f94f-7cef-4515-b5dc-f9c8df953a58")
    public static ToscaModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (ToscaModel.canInstantiate(obj))
        	return new ToscaModel(obj);
        else
        	throw new IllegalArgumentException("ToscaModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("87ff076e-66c8-493a-b92d-936b094d67e4")
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
        ToscaModel other = (ToscaModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("abf0937f-d923-451d-8e5f-b933948659d3")
    public Package getElement() {
        return this.elt;
    }

    @objid ("992cb1fb-3c0d-47b8-a8d5-20f212c5ff35")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("12c81bda-3145-40d3-ae28-b3dbac81c7f7")
    protected  ToscaModel(final Package elt) {
        this.elt = elt;
    }

    @objid ("a938e730-f2f6-48d5-b1cf-2f89dde5ec4f")
    public static final class MdaTypes {
        @objid ("7198a2cf-4fb5-4ce3-ad04-4d376522ed6f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("822ca5f9-d730-4ae3-b200-70c6c3ba9ecd")
        private static Stereotype MDAASSOCDEP;

        @objid ("ef21255f-7016-491b-98b2-08fcc25dbbc2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("96761815-434a-4199-8006-370b79957f55")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "20565008-115d-4fad-800f-134ab276f611", "ToscaModel");
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
