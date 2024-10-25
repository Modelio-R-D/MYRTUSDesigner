package fr.softeam.toscadesigner.handlers.propertypages.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;
import fr.softeam.toscadesigner.api.ToscaDesignerProxyFactory;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TGroupType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.package_.TGroup;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("70b0137e-f426-4173-8bf4-39b754ebb8cc")
public class TGroupPropertyPage<T extends TGroup> extends ToscaElementPropertyPage<T> {
    @objid ("5430e77a-00d6-4172-b2f1-95179e75ecff")
    public  TGroupPropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("2dfbbee9-dff6-4801-b242-f9ce8f436cc2")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            this._element.getElement().setName(value);
            break;
        
        case 2:
            for (ModelElement dep : TGroupType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
                if (value.contains(dep.getUuid())) {
                    this._element.setType(TGroupType.instantiate((org.modelio.metamodel.uml.statik.Class) dep));
                }
            }
            break;
        
        case 3:
            Class elt1 = (Class) getModelElt(TNodeTemplate.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt1 != null)
                    && (elt1.isStereotyped(IToscaDesignerPeerModule.MODULE_NAME, TNodeTemplate.STEREOTYPE_NAME))) {
                Object pc = ToscaDesignerProxyFactory.instantiate(elt1);
                if (value.startsWith(this._add)) {
                    this._element.addMembers((TNodeTemplate) pc);
                } else {
                    this._element.removeMembers((TNodeTemplate) pc);
                }
            }
            break;
        }
    }

    @objid ("f48d6f31-d6fb-4804-b5cd-1d61d2469c51")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
        table.addProperty("Type", this._element.getType() != null ? this._element.getType().getElement() : null,
                Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
                    @Override
                    public boolean accept(MObject element) {
                        return TGroupType.canInstantiate(element);
                    }
                });
        
        
        List <ModelElement> members_elt = extractModelElements(this._element.getMembers());
        List<ModelElement> nodeTemplateList = (TNodeTemplate.MdaTypes.STEREOTYPE_ELT.getExtendedElement() != null) 
            ? TNodeTemplate.MdaTypes.STEREOTYPE_ELT.getExtendedElement()
            : Collections.emptyList();
        
        table.addProperty(
            "Members", 
            getToscaValue(members_elt), 
            getAddRemove(nodeTemplateList, extractModelElements(this._element.getMembers()))
        );
    }



}
