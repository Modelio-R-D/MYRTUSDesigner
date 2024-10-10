package fr.softeam.toscadesigner.handlers.propertypages.core;

import java.util.Arrays;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.smkernel.mapi.MObject;

import fr.softeam.toscadesigner.api.tosca.standard.class_.TGroupType;


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
		case 2:
			for (ModelElement el : TGroupType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
				if (value.contains(el.getUuid())) {
					this._element
							.setDerivedFrom(TGroupType.instantiate((org.modelio.metamodel.uml.statik.Class) el));
				}
			}
			break;
        }
    }

    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
		table.addProperty("Derived From",
				this._element.getDerivedFrom() != null ? this._element.getDerivedFrom().getElement() : null,
				Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
					@Override
					public boolean accept(MObject element) {
						return TGroupType.canInstantiate(element);
					}
				});
    }

}
