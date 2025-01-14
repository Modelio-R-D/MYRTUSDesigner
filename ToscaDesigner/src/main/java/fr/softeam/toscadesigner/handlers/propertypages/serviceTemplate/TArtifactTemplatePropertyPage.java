package fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TArtifactTemplate;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("102884ff-c772-4052-b99e-c51eaf43960e")
public class TArtifactTemplatePropertyPage<T extends TArtifactTemplate> extends ToscaElementPropertyPage<T> {
    @objid ("e0f32948-9584-452f-bc0c-978d6c2f1bf5")
    public  TArtifactTemplatePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("1ff78ada-d964-4e40-90ce-ac9ffd4db2f4")
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

    @objid ("2ad9a0cf-a3f1-4b47-b535-448e4002890a")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", this._element.getElement().getName());
        table.addProperty("Artifact References", this._element.getArtifactReferences());
    }

}
