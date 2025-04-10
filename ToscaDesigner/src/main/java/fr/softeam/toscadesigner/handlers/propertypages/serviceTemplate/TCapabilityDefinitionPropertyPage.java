package fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;
import fr.softeam.toscadesigner.api.ToscaDesignerProxyFactory;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinition;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.Tgroup;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("dda1c36f-f803-4735-b657-1d61d9666f38")
public class TCapabilityDefinitionPropertyPage<T extends TCapabilityDefinition> extends ToscaElementPropertyPage<T> {
    @objid ("aed53ed0-bac1-442e-8ed4-b615406ede17")
    public  TCapabilityDefinitionPropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("e4638914-0ab7-403d-9af1-172ebe614bf4")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            this._element.getElement().setName(value);
            break;
        
        case 2:
            this._element.setConstraints(value);
            break;
        
        case 3:
            for (ModelElement dep : TCapabilityType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
                if (value.contains(dep.getUuid())) {
                    this._element.setCapabilityType(
                            TCapabilityType.instantiate((org.modelio.metamodel.uml.statik.Class) dep));
        break;
        } else {
        this._element.setCapabilityType(null);
        }
            }
            break;
        
        case 4:
            this._element.setLowerBound(Integer.valueOf(value));
            break;
        
        case 5:
            this._element.setUpperBound(Integer.valueOf(value));
            break;
        
        case 6:
            Class elt1 = ( Class) getModelElt(TNodeType.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt1 != null) && (elt1.isStereotyped(IToscaDesignerPeerModule.MODULE_NAME, TNodeType.STEREOTYPE_NAME))) {
                Object pc = ToscaDesignerProxyFactory.instantiate(elt1);
                if (value.startsWith(this._add)) {
                    this._element.addValidSourceType((TNodeType) pc);
                } else {
                    this._element.removeValidSourceType((TNodeType) pc);
                }
            }
            break;
        }
    }

    @objid ("02c00238-1848-4137-a7ab-f76f3f328ea6")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
        table.addProperty("Constraints", _element.getConstraints());
        
        table.addProperty("Capability type",
                this._element.getCapabilityType() != null ? this._element.getCapabilityType().getElement() : null,
                Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
                    @Override
                    public boolean accept(MObject element) {
                        return TCapabilityType.canInstantiate(element);
                    }
                });
        
        table.addProperty("Lower Bound", _element.getLowerBound());
        table.addProperty("Upper Bound", _element.getUpperBound());
        
        //Valid Source Types
        List<ModelElement> members_elt = extractModelElements(this._element.getValidSourceType());
        List<ModelElement> groupList = (TNodeType.MdaTypes.STEREOTYPE_ELT.getExtendedElement() != null)
                ? TNodeType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()
                : Collections.emptyList();
        
        table.addProperty("Valid Source Types", getToscaValue(members_elt),
                getAddRemove(groupList, extractModelElements(this._element.getValidSourceType())));
    }

}
