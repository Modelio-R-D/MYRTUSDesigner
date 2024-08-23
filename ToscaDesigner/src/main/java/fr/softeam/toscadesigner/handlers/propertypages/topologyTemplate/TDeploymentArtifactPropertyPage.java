package fr.softeam.toscadesigner.handlers.propertypages.topologyTemplate;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TDeploymentArtifact;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;

public class TDeploymentArtifactPropertyPage <T extends TDeploymentArtifact> extends ToscaElementPropertyPage<T> {

	public TDeploymentArtifactPropertyPage(T elt) {
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

    @Override
    public void update(IModulePropertyTable table) {
        table.addProperty("Name",_element.getElement().getName());
        table.addProperty("Artifact Type",_element.getArtifactType());
        table.addProperty("Artifact Ref",_element.getArtifactref());
        table.addProperty("File",_element.getFile());
        table.addProperty("Deploy path",_element.getDeploy_path());
          }

}
