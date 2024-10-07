/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 24/09/2024 16:22 by Modelio Studio.
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
public class TGroupType implements IMdaProxy {
    @objid ("9f6c1f08-43fe-4b12-9f1e-359dce7624d8")
    public static final String STEREOTYPE_NAME = "TGroupType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("5afab056-692f-4e2b-bbf3-a0c19ad29af3")
    protected final Class elt;

    /**
     * Tells whether a {@link TGroupType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TGroupType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("08aad7af-123f-4cd0-9a9c-4a28259dc99c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TGroupType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TGroupType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TGroupType >> then instantiate a {@link TGroupType} proxy.
     * @return a {@link TGroupType} proxy on the created {@link Class}.
     */
    @objid ("969d9edf-3bb0-4acb-bae1-d1b0ccf750d6")
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
    @objid ("67fc93ed-2fbf-451f-ba21-c007c094fe8c")
    public static TGroupType instantiate(final Class obj) {
        return TGroupType.canInstantiate(obj) ? new TGroupType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TGroupType} proxy from a {@link Class} stereotyped << TGroupType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TGroupType} proxy.
     */
    @objid ("b9dab9d1-9872-4d9e-be10-b9c77cbd9578")
    public static TGroupType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TGroupType.canInstantiate(obj))
            return new TGroupType(obj);
        else
            throw new IllegalArgumentException("TGroupType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("68a226e1-1d8a-408d-9b2a-4dd8bae58a37")
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
    @objid ("c337f882-4edf-4256-b92f-db3b6770ba69")
    public Class getElement() {
        return this.elt;
    }

    @objid ("b19eabd1-5e84-41fd-9bbf-7ec2d8734bcc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("78c6f70b-3295-4ba8-97ec-fa10177f121d")
    protected  TGroupType(final Class elt) {
        this.elt = elt;
    }

    @objid ("95f59d83-2128-4004-9924-10b684ba49ab")
    public static final class MdaTypes {
        @objid ("00816e60-2b92-49f1-9e97-23951f68c8e0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5cec17cd-dcf9-4fa5-b0b2-edf18d822532")
        private static Stereotype MDAASSOCDEP;

        @objid ("61d93f3c-ee28-419e-a561-6911059afa6f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fb22daa9-c6d4-4764-be4f-799123288685")
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
