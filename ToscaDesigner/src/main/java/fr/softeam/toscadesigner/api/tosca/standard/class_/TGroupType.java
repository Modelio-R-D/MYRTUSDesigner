/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 14/01/2025 15:42 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TGroupType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("39f193a1-127c-495d-be75-44587d7d007d")
public class TGroupType extends TEntityType implements IMdaProxy {
    @objid ("1080696e-2351-4064-9aac-6784e471c18b")
    public static final String STEREOTYPE_NAME = "TGroupType";

    /**
     * Tells whether a {@link TGroupType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TGroupType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e279f410-ed95-4bf4-8299-0f9434594cdb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TGroupType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TGroupType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TGroupType >> then instantiate a {@link TGroupType} proxy.
     * 
     * @return a {@link TGroupType} proxy on the created {@link Class}.
     */
    @objid ("255a832c-29e9-43ea-90df-61865894b2e6")
    public static TGroupType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TGroupType.MdaTypes.STEREOTYPE_ELT);
        return TGroupType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TGroupType} proxy from a {@link Class} stereotyped << TGroupType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TGroupType} proxy or <i>null</i>.
     */
    @objid ("1ca426ba-b453-4676-b2fb-0aae56d5289c")
    public static TGroupType instantiate(final Class obj) {
        return TGroupType.canInstantiate(obj) ? new TGroupType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TGroupType} proxy from a {@link Class} stereotyped << TGroupType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TGroupType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("15bd3446-cf26-46b3-8f40-0a957fd1c167")
    public static TGroupType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TGroupType.canInstantiate(obj))
        	return new TGroupType(obj);
        else
        	throw new IllegalArgumentException("TGroupType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fa6c7066-0fc2-44c8-bb81-8310942d685d")
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
        TGroupType other = (TGroupType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("977525d6-8266-4913-a44a-2207602c366c")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("361856ca-6bd4-4aae-bd56-a023637e9119")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("6e902410-89e9-4898-90c5-d7f26553f1be")
    protected  TGroupType(final Class elt) {
        super(elt);
    }

    @objid ("95f59d83-2128-4004-9924-10b684ba49ab")
    public static final class MdaTypes {
        @objid ("31b79f9b-b5c3-4c00-80d8-bee1ae1d843c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5d9a5758-31f2-47d8-9a41-eb963081ad6d")
        private static Stereotype MDAASSOCDEP;

        @objid ("fd342075-d79b-412f-a081-76099110d5c1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f23be104-9a82-4307-8e94-765b259d137f")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "94a5619a-6aed-4b34-a0d8-03e85419ad55", "TGroupType");
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
