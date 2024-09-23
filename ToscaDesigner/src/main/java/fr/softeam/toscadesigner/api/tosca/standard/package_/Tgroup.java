/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 23/09/2024 12:50 by Modelio Studio.
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
 * Proxy class to handle a {@link Package} with << Tgroup >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4422c42f-a597-425f-8b09-7408101e8285")
public class Tgroup implements IMdaProxy {
    @objid ("d6448624-0ddd-49b5-b977-f9ab0c5ed6e1")
    public static final String STEREOTYPE_NAME = "Tgroup";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     */
    @objid ("86e67d5b-b20c-4774-a474-559df2fb38eb")
    protected final Package elt;

    /**
     * Tells whether a {@link Tgroup proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << Tgroup >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bbef99ee-6365-4b1f-8865-87146c10fe25")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && (Tgroup.MdaTypes.STEREOTYPE_ELT!=null) && ((Package) elt).isStereotyped(Tgroup.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Package} stereotyped << Tgroup >> then instantiate a {@link Tgroup} proxy.
     * 
     * @return a {@link Tgroup} proxy on the created {@link Package}.
     */
    @objid ("9d25f351-9c69-4a10-aad2-10bf0f2acaa0")
    public static Tgroup create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Package");
        e.getExtension().add(Tgroup.MdaTypes.STEREOTYPE_ELT);
        return Tgroup.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link Tgroup} proxy from a {@link Package} stereotyped << Tgroup >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link Tgroup} proxy or <i>null</i>.
     */
    @objid ("87cdf570-713a-48bb-81f1-b5091a5777fc")
    public static Tgroup instantiate(final Package obj) {
        return Tgroup.canInstantiate(obj) ? new Tgroup(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Tgroup} proxy from a {@link Package} stereotyped << Tgroup >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link Tgroup} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("88369b35-dcea-4cfd-8cbf-52294031d6a7")
    public static Tgroup safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (Tgroup.canInstantiate(obj))
        	return new Tgroup(obj);
        else
        	throw new IllegalArgumentException("Tgroup: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("09d7b889-9f77-4991-bbd0-862eccdb96ff")
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
        Tgroup other = (Tgroup) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("781f1ec2-22e6-4971-9f60-ee03736d8bda")
    public Package getElement() {
        return this.elt;
    }

    @objid ("b15cac1a-9a1c-414d-9b57-f0ca4c25719c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("72cbc8d6-4a8a-4064-bae0-cf9a306fe004")
    protected  Tgroup(final Package elt) {
        this.elt = elt;
    }

    @objid ("9664c26e-c18b-497b-a6d5-f1fbeeb24da4")
    public static final class MdaTypes {
        @objid ("256fe2a8-33b3-454d-a008-87331e4e84f5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("50c736d5-2679-4b54-930f-098dec302275")
        private static Stereotype MDAASSOCDEP;

        @objid ("21044ec0-633a-4886-aed3-3609d823f4f6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("497572f8-8a36-41d3-8c78-15adcc6584af")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "572d5cb4-54c7-45d0-a9c8-3dc3677f9ef3", "Tgroup");
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
