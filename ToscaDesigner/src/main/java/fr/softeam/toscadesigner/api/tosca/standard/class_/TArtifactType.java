/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:09 by Modelio Studio.
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
@objid ("cd8fe258-8aef-43b9-a245-9aa7d6d7d121")
public class TArtifactType extends TEntityType implements IMdaProxy {
    @objid ("22840f72-a966-4d13-9f88-2608e4131b92")
    public static final String STEREOTYPE_NAME = "TArtifactType";

    /**
     * Tells whether a {@link TArtifactType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TArtifactType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0dd7b67f-f7ba-4618-a6a2-11d0d63d5fe2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TArtifactType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TArtifactType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TArtifactType >> then instantiate a {@link TArtifactType} proxy.
     * 
     * @return a {@link TArtifactType} proxy on the created {@link Class}.
     */
    @objid ("b9a7b476-e062-4d2f-9148-4349c6a25bad")
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
    @objid ("edaf5c70-ec29-4e42-b44b-ed3e666372f2")
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
    @objid ("0eed7797-527e-4cad-80fe-7fa389c14000")
    public static TArtifactType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TArtifactType.canInstantiate(obj))
        	return new TArtifactType(obj);
        else
        	throw new IllegalArgumentException("TArtifactType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b7d01563-4869-4135-864c-8055ec206c12")
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
    @objid ("1cc00bc6-8138-4056-97e5-2e57cb0b4842")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("7bf3028c-4517-4300-91da-9daaf0bb79a2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("03c9d7b6-54db-452d-83b7-463886285728")
    protected  TArtifactType(final Class elt) {
        super(elt);
    }

    @objid ("9d82a6d2-e52e-40eb-a09b-5b67a48f1336")
    public static final class MdaTypes {
        @objid ("fe21e3a9-200b-447c-bd44-0ed096bd1c30")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("64664b34-8d8c-4b8e-9a82-4356136f132d")
        private static Stereotype MDAASSOCDEP;

        @objid ("2b0eedaa-66b8-4af4-9333-4343afc3ecc6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4b75022a-43d5-4618-8c63-eb483513cb38")
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
