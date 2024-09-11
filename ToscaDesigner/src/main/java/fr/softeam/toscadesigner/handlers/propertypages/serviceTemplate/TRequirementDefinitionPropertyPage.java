package fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate;

import java.util.Arrays;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.smkernel.mapi.MObject;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.tosca.standard.attribute.TCapabilityDefinition;
import fr.softeam.toscadesigner.api.tosca.standard.attribute.TRequirementDefinition;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinitionsType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipType;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;

@objid ("c757eb57-dab6-4fc3-8fd8-6f094926a62c")
public class TRequirementDefinitionPropertyPage<T extends TRequirementDefinition> extends ToscaElementPropertyPage<T> {
    @objid ("bad7c543-2275-4aee-900e-1c4e6306da6f")
    public  TRequirementDefinitionPropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("a8259c89-4113-4860-873d-5c3b6326d46f")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            this._element.getElement().setName(value);
            break;
        
        case 2:
            for (ModelElement dep : TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
                if (value.contains(dep.getUuid())) {
                    this._element.setCapability(
                    		TCapabilityDefinition.instantiate((org.modelio.metamodel.uml.statik.Attribute) dep));
                }
            }
            break;
        
        case 3:
            for (ModelElement dep : TNodeType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
                if (value.contains(dep.getUuid())) {
                    this._element.setNodeType(TNodeType.instantiate((org.modelio.metamodel.uml.statik.Class) dep));
                }
            }
            break;
        
        case 4:
            for (ModelElement dep : TRelationshipType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
                if (value.contains(dep.getUuid())) {
                    this._element.setRelationshipType(
                            TRelationshipType.instantiate((org.modelio.metamodel.uml.statik.Class) dep));
                }
            }
            break;
        case 5:
            this._element.setUpperBound(value);
            break;
        
        case 6:
            this._element.setLowerBound(value);
            break;
        
        }
    }

    @objid ("600d81b9-9625-4ce5-9cd8-1b4e5ed141cd")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
        // Capability
        table.addProperty("Capability", this._element.getCapability() != null ? this._element.getCapability().getElement() : null,
                Arrays.asList(Metamodel.getMClass("Attribute")), new IMObjectFilter() {
                    @Override
                    public boolean accept(MObject element) {
                        return TCapabilityDefinition.canInstantiate(element);
                    }
                });
        
        // Node
        table.addProperty("Node", this._element.getNodeType() != null ? this._element.getNodeType().getElement() : null,
                Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
                    @Override
                    public boolean accept(MObject element) {
                        return TNodeType.canInstantiate(element);
                    }
                });
        
        // Relationship type
        table.addProperty("Relationship type",
                this._element.getRelationshipType() != null ? this._element.getRelationshipType().getElement() : null,
                Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
                    @Override
                    public boolean accept(MObject element) {
                        return TRelationshipType.canInstantiate(element);
                    }
                });
        
        table.addProperty("Upper Bound", _element.getUpperBound());
        table.addProperty("Lower Bound", _element.getLowerBound());
    }

}
