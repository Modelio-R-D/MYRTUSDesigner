/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/09/2024 14:25 by Modelio Studio.
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
@objid ("3027aaf8-ae1c-4c0f-90c6-99ece3b706ed")
public class ToscaModel implements IMdaProxy {
    @objid ("62bad8d1-d8e4-476a-bfed-3b5a72372116")
    public static final String STEREOTYPE_NAME = "ToscaModel";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     */
    @objid ("c59d3305-9d69-44ce-aeda-f3f3e4f47bfe")
    protected final Package elt;

    /**
     * Tells whether a {@link ToscaModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ToscaModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b16c7189-0b65-4d67-b2d3-0768b697974a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && (ToscaModel.MdaTypes.STEREOTYPE_ELT!=null) && ((Package) elt).isStereotyped(ToscaModel.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Package} stereotyped << ToscaModel >> then instantiate a {@link ToscaModel} proxy.
     * 
     * @return a {@link ToscaModel} proxy on the created {@link Package}.
     */
    @objid ("9e192cf0-9e46-4de5-9e11-65f9ee1ef5ed")
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
    @objid ("be850ec0-10f5-4bd0-966e-b44915a90ef0")
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
    @objid ("7b0e4fea-2152-4a83-88f4-11f9310cb3d3")
    public static ToscaModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (ToscaModel.canInstantiate(obj))
        	return new ToscaModel(obj);
        else
        	throw new IllegalArgumentException("ToscaModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4a0a0e86-98d8-44a1-8f34-27bad6dfd6ef")
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
    @objid ("2015837e-e79a-441c-bfea-d64e80aeebca")
    public Package getElement() {
        return this.elt;
    }

    @objid ("2b33da56-6d42-407b-9097-755607d86cb6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("3d0d5130-4fcd-4e84-8d4c-e15ccc165f0b")
    protected  ToscaModel(final Package elt) {
        this.elt = elt;
    }

    @objid ("41bf62e6-a63c-4b81-9cf3-a936dd332716")
    public static final class MdaTypes {
        @objid ("929ea3ba-1b60-4659-abcb-4cc1a6406adb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("80828d47-df42-45b3-a4de-9a09972a1552")
        private static Stereotype MDAASSOCDEP;

        @objid ("ea613db1-b158-43b6-b910-3ec5eaf72c3a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e83b0dd3-446d-4094-8fe8-abeefeaca066")
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
