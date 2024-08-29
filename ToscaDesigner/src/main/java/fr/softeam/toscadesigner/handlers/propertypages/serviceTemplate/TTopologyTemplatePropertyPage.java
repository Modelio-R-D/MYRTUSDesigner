package fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyTemplate;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;

public class TTopologyTemplatePropertyPage<T extends TTopologyTemplate> extends ToscaElementPropertyPage<T> {

	public TTopologyTemplatePropertyPage(T elt) {
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
