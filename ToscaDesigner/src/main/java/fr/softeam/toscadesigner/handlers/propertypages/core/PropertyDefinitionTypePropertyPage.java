package fr.softeam.toscadesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.attribute.PropertyDefinitionType;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid("1c6a520c-04ce-41e5-9556-bd2f87af180b")
public class PropertyDefinitionTypePropertyPage<T extends PropertyDefinitionType> extends ToscaElementPropertyPage<T> {
	@objid("ecf69318-498d-4bf5-a988-bb8408e2e536")
	public PropertyDefinitionTypePropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

	@objid("e87aabc0-60a1-421d-835f-21075c4fffd1")
	@Override
	public void changeProperty(int row, String value) {
		switch (row) {
		case 1:
			this._element.getElement().setName(value);
			break;

		case 2:
			this._element.getElement().setValue(value);
			break;
		}
	}

	@objid("00c9eca6-a630-4847-8087-be1533c9c9eb")
	@Override
	public void update(IModulePropertyTable table) {
		super.update(table);
		table.addProperty("Name", _element.getElement().getName());

		table.addProperty("Type", _element.getElement().getValue());
	}

	@objid("90c3a132-16c6-44c3-ae50-3e281c0450d7")
	enum PrimitiveType {
		@objid("08936dad-7000-4dc8-ab16-4fa6729bb43b")
		IntType, @objid("d55c4fcd-797a-439a-90ce-974df702743f")
		StringType, @objid("ac478852-3be6-46b4-94f3-9b3b9966499e")
		BooleanType, @objid("5c991fdf-d3a0-4017-ad51-6b33ede83067")
		FloatType, @objid("dd011c2d-7afc-44a8-83c7-6bf5c6ea783b")
		DoubleType;

	}

}
