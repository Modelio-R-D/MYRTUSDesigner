package fr.softeam.toscadesigner.handlers.propertypages.topologyTemplate;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementsType;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("b4f929d9-ab9c-4870-977d-832ebfb5d57e")
public class RequirementsTypePropertyPage<T extends RequirementsType> extends ToscaElementPropertyPage<T> {
    @objid ("f9c1c9e5-a304-4bdf-b5b6-994508835a26")
    public  RequirementsTypePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("62e30fd8-6724-4b94-9457-637823f82575")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            this._element.getElement().setName(value);
            break;
        
        }
    }

    @objid ("c26701e2-0003-430b-a9e1-06df024e32bc")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
    }

}
