/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 01/03/2024 11:13 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << RequirementDefinitionsType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e02b7157-b142-4eaa-ba5d-6f9cb139176d")
public class RequirementDefinitionsType implements IMdaProxy {
    @objid ("115e0c35-9f8c-4f95-b207-2409f4f09014")
    public static final String STEREOTYPE_NAME = "RequirementDefinitionsType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("57b1c408-a882-486e-b753-dab0b58c2c0a")
    protected final Class elt;

    /**
     * Tells whether a {@link RequirementDefinitionsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RequirementDefinitionsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6ffd6211-afb7-40a4-a6da-1fc9b3b39c85")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RequirementDefinitionsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RequirementDefinitionsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RequirementDefinitionsType >> then instantiate a {@link RequirementDefinitionsType} proxy.
     * 
     * @return a {@link RequirementDefinitionsType} proxy on the created {@link Class}.
     */
    @objid ("8613b89f-441c-458f-bf01-68c92925c17d")
    public static RequirementDefinitionsType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(RequirementDefinitionsType.MdaTypes.STEREOTYPE_ELT);
        return RequirementDefinitionsType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RequirementDefinitionsType} proxy from a {@link Class} stereotyped << RequirementDefinitionsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RequirementDefinitionsType} proxy or <i>null</i>.
     */
    @objid ("c296b2e4-fd49-415c-bd05-59c82cad9db2")
    public static RequirementDefinitionsType instantiate(final Class obj) {
        return RequirementDefinitionsType.canInstantiate(obj) ? new RequirementDefinitionsType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RequirementDefinitionsType} proxy from a {@link Class} stereotyped << RequirementDefinitionsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RequirementDefinitionsType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("35b0f464-de96-40c5-a356-546177e225f3")
    public static RequirementDefinitionsType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RequirementDefinitionsType.canInstantiate(obj))
        	return new RequirementDefinitionsType(obj);
        else
        	throw new IllegalArgumentException("RequirementDefinitionsType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dc1f75a0-8780-4d39-97f8-397b4d087442")
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
        RequirementDefinitionsType other = (RequirementDefinitionsType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("84259c6d-9f1f-464b-adf7-bae3b49e9045")
    public Class getElement() {
        return this.elt;
    }

    @objid ("a5ad08a7-e9b5-47ae-8ba0-ad37fcbb7095")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("a9825b87-4861-4597-a14e-b63a9f263dc1")
    protected  RequirementDefinitionsType(final Class elt) {
        this.elt = elt;
    }

    @objid ("05569d1f-9ada-45be-bbc5-7f130eb7ff1d")
    public static final class MdaTypes {
        @objid ("598048b3-b16c-4d1a-b1db-c435b982ee85")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7adbe16e-4d6d-42a8-a329-1b4d6c8af9e2")
        private static Stereotype MDAASSOCDEP;

        @objid ("f8f07c0a-e563-487d-83cb-d3b22ec65535")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8b05fec7-06d6-42e7-a64a-fb5a2c3bd9d5")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "622c76d1-f337-471e-984a-2af659417163", "RequirementDefinitionsType");
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
