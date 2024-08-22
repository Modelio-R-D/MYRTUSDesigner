package fr.softeam.toscadesigner.handlers.propertypages.topologyTemplate;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("83e83f25-36df-4af3-a9ec-d48f34eb1aec")
public class TRelationshipTemplatePropertyPage<T extends TRelationshipTemplate> extends ToscaElementPropertyPage<T> {
    @objid ("516ad25d-88af-4232-80e0-26878e2e7032")
    public  TRelationshipTemplatePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("b6b3ca49-8857-4993-b798-1c8328089c4d")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
         case 1:
             this._element.getElement().setName(value);
             break;
         case 2:
             this._element.setType(value);
             break;
        
         }
    }

    @objid ("378c8d16-1a0a-413b-b142-e267468c87c4")
    @Override
    public void update(IModulePropertyTable table) {
		super.update(table);
        table.addProperty("Name",_element.getElement().getName());
        table.addProperty("Type",_element.getType());
    }

}
