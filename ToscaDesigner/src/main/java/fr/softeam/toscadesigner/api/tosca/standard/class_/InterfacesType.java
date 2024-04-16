/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/04/2024 16:51 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << InterfacesType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e1ec5352-a78e-4a35-919a-fdf3a09eb4eb")
public class InterfacesType implements IMdaProxy {
    @objid ("831b98b3-0ff7-4b75-8e14-ec0a055290ee")
    public static final String STEREOTYPE_NAME = "InterfacesType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("34e8f07e-bb3e-4a47-a9d0-949f64b30a25")
    protected final Class elt;

    /**
     * Tells whether a {@link InterfacesType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << InterfacesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ea3393cc-677d-48fc-8230-21ab81d60927")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (InterfacesType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(InterfacesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << InterfacesType >> then instantiate a {@link InterfacesType} proxy.
     * 
     * @return a {@link InterfacesType} proxy on the created {@link Class}.
     */
    @objid ("4ce5d045-a272-4143-8e39-f59ef1a0dbd0")
    public static InterfacesType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(InterfacesType.MdaTypes.STEREOTYPE_ELT);
        return InterfacesType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link InterfacesType} proxy from a {@link Class} stereotyped << InterfacesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link InterfacesType} proxy or <i>null</i>.
     */
    @objid ("eead8460-3b56-43a2-8390-bac015dd421f")
    public static InterfacesType instantiate(final Class obj) {
        return InterfacesType.canInstantiate(obj) ? new InterfacesType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InterfacesType} proxy from a {@link Class} stereotyped << InterfacesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link InterfacesType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fabc3191-f4ae-4e6b-a3e0-e65fac475db5")
    public static InterfacesType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (InterfacesType.canInstantiate(obj))
        	return new InterfacesType(obj);
        else
        	throw new IllegalArgumentException("InterfacesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cb51b978-c8bb-4d2a-a049-38c69ecbad25")
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
        InterfacesType other = (InterfacesType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("b81fcf06-ac45-4fa9-ab8f-5279e17243c1")
    public Class getElement() {
        return this.elt;
    }

    @objid ("8d1a7e52-10b1-4292-9739-d33f49b1c499")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("aa2d7a13-7ff0-4c04-895e-89c6cab8a38d")
    protected  InterfacesType(final Class elt) {
        this.elt = elt;
    }

    @objid ("4309b581-0dd9-4e5c-a770-380b5c620f46")
    public static final class MdaTypes {
        @objid ("8446c300-f78e-471d-a56d-b68bec7dfe83")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("073a86f8-bf21-46b6-855c-6a8818444fd5")
        private static Stereotype MDAASSOCDEP;

        @objid ("e62a7c70-8283-4379-a032-132fdf04a0fe")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("02138004-88a9-4a75-8382-5cc5bcb0d9dd")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "52b9c42d-29c2-4a9c-a9af-c3d178e32339", "InterfacesType");
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
