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
 * Proxy class to handle a {@link Class} with << TArtifactType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c8bb4135-3f08-4d6f-9858-b26ac8816f7c")
public class TArtifactType extends TEntityType implements IMdaProxy {
    @objid ("976606d0-cee8-4cdb-9efc-b3b1b7b347be")
    public static final String STEREOTYPE_NAME = "TArtifactType";

    /**
     * Tells whether a {@link TArtifactType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TArtifactType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bc43d574-b5d6-4b12-8111-b1fb7d99d81c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TArtifactType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TArtifactType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TArtifactType >> then instantiate a {@link TArtifactType} proxy.
     * 
     * @return a {@link TArtifactType} proxy on the created {@link Class}.
     */
    @objid ("e5769b4f-2607-4dad-943f-163954515d6d")
    public static TArtifactType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TArtifactType.MdaTypes.STEREOTYPE_ELT);
        return TArtifactType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TArtifactType} proxy from a {@link Class} stereotyped << TArtifactType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TArtifactType} proxy or <i>null</i>.
     */
    @objid ("17ad4d4c-c4ae-4576-9a9b-dbcd9a4e5205")
    public static TArtifactType instantiate(final Class obj) {
        return TArtifactType.canInstantiate(obj) ? new TArtifactType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TArtifactType} proxy from a {@link Class} stereotyped << TArtifactType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TArtifactType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1f9201e6-9f01-48be-a5d8-e62fc03e7ed6")
    public static TArtifactType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TArtifactType.canInstantiate(obj))
        	return new TArtifactType(obj);
        else
        	throw new IllegalArgumentException("TArtifactType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c6bfa482-e5d3-4d1a-b805-183df82e4c57")
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
        TArtifactType other = (TArtifactType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("ed9d9773-f3b4-421b-a619-b9f8bd8348a1")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("9ab48cb5-f72f-4c18-9fa6-5c1f91af1894")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("d8ae02dd-b7f8-4307-8bb3-194b5e0fe302")
    protected  TArtifactType(final Class elt) {
        super(elt);
    }

    @objid ("6997d70c-4755-49ef-b28a-e3397b4b558b")
    public static final class MdaTypes {
        @objid ("40041e8d-15c3-4360-b958-ae2dade221ae")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("110d2a13-14ae-4257-ae3d-1d36285c91b3")
        private static Stereotype MDAASSOCDEP;

        @objid ("4eed0c89-873a-4093-a304-b8b34576db2b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1accc15d-0194-4d26-beef-ac9a26f22e8d")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "08c1d0af-1987-4d3f-8dda-3b28c1aadcb9", "TArtifactType");
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
