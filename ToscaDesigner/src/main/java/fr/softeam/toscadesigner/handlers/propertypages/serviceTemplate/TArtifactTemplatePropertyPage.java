package fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TArtifactTemplate;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;

public class TArtifactTemplatePropertyPage<T extends TArtifactTemplate> extends ToscaElementPropertyPage<T> {

	public TArtifactTemplatePropertyPage(T elt) {
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
			this._element.setArtifactReferences(value);
			break;
		}
	}

	@Override
	public void update(IModulePropertyTable table) {
		super.update(table);
		table.addProperty("Name", this._element.getElement().getName());
		table.addProperty("Artifact References", this._element.getArtifactReferences());

	}
}
