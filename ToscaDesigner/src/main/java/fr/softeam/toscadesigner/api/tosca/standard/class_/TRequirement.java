/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/06/2024 17:18 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4a4370e1-8e19-4060-b016-76e600933ec5")
public class TRequirement implements IMdaProxy {
    @objid ("e3dc0eac-2a4b-4d00-99db-cb2f06fe39ab")
    public static final String STEREOTYPE_NAME = "TRequirement";

    @objid ("fbfe2a91-9368-49a5-84f3-cea42c683b12")
    public static final String NAME_PROPERTY = "name";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("d4ad1e44-9098-44d0-840c-c34d988bca88")
    protected final Class elt;

    /**
     * Tells whether a {@link TRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("43b4546b-f97f-4dc1-b7f5-5078353651cc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirement.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirement >> then instantiate a {@link TRequirement} proxy.
     * 
     * @return a {@link TRequirement} proxy on the created {@link Class}.
     */
    @objid ("829493cc-8c16-469d-be8b-12173f6ae36b")
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
    @objid ("df89197e-edc8-4dad-83f5-b2f1c9eb3930")
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
    @objid ("91c4ff4a-921e-4b16-aee0-50a60e19e5ef")
    public static TRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRequirement.canInstantiate(obj))
        	return new TRequirement(obj);
        else
        	throw new IllegalArgumentException("TRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a4d5d1ee-f0a7-4a1d-b8d1-b27e7620cb60")
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
    @objid ("35e9ce3d-3d09-4a80-bbb3-12f2857d209b")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TRequirement.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5696c629-53c1-46c0-bec2-c416a214c449")
    public String getName() {
        String value = this.elt.getProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                                            TRequirement.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirement.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirement.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("4fadba56-3765-433f-ba6c-3eccb233e94a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TRequirement.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("02514b6c-0da8-46eb-91b1-a720fcdab02f")
    public void setName(final String value) {
        this.elt.setProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                             TRequirement.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirement.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    @objid ("dd291f95-eeb3-437f-a436-d4629fe58923")
    protected  TRequirement(final Class elt) {
        this.elt = elt;
    }

    @objid ("fce79519-5318-4017-b27f-63fe4e4ceee1")
    public static final class MdaTypes {
        @objid ("5a12a317-fe38-48b3-82db-0959245d29bf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7130d594-eee4-4026-994c-ca05fdb00935")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("f393b3b7-f83e-4b6e-b2db-1d5cef5578e7")
        private static Stereotype MDAASSOCDEP;

        @objid ("74ba3bab-6264-42fa-b7db-f490a7f5a59b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("087bd429-f099-4f6a-af45-32baaf521a5a")
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
