/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 12:14 by Modelio Studio.
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
    @objid ("a4158a0e-a0e2-4052-94ea-83bd3276319d")
    public static final String STEREOTYPE_NAME = "TGroupType";

    /**
     * Tells whether a {@link TGroupType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TGroupType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c18bb77c-8665-48ed-928b-b9611a770847")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TGroupType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TGroupType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TGroupType >> then instantiate a {@link TGroupType} proxy.
     * 
     * @return a {@link TGroupType} proxy on the created {@link Class}.
     */
    @objid ("86ca490d-ded5-4dff-a0bf-914bb8e12d8e")
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
    @objid ("1cf0fcd3-6128-4cb9-bdbd-fc7b70870433")
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
    @objid ("aa8fe554-3308-4764-9941-8ec64ebe9622")
    public static TGroupType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TGroupType.canInstantiate(obj))
        	return new TGroupType(obj);
        else
        	throw new IllegalArgumentException("TGroupType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("47df11c2-a599-4e50-9cb3-dea289785647")
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
    @objid ("1d982a0c-bb9c-4c29-b99c-27ccb55cef30")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("7ab17058-a117-4cc9-a882-3f9f9fe308b3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("c1a8fcb2-46e0-4bb3-aa2d-17ee5b44f474")
    protected  TGroupType(final Class elt) {
        super(elt);
    }

    @objid ("95f59d83-2128-4004-9924-10b684ba49ab")
    public static final class MdaTypes {
        @objid ("3bea30d8-1187-4d0a-9ec9-550208efb076")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6deae155-eb2c-4da4-a9a7-257f1094a111")
        private static Stereotype MDAASSOCDEP;

        @objid ("c6dc9f2f-6ce2-4571-a23e-0a8b37bd97c9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("018c338c-15a1-42ce-b8c1-2dcd7e7270c4")
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
