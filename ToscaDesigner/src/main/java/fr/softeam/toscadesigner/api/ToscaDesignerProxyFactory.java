/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 08/03/2024 09:55 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api;

import com.modeliosoft.modelio.api.module.mda.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.visitors.IDefaultModelVisitor;
import org.modelio.metamodel.visitors.IInfrastructureVisitor;

/**
 * Factory that instantiates the right proxy class for a model element stereotyped by a 'ToscaDesigner' module stereotype.
 * <h2>Module description:</h2>
 * <br/><i>null</i></p>
 * <h2>Supported stereotypes:</h2>
 * <ul><li><< ArtifactTemplate >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ArtifactTemplate}
 * <li><< CapabilitiesType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link CapabilitiesType}
 * <li><< CapabilityDefinitionsType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link CapabilityDefinitionsType}
 * <li><< ConstraintsType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ConstraintsType}
 * <li><< InstanceStateType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link InstanceStateType}
 * <li><< InterfacesType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link InterfacesType}
 * <li><< MaxInstancesType >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link MaxInstancesType}
 * <li><< PoliciesType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link PoliciesType}
 * <li><< RelationshipConstraintType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RelationshipConstraintType}
 * <li><< RelationshipConstraintsType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RelationshipConstraintsType}
 * <li><< RelationshipOperationType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RelationshipOperationType}
 * <li><< RequirementDefinitionsType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RequirementDefinitionsType}
 * <li><< RequirementsType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RequirementsType}
 * <li><< SourceElementType >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link SourceElementType}
 * <li><< TCapability >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TCapability}
 * <li><< TCapabilityDefinition >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TCapabilityDefinition}
 * <li><< TDeploymentArtifact >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TDeploymentArtifact}
 * <li><< TDeploymentArtifacts >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TDeploymentArtifacts}
 * <li><< TExtensibleElements >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TExtensibleElements}
 * <li><< TNodeTemplate >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TNodeTemplate}
 * <li><< TNodeType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TNodeType}
 * <li><< TPolicy >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TPolicy}
 * <li><< TRelationshipTemplate >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TRelationshipTemplate}
 * <li><< TRequirement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TRequirement}
 * <li><< TRequirementDefinition >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TRequirementDefinition}
 * <li><< TTopologyElementInstanceStates >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TTopologyElementInstanceStates}
 * <li><< TTopologyTemplate >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TTopologyTemplate}
 * <li><< TargetElementType >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link TargetElementType}
 * <li><< ToscaModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link ToscaModel}
 * <li><< TServiceTemplate >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TServiceTemplate}
 * <li><< TRelationshipType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TRelationshipType}
 * <li><< CloudServiceArchiveDiagram >> on a {@link org.modelio.metamodel.diagrams.StaticDiagram}: instantiates a {@link CloudServiceArchiveDiagram}
 * <li><< ServiceTemplateDiagram >> on a {@link org.modelio.metamodel.diagrams.StaticDiagram}: instantiates a {@link ServiceTemplateDiagram}
 * <li><< TopologyTemplateDiagram >> on a {@link org.modelio.metamodel.diagrams.StaticDiagram}: instantiates a {@link TopologyTemplateDiagram}
 * </ul>
 */
@objid ("365cd17d-2d04-4020-839d-7e7bdefdf43f")
public class ToscaDesignerProxyFactory {
    @objid ("716c6fce-0d5f-469a-aaf5-bdc92cec1c88")
    private static final String ASSETNAME = "ToscaDesigner";

    @objid ("cc3db72f-6cf5-40dd-a9aa-26302b93b266")
    private static final InstantiateVisitor instantiateVisitor = new InstantiateVisitor();

    /**
     * @param session The modeling session this factory is operating in.
     */
    @objid ("4423cbcf-44fe-45b2-a98d-7ab590cfca53")
    public static final void initialize(final IModelingSession session) throws MdaProxyException {
        fr.softeam.toscadesigner.api.tosca.standard.class_.ArtifactTemplate.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.CapabilitiesType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.CapabilityDefinitionsType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.ConstraintsType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.InstanceStateType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.InterfacesType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.datatype.MaxInstancesType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.PoliciesType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.RelationshipConstraintType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.RelationshipConstraintsType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.RelationshipOperationType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementDefinitionsType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementsType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.datatype.SourceElementType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TCapability.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinition.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifact.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifacts.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TExtensibleElements.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TPolicy.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipTemplate.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirement.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirementDefinition.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyElementInstanceStates.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyTemplate.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.datatype.TargetElementType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.package_.ToscaModel.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TServiceTemplate.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.CloudServiceArchiveDiagram.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.ServiceTemplateDiagram.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.TopologyTemplateDiagram.MdaTypes.init(session);
        
    }

    /**
     * Instantiates the right proxy class the given element.
     * <br/>The model element must be stereotyped by a 'ToscaDesigner' module stereotype.
     * <br/>In the other case the method will return <i>null</i>.
     * 
     * @param e A model element
     * @return the right proxy or <i>null</i>.
     */
    @objid ("615529d6-370e-46b2-ac8c-9110d23f23e2")
    public static final Object instantiate(final ModelElement e) {
        for (Stereotype s : e.getExtension()) {
              ModuleComponent module = s.getModule();
              if (module != null && module.getName().equals(ASSETNAME)) {
                  return instantiate(e, s.getName());
              }
        }
        return null;
    }

    /**
     * Instantiates the right proxy class the given element with a stereotype name.
     * The stereotype must be one of the 'ToscaDesigner' module stereotypes.
     * In the other case the method will return <i>null</i>.
     * 
     * @param e A model element.
     * @param stName A stereotype name.
     * @return the right proxy or <i>null</i>.
     */
    @objid ("63d4888e-3356-4cc1-a0ca-b11e36213183")
    public static final Object instantiate(final Element e, final String stName) {
        instantiateVisitor.setStereotype(stName);
        return e.accept(instantiateVisitor);
    }

    @objid ("debac363-8f6a-4f01-b4d9-2e0d218354ff")
    private static class InstantiateVisitor implements IDefaultModelVisitor {
        @objid ("47a91884-5548-405e-be6e-132fe14d6b52")
        private String stName;

        @objid ("17259c67-4ade-43ef-8fa5-2b8909782888")
        public final void setStereotype(final String stName) {
            this.stName = stName;
        }

        @objid ("d5cc1b4b-f7c1-4152-94aa-a69111ef8df2")
        @Override
        public final Object visitPackage(Package obj) {
            switch (this.stName) {
            	case fr.softeam.toscadesigner.api.tosca.standard.package_.ToscaModel.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.package_.ToscaModel.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitPackage(obj);
            
        }

        @objid ("e3ddc2a6-85b3-49d9-9a16-b5246620d8a5")
        @Override
        public final Object visitDataType(DataType obj) {
            switch (this.stName) {
            	case fr.softeam.toscadesigner.api.tosca.standard.datatype.MaxInstancesType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.datatype.MaxInstancesType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.datatype.SourceElementType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.datatype.SourceElementType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.datatype.TargetElementType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.datatype.TargetElementType.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitDataType(obj);
            
        }

        @objid ("807ae560-f337-4272-9b53-ecc5eb8ebc7c")
        @Override
        public final Object visitClass(Class obj) {
            switch (this.stName) {
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.ArtifactTemplate.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.ArtifactTemplate.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.CapabilitiesType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.CapabilitiesType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.CapabilityDefinitionsType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.CapabilityDefinitionsType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.ConstraintsType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.ConstraintsType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.InstanceStateType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.InstanceStateType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.InterfacesType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.InterfacesType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.PoliciesType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.PoliciesType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.RelationshipConstraintType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.RelationshipConstraintType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.RelationshipConstraintsType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.RelationshipConstraintsType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.RelationshipOperationType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.RelationshipOperationType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementDefinitionsType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementDefinitionsType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementsType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementsType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TCapability.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TCapability.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinition.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinition.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifact.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifact.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifacts.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifacts.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TExtensibleElements.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TExtensibleElements.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TPolicy.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TPolicy.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipTemplate.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipTemplate.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirement.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirement.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirementDefinition.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirementDefinition.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyElementInstanceStates.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyElementInstanceStates.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyTemplate.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyTemplate.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TServiceTemplate.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TServiceTemplate.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipType.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitClass(obj);
            
        }

        @objid ("c635b414-dd38-4f86-aba1-b0ea64935785")
        @Override
        public final Object visitStaticDiagram(StaticDiagram obj) {
            switch (this.stName) {
            	case fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.CloudServiceArchiveDiagram.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.CloudServiceArchiveDiagram.instantiate(obj);
            	case fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.ServiceTemplateDiagram.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.ServiceTemplateDiagram.instantiate(obj);
            	case fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.TopologyTemplateDiagram.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.TopologyTemplateDiagram.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitStaticDiagram(obj);
            
        }

        /**
         * Get the visitor to delegate to when a {@link IInfrastructureVisitor} is needed.
         * <p>If null is returned the caller will return null.
         * @return the {@link IInfrastructureVisitor} visitor or <i>null</i>.
         */
        @objid ("bfae3266-80eb-4473-b85c-f6fe990c2f7b")
        @Override
        public IInfrastructureVisitor getInfrastructureVisitor() {
            return null;
        }

    }

}
