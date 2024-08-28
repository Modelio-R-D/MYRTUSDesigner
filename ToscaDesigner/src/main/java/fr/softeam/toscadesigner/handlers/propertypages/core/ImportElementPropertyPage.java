package fr.softeam.toscadesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ImportElement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("94f8b8ec-54e8-454c-9e1f-32ca5a0dea62")
public class ImportElementPropertyPage<T extends ImportElement> extends ToscaElementPropertyPage<T> {
    @objid ("eef08305-8700-4461-a3b0-c470c3bf1c5e")
    public  ImportElementPropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("3d9f2e19-eae9-42f6-bd1e-d796ed37a418")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            this._element.setFile(value);
            break;
        
        case 2:
            this._element.setNamespace_prefix(value);
            break;
        
        case 3:
            this._element.setNamespace_uri(value);
            break;
        }
    }

    @objid ("77a5a715-3493-4ac3-9144-97ca6520ddf7")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
        table.addProperty("Namespace Prefix", _element.getNamespace_prefix());
        table.addProperty("Namespace Uri", _element.getNamespace_uri());
    }

}
