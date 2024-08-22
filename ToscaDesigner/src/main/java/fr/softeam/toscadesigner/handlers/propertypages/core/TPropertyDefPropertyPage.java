package fr.softeam.toscadesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TPropertyDef;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid("fe907769-1d75-4335-8f0c-89260a0dca54")
public class TPropertyDefPropertyPage<T extends TPropertyDef> extends ToscaElementPropertyPage<T> {
	@objid("bf3ef6d9-e96d-4d05-94e8-8a4aec4b2b4e")
	public TPropertyDefPropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

	@objid("ab5d49e1-fc4e-4905-bbef-0224d341d36a")
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

	@objid("3f56b27a-bd33-4929-8c16-a7d45b7be597")
	@Override
	public void update(IModulePropertyTable table) {
		super.update(table);
		table.addProperty("Name", _element.getElement().getName());
		table.addProperty("Value", _element.getValue());
	}

}
