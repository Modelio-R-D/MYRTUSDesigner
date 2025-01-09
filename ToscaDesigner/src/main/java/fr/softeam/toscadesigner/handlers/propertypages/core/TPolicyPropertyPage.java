package fr.softeam.toscadesigner.handlers.propertypages.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;
import fr.softeam.toscadesigner.api.ToscaDesignerProxyFactory;
import fr.softeam.toscadesigner.api.tosca.standard.attribute.TPropertyDef;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TPolicy;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TPolicyType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.Trigger;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Class;
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
                    this._element.setType(TPolicyType.instantiate((org.modelio.metamodel.uml.statik.Class) el));
                }
            }
            break;
              case 3:
                  Class elt2 = (Class) getModelElt(TNodeTemplate.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
                  if ((elt2 != null)
                          && (elt2.isStereotyped(IToscaDesignerPeerModule.MODULE_NAME, TNodeTemplate.STEREOTYPE_NAME))) {
                      Object pc = ToscaDesignerProxyFactory.instantiate(elt2);
                      if (value.startsWith(this._add)) {
                          this._element.addTargets((TNodeTemplate) pc);
                      } else {
                          this._element.removeTargets((TNodeTemplate) pc);
                      }
                  }
                  break;
              case 4:
                  Class elt4 = (Class) getModelElt(Trigger.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
                  if ((elt4 != null)
                          && (elt4.isStereotyped(IToscaDesignerPeerModule.MODULE_NAME, Trigger.STEREOTYPE_NAME))) {
                      Object pc = ToscaDesignerProxyFactory.instantiate(elt4);
                      if (value.startsWith(this._add)) {
                          this._element.addTriggers((Trigger) pc);
                      } else {
                          this._element.removeTriggers((Trigger) pc);
                      }
                  }
                  break;   
                  
              case 5:
                  Attribute elt3 = (Attribute) getModelElt(TPropertyDef.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
                  if ((elt3 != null)
                          && (elt3.isStereotyped(IToscaDesignerPeerModule.MODULE_NAME, TPropertyDef.STEREOTYPE_NAME))) {
                      Object pc = ToscaDesignerProxyFactory.instantiate(elt3);
                      if (value.startsWith(this._add)) {
                          this._element.addProperties((TPropertyDef) pc);
                      } else {
                          this._element.removeProperties((TPropertyDef) pc);
                      }
                  }
                  break;
                  
        case 6:
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
                this._element.getType() != null ? this._element.getType().getElement() : null,
                Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
                    @Override
                    public boolean accept(MObject element) {
                        return TPolicyType.canInstantiate(element);
                    }
                });
        
        //Targets
        List<ModelElement> members_elt = extractModelElements(this._element.getTargets());
        List<ModelElement> nodeTemplateList = (TNodeTemplate.MdaTypes.STEREOTYPE_ELT.getExtendedElement() != null) 
            ? TNodeTemplate.MdaTypes.STEREOTYPE_ELT.getExtendedElement()
            : Collections.emptyList();
        table.addProperty(
            "Targets", 
            getToscaValue(members_elt), 
            getAddRemove(nodeTemplateList, extractModelElements(this._element.getTargets()))
        );
        
        //Triggers
        members_elt = extractModelElements(this._element.getTriggers());
        List<ModelElement> triggersList = (Trigger.MdaTypes.STEREOTYPE_ELT.getExtendedElement() != null) 
            ? Trigger.MdaTypes.STEREOTYPE_ELT.getExtendedElement()
            : Collections.emptyList();
        table.addProperty(
            "Triggers", 
            getToscaValue(members_elt), 
            getAddRemove(triggersList, extractModelElements(this._element.getTriggers()))
        );         
                
        //Properties
        members_elt = extractModelElements(this._element.getProperties());
        List<ModelElement> propertiesList = (Trigger.MdaTypes.STEREOTYPE_ELT.getExtendedElement() != null) 
            ? TPropertyDef.MdaTypes.STEREOTYPE_ELT.getExtendedElement()
            : Collections.emptyList();
        table.addProperty(
            "Properties", 
            getToscaValue(members_elt), 
            getAddRemove(propertiesList, extractModelElements(this._element.getProperties()))
        );   
        
        table.addProperty("Policy Ref", _element.getPolicyRef());
    }

}
