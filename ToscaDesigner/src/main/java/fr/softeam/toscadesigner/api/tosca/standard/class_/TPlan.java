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
 * Proxy class to handle a {@link Class} with << TPlan >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1e138842-6b33-4a7f-a60f-7e76af1d4268")
public class TPlan implements IMdaProxy {
    @objid ("8eea2a70-e29f-48ca-b62f-429e75d46a87")
    public static final String STEREOTYPE_NAME = "TPlan";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("2fc92f3f-b4db-4b61-976f-ff4660b33f7e")
    protected final Class elt;

    /**
     * Tells whether a {@link TPlan proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TPlan >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("17f87e6c-7105-423d-91eb-e10de51356aa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TPlan.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TPlan.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TPlan >> then instantiate a {@link TPlan} proxy.
     * 
     * @return a {@link TPlan} proxy on the created {@link Class}.
     */
    @objid ("09bad1bd-6f44-44fd-a9d3-b1866d40536a")
    public static TPlan create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TPlan.MdaTypes.STEREOTYPE_ELT);
        return TPlan.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TPlan} proxy from a {@link Class} stereotyped << TPlan >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TPlan} proxy or <i>null</i>.
     */
    @objid ("e91fd5aa-7ab7-4323-a9f4-c27805626cdc")
    public static TPlan instantiate(final Class obj) {
        return TPlan.canInstantiate(obj) ? new TPlan(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPlan} proxy from a {@link Class} stereotyped << TPlan >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TPlan} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9d610f14-ed2a-4834-9d81-1298a367b828")
    public static TPlan safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TPlan.canInstantiate(obj))
        	return new TPlan(obj);
        else
        	throw new IllegalArgumentException("TPlan: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7531e965-a676-46da-904b-8efa3b639c16")
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
        TPlan other = (TPlan) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("1049844c-75fb-4a93-846a-ebf8b8b32ca7")
    public Class getElement() {
        return this.elt;
    }

    @objid ("18c17ab7-dbdc-4297-8868-d766c44e2f3a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("c8968473-bf6e-483b-a2ef-4373069827e0")
    protected  TPlan(final Class elt) {
        this.elt = elt;
    }

    @objid ("3ad66546-8765-4c36-b55f-bd539ebe9a44")
    public static final class MdaTypes {
        @objid ("a60c5731-ef33-4754-92e3-371d35bda2f2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4af82752-bcef-494e-a84c-714451bc66bb")
        private static Stereotype MDAASSOCDEP;

        @objid ("8c9a8c92-54bc-41a4-8c96-f67a101876e4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("028850d4-ef35-4d4a-a4ab-465ee33c6db6")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "182e3894-ba54-49ce-bfdc-c97d06294a29", "TPlan");
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
