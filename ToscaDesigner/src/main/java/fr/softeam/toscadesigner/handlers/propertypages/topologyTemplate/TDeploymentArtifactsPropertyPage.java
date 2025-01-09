package fr.softeam.toscadesigner.handlers.propertypages.topologyTemplate;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifacts;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid("07c948d6-6770-47de-8325-9ca577039207")
public class TDeploymentArtifactsPropertyPage<T extends TDeploymentArtifacts> extends ToscaElementPropertyPage<T> {
	@objid("79b80879-cd03-4fc9-b689-2c88606d65a9")
	public TDeploymentArtifactsPropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

	@objid("00904134-dd7b-4d8b-9f15-ead07da696ac")
	@Override
	public void changeProperty(int row, String value) {
		switch (row) {
		case 1:
			this._element.getElement().setName(value);
			break;

		}
	}

	@objid("3a2030e4-8584-4473-9074-0906b35d0174")
	@Override
	public void update(IModulePropertyTable table) {
		super.update(table);
		table.addProperty("Name", _element.getElement().getName());
	}

}
