package fr.softeam.toscadesigner.handlers.propertypages.core;

import java.util.Collections;
import java.util.List;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;
import fr.softeam.toscadesigner.api.ToscaDesignerProxyFactory;
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.CapabilitiesType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapability;
import fr.softeam.toscadesigner.api.tosca.standard.class_.Trigger;

public class CapabilitiesTypePropertyPage<T extends CapabilitiesType> extends ToscaElementPropertyPage<T> {

	public CapabilitiesTypePropertyPage(T elt) {
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
			Class elt2 = (Class) getModelElt(TCapability.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
			if ((elt2 != null)
					&& (elt2.isStereotyped(IToscaDesignerPeerModule.MODULE_NAME, TCapability.STEREOTYPE_NAME))) {
				Object pc = ToscaDesignerProxyFactory.instantiate(elt2);
				if (value.startsWith(this._add)) {
					this._element.addCapability((TCapability) pc);
				} else {
					this._element.removeCapability((TCapability) pc);
				}
			}
			break;
		}
	}

	@Override
	public void update(IModulePropertyTable table) {
		super.update(table);
		table.addProperty("Name", _element.getElement().getName());

		// Capability
		List<ModelElement> members_elt = extractModelElements(this._element.getCapability());
		List<ModelElement> capabilityList = (TCapability.MdaTypes.STEREOTYPE_ELT.getExtendedElement() != null)
				? TCapability.MdaTypes.STEREOTYPE_ELT.getExtendedElement()
				: Collections.emptyList();
		table.addProperty("Capability", getToscaValue(members_elt),
				getAddRemove(capabilityList, extractModelElements(this._element.getCapability())));

	}
}