package fr.softeam.toscadesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapability;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("aca05c83-f273-422a-ae7e-ebac366960d1")
public class TCapabilityPropertyPage<T extends TCapability> extends ToscaElementPropertyPage<T> {
    @objid ("f968addf-f03a-4e54-a1dc-bea3ec850adb")
    public  TCapabilityPropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("f405e2ee-e526-4d11-b11b-b71bffab6ead")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            this._element.getElement().setName(value);
            break;
        
        }
    }

    @objid ("eba8933b-7a12-48f6-bd77-93e8e5fed0d2")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
    }

}
