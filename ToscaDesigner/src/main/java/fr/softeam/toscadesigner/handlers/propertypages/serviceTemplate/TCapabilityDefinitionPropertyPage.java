package fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;

import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinition;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;

public class TCapabilityDefinitionPropertyPage <T extends TCapabilityDefinition> extends ToscaElementPropertyPage<T>  {

	public TCapabilityDefinitionPropertyPage(T elt) {
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
			this._element.setConstraints(value);
			break;
	
		case 3:
			this._element.setCapabilityType(value);

			break;
			
		case 4:
			this._element.setLowerBound(Integer.valueOf(value));
			break;
			
		case 5:
			this._element.setUpperBound(Integer.valueOf(value));
			break;
			
		case 6:
			this._element.setValid_source_tyoes(value);;
			break;
		}
	}

	@Override
	public void update(IModulePropertyTable table) {
		super.update(table);
		table.addProperty("Name", _element.getElement().getName());
		table.addProperty("Constraints", _element.getConstraints());
		table.addProperty("Capability Type", _element.getCapabilityType());
		table.addProperty("Lower Bound", _element.getLowerBound());
		table.addProperty("Upper Bound", _element.getUpperBound());
		table.addProperty("Valid Source Types", _element.getValid_source_tyoes());
	}

}
