package fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate;

import java.util.Arrays;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirementDefinitionType;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("c757eb57-dab6-4fc3-8fd8-6f094926a62c")
public class TRequirementDefinitionTypePropertyPage<T extends TRequirementDefinitionType> extends ToscaElementPropertyPage<T> {
    @objid ("bad7c543-2275-4aee-900e-1c4e6306da6f")
    public  TRequirementDefinitionTypePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("a8259c89-4113-4860-873d-5c3b6326d46f")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            this._element.getElement().setName(value);
            break;
        case 2:
        for (ModelElement el : TRequirementDefinitionType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
        if (value.contains(el.getUuid())) {
        this._element
        .setDerivedFrom(TRequirementDefinitionType.instantiate((org.modelio.metamodel.uml.statik.Class) el));
        }
        }
        break;
        
        }
    }

    @objid ("600d81b9-9625-4ce5-9cd8-1b4e5ed141cd")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
        table.addProperty("Derived From",
        this._element.getDerivedFrom() != null ? this._element.getDerivedFrom().getElement() : null,
        Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
        @Override
        public boolean accept(MObject element) {
        return TRequirementDefinitionType.canInstantiate(element);
        }
        });
    }

}
