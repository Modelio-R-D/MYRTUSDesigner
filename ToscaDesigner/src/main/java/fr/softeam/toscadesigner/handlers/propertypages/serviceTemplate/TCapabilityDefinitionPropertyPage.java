package fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinition;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("ec2ef9e0-9596-4d0f-87cc-8d95236ec72a")
public class TCapabilityDefinitionPropertyPage<T extends TCapabilityDefinition> extends ToscaElementPropertyPage<T> {
    @objid ("f4052e04-47ad-43ba-91bf-3c51b69f1458")
    public  TCapabilityDefinitionPropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("7bf9e7e6-0213-4d2e-b709-a24ad8fb0ccc")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            this._element.getElement().setName(value);
            break;
        
        case 2:
            this._element.setConstraints(value);
            break;
        
        case 3:
            this._element.setCapabilityType(value);
        
            break;
            
        case 4:
            this._element.setLowerBound(Integer.valueOf(value));
            break;
            
        case 5:
            this._element.setUpperBound(Integer.valueOf(value));
            break;
            
        case 6:
            this._element.setValid_source_tyoes(value);;
            break;
        }
    }

    @objid ("2e8cda3c-08de-42cd-b9be-af4ebf5a24cc")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
        table.addProperty("Constraints", _element.getConstraints());
        table.addProperty("Capability Type", _element.getCapabilityType());
        table.addProperty("Lower Bound", _element.getLowerBound());
        table.addProperty("Upper Bound", _element.getUpperBound());
        table.addProperty("Valid Source Types", _element.getValid_source_tyoes());
    }

}