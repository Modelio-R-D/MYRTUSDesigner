package fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TEntityType;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("00b0f9d7-831b-4f11-9a40-328724e84ef9")
public abstract class TEntityTypePropertyPage<T extends TEntityType> extends ToscaElementPropertyPage<T> {
    @objid ("7e2c0c83-001d-462f-a4a0-4835afc13795")
    public  TEntityTypePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("e7680c00-6a18-4a93-b78a-f9c470416d3c")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
         case 1:
             this._element.getElement().setName(value);
             break;             
         }
    }

    @objid ("769a55df-a7f2-4aeb-b482-b67372e24820")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name",_element.getElement().getName());
    }

}
