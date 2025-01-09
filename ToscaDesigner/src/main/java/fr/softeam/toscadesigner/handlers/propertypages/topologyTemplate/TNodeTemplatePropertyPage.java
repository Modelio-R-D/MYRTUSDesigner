package fr.softeam.toscadesigner.handlers.propertypages.topologyTemplate;

import java.util.Arrays;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementsType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifacts;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid("e048fc6c-d270-4303-ad58-e0ce53629c36")
public class TNodeTemplatePropertyPage<T extends TNodeTemplate> extends ToscaElementPropertyPage<T> {
	@objid("63860325-314c-41b3-8585-72012af82d21")
	public TNodeTemplatePropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

	@objid("03104839-a70b-4c28-92b3-7407202c97d0")
	@Override
	public void changeProperty(int row, String value) {
		switch (row) {
		case 1:
			this._element.getElement().setName(value);
			break;
		case 2:
			this._element.setMinInstances(Integer.valueOf(value));
			break;
		case 3:
			this._element.setMaxInstances(Integer.valueOf(value));
			break;

		case 4:
			for (ModelElement dep : TDeploymentArtifacts.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
				if (value.contains(dep.getUuid())) {
					this._element.setDeploymentArtifacts(
							TDeploymentArtifacts.instantiate((org.modelio.metamodel.uml.statik.Class) dep));
				}
			}
			break;

		case 5:
			for (ModelElement req : RequirementsType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
				if (value.contains(req.getUuid())) {
					this._element.setRequirements(
							RequirementsType.instantiate((org.modelio.metamodel.uml.statik.Class) req));
				}
			}

			break;
		case 6:
			for (ModelElement nodet : TNodeType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
				if (value.contains(nodet.getUuid())) {
					this._element.setNodeType(TNodeType.instantiate((org.modelio.metamodel.uml.statik.Class) nodet));
				}
			}
			break;

		}
	}

	@objid("c4b4d021-91ff-4ee1-b543-8f75ebc7642e")
	@SuppressWarnings("deprecation")
	@Override
	public void update(IModulePropertyTable table) {
		super.update(table);
		table.addProperty("Name", _element.getElement().getName());
		table.addProperty("Min Instance", String.valueOf(_element.getMinInstances()));
		table.addProperty("Max Instance", String.valueOf(_element.getMaxInstances()));

		// DeploymentArtifacts
		table.addProperty("Deployment Artifacts",
				this._element.getDeploymentArtifacts() != null ? this._element.getDeploymentArtifacts().getElement()
						: null,
				Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
					@Override
					public boolean accept(MObject element) {
						return TDeploymentArtifacts.canInstantiate(element);
					}
				});

		// Requirements
		table.addProperty("Requirements",
				this._element.getRequirements() != null ? this._element.getRequirements().getElement() : null,
				Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
					@Override
					public boolean accept(MObject element) {
						return RequirementsType.canInstantiate(element);
					}
				});

		// Node Type
		table.addProperty("Node Type",
				this._element.getNodeType() != null ? this._element.getNodeType().getElement() : null,
				Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
					@Override
					public boolean accept(MObject element) {
						return TNodeType.canInstantiate(element);
					}
				});
	}

}
