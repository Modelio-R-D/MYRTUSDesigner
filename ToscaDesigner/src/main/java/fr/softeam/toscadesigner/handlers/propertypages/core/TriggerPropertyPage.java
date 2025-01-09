package fr.softeam.toscadesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.class_.Trigger;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("0a524b1a-5bbd-4258-a3e4-5eb00849ba3b")
public class TriggerPropertyPage<T extends Trigger> extends ToscaElementPropertyPage<T> {
    @objid ("664f87d3-9584-4d57-bbb8-ce534c48c2d9")
    public  TriggerPropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("ee6d6b91-7e86-480c-a223-a6e77315f871")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            this._element.getElement().setName(value);
            break;
        
        case 2:
            this._element.setDescription(value);
            break;
        
        case 3:
            this._element.setEvent(value);
            break;
        
        case 4:
            this._element.setSchedule(value);
            break;
        
        case 5:
            this._element.setTarget_filter(value);
            break;
        
        case 6:
            this._element.setCondition(value);
            break;
        case 7:
            this._element.setAction(value);
            break;
        
        }
    }

    @objid ("432ada94-b063-466f-a74a-aab666f6ad38")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
        table.addProperty("Description", _element.getDescription());
        table.addProperty("Event", _element.getEvent());
        table.addProperty("Schedule", _element.getSchedule());
        table.addProperty("Target filter", _element.getTarget_filter());
        table.addProperty("Condition", _element.getCondition());
        table.addProperty("Action", _element.getAction());
    }

}
