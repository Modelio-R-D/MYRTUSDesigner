/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/08/2024 12:30 by Modelio Studio.
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
    @objid ("87af20ad-fda0-4840-a752-46628ced7405")
    private static final String ASSETNAME = "ToscaDesigner";

    @objid ("9792d2ce-3799-4223-863f-c63c98a20ccc")
    private static final InstantiateVisitor instantiateVisitor = new InstantiateVisitor();

    /**
     * @param session The modeling session this factory is operating in.
     */
    @objid ("02235751-14f1-4879-b2d3-aa26dc580dbe")
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
    @objid ("ee406c37-a84d-497a-83d3-67a05cdedda3")
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
    @objid ("573cfe59-56c7-42d7-ab74-6db33ca232fc")
    public static final Object instantiate(final Element e, final String stName) {
        instantiateVisitor.setStereotype(stName);
        return e.accept(instantiateVisitor);
    }

    @objid ("c61c503c-e585-444a-9256-faacab14a8f7")
    private static class InstantiateVisitor implements IDefaultInfrastructureVisitor, IDefaultModelVisitor {
        @objid ("583c4f48-bb32-4d33-8f2d-579c1bc756b9")
        private String stName;

        @objid ("ad5922b2-6fc4-4638-a257-ac7c77dbc2ba")
        public final void setStereotype(final String stName) {
            this.stName = stName;
        }

        @objid ("2062e7ef-7cb4-4829-9854-55941437f61c")
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

        @objid ("c9732862-207a-4338-bfb4-422b86ec6065")
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

        @objid ("32f9f83e-a6ad-48aa-b62e-4e3f458cb7b7")
        @Override
        public final Object visitAssociation(Association obj) {
            switch (this.stName) {
            	case fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitAssociation(obj);
            
        }

        @objid ("41a54974-64c5-46fa-a082-7fbf4317c21c")
        @Override
        public final Object visitPackage(Package obj) {
            switch (this.stName) {
            	case fr.softeam.toscadesigner.api.tosca.standard.package_.ToscaModel.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.package_.ToscaModel.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitPackage(obj);
            
        }

        @objid ("a3614d93-1ae1-4468-ab78-e8a62f74655c")
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

        @objid ("66a74956-c409-4c5e-8046-827d1944f7a5")
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
        @objid ("47026376-7653-4f29-897c-795143f03b4f")
        @Override
        public IInfrastructureVisitor getInfrastructureVisitor() {
            return this;
        }

    }

}
