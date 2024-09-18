package fr.softeam.toscadesigner.handlers.propertypages.core;

import java.util.Arrays;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TPolicyType;
import fr.softeam.toscadesigner.api.tosca.standard.attribute.PropertyDefinitionType;
import fr.softeam.toscadesigner.api.tosca.standard.attribute.TPolicy;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.smkernel.mapi.MObject;

public class TPolicyPropertyPage<T extends TPolicy> extends ToscaElementPropertyPage<T> {

	public TPolicyPropertyPage(T elt) {
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
                    this._element.setPolicyType(
                    		TPolicyType.instantiate((org.modelio.metamodel.uml.statik.Attribute) el));
                }
            }
            break;
		case 3:
			this._element.setPolicyRef(value);
			break;

		}
	}

	@Override
	public void update(IModulePropertyTable table) {
		super.update(table);
		table.addProperty("Name", _element.getElement().getName());
        table.addProperty("Policy Type",
                this._element.getPolicyType() != null ? this._element.getPolicyType().getElement()
                        : null,
                Arrays.asList(Metamodel.getMClass("Attribute")), new IMObjectFilter() {
                    @Override
                    public boolean accept(MObject element) {
                        return TPolicyType.canInstantiate(element);
                    }
                });
		table.addProperty("Policy Ref", _element.getPolicyRef());

	}

}
