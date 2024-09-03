package fr.softeam.toscadesigner.handlers.propertypages.topologyTemplate;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifacts;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

public class TDeploymentArtifactsPropertyPage<T extends TDeploymentArtifacts> extends ToscaElementPropertyPage<T> {
    public  TDeploymentArtifactsPropertyPage(T elt) {
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
