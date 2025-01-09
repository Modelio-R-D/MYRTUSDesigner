package fr.softeam.toscadesigner.handlers.propertypages.topologyTemplate;

import java.util.Arrays;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapability;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinition;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinitionsType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirement;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid("2f77160e-23d4-4fae-b3e2-c6bbee980d2e")
public class TRequirementPropertyPage<T extends TRequirement> extends ToscaElementPropertyPage<T> {
	@objid("37b66234-b059-4229-a386-8ee7c4327764")
	public TRequirementPropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

	@objid("0f3b25da-6f83-4cc1-a773-7fbb22518d4d")
	@Override
	public void changeProperty(int row, String value) {
		switch (row) {
		case 1:
			this._element.getElement().setName(value);
			break;
		case 2:
			for (ModelElement dep : TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
				if (value.contains(dep.getUuid())) {
					this._element.setRelationship(
							TRelationshipTemplate.instantiate((org.modelio.metamodel.uml.statik.Association) dep));
				}
			}
			break;
		case 3:
			for (ModelElement dep : TNodeTemplate.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
				if (value.contains(dep.getUuid())) {
					this._element.setNode(TNodeTemplate.instantiate((org.modelio.metamodel.uml.statik.Class) dep));
				}
			}
			break;
		case 4:
			for (ModelElement dep : TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
				if (value.contains(dep.getUuid())) {
					this._element.setCapability(
							TCapabilityDefinition.instantiate((org.modelio.metamodel.uml.statik.Class) dep));
				}
			}
			for (ModelElement dep : TCapabilityType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
				if (value.contains(dep.getUuid())) {
					this._element
							.setCapability(TCapabilityType.instantiate((org.modelio.metamodel.uml.statik.Class) dep));
				}
			}
			break;
		}
	}

	@objid("4df4e502-5035-4c7a-a7cf-81681019a431")
	@Override
	public void update(IModulePropertyTable table) {
		super.update(table);
		table.addProperty("Name", _element.getElement().getName());
		// relationship template
		table.addProperty("Relationship",
				this._element.getRelationship() != null ? this._element.getRelationship().getElement() : null,
				Arrays.asList(Metamodel.getMClass("Association")), new IMObjectFilter() {
					@Override
					public boolean accept(MObject element) {
						return TRelationshipTemplate.canInstantiate(element);
					}
				});
		// node template
		table.addProperty("Node", this._element.getNode() != null ? this._element.getNode().getElement() : null,
				Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
					@Override
					public boolean accept(MObject element) {
						return TNodeTemplate.canInstantiate(element);
					}
				});
		// Capability
		table.addProperty("Capability",
				this._element.getCapability() != null ? this._element.getCapability().getElement() : null,
				Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
					@Override
					public boolean accept(MObject element) {
						return (TCapabilityDefinition.canInstantiate(element)
								|| TCapabilityType.canInstantiate(element));
					}
				});
	}

}
