package fr.softeam.toscadesigner.handlers.propertypages.core;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ImportElement;
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PropertiesDefinitionType;

public class PropertiesDefinitionPropertyPage <T extends PropertiesDefinitionType> extends ToscaElementPropertyPage<T> {

	public PropertiesDefinitionPropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

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

	@Override
	public void update(IModulePropertyTable table) {
		super.update(table);
		table.addProperty("Name", _element.getElement().getName());
		table.addProperty("Type", _element.getType());
		table.addProperty("Description", _element.getDescription());
		table.addProperty("Required", _element.getRequired());
	}

}
