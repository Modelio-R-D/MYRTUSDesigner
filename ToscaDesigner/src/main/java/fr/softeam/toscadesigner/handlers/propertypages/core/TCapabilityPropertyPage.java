package fr.softeam.toscadesigner.handlers.propertypages.core;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapability;

public class TCapabilityPropertyPage<T extends TCapability> extends ToscaElementPropertyPage<T> {

	public TCapabilityPropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeProperty(int row, String value) {
		switch (row) {
		case 1:
			this._element.getElement().setName(value);
			break;

		}
	}

	@Override
	public void update(IModulePropertyTable table) {
		super.update(table);
		table.addProperty("Name", _element.getElement().getName());
	}
}