package fr.softeam.toscadesigner.handlers.propertypages.topologyTemplate;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.attribute.TDeploymentArtifact;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("c33850f8-9651-4f11-b39e-345401a503d1")
public class TDeploymentArtifactPropertyPage<T extends TDeploymentArtifact> extends ToscaElementPropertyPage<T> {
    @objid ("5b445923-1758-43eb-8dcd-4902c243c936")
    public  TDeploymentArtifactPropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("482f23d1-3c80-4981-b3e5-1f20d7a0bf97")
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

    @objid ("ed370899-8380-4cf2-bfc3-8bab80f1bbca")
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
