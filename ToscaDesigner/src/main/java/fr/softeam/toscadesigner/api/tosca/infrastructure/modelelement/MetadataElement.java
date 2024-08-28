/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 27/08/2024 15:42 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import com.modeliosoft.modelio.api.module.mda.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.ToscaDesignerProxyFactory;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ModelingSessionRegistry;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << MetadataElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6d365d23-4bf8-42e9-869a-311f5af24286")
public class MetadataElement implements IMdaProxy {
    @objid ("d107512f-3c26-494d-8e4c-b62479808423")
    public static final String STEREOTYPE_NAME = "MetadataElement";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("d2fef598-c883-4d77-bb22-d789a168d27c")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link MetadataElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << MetadataElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d084084a-3c1c-4c5e-93b2-26c2ff6dc5ff")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (MetadataElement.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(MetadataElement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << MetadataElement >> then instantiate a {@link MetadataElement} proxy.
     * @return a {@link MetadataElement} proxy on the created {@link ModelElement}.
     */
    @objid ("373ace2a-d134-4eb8-b082-7e98d2d03138")
    public static MetadataElement create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(MetadataElement.MdaTypes.STEREOTYPE_ELT);
        return MetadataElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link MetadataElement} proxy from a {@link ModelElement} stereotyped << MetadataElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link MetadataElement} proxy or <i>null</i>.
     */
    @objid ("86d13ade-3317-437e-b4fa-781f55da7b07")
    public static MetadataElement instantiate(final ModelElement obj) {
        return MetadataElement.canInstantiate(obj) ? new MetadataElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetadataElement} proxy from a {@link ModelElement} stereotyped << MetadataElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link MetadataElement} proxy.
     */
    @objid ("2ffa048b-8100-4530-9a50-63e553a57b49")
    public static MetadataElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (MetadataElement.canInstantiate(obj))
            return new MetadataElement(obj);
        else
            throw new IllegalArgumentException("MetadataElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("af686765-3646-42f8-88ef-1d718f3ce880")
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
        MetadataElement other = (MetadataElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}.
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("d4522042-c3d4-41ed-b30f-5cd48bc5994b")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the value of the 'elements' role.<p>
     * Role description:
     * null
     */
    @objid ("f8e26c3d-2f4d-4e46-a1de-062a9eeed486")
    public TPropertyDef getElements() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetadataElement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetadataElement.MdaTypes.MDAASSOCDEP_ROLE), "elements")
                  && TPropertyDef.canInstantiate(d.getDependsOn())) {
                     return (TPropertyDef)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TPropertyDef.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("87f492eb-ea6c-4b62-a979-346f2b6680e8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'elements' role.<p>
     * Role description:
     * null
     */
    @objid ("1c81c3a0-33b5-4aa1-82df-f1cc096da8d3")
    public void setElements(final TPropertyDef obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetadataElement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetadataElement.MdaTypes.MDAASSOCDEP_ROLE), "elements")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetadataElement.MdaTypes.MDAASSOCDEP);
              dep.setName("elements");      dep.putTagValue(MetadataElement.MdaTypes.MDAASSOCDEP_ROLE, "elements");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("fd487014-c941-43a2-851c-9cd074b56d66")
    protected  MetadataElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("c113b757-e176-4bc0-b012-4accfe40922c")
    public static final class MdaTypes {
        @objid ("33bb8136-3cb8-4046-bda8-20845bf0ffc5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c396f54b-1d02-4739-a48f-84a111e857b6")
        private static Stereotype MDAASSOCDEP;

        @objid ("0461fe5d-5bf5-488c-94d5-bb092b5f10b1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("03890bcf-a47f-4f83-a25c-63b313ea2f7b")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "2c20f655-d501-4dde-b82b-ddc16c6d0c0f", "MetadataElement");
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
