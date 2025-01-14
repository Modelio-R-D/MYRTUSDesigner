package fr.softeam.toscadesigner.handlers.propertypages.topologyTemplate;

import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;
import fr.softeam.toscadesigner.api.ToscaDesignerProxyFactory;
import fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.package_.TGroup;
import fr.softeam.toscadesigner.api.tosca.standard.package_.TTopologyTemplate;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Class;

@objid ("a7f33f74-8435-4a95-a221-94a56c5f4cfd")
public class TTopologyTemplatePropertyPage<T extends TTopologyTemplate> extends ToscaElementPropertyPage<T> {
    @objid ("6b40406a-9893-459b-872a-046f069c5b49")
    public  TTopologyTemplatePropertyPage(T elt) {
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
        
        case 3:
            Class elt2 = (Class) getModelElt(TNodeTemplate.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt2 != null)
                    && (elt2.isStereotyped(IToscaDesignerPeerModule.MODULE_NAME, TNodeTemplate.STEREOTYPE_NAME))) {
                Object pc = ToscaDesignerProxyFactory.instantiate(elt2);
                if (value.startsWith(this._add)) {
                    this._element.addNodeTemplates((TNodeTemplate) pc);
                } else {
                    this._element.removeNodeTemplates((TNodeTemplate) pc);
                }
            }
            break;
        
        case 4:
            Association elt3 = (Association) getModelElt(
                    TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt3 != null) && (elt3.isStereotyped(IToscaDesignerPeerModule.MODULE_NAME,
                    TRelationshipTemplate.STEREOTYPE_NAME))) {
                Object pc = ToscaDesignerProxyFactory.instantiate(elt3);
                if (value.startsWith(this._add)) {
                    this._element.addRelationshipTemplates((TRelationshipTemplate) pc);
                } else {
                    this._element.removeRelationshipTemplates((TRelationshipTemplate) pc);
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
        
        // groups
        List<ModelElement> members_elt = extractModelElements(this._element.getGroups());
        List<ModelElement> groupList = (TGroup.MdaTypes.STEREOTYPE_ELT.getExtendedElement() != null)
                ? TGroup.MdaTypes.STEREOTYPE_ELT.getExtendedElement()
                : Collections.emptyList();
        
        table.addProperty("Groups", getToscaValue(members_elt),
                getAddRemove(groupList, extractModelElements(this._element.getGroups())));
        
        // node templates
        members_elt = extractModelElements(this._element.getNodeTemplates());
        List<ModelElement> nodeTemplateList = (TNodeTemplate.MdaTypes.STEREOTYPE_ELT.getExtendedElement() != null)
                ? TNodeTemplate.MdaTypes.STEREOTYPE_ELT.getExtendedElement()
                : Collections.emptyList();
        
        table.addProperty("Node templates", getToscaValue(members_elt),
                getAddRemove(nodeTemplateList, extractModelElements(this._element.getNodeTemplates())));
        
        // relationship templates
        members_elt = extractModelElements(this._element.getRelationshipTemplates());
        List<ModelElement> relationshipTemplates = (TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT
                .getExtendedElement() != null) ? TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT.getExtendedElement()
                        : Collections.emptyList();
        
        table.addProperty("Relationship templates", getToscaValue(members_elt),
                getAddRemove(relationshipTemplates, extractModelElements(this._element.getRelationshipTemplates())));
    }

}
