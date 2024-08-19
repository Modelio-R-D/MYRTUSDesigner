/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 02/08/2024 16:15 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

import java.util.ArrayList;
import java.util.List;

import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Proxy class to handle a {@link Class} with << TRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7441d43a-6384-456d-a82a-7133317114d4")
public class TRequirement implements IMdaProxy {
    @objid ("fa42bcd7-9153-46c0-81e2-8412fd154d40")
    public static final String STEREOTYPE_NAME = "TRequirement";

    @objid ("6af2854b-5cf4-46d9-a869-81b2f20730b9")
    public static final String NAME_PROPERTY = "name";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("2e9e42c3-4c05-449e-82cd-8911ef45d3be")
    protected final Class elt;

    /**
     * Tells whether a {@link TRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0e5eaa77-8bc9-4254-b6fc-285a11a316d9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirement.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirement >> then instantiate a {@link TRequirement} proxy.
     * 
     * @return a {@link TRequirement} proxy on the created {@link Class}.
     */
    @objid ("095885f0-adaa-46a5-a981-2d74a3b0c5ff")
    public static TRequirement create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TRequirement.MdaTypes.STEREOTYPE_ELT);
        return TRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TRequirement} proxy from a {@link Class} stereotyped << TRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TRequirement} proxy or <i>null</i>.
     */
    @objid ("da75b5b6-ccca-4637-8096-9a89d4bca648")
    public static TRequirement instantiate(final Class obj) {
        return TRequirement.canInstantiate(obj) ? new TRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRequirement} proxy from a {@link Class} stereotyped << TRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e5f29746-5ed7-4cfe-b1a1-ff751f8d5dfe")
    public static TRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRequirement.canInstantiate(obj))
        	return new TRequirement(obj);
        else
        	throw new IllegalArgumentException("TRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("227e8b12-d882-4c31-9197-470f3dcd2897")
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
        TRequirement other = (TRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("ff3929ea-d34e-427c-9f0c-f7c77ca98f25")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TRequirement.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("84f3a5e5-a0d5-4ab8-b1a5-29ee9c479116")
    public String getName() {
        String value = this.elt.getProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                                            TRequirement.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirement.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirement.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("3ae9b552-bbe5-4632-a7b0-0d3ce6c1f87f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TRequirement.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("add20341-0629-41e9-afd1-e1a58d90e61f")
    public void setName(final String value) {
        this.elt.setProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                             TRequirement.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirement.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    @objid ("6ec10f55-401d-4431-9e97-71aea17554c3")
    protected  TRequirement(final Class elt) {
        this.elt = elt;
    }

    @objid ("31efaf6b-695c-472a-9430-e6d8d4f1c34a")
    public static final class MdaTypes {
        @objid ("276a5cc5-f273-4edf-a2b5-1c0faefdb5f1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f5a0daad-2353-479b-8e04-f79e576d8ddb")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("ae460948-0649-4782-9ba7-bd268dd2d86e")
        private static Stereotype MDAASSOCDEP;

        @objid ("7e3f23ca-1efb-4f74-8657-b2d8dccf006b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c181e3ba-d0e9-48a9-aa9f-a5b03553b6d0")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "2a38f650-7f59-41a7-a928-ac9cbe326f84", "TRequirement");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "95a52b2f-43dd-469a-b6da-a187ef6573a1", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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
