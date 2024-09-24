package fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TPolicyType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinitionsType;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;

import java.util.Arrays;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("0f47e5e9-4fff-49ec-86bc-786016f24d85")
public class TCapabilityDefinitionsTypePropertyPage<T extends TCapabilityDefinitionsType> extends ToscaElementPropertyPage<T> {
    @objid ("1fa9372c-cbfc-4d53-989d-0fd07c6575ed")
    public  TCapabilityDefinitionsTypePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("097d23d1-3362-45bb-ad17-6c46558dff10")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            this._element.getElement().setName(value);
            break;
        
        }
    }

    @objid ("f71fd3f0-3856-459c-9320-a64b3b1aaf0f")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
        /*
		table.addProperty("Derived From",
				this._element.getElement().getDerivedFrom() != null ? this._element.getElement().getDerivedFrom() : null,
				Arrays.asList(Metamodel.getMClass("Attribute")), new IMObjectFilter() {
					@Override
					public boolean accept(MObject element) {
						return TPolicyType.canInstantiate(element);
					}
				});
				*/
    }

}
