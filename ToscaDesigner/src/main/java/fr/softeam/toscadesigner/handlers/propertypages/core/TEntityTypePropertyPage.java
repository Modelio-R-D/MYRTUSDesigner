package fr.softeam.toscadesigner.handlers.propertypages.core;

import java.util.Arrays;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TEntityType;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("2838ec68-e4d6-477b-9ba1-a3596be3ed41")
public abstract class TEntityTypePropertyPage<T extends TEntityType> extends ToscaElementPropertyPage<T> {
    @objid ("2000cd5e-4ed6-4455-a13d-9069a6cb5c6a")
    public  TEntityTypePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("5ff8c89a-8557-48ed-82bd-40fdb5f2f6fa")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
           switch (row) {
           case 1:
               this._element.getElement().setName(value);
               break;
           
           case 2:
               this._element.setDescription(value);
               break;
           
           case 3:
               for (ModelElement el : TEntityType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
                   if (value.contains(el.getUuid())) {
                       this._element.setDerivedFrom(TEntityType.instantiate((org.modelio.metamodel.uml.statik.Class) el));
                   }
               }
               break;
           }
    }

    @objid ("17a6a2d8-d975-400f-acfe-78fc8ef282f3")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
        table.addProperty("Description", _element.getDescription());
        table.addProperty("Derived From",
                this._element.getDerivedFrom() != null ? this._element.getDerivedFrom().getElement() : null,
                Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
                    @Override
                    public boolean accept(MObject element) {
                        return TEntityType.canInstantiate(element);
                    }
                });
    }

}
