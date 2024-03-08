/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 08/03/2024 09:55 by Modelio Studio.
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
    @objid ("bf2f95e7-8734-4b2d-97ef-a569889f75e0")
    public static final String STEREOTYPE_NAME = "RequirementDefinitionsType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("212a95b4-e074-44cf-90d3-94f97e5662f0")
    protected final Class elt;

    /**
     * Tells whether a {@link RequirementDefinitionsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RequirementDefinitionsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b753f44f-3920-4b7e-b162-96f39d39d70c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RequirementDefinitionsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RequirementDefinitionsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RequirementDefinitionsType >> then instantiate a {@link RequirementDefinitionsType} proxy.
     * 
     * @return a {@link RequirementDefinitionsType} proxy on the created {@link Class}.
     */
    @objid ("cd9ff0b7-e787-47cb-9bf8-5ad104553115")
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
    @objid ("c0bbb053-b964-4a21-b9eb-c706ed9afc24")
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
    @objid ("80240b9d-8be9-4ccc-b90c-a31216e6147b")
    public static RequirementDefinitionsType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RequirementDefinitionsType.canInstantiate(obj))
        	return new RequirementDefinitionsType(obj);
        else
        	throw new IllegalArgumentException("RequirementDefinitionsType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0768fc55-b42c-4615-8d16-3d89cbc6f45a")
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
    @objid ("351448fb-39a3-47de-97a2-3595f31713b8")
    public Class getElement() {
        return this.elt;
    }

    @objid ("ca8fff3d-725b-4c81-930c-02f4c608f1b0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("65985259-80e1-449a-9e93-40e1f973e6bd")
    protected  RequirementDefinitionsType(final Class elt) {
        this.elt = elt;
    }

    @objid ("05569d1f-9ada-45be-bbc5-7f130eb7ff1d")
    public static final class MdaTypes {
        @objid ("fb91c6e5-d553-402a-8775-982dc60834c4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d2dad30b-18d8-484a-b2b3-4e5bcd099b1f")
        private static Stereotype MDAASSOCDEP;

        @objid ("5d041d9e-a55b-4b0b-9485-322c692690a8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("480f3d7f-7a73-466c-bdff-f937ce505fdb")
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
