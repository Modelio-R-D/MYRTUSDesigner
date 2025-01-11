package fr.softeam.toscadesigner.handlers.propertypages.core;

import java.util.Arrays;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TGroupType;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("eb6c1eed-6b27-4419-9dc7-6ac4a7f8d107")
public class TGroupTypePropertyPage<T extends TGroupType> extends ToscaElementPropertyPage<T> {
    @objid ("44a6938f-5656-44d0-831a-92af14c453fa")
    public  TGroupTypePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("8c38bec9-0a23-438f-a8ec-cc24c1c917bb")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            this._element.getElement().setName(value);
            break;
        case 2:
            for (ModelElement el : TGroupType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
                if (value.contains(el.getUuid())) {
                    this._element.setDerivedFrom(TGroupType.instantiate((org.modelio.metamodel.uml.statik.Class) el));
                }
            }
            break;
        }
    }

    @objid ("bce8cd15-5be1-4e8c-8478-529c354cc0f2")
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
