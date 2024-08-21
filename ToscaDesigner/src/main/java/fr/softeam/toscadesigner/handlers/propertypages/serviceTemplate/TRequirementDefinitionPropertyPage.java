package fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirementDefinition;
import fr.softeam.toscadesigner.handlers.propertypages.core.TEntityTypePropertyPage;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("8e6ae627-578f-422f-8de0-77c04824219b")
public class TRequirementDefinitionPropertyPage<T extends TRequirementDefinition> extends ToscaElementPropertyPage<T> {
    @objid ("b129e2d0-20bf-4b53-9bdf-8b625ba37529")
    public  TRequirementDefinitionPropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("f7311659-e3b9-43bb-b939-e143682cce9f")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            this._element.getElement().setName(value);
            break;
        
        case 2:
            this._element.setCapability(value);
            break;
        
        case 3:
            this._element.setNode(value);
            break;
        
        case 4:
            this._element.setRelationshipType(value);
            break;
        case 5:
            this._element.setLowerBound(value);
            break;
        
        case 6:
            this._element.setUpperBound(value);
            break;
        
        }
    }

    @objid ("3df2e3b9-f8a2-4c5c-9a5b-60799c369b20")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
        table.addProperty("Capability", _element.getCapability());
        table.addProperty("Node", _element.getNode());
        table.addProperty("Relationship", _element.getRelationshipType());
        table.addProperty("Lower Bound", _element.getLowerBound());
        table.addProperty("Upper Bound", _element.getUpperBound());
    }

}
