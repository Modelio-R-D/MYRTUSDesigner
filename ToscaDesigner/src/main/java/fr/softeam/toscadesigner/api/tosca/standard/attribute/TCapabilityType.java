/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 25/09/2024 11:42 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Attribute} with << TCapabilityType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("df4c6a7d-ab07-4d7f-807d-a2220e3ed9c9")
public class TCapabilityType implements IMdaProxy {
    @objid ("c17f2470-a36b-4ade-9721-0ffc14a69913")
    public static final String STEREOTYPE_NAME = "TCapabilityType";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("294e551b-476a-4023-a51f-748a6f94d156")
    protected final Attribute elt;

    /**
     * Tells whether a {@link TCapabilityType proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TCapabilityType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("da63d87d-c666-472a-b843-2a20e291e309")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (TCapabilityType.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(TCapabilityType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TCapabilityType >> then instantiate a {@link TCapabilityType} proxy.
     * 
     * @return a {@link TCapabilityType} proxy on the created {@link Attribute}.
     */
    @objid ("7dcc7b72-ba2a-4135-b56c-de8a03de979a")
    public static TCapabilityType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Attribute");
        e.getExtension().add(TCapabilityType.MdaTypes.STEREOTYPE_ELT);
        return TCapabilityType.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link TCapabilityType} proxy from a {@link Attribute} stereotyped << TCapabilityType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link TCapabilityType} proxy or <i>null</i>.
     */
    @objid ("8964cb0e-e1a8-4e40-9b19-24689fc491d1")
    public static TCapabilityType instantiate(final Attribute obj) {
        return TCapabilityType.canInstantiate(obj) ? new TCapabilityType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TCapabilityType} proxy from a {@link Attribute} stereotyped << TCapabilityType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link TCapabilityType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("13293cce-c0cb-4d94-81f3-34f95034016c")
    public static TCapabilityType safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TCapabilityType.canInstantiate(obj))
        	return new TCapabilityType(obj);
        else
        	throw new IllegalArgumentException("TCapabilityType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("24455f2c-f319-4ece-b6dc-686721928079")
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
        TCapabilityType other = (TCapabilityType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("8e932389-dd1a-4dfc-a6e5-142efd572656")
    public Attribute getElement() {
        return this.elt;
    }

    @objid ("222e57b0-6c39-4da0-aaec-267473a7f8f2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("e0398f31-4bee-459a-bcba-baa408bf47c0")
    protected  TCapabilityType(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("4f23151a-ea23-49ca-9cf0-d94cb227254e")
    public static final class MdaTypes {
        @objid ("ba748b6b-f618-4793-81bb-04a4bde2d943")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cf6fb4a9-af89-48b7-9c9f-9433f8288d57")
        private static Stereotype MDAASSOCDEP;

        @objid ("1c3e439d-10b2-4937-a406-40300415e1d8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ff8e29d9-b9ac-4420-845f-f73fd2d33cfb")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "42438c96-0721-406a-a8b9-c4a85931cc60", "TCapabilityType");
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
