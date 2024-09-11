package fr.softeam.toscadesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.attribute.PropertyDefinitionType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifacts;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.GeneralClass;

@objid ("1c6a520c-04ce-41e5-9556-bd2f87af180b")
public class PropertyDefinitionTypePropertyPage<T extends PropertyDefinitionType> extends ToscaElementPropertyPage<T> {
    @objid ("ecf69318-498d-4bf5-a988-bb8408e2e536")
    public  PropertyDefinitionTypePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("e87aabc0-60a1-421d-835f-21075c4fffd1")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            this._element.getElement().setName(value);
            break;
        
        case 2:    
            
        this._element.getElement().setValue(value);
            break;
        }
    }

    @objid ("00c9eca6-a630-4847-8087-be1533c9c9eb")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
        table.addProperty("Type", _element.getElement().getValue());
    }

}
