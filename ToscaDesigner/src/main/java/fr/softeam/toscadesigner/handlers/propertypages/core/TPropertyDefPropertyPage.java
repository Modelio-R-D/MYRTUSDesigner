package fr.softeam.toscadesigner.handlers.propertypages.core;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;

import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TPropertyDef;

public class TPropertyDefPropertyPage<T extends TPropertyDef> extends ToscaElementPropertyPage<T> {

	public TPropertyDefPropertyPage(T elt) {

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
			this._element.setValue(value);
			break;
		}
	}

	@Override
	public void update(IModulePropertyTable table) {
		super.update(table);
		table.addProperty("Name", _element.getElement().getName());
		table.addProperty("Value", _element.getValue());

	}
}
