package fr.softeam.toscadesigner.handlers.propertypages.types;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityType;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;

public class TCapabilityTypePropertyPage<T extends TCapabilityType> extends ToscaElementPropertyPage<T> {


    public TCapabilityTypePropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}



	@Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            break;
        
        }
    }

    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);

    }

}
