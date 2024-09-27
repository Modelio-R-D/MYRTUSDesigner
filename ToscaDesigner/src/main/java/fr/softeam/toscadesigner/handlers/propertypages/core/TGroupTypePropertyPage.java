package fr.softeam.toscadesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.tosca.standard.class_.TGroupType;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;


public class TGroupTypePropertyPage<T extends TGroupType> extends ToscaElementPropertyPage<T> {
    public TGroupTypePropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}



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
