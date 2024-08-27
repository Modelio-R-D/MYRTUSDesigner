package fr.softeam.toscadesigner.handlers.propertypages.topologyTemplate;

import java.util.Arrays;
import java.util.List;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.smkernel.mapi.MObject;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.CapabilitiesType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementsType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirement;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;

@objid ("e048fc6c-d270-4303-ad58-e0ce53629c36")
public class TNodeTemplatePropertyPage<T extends TNodeTemplate> extends ToscaElementPropertyPage<T> {
    @objid ("b9c761de-9327-4f7c-b753-83885d625b7f")
    private List<ModelElement> _capabilities = null;

    @objid ("63860325-314c-41b3-8585-72012af82d21")
    public  TNodeTemplatePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("03104839-a70b-4c28-92b3-7407202c97d0")
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
            ModelElement elt = getModelElt(this._capabilities, value);
            if (elt.isStereotyped(IToscaDesignerPeerModule.MODULE_NAME, CapabilitiesType.STEREOTYPE_NAME)) {
                // this._element.setCapabilities((CapabilitiesType) elt);
            }
        
            break;
        case 5:
            this._element.setDeploymentArtifacts(null);
            break;

        case 6:
        	
        	for(ModelElement req : RequirementsType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
        		if(value.contains(req.getUuid())) {
        			   this._element.setRequirements(RequirementsType.instantiate((org.modelio.metamodel.uml.statik.Class)req));
        		}
        	}
        	
        	
         
            break;
        case 7:
            this._element.setNodeType(null);
            break;
        }
    }

    @SuppressWarnings("deprecation")
	@objid ("c4b4d021-91ff-4ee1-b543-8f75ebc7642e")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
        table.addProperty("Min Instance", String.valueOf(_element.getMinInstances()));
        table.addProperty("Max Instance", String.valueOf(_element.getMaxInstances()));
        
        // capabilities
        this._capabilities = CapabilitiesType.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Capabilities", String.valueOf(_element.getMaxInstances()));
         //table.addProperty("Capabilities0",getCamelName(this._element.getCapabilities()), getCamelNames(this._c));
        
        // table.addProperty("Capabilities",
        // getNotNull((String.valueOf(this._element.getCapabilities()))));
        table.addProperty("Deployment Artifacts", getNotNull((String.valueOf(this._element.getDeploymentArtifacts()))));
        // table.addProperty("Policies",
        // getNotNull((String.valueOf(this._element.getPolicies()))));
        
        IMObjectFilter filter =   new IMObjectFilter() {
			@Override
			public boolean accept(MObject element) {
				return RequirementsType.canInstantiate(element);
			}
		};
     
        table.addProperty("Requirements",  this._element.getRequirements() != null ? this._element.getRequirements().getElement() : null,Arrays.asList(Metamodel.getMClass("Class")),filter);

        
        //table.addProperty("Requirements", getNotNull((String.valueOf(this._element.getRequirements()))));
        table.addProperty("Node Type", getNotNull((String.valueOf(this._element.getNodeType()))));
    }

}
