/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 18:02 by Modelio Studio.
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
    @objid ("7b222d64-9a1a-48b6-87ec-cd9fd121bdee")
    public static final String STEREOTYPE_NAME = "TPropertyDef";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("3cf78e15-a59d-4a2e-abf2-89723cecfb3f")
    protected final Attribute elt;

    /**
     * Tells whether a {@link TPropertyDef proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TPropertyDef >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("22cce28b-e54d-4807-bc9b-f953289e577d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (TPropertyDef.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(TPropertyDef.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TPropertyDef >> then instantiate a {@link TPropertyDef} proxy.
     * 
     * @return a {@link TPropertyDef} proxy on the created {@link Attribute}.
     */
    @objid ("2b9efdcb-0c54-4d84-890c-d4450e738b30")
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
    @objid ("4aa7248c-2b04-4f54-b671-40788280e418")
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
    @objid ("cb33f13a-497b-47a0-88c7-edc23cb0ecce")
    public static TPropertyDef safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TPropertyDef.canInstantiate(obj))
        	return new TPropertyDef(obj);
        else
        	throw new IllegalArgumentException("TPropertyDef: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8dd1a38f-2a3e-4572-aaf5-4f97bb6f581a")
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
    @objid ("9f863ae3-8aac-4d8b-8948-6be2dd0f3cc3")
    public Attribute getElement() {
        return this.elt;
    }

    /**
     * Get the value of the 'name' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("94354b83-9093-463c-b523-c480ded68293")
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

    @objid ("7af5da23-b17d-46c2-871e-eb25a1f5a62e")
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
    @objid ("38901a4b-349a-4137-a79e-235f12e610f1")
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

    @objid ("6296784c-1ac7-46f0-8b8d-b03d479ad3e0")
    protected  TPropertyDef(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("8b43ca2a-64a0-4f68-9647-c88c59a98c0b")
    public static final class MdaTypes {
        @objid ("ed39135e-6bb9-415a-b5d7-7c498f52fc76")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4e0e2ee0-a73f-472d-aa0a-ffa6a6e05eb3")
        private static Stereotype MDAASSOCDEP;

        @objid ("08ec0332-8f83-4ba8-b710-17b7ecb803e7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("75b58343-e5c3-4f09-9c40-296387299481")
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
