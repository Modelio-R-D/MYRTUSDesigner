package fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyTemplate;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("a7f33f74-8435-4a95-a221-94a56c5f4cfd")
public class TTopologyTemplatePropertyPage<T extends TTopologyTemplate> extends ToscaElementPropertyPage<T> {
    @objid ("6b40406a-9893-459b-872a-046f069c5b49")
    public  TTopologyTemplatePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("004035a6-3c47-440d-8d27-c3032b9db0fc")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            this._element.getElement().setName(value);
            break;
        
        }
    }

    @objid ("42d61cbc-7b7b-42bc-8d36-c08a126e4d21")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
    }

}
