/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.1.06

 * This file was generated on 11/30/20 8:06 PM by Modelio Studio.
 */
package fr.softeam.toscadesigner.handlers.propertypages;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;
import fr.softeam.toscadesigner.handlers.propertypages.core.MetadataPropertyPage;
import fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate.TCapabilityDefinitionPropertyPage;
import fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate.TCapabilityDefinitionsTypePropertyPage;
import fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate.TNodeTypePropertyPage;
import fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate.TRelationshipTypePropertyPage;
import fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate.TTopologyTemplatePropertyPage;
import fr.softeam.toscadesigner.handlers.propertypages.topologyTemplate.RequirementsTypePropertyPage;
import fr.softeam.toscadesigner.handlers.propertypages.topologyTemplate.TDeploymentArtifactPropertyPage;
import fr.softeam.toscadesigner.handlers.propertypages.topologyTemplate.TDeploymentArtifactsPropertyPage;
import fr.softeam.toscadesigner.handlers.propertypages.topologyTemplate.TNodeTemplatePropertyPage;
import fr.softeam.toscadesigner.handlers.propertypages.topologyTemplate.TRequirementPropertyPage;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.visitors.IDefaultInfrastructureVisitor;
import org.modelio.metamodel.visitors.IDefaultModelVisitor;
import org.modelio.metamodel.visitors.IInfrastructureVisitor;

@objid ("548a9154-c8a7-486f-9adb-ba13d312251a")
public class ToscaDesignerPropertyPageFactory {
    @objid ("9c7aba2f-0c37-4d81-908a-ddfd5a54e213")
    private static final PropertyPageVisitor propertyVisitor = new PropertyPageVisitor();

    /**
     * Instantiates the right proxy class the given element.
     * <br/>The model element must be stereotyped by a 'CamelDesigner' module stereotype.
     * <br/>In the other case the method will return <i>null</i>.
     * @param e A model element
     * @return the right proxy or <i>null</i>.
     */
    @objid ("a7b13f96-174e-4ada-9834-a5025598c7b1")
    public static final Object instantiatePropertyPage(final ModelElement e) {
        for (Stereotype s : e.getExtension()) {
            ModuleComponent module = s.getModule();
            if (module != null && module.getName().equals(IToscaDesignerPeerModule.MODULE_NAME)) {
                return instantiatePropertyPage(e, s.getName());
            }
        }
        return  null;
    }

    /**
     * Instantiates the right proxy class the given element with a stereotype name.
     * The stereotype must be one of the 'CamelDesigner' module stereotypes.
     * In the other case the method will return <i>null</i>.
     * @param e A model element.
     * @param stName A stereotype name.
     * @return the right proxy or <i>null</i>.
     */
    @objid ("d65c2717-560a-4a73-9ad9-64f1521ed689")
    public static final Object instantiatePropertyPage(final Element e, final String stName) {
        propertyVisitor.setStereotype(stName);
        return e.accept(propertyVisitor);
    }

    @objid ("62f17733-06eb-4810-b5b8-aa31b05ef70b")
    private static class PropertyPageVisitor implements IDefaultModelVisitor, IDefaultInfrastructureVisitor {
        @objid ("794396c0-0aba-4b46-aca4-5183eda7382b")
        private String stName;

        @objid ("c4638ee7-f533-4a19-9eec-97e6670a47f3")
        @Override
        public final Object visitGeneralClass(GeneralClass obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitGeneralClass(obj);
        }

        @objid ("517d3ff0-f51b-43ac-9f03-3b2e322e41e1")
        @Override
        public final Object visitDependency(Dependency obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultInfrastructureVisitor.super.visitDependency(obj);
        }

        @objid ("42bd818f-e7bd-46ba-828e-9cbd52ee494c")
        @Override
        public final Object visitComponent(Component obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitComponent(obj);
        }

        @objid ("26f97305-05b3-4847-8e3e-46e578e58136")
        @Override
        public final Object visitInstance(Instance obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitInstance(obj);
        }

        @objid ("52e9ca66-17cb-4560-b97f-e42e0c828f46")
        @Override
        public final Object visitClass(Class obj) {
            switch (this.stName) {
            case fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate.STEREOTYPE_NAME: return new TNodeTemplatePropertyPage<>(fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate.instantiate(obj));
            case fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType.STEREOTYPE_NAME: return new TNodeTypePropertyPage<>(fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType.instantiate(obj));
            case fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipType.STEREOTYPE_NAME: return new TRelationshipTypePropertyPage<>(fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipType.instantiate(obj));
            case fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyTemplate.STEREOTYPE_NAME: return new TTopologyTemplatePropertyPage<>(fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyTemplate.instantiate(obj));
            case fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifacts.STEREOTYPE_NAME: return new TDeploymentArtifactsPropertyPage<>(fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifacts.instantiate(obj));
            case fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementsType.STEREOTYPE_NAME: return new RequirementsTypePropertyPage<>(fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementsType.instantiate(obj));
            case fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinitionsType.STEREOTYPE_NAME: return new TCapabilityDefinitionsTypePropertyPage<>(fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinitionsType.instantiate(obj));
            
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitClass(obj);
        }

        @objid ("158dcd2e-88fb-4446-9789-ca1183691f56")
        @Override
        public final Object visitAssociationEnd(AssociationEnd obj) {
            switch (this.stName) {
            case fr.softeam.toscadesigner.api.tosca.standard.associationend.TRelationshipTemplateEnd.STEREOTYPE_NAME: return new fr.softeam.toscadesigner.handlers.propertypages.topologyTemplate.TRelationshipTemplatePropertyPage<>(fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate.instantiate(obj.getAssociation()));
            
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitAssociationEnd(obj);
        }

        @objid ("378ea0c8-e23f-46da-a392-c4924f2c9623")
        @Override
        public final Object visitEnumeration(Enumeration obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitEnumeration(obj);
        }

        @objid ("68120a39-d9c4-4406-b1a0-b59374b4f080")
        @Override
        public final Object visitModelElement(ModelElement obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultInfrastructureVisitor.super.visitModelElement(obj);
        }

        @objid ("af5d7075-49d6-4626-ba9a-7ca51195897c")
        @Override
        public final Object visitArtifact(Artifact obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitArtifact(obj);
        }

        @objid ("aa097662-3eb9-42d6-8c6f-5f9b101127d2")
        @Override
        public final Object visitAttribute(Attribute obj) {
            switch (this.stName) {
            case fr.softeam.toscadesigner.api.tosca.standard.attribute.Metadata.STEREOTYPE_NAME: return new MetadataPropertyPage<>(fr.softeam.toscadesigner.api.tosca.standard.attribute.Metadata.instantiate(obj));
            case fr.softeam.toscadesigner.api.tosca.standard.attribute.TDeploymentArtifact.STEREOTYPE_NAME: return new TDeploymentArtifactPropertyPage<>(fr.softeam.toscadesigner.api.tosca.standard.attribute.TDeploymentArtifact.instantiate(obj));
            case fr.softeam.toscadesigner.api.tosca.standard.attribute.TRequirement.STEREOTYPE_NAME: return new TRequirementPropertyPage<>(fr.softeam.toscadesigner.api.tosca.standard.attribute.TRequirement.instantiate(obj));
            case fr.softeam.toscadesigner.api.tosca.standard.attribute.TCapabilityDefinition.STEREOTYPE_NAME: return new TCapabilityDefinitionPropertyPage<>(fr.softeam.toscadesigner.api.tosca.standard.attribute.TCapabilityDefinition.instantiate(obj));
            
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitAttribute(obj);
        }

        @objid ("5e3d2e2b-6937-4f7b-a8aa-568b55145b9c")
        @Override
        public final Object visitAttributeLink(AttributeLink obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitAttributeLink(obj);
        }

        @objid ("1fc5ad67-2f6f-49e6-9f6d-f2292363c0bd")
        @Override
        public final Object visitClassDiagram(ClassDiagram obj) {
            switch (this.stName) {
            default:
            
                break;
            }
            return IDefaultModelVisitor.super.visitClassDiagram(obj);
        }

        @objid ("a0ef2e20-22f8-4597-8f16-d2e6c2e4950c")
        @Override
        public final Object visitPackage(Package obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitPackage(obj);
        }

        @objid ("a323a489-3415-4e43-af17-952d7d9f0e42")
        @Override
        public final Object visitConnector(Connector obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitConnector(obj);
        }

        @objid ("b70b44d5-c66d-499f-8edf-fdae822296e9")
        @Override
        public final Object visitDataType(DataType obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitDataType(obj);
        }

        @objid ("4544c5af-e05f-4216-9211-d3b79e56589b")
        @Override
        public final Object visitPort(Port obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitPort(obj);
        }

        @objid ("a52b68a9-cafc-40a2-9f0f-4b3769d91f74")
        @Override
        public IInfrastructureVisitor getInfrastructureVisitor() {
            return this;
        }

        @objid ("0aac5039-d4c3-40e2-b452-021763eb05d1")
        public final void setStereotype(final String stName) {
            this.stName = stName;
        }

    }

}
