package fr.softeam.toscadesigner.handlers.propertypages.core;

import java.util.Arrays;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.attribute.PropertyDefinitionType;
import fr.softeam.toscadesigner.api.tosca.standard.attribute.TPropertyDef;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("fe907769-1d75-4335-8f0c-89260a0dca54")
public class TPropertyDefPropertyPage<T extends TPropertyDef> extends ToscaElementPropertyPage<T> {
    @objid ("bf3ef6d9-e96d-4d05-94e8-8a4aec4b2b4e")
    public  TPropertyDefPropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("ab5d49e1-fc4e-4905-bbef-0224d341d36a")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        
        case 1:
            for (ModelElement el : PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
                if (value.contains(el.getUuid())) {
                    this._element.setName(
                            PropertyDefinitionType.instantiate((org.modelio.metamodel.uml.statik.Attribute) el));
                }
            }
            break;
        
        case 2:
            this._element.getElement().setValue(value);
            break;
        }
    }

    @objid ("3f56b27a-bd33-4929-8c16-a7d45b7be597")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", this._element.getName() != null ? this._element.getName().getElement() : null,
                Arrays.asList(Metamodel.getMClass("Attribute")), new IMObjectFilter() {
                    @Override
                    public boolean accept(MObject element) {
                        return PropertyDefinitionType.canInstantiate(element);
                    }
                });
        table.addProperty("Value", _element.getElement().getValue());
    }

}
