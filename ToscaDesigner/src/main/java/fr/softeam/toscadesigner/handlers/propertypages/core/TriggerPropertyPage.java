package fr.softeam.toscadesigner.handlers.propertypages.core;


import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.toscadesigner.api.tosca.standard.class_.Trigger;

public class TriggerPropertyPage <T extends Trigger> extends ToscaElementPropertyPage<T> {

	public TriggerPropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

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
