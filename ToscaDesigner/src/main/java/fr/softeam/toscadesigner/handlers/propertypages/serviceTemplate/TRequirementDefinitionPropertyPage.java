package fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.attribute.TRequirementDefinition;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

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
            this._element.setCapability(value);//capability
            break;
        
        case 3:
            this._element.setNode(value); //nodetype
            break;
        
        case 4:
            this._element.setRelationshipType(value);//relationship type
            break;
        case 5:
            this._element.setLowerBound(value);
            break;
        
        case 6:
            this._element.setUpperBound(value);
            break;
        
        }
    }

    @objid ("600d81b9-9625-4ce5-9cd8-1b4e5ed141cd")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
        //Capability
        //Node
        //Relationship type
        table.addProperty("Upper Bound", _element.getUpperBound());
        table.addProperty("Lower Bound", _element.getLowerBound());
    }

}
