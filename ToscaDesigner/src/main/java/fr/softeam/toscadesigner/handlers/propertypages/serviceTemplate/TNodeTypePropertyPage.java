package fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("8e6ae627-578f-422f-8de0-77c04824219b")
public class TNodeTypePropertyPage<T extends TNodeType> extends TEntityTypePropertyPage<T> {
    @objid ("b129e2d0-20bf-4b53-9bdf-8b625ba37529")
    public  TNodeTypePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("f7311659-e3b9-43bb-b939-e143682cce9f")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
         case 2:
             this._element.setRequirementDefinitions(null);;
             break;
         case 3:
             this._element.setCapabilityDefinitions(null);;
             break;
         case 4:
             this._element.setInstanceStates(null);
             break;
         case 5:
             this._element.setInterfaces(null);
             break;
         
         }
    }

    @objid ("3df2e3b9-f8a2-4c5c-9a5b-60799c369b20")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Requirement Definitions", getNotNull((String.valueOf(this._element.getRequirementDefinitions()))));
        table.addProperty("Capabilities Definitions", getNotNull((String.valueOf(this._element.getCapabilityDefinitions()))));
        table.addProperty("Instance States", getNotNull((String.valueOf(this._element.getInstanceStates()))));
        table.addProperty("Intefaces", getNotNull((String.valueOf(this._element.getInterfaces()))));
    }

}
