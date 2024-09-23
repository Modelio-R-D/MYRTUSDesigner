/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 23/09/2024 12:50 by Modelio Studio.
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
    @objid ("ae135db3-a5c4-4edb-8c60-fc7731b43cf1")
    public static final String STEREOTYPE_NAME = "TPropertyDef";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("908cc5e9-b690-4374-b748-e6840823a0ac")
    protected final Attribute elt;

    /**
     * Tells whether a {@link TPropertyDef proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TPropertyDef >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f3dac565-3d94-429b-bccb-aa72e922ce41")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (TPropertyDef.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(TPropertyDef.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TPropertyDef >> then instantiate a {@link TPropertyDef} proxy.
     * 
     * @return a {@link TPropertyDef} proxy on the created {@link Attribute}.
     */
    @objid ("824760af-2294-4254-8092-81d29914a72d")
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
    @objid ("03b4c10b-b77e-4a14-9fe8-7f4c10b6661d")
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
    @objid ("02146acf-5dde-494f-8911-ccdf8608709e")
    public static TPropertyDef safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TPropertyDef.canInstantiate(obj))
        	return new TPropertyDef(obj);
        else
        	throw new IllegalArgumentException("TPropertyDef: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b3fef0f9-9cff-415a-a27c-c866540dbe3c")
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
    @objid ("b8548797-e7b3-4e28-b1df-55c7ef474a4c")
    public Attribute getElement() {
        return this.elt;
    }

    /**
     * Get the value of the 'name' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("304f752d-c109-45bb-adeb-4ed8f474a265")
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

    @objid ("5a47b1fa-fdc2-44c2-92f1-bb1c41c5254c")
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
    @objid ("f8659917-452a-47fd-9c01-a418777c9282")
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

    @objid ("b3f49403-8876-4a78-aa64-eb2bc2525bd4")
    protected  TPropertyDef(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("38033de9-5f63-44ad-9149-ce0ea1c852b5")
    public static final class MdaTypes {
        @objid ("84c94981-3036-4324-acb3-6347b9c1b609")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f91789f1-6dc2-4401-8985-eb06a1176291")
        private static Stereotype MDAASSOCDEP;

        @objid ("131072a8-ea7c-4596-b966-54ac44e8c5b4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("841fd960-6378-4af1-b18b-333aa36526ec")
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
