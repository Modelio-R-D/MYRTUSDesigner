/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 16:27 by Modelio Studio.
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
@objid ("47ccbbd7-9e38-4b07-a36a-dcd6d5051ee9")
public class ToscaModel implements IMdaProxy {
    @objid ("c4e18899-d6fe-4db3-aa74-6ad6bc79e7ae")
    public static final String STEREOTYPE_NAME = "ToscaModel";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     * 
     */
    @objid ("abfcc94e-94ac-4a0f-b4e4-995a36703a34")
    protected final Package elt;

    /**
     * Tells whether a {@link ToscaModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ToscaModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0165d21c-98c9-4b61-b865-5d5cb63737d8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && (ToscaModel.MdaTypes.STEREOTYPE_ELT!=null) && ((Package) elt).isStereotyped(ToscaModel.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Package} stereotyped << ToscaModel >> then instantiate a {@link ToscaModel} proxy.
     * @return a {@link ToscaModel} proxy on the created {@link Package}.
     */
    @objid ("b7e39ba8-e287-4a16-91c4-1c658f92af3b")
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
    @objid ("cc7c63a7-c077-4049-9b87-15ca0cad43eb")
    public static ToscaModel instantiate(final Package obj) {
        return ToscaModel.canInstantiate(obj) ? new ToscaModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ToscaModel} proxy from a {@link Package} stereotyped << ToscaModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link ToscaModel} proxy.
     */
    @objid ("7f5f7e1e-cdf8-4305-b54b-1ac53641cb17")
    public static ToscaModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (ToscaModel.canInstantiate(obj))
            return new ToscaModel(obj);
        else
            throw new IllegalArgumentException("ToscaModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c4ac1b9b-4591-4296-916d-4905d3c62098")
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
    @objid ("58abb866-1751-448f-8f59-a6cdd5442adc")
    public Package getElement() {
        return this.elt;
    }

    @objid ("c8fd7a5f-5f26-49f3-bd9a-9b0b893d3a12")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e01e266e-6cb4-4ed8-8f76-c9e963863d06")
    protected  ToscaModel(final Package elt) {
        this.elt = elt;
    }

    @objid ("a4723e31-41d3-496c-909f-d63fb570c868")
    public static final class MdaTypes {
        @objid ("46397093-eb87-42f2-afb2-d0aebd08ae56")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ec72465b-ee44-4cce-afc9-a2a34df1b953")
        private static Stereotype MDAASSOCDEP;

        @objid ("42dd48b4-e0c8-4e1e-bb3b-ef7f5ca9229a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bf3aff2d-8e5d-4840-92aa-b8198a85278a")
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
