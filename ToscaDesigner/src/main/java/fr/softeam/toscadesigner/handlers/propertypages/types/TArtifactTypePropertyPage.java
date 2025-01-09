package fr.softeam.toscadesigner.handlers.propertypages.types;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TArtifactType;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid("dc9b4fe7-2740-4922-a2e8-2f8bed9ab839")
public class TArtifactTypePropertyPage<T extends TArtifactType> extends ToscaElementPropertyPage<T> {
	@objid("ebefb57f-73b0-40c4-9fdb-4361c6e97502")
	public TArtifactTypePropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

	@objid("d83d1ab5-ef73-4d1b-a050-21aba39c508c")
	@Override
	public void changeProperty(int row, String value) {
		switch (row) {
		case 1:
			break;

		}
	}

	@objid("d690bc28-584e-47c4-8e8c-5628dd406254")
	@Override
	public void update(IModulePropertyTable table) {
		super.update(table);
	}

}
