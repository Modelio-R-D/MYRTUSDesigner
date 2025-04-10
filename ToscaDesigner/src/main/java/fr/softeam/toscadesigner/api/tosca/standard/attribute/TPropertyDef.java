/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 10:12 by Modelio Studio.
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
@objid ("3563d852-a18e-4b8c-b3d7-546fa69f40ed")
public class TPropertyDef implements IMdaProxy {
    @objid ("3652e65c-a582-4a52-94fe-26cbeb892c65")
    public static final String STEREOTYPE_NAME = "TPropertyDef";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("e14eed31-732b-4c3b-b9db-54793858c840")
    protected final Attribute elt;

    /**
     * Tells whether a {@link TPropertyDef proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TPropertyDef >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4130d5e6-a1d9-4506-966a-eee8fe1d19fb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (TPropertyDef.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(TPropertyDef.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TPropertyDef >> then instantiate a {@link TPropertyDef} proxy.
     * 
     * @return a {@link TPropertyDef} proxy on the created {@link Attribute}.
     */
    @objid ("12d8aaa7-5d69-4286-a6a6-606cc5ebd7ce")
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
    @objid ("abf3d275-0596-4743-b2fd-7eec605d5d12")
    public static TPropertyDef instantiate(final Attribute obj) {
        return TPropertyDef.canInstantiate(obj) ? new TPropertyDef(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPropertyDef} proxy from a {@link Attribute} stereotyped << TPropertyDef >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link TPropertyDef} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cc5e607a-0db7-47d5-8fbd-160452030441")
    public static TPropertyDef safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TPropertyDef.canInstantiate(obj))
        	return new TPropertyDef(obj);
        else
        	throw new IllegalArgumentException("TPropertyDef: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("667fc8fa-f0df-4019-a82a-1b2feabf01be")
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
    @objid ("ba49d935-184b-4311-a60e-7fe76575ef8a")
    public Attribute getElement() {
        return this.elt;
    }

    /**
     * Get the value of the 'name' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6200a466-b176-4e8e-95ef-f7bd01784d38")
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

    @objid ("2bc962b8-189a-4705-961e-bd06c3593809")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Set the value of the 'name' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c90bc82a-daae-413c-9e5c-c312d316670b")
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

    @objid ("512fd357-4d22-41e1-873f-4fc5396045dd")
    protected  TPropertyDef(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("8b43ca2a-64a0-4f68-9647-c88c59a98c0b")
    public static final class MdaTypes {
        @objid ("e7ab1075-9f99-455b-b086-b4fa3b0051f2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0ee1eef7-d9df-484b-ba47-34521d26a1d7")
        private static Stereotype MDAASSOCDEP;

        @objid ("f84235af-6f8c-4ae8-87d1-fcb5a23dc1b6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2ad02b28-1e13-4a02-a018-da0fb298e467")
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
