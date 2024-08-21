/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 16:27 by Modelio Studio.
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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.visitors.IDefaultInfrastructureVisitor;
import org.modelio.metamodel.visitors.IDefaultModelVisitor;
import org.modelio.metamodel.visitors.IInfrastructureVisitor;

/**
 * Factory that instantiates the right proxy class for a model element stereotyped by a 'ToscaDesigner' module stereotype.
 * <h2>Module description:</h2>
 * <br/><i>null</i></p>
 * <h2>Supported stereotypes:</h2>
 * <ul><li><< CloudServiceArchiveDiagram >> on a {@link org.modelio.metamodel.diagrams.StaticDiagram}: instantiates a {@link CloudServiceArchiveDiagram}
 * <li><< ServiceTemplateDiagram >> on a {@link org.modelio.metamodel.diagrams.StaticDiagram}: instantiates a {@link ServiceTemplateDiagram}
 * <li><< TopologyTemplateDiagram >> on a {@link org.modelio.metamodel.diagrams.StaticDiagram}: instantiates a {@link TopologyTemplateDiagram}
 * <li><< ArtifactReferencesType >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link ArtifactReferencesType}
 * <li><< CapabilitiesType >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link CapabilitiesType}
 * <li><< CapabilitiesType1 >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link CapabilitiesType1}
 * <li><< CapabilityDefinitionsType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link CapabilityDefinitionsType}
 * <li><< ConstraintType1 >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link ConstraintType1}
 * <li><< ConstraintsType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ConstraintsType}
 * <li><< DefinitionType >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link DefinitionType}
 * <li><< DocumentRoot >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link DocumentRoot}
 * <li><< ExtensionType >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link ExtensionType}
 * <li><< ImplementationArtifactType >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link ImplementationArtifactType}
 * <li><< ImportElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link ImportElement}
 * <li><< InputParameterType1 >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link InputParameterType1}
 * <li><< InputParametersType >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link InputParametersType}
 * <li><< InstanceStateType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link InstanceStateType}
 * <li><< InterfaceType1 >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link InterfaceType1}
 * <li><< InterfacesType >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link InterfacesType}
 * <li><< MetadataElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link MetadataElement}
 * <li><< NodeOperationType >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link NodeOperationType}
 * <li><< NodeTypeReferenceType >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link NodeTypeReferenceType}
 * <li><< OutputParametersType >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link OutputParametersType}
 * <li><< OutputParametersType1 >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link OutputParametersType1}
 * <li><< PoliciesType >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link PoliciesType}
 * <li><< PoliciesType1 >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link PoliciesType1}
 * <li><< PropertiesDefinitionType >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link PropertiesDefinitionType}
 * <li><< PropertiesType1 >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link PropertiesType1}
 * <li><< PropertyConstraintsType >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link PropertyConstraintsType}
 * <li><< PropertyConstraintsType1 >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link PropertyConstraintsType1}
 * <li><< PropertyMappingsType >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link PropertyMappingsType}
 * <li><< RelationshipConstraintType >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link RelationshipConstraintType}
 * <li><< RelationshipConstraintsType >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link RelationshipConstraintsType}
 * <li><< RelationshipOperationType >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link RelationshipOperationType}
 * <li><< RequirementDefinitionsType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RequirementDefinitionsType}
 * <li><< RequirementsType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RequirementsType}
 * <li><< RequirementsType1 >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link RequirementsType1}
 * <li><< SourceElementType >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link SourceElementType}
 * <li><< SourceInterfacesType >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link SourceInterfacesType}
 * <li><< TAppliesTo >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TAppliesTo}
 * <li><< TArtifactReference >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TArtifactReference}
 * <li><< TArtifactTemplate >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TArtifactTemplate}
 * <li><< TArtifactType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TArtifactType}
 * <li><< TBoundaryDefinitions >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TBoundaryDefinitions}
 * <li><< TCapability >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TCapability}
 * <li><< TCapabilityDefinition >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TCapabilityDefinition}
 * <li><< TCapabilityRef >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TCapabilityRef}
 * <li><< TCondition >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TCondition}
 * <li><< TConstraint >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TConstraint}
 * <li><< TDefinitions >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TDefinitions}
 * <li><< TDeploymentArtifact >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TDeploymentArtifact}
 * <li><< TDeploymentArtifacts >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TDeploymentArtifacts}
 * <li><< TDocumentation >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TDocumentation}
 * <li><< TEntityTemplate >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TEntityTemplate}
 * <li><< TEntityType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TEntityType}
 * <li><< TExportedInterface >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TExportedInterface}
 * <li><< TExportedOperation >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TExportedOperation}
 * <li><< TExtensibleElements >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TExtensibleElements}
 * <li><< TExtension >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TExtension}
 * <li><< TExtensions >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TExtensions}
 * <li><< TImplementationArtifact >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TImplementationArtifact}
 * <li><< TImplementationArtifacts >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TImplementationArtifacts}
 * <li><< TInterface >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TInterface}
 * <li><< TNodeTemplate >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TNodeTemplate}
 * <li><< TNodeType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TNodeType}
 * <li><< TOperation >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TOperation}
 * <li><< TParameter >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TParameter}
 * <li><< TPlan >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TPlan}
 * <li><< TPlans >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TPlans}
 * <li><< TPolicy >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TPolicy}
 * <li><< TPropertyConstraint >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TPropertyConstraint}
 * <li><< TPropertyDef >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TPropertyDef}
 * <li><< TPropertyMapping >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TPropertyMapping}
 * <li><< TRelationshipTemplate >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link TRelationshipTemplate}
 * <li><< TRelationshipType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TRelationshipType}
 * <li><< TRequirement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TRequirement}
 * <li><< TRequirementDefinition >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TRequirementDefinition}
 * <li><< TRequirementRef >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TRequirementRef}
 * <li><< TServiceTemplate >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TServiceTemplate}
 * <li><< TTopologyElementInstanceStates >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TTopologyElementInstanceStates}
 * <li><< TTopologyTemplate >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TTopologyTemplate}
 * <li><< TargetElementType >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link TargetElementType}
 * <li><< TargetInterfacesType >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TargetInterfacesType}
 * <li><< ToscaModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link ToscaModel}
 * </ul>
 */
@objid ("182482c1-b707-49be-b4d1-10dd511e19bd")
public class ToscaDesignerProxyFactory {
    @objid ("211191f4-65fa-4da2-b1c7-eaccda2b995d")
    private static final String ASSETNAME = "ToscaDesigner";

    @objid ("254b80fb-6f0e-437e-b1ad-0e465a4846c9")
    private static final InstantiateVisitor instantiateVisitor = new InstantiateVisitor();

    /**
     * @param session The modeling session this factory is operating in.
     */
    @objid ("a019b4b6-e5bf-43dd-8075-ab038dac2037")
    public static final void initialize(final IModelingSession session) throws MdaProxyException {
        fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.CloudServiceArchiveDiagram.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.ServiceTemplateDiagram.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.TopologyTemplateDiagram.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ArtifactReferencesType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.CapabilitiesType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.CapabilitiesType1.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.CapabilityDefinitionsType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ConstraintType1.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.ConstraintsType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.DefinitionType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.DocumentRoot.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ExtensionType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ImplementationArtifactType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ImportElement.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.InputParameterType1.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.InputParametersType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.InstanceStateType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.InterfaceType1.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.InterfacesType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.MetadataElement.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.NodeOperationType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.NodeTypeReferenceType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.OutputParametersType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.OutputParametersType1.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PoliciesType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PoliciesType1.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PropertiesDefinitionType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PropertiesType1.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PropertyConstraintsType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PropertyConstraintsType1.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PropertyMappingsType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.RelationshipConstraintType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.RelationshipConstraintsType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.RelationshipOperationType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementDefinitionsType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementsType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.RequirementsType1.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.datatype.SourceElementType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.SourceInterfacesType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TAppliesTo.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TArtifactReference.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TArtifactTemplate.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TArtifactType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TBoundaryDefinitions.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TCapability.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinition.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TCapabilityRef.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TCondition.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TConstraint.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TDefinitions.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TDeploymentArtifact.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifacts.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TDocumentation.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TEntityTemplate.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TEntityType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExportedInterface.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExportedOperation.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExtensibleElements.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExtension.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExtensions.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TImplementationArtifact.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TImplementationArtifacts.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TInterface.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TOperation.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TParameter.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TPlan.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TPlans.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TPolicy.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TPropertyConstraint.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TPropertyDef.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TPropertyMapping.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirement.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirementDefinition.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TRequirementRef.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TServiceTemplate.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyElementInstanceStates.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyTemplate.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.datatype.TargetElementType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TargetInterfacesType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.package_.ToscaModel.MdaTypes.init(session);
        
    }

    /**
     * Instantiates the right proxy class the given element.
     * <br/>The model element must be stereotyped by a 'ToscaDesigner' module stereotype.
     * <br/>In the other case the method will return <i>null</i>.
     * 
     * @param e A model element
     * @return the right proxy or <i>null</i>.
     */
    @objid ("17911e19-c053-4e35-9b77-cab3cc086a8b")
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
    @objid ("4655381b-6ba6-4e26-878b-ee5b61faf15e")
    public static final Object instantiate(final Element e, final String stName) {
        instantiateVisitor.setStereotype(stName);
        return e.accept(instantiateVisitor);
    }

    @objid ("63d78438-5002-4140-9a94-fe64390a3f9b")
    private static class InstantiateVisitor implements IDefaultModelVisitor, IDefaultInfrastructureVisitor {
        @objid ("a6adf37f-1f47-4da9-94b3-0fa4fca6ad2f")
        private String stName;

        @objid ("296eba27-30b9-49bc-af1e-8224fa6795ac")
        public final void setStereotype(final String stName) {
            this.stName = stName;
        }

        @objid ("d57eb5bc-88df-49bd-978e-53cb8f538bf4")
        @Override
        public final Object visitAssociation(Association obj) {
            switch (this.stName) {
            	case fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitAssociation(obj);
            
        }

        @objid ("ad7ae117-036f-4546-91d5-84c56740e64c")
        @Override
        public final Object visitPackage(Package obj) {
            switch (this.stName) {
            	case fr.softeam.toscadesigner.api.tosca.standard.package_.ToscaModel.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.package_.ToscaModel.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitPackage(obj);
            
        }

        @objid ("0bdefa4c-7483-4a26-83ed-ebfb4c4d6105")
        @Override
        public final Object visitDataType(DataType obj) {
            switch (this.stName) {
            	case fr.softeam.toscadesigner.api.tosca.standard.datatype.SourceElementType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.datatype.SourceElementType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.datatype.TargetElementType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.datatype.TargetElementType.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitDataType(obj);
            
        }

        @objid ("005b8a59-6989-4b37-a82b-fb159dfab63d")
        @Override
        public final Object visitClass(Class obj) {
            switch (this.stName) {
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.CapabilityDefinitionsType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.CapabilityDefinitionsType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.ConstraintsType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.ConstraintsType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.InstanceStateType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.InstanceStateType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementDefinitionsType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementDefinitionsType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementsType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementsType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TArtifactType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TArtifactType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TBoundaryDefinitions.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TBoundaryDefinitions.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TCapability.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TCapability.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinition.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinition.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifacts.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifacts.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TDocumentation.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TDocumentation.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TEntityType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TEntityType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TPlan.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TPlan.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TPlans.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TPlans.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TPolicy.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TPolicy.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirement.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirement.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirementDefinition.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirementDefinition.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TServiceTemplate.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TServiceTemplate.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyElementInstanceStates.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyElementInstanceStates.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyTemplate.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyTemplate.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitClass(obj);
            
        }

        @objid ("90f699b9-4164-47cd-9b3b-6186b8679a3e")
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

        @objid ("cc42db31-10ee-400f-b3a9-d97f9e39d025")
        @Override
        public final Object visitModelElement(ModelElement obj) {
            switch (this.stName) {
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ArtifactReferencesType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ArtifactReferencesType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.CapabilitiesType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.CapabilitiesType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.CapabilitiesType1.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.CapabilitiesType1.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ConstraintType1.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ConstraintType1.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.DefinitionType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.DefinitionType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.DocumentRoot.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.DocumentRoot.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ExtensionType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ExtensionType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ImplementationArtifactType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ImplementationArtifactType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ImportElement.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ImportElement.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.InputParameterType1.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.InputParameterType1.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.InputParametersType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.InputParametersType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.InterfaceType1.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.InterfaceType1.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.InterfacesType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.InterfacesType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.MetadataElement.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.MetadataElement.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.NodeOperationType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.NodeOperationType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.NodeTypeReferenceType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.NodeTypeReferenceType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.OutputParametersType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.OutputParametersType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.OutputParametersType1.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.OutputParametersType1.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PoliciesType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PoliciesType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PoliciesType1.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PoliciesType1.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PropertiesDefinitionType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PropertiesDefinitionType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PropertiesType1.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PropertiesType1.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PropertyConstraintsType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PropertyConstraintsType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PropertyConstraintsType1.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PropertyConstraintsType1.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PropertyMappingsType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PropertyMappingsType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.RelationshipConstraintType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.RelationshipConstraintType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.RelationshipConstraintsType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.RelationshipConstraintsType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.RelationshipOperationType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.RelationshipOperationType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.RequirementsType1.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.RequirementsType1.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.SourceInterfacesType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.SourceInterfacesType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TAppliesTo.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TAppliesTo.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TArtifactReference.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TArtifactReference.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TArtifactTemplate.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TArtifactTemplate.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TCapabilityRef.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TCapabilityRef.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TCondition.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TCondition.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TConstraint.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TConstraint.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TDefinitions.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TDefinitions.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TDeploymentArtifact.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TDeploymentArtifact.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TEntityTemplate.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TEntityTemplate.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExportedInterface.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExportedInterface.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExportedOperation.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExportedOperation.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExtensibleElements.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExtensibleElements.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExtension.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExtension.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExtensions.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExtensions.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TImplementationArtifact.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TImplementationArtifact.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TImplementationArtifacts.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TImplementationArtifacts.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TInterface.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TInterface.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TOperation.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TOperation.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TParameter.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TParameter.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TPropertyConstraint.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TPropertyConstraint.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TPropertyDef.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TPropertyDef.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TPropertyMapping.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TPropertyMapping.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TRequirementRef.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TRequirementRef.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TargetInterfacesType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TargetInterfacesType.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultInfrastructureVisitor.super.visitModelElement(obj);
            
        }

        /**
         * Get the visitor to delegate to when a {@link IInfrastructureVisitor} is needed.
         * <p>If null is returned the caller will return null.
         * @return the {@link IInfrastructureVisitor} visitor or <i>null</i>.
         */
        @objid ("6b059b6b-df02-470e-939e-9a60d77981d2")
        @Override
        public IInfrastructureVisitor getInfrastructureVisitor() {
            return this;
        }

    }

}
