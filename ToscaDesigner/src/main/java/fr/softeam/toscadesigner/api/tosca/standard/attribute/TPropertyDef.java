/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 17/10/2024 12:15 by Modelio Studio.
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
    @objid ("524f1d30-1d4f-4ecd-8187-94df1b942272")
    public static final String STEREOTYPE_NAME = "TPropertyDef";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     * 
     */
    @objid ("4e1da3bf-fabe-440e-b54c-ca78e809198f")
    protected final Attribute elt;

    /**
     * Tells whether a {@link TPropertyDef proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TPropertyDef >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("24e2a2b5-988e-451d-bd9c-e6d5835e7d24")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (TPropertyDef.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(TPropertyDef.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TPropertyDef >> then instantiate a {@link TPropertyDef} proxy.
     * @return a {@link TPropertyDef} proxy on the created {@link Attribute}.
     */
    @objid ("c333e72b-fe3d-4717-a95b-3b6b1f60a288")
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
    @objid ("6c06ab80-32c3-40cc-b189-640d3ab6ee0d")
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
    @objid ("9b2fb6e2-075e-4b72-a1d1-70c859417cdb")
    public static TPropertyDef safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TPropertyDef.canInstantiate(obj))
            return new TPropertyDef(obj);
        else
            throw new IllegalArgumentException("TPropertyDef: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("73b96240-461f-403f-9657-17ad64444905")
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
    @objid ("1ce429c5-d922-4100-a139-4efb6632476b")
    public Attribute getElement() {
        return this.elt;
    }

    /**
     * Get the value of the 'name' role.<p>
     * Role description:
     * null
     */
    @objid ("f1ec43fc-5267-4cc0-982f-72eac81cf599")
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

    @objid ("381c6892-dd90-4a02-ad89-daf109e6a8e8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'name' role.<p>
     * Role description:
     * null
     */
    @objid ("bcc85896-4c94-455e-bccf-d1497cb13f80")
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

    @objid ("bb6ec3d1-5e1a-4d66-b768-8a90c2fa7bfe")
    protected  TPropertyDef(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("38033de9-5f63-44ad-9149-ce0ea1c852b5")
    public static final class MdaTypes {
        @objid ("d2a96103-3f69-49a1-b14b-7e914ce183e3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("92bf8d39-afa3-435d-934b-29ebd244b31c")
        private static Stereotype MDAASSOCDEP;

        @objid ("df85f41c-0b18-4cd3-b698-040a4bc5b2d6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2ec6af6b-a698-4ff6-8e65-ef63db2d7fde")
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
