package fr.softeam.toscadesigner.handlers.propertypages.topologyTemplate;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.attribute.TDeploymentArtifact;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid("586300a8-905d-411f-90a8-29db09707a2b")
public class TDeploymentArtifactPropertyPage<T extends TDeploymentArtifact> extends ToscaElementPropertyPage<T> {
	@objid("7d813bd4-5248-44ee-a2e4-dc38d92317b1")
	public TDeploymentArtifactPropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

	@objid("d28e8264-4c7d-40ad-b53b-9fb2b6c10b4b")
	@Override
	public void changeProperty(int row, String value) {
		switch (row) {
		case 1:
			this._element.getElement().setName(value);
			break;
		case 2:
			this._element.setArtifactType(value);
			break;
		case 3:
			this._element.setArtifactref(value);
			break;
		case 4:
			this._element.setFile(value);
			break;
		case 5:
			this._element.setDeploy_path(value);
			break;
		}
	}

	@objid("3e30eee6-a99f-49d5-81c4-77df1925bc28")
	@Override
	public void update(IModulePropertyTable table) {
		super.update(table);
		table.addProperty("Name", _element.getElement().getName());
		table.addProperty("Artifact Type", _element.getArtifactType());
		table.addProperty("Artifact Ref", _element.getArtifactref());
		table.addProperty("File", _element.getFile());
		table.addProperty("Deploy path", _element.getDeploy_path());
	}

}
