package fr.softeam.toscadesigner.handlers.propertypages.core;

import java.util.Arrays;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.smkernel.mapi.MObject;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.tosca.standard.class_.TPolicyType;

public class TPolicyTypePropertyPage<T extends TPolicyType> extends ToscaElementPropertyPage<T> {
	public TPolicyTypePropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeProperty(int row, String value) {
		switch (row) {

		case 1:
			this._element.getElement().setName(value);
			;
			break;
		case 2:
			for (ModelElement el : TPolicyType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
				if (value.contains(el.getUuid())) {
					this._element
							.setDerivedFrom(TPolicyType.instantiate((org.modelio.metamodel.uml.statik.Class) el));
				}
			}
			break;
		case 3:
			this._element.setPolicyLanguage(value);
			break;

		}
	}

	@objid("57cdfc80-a690-495d-ab16-2e8759bdd7e0")
	@Override
	public void update(IModulePropertyTable table) {
		super.update(table);
		table.addProperty("Name", _element.getElement().getName());
		table.addProperty("Description", _element.getDescription());
		table.addProperty("Derived From",
				this._element.getDerivedFrom() != null ? this._element.getDerivedFrom().getElement() : null,
				Arrays.asList(Metamodel.getMClass("Attribute")), new IMObjectFilter() {
					@Override
					public boolean accept(MObject element) {
						return TPolicyType.canInstantiate(element);
					}
				});
		table.addProperty("Policy Language", _element.getPolicyLanguage());
	}

}
