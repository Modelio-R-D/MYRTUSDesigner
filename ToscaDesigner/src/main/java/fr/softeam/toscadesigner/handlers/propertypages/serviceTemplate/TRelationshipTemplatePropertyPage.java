package fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate;

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

@objid ("15b7bd83-3aed-434a-8ff1-4f61ab9d6360")
public class TRelationshipTemplatePropertyPage<T extends TRelationshipTemplate> extends ToscaElementPropertyPage<T> {
    @objid ("5a0ad181-2aa4-4ad3-a889-94e3ee7e7875")
    public  TRelationshipTemplatePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("ecaf7d2d-dca2-4947-8e42-14f8b4736be6")
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
					break;
				} else {
					this._element.setRelationshipType(null);
				}

            }
            break;
        
        case 3:
            for (ModelElement elt : RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
                if (value.contains(elt.getUuid())) {
                    this._element.setRelationshipConstraints(
                            RelationshipConstraintsType.instantiate((org.modelio.metamodel.uml.statik.Class) elt));
					break;
				} else {
					this._element.setRelationshipConstraints(null);
				}

            }
            break;
        
        }
    }

    @objid ("84d0ce8f-8a60-4f35-bcfd-35ab46b5532a")
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
