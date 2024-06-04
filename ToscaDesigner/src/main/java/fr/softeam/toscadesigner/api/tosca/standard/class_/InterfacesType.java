/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 04/06/2024 17:23 by Modelio Studio.
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
@objid ("55ea0196-26d8-4d3f-9d3e-2fac91330949")
public class InterfacesType implements IMdaProxy {
    @objid ("163843e8-5cc3-4d16-a13d-eacfa2d91d5f")
    public static final String STEREOTYPE_NAME = "InterfacesType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("7d172233-bb66-4995-8454-402ca75597c9")
    protected final Class elt;

    /**
     * Tells whether a {@link InterfacesType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << InterfacesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4a93e226-62c6-48a8-ba23-1e5c49eec075")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (InterfacesType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(InterfacesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << InterfacesType >> then instantiate a {@link InterfacesType} proxy.
     * 
     * @return a {@link InterfacesType} proxy on the created {@link Class}.
     */
    @objid ("e3b8553b-0434-435b-bb35-74f6443456e7")
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
    @objid ("b595f6be-b23f-4263-b407-daf0c56e5de5")
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
    @objid ("91b36582-fccc-491a-b627-0c39a6afd851")
    public static InterfacesType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (InterfacesType.canInstantiate(obj))
        	return new InterfacesType(obj);
        else
        	throw new IllegalArgumentException("InterfacesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8f9c33e8-6e98-4215-82a4-565774f6332b")
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
    @objid ("1fcf8a28-f6fa-46c2-a936-93010c5fb3b0")
    public Class getElement() {
        return this.elt;
    }

    @objid ("e3ccdf8b-35ec-4523-9808-193bb9de6331")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("f8a30ed7-3190-4478-bb15-89ba8eef7809")
    protected  InterfacesType(final Class elt) {
        this.elt = elt;
    }

    @objid ("d51d0870-8b1a-450c-92d1-ff570fb6121e")
    public static final class MdaTypes {
        @objid ("d548d239-94dd-4cc0-b61e-7480ea0b7362")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c7c1048c-74ec-4041-9687-877b8c34f009")
        private static Stereotype MDAASSOCDEP;

        @objid ("5bd54a77-d9dd-450d-9f60-73da2d33c494")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8964bc3c-1a36-4708-9b7a-6d159642766a")
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
