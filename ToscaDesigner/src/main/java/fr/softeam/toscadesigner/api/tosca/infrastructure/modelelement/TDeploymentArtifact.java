/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 02/08/2024 16:15 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.List;

import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Proxy class to handle a {@link ModelElement} with << TDeploymentArtifact >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("102eb1f1-1465-4fd6-8ee2-0415f2690123")
public class TDeploymentArtifact extends TExtensibleElements implements IMdaProxy {
    @objid ("cd4c3c2a-302c-45bd-999b-087f6318357c")
    public static final String STEREOTYPE_NAME = "TDeploymentArtifact";

    @objid ("f3d33fdc-ac97-4d76-90a0-611a8cfadc00")
    public static final String ARTIFACTTYPE_PROPERTY = "artifactType";

    @objid ("bdc72697-39c8-4130-b8fa-b1d2d78e4375")
    public static final String ARTIFACTREF_PROPERTY = "artifactref";

    /**
     * Tells whether a {@link TDeploymentArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TDeploymentArtifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0b4e8f70-71ac-4eb0-b28a-9f1161e28073")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TDeploymentArtifact >> then instantiate a {@link TDeploymentArtifact} proxy.
     * 
     * @return a {@link TDeploymentArtifact} proxy on the created {@link ModelElement}.
     */
    @objid ("b0321965-3a9c-4349-a435-946d8bd8afc6")
    public static TDeploymentArtifact create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT);
        return TDeploymentArtifact.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TDeploymentArtifact} proxy from a {@link ModelElement} stereotyped << TDeploymentArtifact >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TDeploymentArtifact} proxy or <i>null</i>.
     */
    @objid ("d9283b5a-9094-484b-835e-666906facaba")
    public static TDeploymentArtifact instantiate(final ModelElement obj) {
        return TDeploymentArtifact.canInstantiate(obj) ? new TDeploymentArtifact(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TDeploymentArtifact} proxy from a {@link ModelElement} stereotyped << TDeploymentArtifact >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TDeploymentArtifact} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("637eda43-6126-407d-91a8-0c1523526668")
    public static TDeploymentArtifact safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TDeploymentArtifact.canInstantiate(obj))
        	return new TDeploymentArtifact(obj);
        else
        	throw new IllegalArgumentException("TDeploymentArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("26e298ca-806f-4f36-847e-2c155eb7b7b9")
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
        TDeploymentArtifact other = (TDeploymentArtifact) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TDeploymentArtifact.artifactType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("df80380d-8729-484e-8007-65ecf198d814")
    public String getArtifactType() {
        String value = this.elt.getProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TDeploymentArtifact.MdaTypes.ARTIFACTTYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDeploymentArtifact.MdaTypes.ARTIFACTTYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDeploymentArtifact.MdaTypes.ARTIFACTTYPE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDeploymentArtifact.artifactref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("316fd35e-7066-4171-bd87-668800e610d0")
    public String getArtifactref() {
        String value = this.elt.getProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TDeploymentArtifact.MdaTypes.ARTIFACTREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDeploymentArtifact.MdaTypes.ARTIFACTREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDeploymentArtifact.MdaTypes.ARTIFACTREF_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("7be444bd-38ff-460a-b30d-ef6020381c88")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("dbd2f07f-0518-4c2c-9d50-18de2f2f2d22")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TDeploymentArtifact.artifactType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("641f1f5b-2c1e-436d-bb1b-21867b5b2cb4")
    public void setArtifactType(final String value) {
        this.elt.setProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                             TDeploymentArtifact.MdaTypes.ARTIFACTTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDeploymentArtifact.MdaTypes.ARTIFACTTYPE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDeploymentArtifact.artifactref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b89c59f5-add0-44c7-ae6c-06817053ebd9")
    public void setArtifactref(final String value) {
        this.elt.setProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                             TDeploymentArtifact.MdaTypes.ARTIFACTREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDeploymentArtifact.MdaTypes.ARTIFACTREF_PROPERTY_ELT, value));
    }

    @objid ("313b5058-19e2-46fa-b94a-83f5cd14ff70")
    protected  TDeploymentArtifact(final ModelElement elt) {
        super(elt);
    }

    @objid ("430ed3fc-240f-45ff-a143-01f60fe0039f")
    public static final class MdaTypes {
        @objid ("f356ebb8-1e0d-48f0-8a49-8391716653e9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b22c9ff9-5a44-4861-9c94-4d95c5c2f1b5")
        public static PropertyDefinition ARTIFACTTYPE_PROPERTY_ELT;

        @objid ("d1e11a34-aafd-4dad-8478-fdfb8ad352a4")
        public static PropertyDefinition ARTIFACTREF_PROPERTY_ELT;

        @objid ("4c6811ce-5538-4c52-9ea3-3b05dc3104e1")
        private static Stereotype MDAASSOCDEP;

        @objid ("b0b491d6-b203-4387-b056-fb6beb7a810e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dbfd6edc-0988-48a6-a5fd-8fd6eb863c55")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "7c624564-a87e-4058-ab8b-8f6782b68031", "TDeploymentArtifact");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "11b2ec8c-7e88-4012-b051-c5ff3843b3d7", "artifactType");
            ARTIFACTTYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ARTIFACTTYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "7acf9bc4-9dc3-4663-8355-4368413f2578", "artifactref");
            ARTIFACTREF_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ARTIFACTREF_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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
