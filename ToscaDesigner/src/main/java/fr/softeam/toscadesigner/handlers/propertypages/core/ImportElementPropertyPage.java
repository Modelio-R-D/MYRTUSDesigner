package fr.softeam.toscadesigner.handlers.propertypages.core;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ImportElement;

public class ImportElementPropertyPage <T extends ImportElement> extends ToscaElementPropertyPage<T> {

	public ImportElementPropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeProperty(int row, String value) {
		switch (row) {
		case 1:
			this._element.setFile(value);
			break;

		case 2:
			this._element.setNamespace_prefix(value);
			break;
	
		case 3:
			this._element.setNamespace_uri(value);
			break;
		}
	}

	@Override
	public void update(IModulePropertyTable table) {
		super.update(table);
		table.addProperty("Name", _element.getElement().getName());
		table.addProperty("Namespace Prefix", _element.getNamespace_prefix());
		table.addProperty("Namespace Uri", _element.getNamespace_uri());
	}

}
