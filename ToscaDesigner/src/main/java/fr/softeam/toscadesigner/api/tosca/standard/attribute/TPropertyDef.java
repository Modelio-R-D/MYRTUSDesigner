/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/09/2024 13:03 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Attribute} with << TPropertyDef >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("852b71fd-c5a6-4ed8-a584-41151572f10f")
public class TPropertyDef implements IMdaProxy {
    @objid ("6a6963ed-2662-4445-8376-f89f5f35f297")
    public static final String STEREOTYPE_NAME = "TPropertyDef";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     * 
     */
    @objid ("88c5d8bf-43f4-4899-b814-84935954b415")
    protected final Attribute elt;

    /**
     * Tells whether a {@link TPropertyDef proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TPropertyDef >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e348c3c6-409c-48f4-87f9-dfe4723f80f8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (TPropertyDef.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(TPropertyDef.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TPropertyDef >> then instantiate a {@link TPropertyDef} proxy.
     * @return a {@link TPropertyDef} proxy on the created {@link Attribute}.
     */
    @objid ("df616e6b-b363-4520-8ecc-6a0b3162a953")
    public static TPropertyDef create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Attribute");
        e.getExtension().add(TPropertyDef.MdaTypes.STEREOTYPE_ELT);
        return TPropertyDef.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link TPropertyDef} proxy from a {@link Attribute} stereotyped << TPropertyDef >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link TPropertyDef} proxy or <i>null</i>.
     */
    @objid ("184adf6c-937b-434a-a599-683cb73fc013")
    public static TPropertyDef instantiate(final Attribute obj) {
        return TPropertyDef.canInstantiate(obj) ? new TPropertyDef(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPropertyDef} proxy from a {@link Attribute} stereotyped << TPropertyDef >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link TPropertyDef} proxy.
     */
    @objid ("87c523a0-74a7-481c-a1eb-b16be1609f09")
    public static TPropertyDef safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TPropertyDef.canInstantiate(obj))
            return new TPropertyDef(obj);
        else
            throw new IllegalArgumentException("TPropertyDef: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f4f35a7d-b358-4f9c-aa90-77e9ac88c4e9")
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
        TPropertyDef other = (TPropertyDef) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}.
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("b65eb770-4ee2-407b-854f-74c39524155f")
    public Attribute getElement() {
        return this.elt;
    }

    /**
     * Get the value of the 'name' role.<p>
     * Role description:
     * null
     */
    @objid ("3efe15e8-2b96-4732-8930-79a8cbba7b33")
    public PropertyDefinitionType getName() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TPropertyDef.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TPropertyDef.MdaTypes.MDAASSOCDEP_ROLE), "name")
                  && PropertyDefinitionType.canInstantiate(d.getDependsOn())) {
                     return (PropertyDefinitionType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("2476c3be-edf3-4b0b-a433-da4917b384b2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'name' role.<p>
     * Role description:
     * null
     */
    @objid ("13cd4297-b7c1-45b1-8bd9-f584aecd6701")
    public void setName(final PropertyDefinitionType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TPropertyDef.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TPropertyDef.MdaTypes.MDAASSOCDEP_ROLE), "name")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TPropertyDef.MdaTypes.MDAASSOCDEP);
              dep.setName("name");      dep.putTagValue(TPropertyDef.MdaTypes.MDAASSOCDEP_ROLE, "name");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("8288e77e-3bbe-4036-8c1a-59f6c94eb9d7")
    protected  TPropertyDef(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("38033de9-5f63-44ad-9149-ce0ea1c852b5")
    public static final class MdaTypes {
        @objid ("52cd11f5-7945-4cec-a83b-870b83f33efb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4a5f2743-85e2-42a9-acc0-a3ebb7652310")
        private static Stereotype MDAASSOCDEP;

        @objid ("0b4770ef-4ea4-420d-8d95-0a7a9e10b260")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("59c7d852-257c-403b-b7db-feeca2d9d35a")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "a5792de9-2c94-4367-970b-d370cf7c1555", "TPropertyDef");
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
