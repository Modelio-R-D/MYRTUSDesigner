/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 12/06/2024 14:58 by Modelio Studio.
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

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.impl.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;

/**
 * Proxy class to handle a {@link Class} with << TRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7441d43a-6384-456d-a82a-7133317114d4")
public class TRequirement implements IMdaProxy {
    @objid ("16ef1707-85bd-40ed-a5bf-eb44da4d81b6")
    public static final String STEREOTYPE_NAME = "TRequirement";

    @objid ("58a2c0db-ff62-4f65-9eae-b8093b88f2d9")
    public static final String NAME_PROPERTY = "name";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("5bc8b778-c391-437c-9e28-3056a87495a5")
    protected final Class elt;

    /**
     * Tells whether a {@link TRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("35e4bb84-3914-4e26-beba-04092d66cf2f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirement.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirement >> then instantiate a {@link TRequirement} proxy.
     * 
     * @return a {@link TRequirement} proxy on the created {@link Class}.
     */
    @objid ("706b0224-2da4-4c9d-bb60-2399b9d36196")
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
    @objid ("71dcd301-91d7-497d-9180-d6d6f21fd9fd")
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
    @objid ("d5979ee9-8a89-44da-a267-f8bd17c4cef4")
    public static TRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRequirement.canInstantiate(obj))
        	return new TRequirement(obj);
        else
        	throw new IllegalArgumentException("TRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("52be171e-03e0-4b77-a819-443934b7427a")
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
    @objid ("513e2e43-2436-4cc9-af0e-3d9df506bd95")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TRequirement.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3ddb796c-ae9d-433e-937f-9073972a4a2a")
    public String getName() {
        String value = this.elt.getProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                                            TRequirement.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirement.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirement.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("b01108b1-48a9-4ddb-a1ef-3f21fe6e54e2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TRequirement.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e6a24bde-01b1-48f2-a648-91207b4a495f")
    public void setName(final String value) {
        this.elt.setProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                             TRequirement.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirement.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    @objid ("e2632f35-6fa1-4c63-aa5a-70e430b086d7")
    protected  TRequirement(final Class elt) {
        this.elt = elt;
    }

    @objid ("31efaf6b-695c-472a-9430-e6d8d4f1c34a")
    public static final class MdaTypes {
        @objid ("634f3036-b520-48a4-a0d6-3a5d0dc14ba0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("83e4ecdf-ede1-481e-80f6-bffaf59e9174")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("42e3a593-27dc-4ff3-a4a0-58309c95c576")
        private static Stereotype MDAASSOCDEP;

        @objid ("7a277691-7a12-4d7f-a370-b1dcd0d3dcfc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8cde6a74-826e-456a-be97-141a922f71b6")
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
