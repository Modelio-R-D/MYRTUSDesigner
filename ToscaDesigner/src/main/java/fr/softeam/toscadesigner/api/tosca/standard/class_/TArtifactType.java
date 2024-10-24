/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 17/10/2024 12:15 by Modelio Studio.
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
    @objid ("b76ddb2d-8015-48f9-afff-96465c66f615")
    public static final String STEREOTYPE_NAME = "TArtifactType";

    /**
     * Tells whether a {@link TArtifactType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TArtifactType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1850adb7-7ea3-438a-bcdf-e330b028a70e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TArtifactType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TArtifactType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TArtifactType >> then instantiate a {@link TArtifactType} proxy.
     * @return a {@link TArtifactType} proxy on the created {@link Class}.
     */
    @objid ("e8dde65c-987c-47b6-ac35-9f9f12f2a2f3")
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
    @objid ("5794a16a-4000-434b-88c3-1789dd1807f4")
    public static TArtifactType instantiate(final Class obj) {
        return TArtifactType.canInstantiate(obj) ? new TArtifactType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TArtifactType} proxy from a {@link Class} stereotyped << TArtifactType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TArtifactType} proxy.
     */
    @objid ("8d70b146-c475-4651-a7f1-434fd2f6de38")
    public static TArtifactType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TArtifactType.canInstantiate(obj))
            return new TArtifactType(obj);
        else
            throw new IllegalArgumentException("TArtifactType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("47521edf-86bb-4352-8af7-293e033158ff")
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
    @objid ("ad7e9b6e-cd15-4edb-9975-45b15e00a405")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("73e95d26-5deb-4239-8dff-6f4d8fffae7b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("71876ae3-1712-44fb-bad5-462bf1af37fe")
    protected  TArtifactType(final Class elt) {
        super(elt);
    }

    @objid ("6997d70c-4755-49ef-b28a-e3397b4b558b")
    public static final class MdaTypes {
        @objid ("f7a410cc-d107-4876-87f4-f340cb5c4e2d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6dc15d62-c709-4f03-8da2-8167f1f6e90d")
        private static Stereotype MDAASSOCDEP;

        @objid ("d1faf7c3-95fe-450a-b4d9-5149b31ad050")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6f944a04-fe9b-42af-be08-3f78c1ce51cb")
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
