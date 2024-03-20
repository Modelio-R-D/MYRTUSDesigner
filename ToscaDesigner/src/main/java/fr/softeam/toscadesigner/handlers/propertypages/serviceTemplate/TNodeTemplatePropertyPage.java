package fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;

public class TNodeTemplatePropertyPage<T extends TNodeTemplate> extends ToscaElementPropertyPage<T> {

	public TNodeTemplatePropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeProperty(int row, String value) {
		super.changeProperty(row, value);

		switch (this._currentRow) {
		case 1:
			this._element.setName(value);
			break;
		}
		this._currentRow -= 1;
	}

	@Override
	public void update(IModulePropertyTable table) {
	}

}
