package fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirementDefinitionType;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;

@objid ("c757eb57-dab6-4fc3-8fd8-6f094926a62c")
public class TRequirementDefinitionTypePropertyPage<T extends TRequirementDefinitionType> extends ToscaElementPropertyPage<T> {
    @objid ("bad7c543-2275-4aee-900e-1c4e6306da6f")
    public  TRequirementDefinitionTypePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("a8259c89-4113-4860-873d-5c3b6326d46f")
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
