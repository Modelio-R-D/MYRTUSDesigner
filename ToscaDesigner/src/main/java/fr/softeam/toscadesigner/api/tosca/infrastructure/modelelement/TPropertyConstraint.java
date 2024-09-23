/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 23/09/2024 12:50 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TPropertyConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d1e9611d-8cc9-42d2-9081-81d4e72a8d3c")
public class TPropertyConstraint extends TConstraint implements IMdaProxy {
    @objid ("e83a1c95-6655-4901-a705-aba61f1800e6")
    public static final String STEREOTYPE_NAME = "TPropertyConstraint";

    /**
     * Tells whether a {@link TPropertyConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TPropertyConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b7df217e-ea95-4b48-a31b-5d5a18459d3a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TPropertyConstraint.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TPropertyConstraint.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TPropertyConstraint >> then instantiate a {@link TPropertyConstraint} proxy.
     * 
     * @return a {@link TPropertyConstraint} proxy on the created {@link ModelElement}.
     */
    @objid ("7e536ae9-a486-4fec-bf8b-7061b1f3ee77")
    public static TPropertyConstraint create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TPropertyConstraint.MdaTypes.STEREOTYPE_ELT);
        return TPropertyConstraint.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TPropertyConstraint} proxy from a {@link ModelElement} stereotyped << TPropertyConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TPropertyConstraint} proxy or <i>null</i>.
     */
    @objid ("2920749c-b5da-473d-ba64-75a43b5054eb")
    public static TPropertyConstraint instantiate(final ModelElement obj) {
        return TPropertyConstraint.canInstantiate(obj) ? new TPropertyConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPropertyConstraint} proxy from a {@link ModelElement} stereotyped << TPropertyConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TPropertyConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f2b4b0c3-65e6-458a-b6c5-2e3eb1799dd0")
    public static TPropertyConstraint safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TPropertyConstraint.canInstantiate(obj))
        	return new TPropertyConstraint(obj);
        else
        	throw new IllegalArgumentException("TPropertyConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4149a160-a912-4d6b-b56e-644e57fcfe16")
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
        TPropertyConstraint other = (TPropertyConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("799140e4-76c8-445f-ae54-0a9c69f21690")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("4c8d5896-abe0-460b-9841-c425539943fb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("ba86afa3-9d7d-44b7-837d-2f16d0668265")
    protected  TPropertyConstraint(final ModelElement elt) {
        super(elt);
    }

    @objid ("fcc57cd5-12c0-49d3-b5b8-7ef4993285a2")
    public static final class MdaTypes {
        @objid ("16498ad7-2b72-401f-a0b9-6ec2deaf4d82")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a8a71d04-1e3d-4b08-bf98-8dffd687c82c")
        private static Stereotype MDAASSOCDEP;

        @objid ("dbc897b0-8d3a-4791-8c8d-2b194f097c1d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c7ece497-20f2-4328-bfb4-2a7a23e975cf")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "85f116c1-fe2c-435b-a801-c3389c84beef", "TPropertyConstraint");
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
