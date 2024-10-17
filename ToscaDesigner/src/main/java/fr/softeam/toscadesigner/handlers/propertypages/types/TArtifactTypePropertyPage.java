package fr.softeam.toscadesigner.handlers.propertypages.types;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.tosca.standard.class_.TArtifactType;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;

public class TArtifactTypePropertyPage<T extends TArtifactType> extends ToscaElementPropertyPage<T> {


    public TArtifactTypePropertyPage(T elt) {
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
