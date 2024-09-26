package fr.softeam.toscadesigner.handlers.propertypages.core;

import java.util.Arrays;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.attribute.PropertyDefinitionType;
import fr.softeam.toscadesigner.api.tosca.standard.attribute.TPolicy;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TPolicyType;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("d99db68d-87e1-475a-91b7-c224c33cb0cc")
public class TPolicyPropertyPage<T extends TPolicy> extends ToscaElementPropertyPage<T> {
    @objid ("bfa8ecd2-9c97-48db-bf33-ccbcdc2e2903")
    public  TPolicyPropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("fd527354-ffa4-4097-b4f5-53c5337a1cee")
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
                                  TPolicyType.instantiate((org.modelio.metamodel.uml.statik.Class) el));
                      }
                  }
                  break;
        case 3:
            this._element.setPolicyRef(value);
            break;
        
        }
    }

    @objid ("57cdfc80-a690-495d-ab16-2e8759bdd7e0")
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
