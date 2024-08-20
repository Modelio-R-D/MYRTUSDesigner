package fr.softeam.toscadesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ImportElement;
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PropertiesDefinitionType;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("9937669b-3bf8-4a60-a471-44d5286e965f")
public class PropertiesDefinitionPropertyPage<T extends PropertiesDefinitionType> extends ToscaElementPropertyPage<T> {
    @objid ("92bb8fe6-c277-44bc-869d-728e8763a97c")
    public  PropertiesDefinitionPropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("4be22a14-4eb5-42c2-a850-c43f6eb81366")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            this._element.getElement().setName(value);
            break;
        
        case 2:
            this._element.setType(value);
            break;
        
        case 3:
            this._element.setDescription(value);
            break;
            
        case 4:
            this._element.setRequired(Boolean.valueOf(value));
            break;
        }
    }

    @objid ("d016677f-3eba-4934-9e7c-a14fb2ac489a")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
        table.addProperty("Type", _element.getType());
        table.addProperty("Description", _element.getDescription());
        table.addProperty("Required", _element.getRequired());
    }

}
