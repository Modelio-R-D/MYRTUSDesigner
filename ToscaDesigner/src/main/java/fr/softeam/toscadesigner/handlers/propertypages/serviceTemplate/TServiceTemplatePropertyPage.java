package fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;
import fr.softeam.toscadesigner.api.ToscaDesignerProxyFactory;
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.InterfacesType;
import fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyElementInstanceStates;
import fr.softeam.toscadesigner.api.tosca.standard.package_.TGroup;
import fr.softeam.toscadesigner.api.tosca.standard.package_.TServiceTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.package_.TTopologyTemplate;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("a7f33f74-8435-4a95-a221-94a56c5f4cfd")
public class TServiceTemplatePropertyPage<T extends TServiceTemplate> extends ToscaElementPropertyPage<T> {
    @objid ("6b40406a-9893-459b-872a-046f069c5b49")
    public  TServiceTemplatePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("004035a6-3c47-440d-8d27-c3032b9db0fc")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            this._element.getElement().setName(value);
            break;
        
        case 2:
            for (ModelElement dep : TTopologyTemplate.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
                if (value.contains(dep.getUuid())) {
                    this._element.setTopologyTemplate(
                            TTopologyTemplate.instantiate((org.modelio.metamodel.uml.statik.Package) dep));
                }
            }
            break;
        
        case 3:
            Class elt2 = (Class) getModelElt(TNodeType.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt2 != null)
                    && (elt2.isStereotyped(IToscaDesignerPeerModule.MODULE_NAME, TNodeType.STEREOTYPE_NAME))) {
                Object pc = ToscaDesignerProxyFactory.instantiate(elt2);
                if (value.startsWith(this._add)) {
                    this._element.addNodeTypes((TNodeType) pc);
                } else {
                    this._element.removeNodeTypes((TNodeType) pc);
                }
            }
            break;
        
        case 4:
            Class elt3 = (Class) getModelElt(TRelationshipType.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt3 != null)
                    && (elt3.isStereotyped(IToscaDesignerPeerModule.MODULE_NAME, TRelationshipType.STEREOTYPE_NAME))) {
                Object pc = ToscaDesignerProxyFactory.instantiate(elt3);
                if (value.startsWith(this._add)) {
                    this._element.addRelationships((TRelationshipType) pc);
                } else {
                    this._element.removeRelationships((TRelationshipType) pc);
                }
            }
            break;
        case 5:
            ModelElement elt1 = getModelElt(TGroup.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt1 != null) && (elt1.isStereotyped(IToscaDesignerPeerModule.MODULE_NAME, TGroup.STEREOTYPE_NAME))) {
                Object pc = ToscaDesignerProxyFactory.instantiate(elt1);
                if (value.startsWith(this._add)) {
                    this._element.addGroups((TGroup) pc);
                } else {
                    this._element.removeGroups((TGroup) pc);
                }
            }
            break;
        }
    }

    @objid ("42d61cbc-7b7b-42bc-8d36-c08a126e4d21")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
        
        // TOPOLOGY TEMPLATE
        table.addProperty("Topology",
                this._element.getTopologyTemplate() != null ? this._element.getTopologyTemplate().getElement() : null,
                Arrays.asList(Metamodel.getMClass("Package")), new IMObjectFilter() {
                    @Override
                    public boolean accept(MObject element) {
                        return TTopologyTemplate.canInstantiate(element);
                    }
                });
        
        // NODE TYPES
        List<ModelElement> members_elt = extractModelElements(this._element.getNodeTypes());
        List<ModelElement> nodeTypeList = (TNodeType.MdaTypes.STEREOTYPE_ELT.getExtendedElement() != null)
                ? TNodeType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()
                : Collections.emptyList();
        
        table.addProperty("Node types", getToscaValue(members_elt),
                getAddRemove(nodeTypeList, extractModelElements(this._element.getNodeTypes())));
        
        // RELATIONSHIP types
        members_elt = extractModelElements(this._element.getRelationships());
        List<ModelElement> relationships = (TRelationshipType.MdaTypes.STEREOTYPE_ELT.getExtendedElement() != null)
                ? TRelationshipType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()
                : Collections.emptyList();
        
        table.addProperty("Relationship types", getToscaValue(members_elt),
                getAddRemove(relationships, extractModelElements(this._element.getRelationships())));
        
        // GROUPS
        members_elt = extractModelElements(this._element.getGroups());
        List<ModelElement> groupList = (TGroup.MdaTypes.STEREOTYPE_ELT.getExtendedElement() != null)
                ? TGroup.MdaTypes.STEREOTYPE_ELT.getExtendedElement()
                : Collections.emptyList();
        
        table.addProperty("Groups", getToscaValue(members_elt),
                getAddRemove(groupList, extractModelElements(this._element.getGroups())));
    }

}
