package fr.softeam.toscadesigner.handlers.propertypages.topologyTemplate;

import java.util.Arrays;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.RelationshipConstraintsType;
import fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipType;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("83e83f25-36df-4af3-a9ec-d48f34eb1aec")
public class TRelationshipTemplatePropertyPage<T extends TRelationshipTemplate> extends ToscaElementPropertyPage<T> {
    @objid ("8b38e548-70ca-4080-ab98-d6e2374fc90e")
    public  TRelationshipTemplatePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("b6b3ca49-8857-4993-b798-1c8328089c4d")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            this._element.getElement().setName(value);
            break;
        
        case 2:
            for (ModelElement elt : TRelationshipType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
                if (value.contains(elt.getUuid())) {
                    this._element.setRelationshipType(
                            TRelationshipType.instantiate((org.modelio.metamodel.uml.statik.Class) elt));
                }
            }
            break;
        
        case 3:
            for (ModelElement elt : RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
                if (value.contains(elt.getUuid())) {
                    this._element.setRelationshipConstraints(
                            RelationshipConstraintsType.instantiate((org.modelio.metamodel.uml.statik.Class) elt));
                }
            }
            break;
        
        }
    }

    @objid ("378c8d16-1a0a-413b-b142-e267468c87c4")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Name", _element.getElement().getName());
        
        // Type
        table.addProperty("Type",
                this._element.getRelationshipType() != null ? this._element.getRelationshipType().getElement() : null,
                Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
                    @Override
                    public boolean accept(MObject element) {
                        return TRelationshipType.canInstantiate(element);
                    }
                });
        
        // Constraints
        table.addProperty("Constraints",
                this._element.getRelationshipConstraints() != null
                        ? this._element.getRelationshipConstraints().getElement()
                        : null,
                Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
                    @Override
                    public boolean accept(MObject element) {
                        return RelationshipConstraintsType.canInstantiate(element);
                    }
                });
    }

}
