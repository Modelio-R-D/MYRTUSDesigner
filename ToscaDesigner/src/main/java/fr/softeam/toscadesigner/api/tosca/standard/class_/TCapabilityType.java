/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 22/05/2025 15:07 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

import java.util.ArrayList;
import java.util.List;

import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.impl.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;

/**
 * Proxy class to handle a {@link Class} with << TCapabilityType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b5f2d0d9-8204-4766-80f7-e7109b67a5f1")
public class TCapabilityType extends CapabilityStereotype implements IMdaProxy {
    @objid ("d5bdbfc1-eb77-430f-9528-a092a346c4fd")
    public static final String STEREOTYPE_NAME = "TCapabilityType";

    /**
     * Tells whether a {@link TCapabilityType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TCapabilityType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3132f5d6-ded2-4e33-948c-83abcaacf4ce")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TCapabilityType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TCapabilityType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TCapabilityType >> then instantiate a {@link TCapabilityType} proxy.
     * 
     * @return a {@link TCapabilityType} proxy on the created {@link Class}.
     */
    @objid ("744978ca-a227-46e0-8eb0-f919e91d4f59")
    public static TCapabilityType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TCapabilityType.MdaTypes.STEREOTYPE_ELT);
        return TCapabilityType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TCapabilityType} proxy from a {@link Class} stereotyped << TCapabilityType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TCapabilityType} proxy or <i>null</i>.
     */
    @objid ("94dce3f3-f503-4d76-aa52-9d28dacd573f")
    public static TCapabilityType instantiate(final Class obj) {
        return TCapabilityType.canInstantiate(obj) ? new TCapabilityType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TCapabilityType} proxy from a {@link Class} stereotyped << TCapabilityType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TCapabilityType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("28e31915-2e60-4f48-a3e3-054ef7d414e0")
    public static TCapabilityType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TCapabilityType.canInstantiate(obj))
        	return new TCapabilityType(obj);
        else
        	throw new IllegalArgumentException("TCapabilityType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7b4e0143-f651-475d-8479-93ae99c693f2")
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
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("13358bc4-747a-4d1b-a49b-f45735ca0430")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("630e32c3-4d04-4197-985f-c5925462593c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("35a5fadc-c45e-497b-9d3e-21c2cac7707c")
    protected  TCapabilityType(final Class elt) {
        super(elt);
    }

    @objid ("62799cea-dfb7-4558-ae8a-d4727adcadb6")
    public static final class MdaTypes {
        @objid ("3697a92d-2dd9-40d1-b2b9-db8818b3b998")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3e56a2ae-d6e0-445a-aab3-79d42b49c767")
        private static Stereotype MDAASSOCDEP;

        @objid ("dd5b4784-191d-425f-806d-f4866310cc6a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7e52310b-6ea0-4a98-93a3-5823d0839724")
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
