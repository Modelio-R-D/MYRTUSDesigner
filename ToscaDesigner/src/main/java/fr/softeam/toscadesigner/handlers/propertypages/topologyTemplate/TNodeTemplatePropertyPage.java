package fr.softeam.toscadesigner.handlers.propertypages.topologyTemplate;

import java.util.List;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;
import fr.softeam.toscadesigner.api.tosca.standard.class_.CapabilitiesType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;

@objid ("83e83f25-36df-4af3-a9ec-d48f34eb1aec")
public class TNodeTemplatePropertyPage<T extends TNodeTemplate> extends ToscaElementPropertyPage<T> {
    @objid ("62694fb2-d122-48b7-9d11-9e1cadafa694")
    private List<ModelElement> _capabilities = null;

    @objid ("d26b318d-f388-4ba5-9cbb-09ef9da59be7")
    public  TNodeTemplatePropertyPage(T elt) {
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
             this._element.setMinInstances(Integer.valueOf(value));
                    break;
         case 3:
             this._element.setMaxInstances(Integer.valueOf(value));
             break;
         case 4:
             ModelElement elt = getModelElt(this._capabilities, value);
        if (elt.isStereotyped(IToscaDesignerPeerModule.MODULE_NAME, CapabilitiesType.STEREOTYPE_NAME)) {
        this._element.setCapabilities((CapabilitiesType) elt);
        }
             
             break;
         case 5:
             this._element.setDeploymentArtifacts(null);
             break;
         case 6:
             this._element.setPolicies(null);
             break;
         case 7:
             this._element.setRequirements(null);
             break;
         }
    }

    @objid ("378c8d16-1a0a-413b-b142-e267468c87c4")
    @Override
    public void update(IModulePropertyTable table) {
        table.addProperty("Name",_element.getElement().getName());
        table.addProperty("Min Instance",String.valueOf(_element.getMinInstances()));
        table.addProperty("Max Instance",String.valueOf(_element.getMaxInstances()));
        
        //capabilities
        this._capabilities = CapabilitiesType.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        //table.addProperty("Capabilities0", getCamelName(this._element.getCapabilities()()), getCamelNames(this._c));
        
        
        table.addProperty("Capabilities", getNotNull((String.valueOf(this._element.getCapabilities()))));
        table.addProperty("Deployment Artifacts", getNotNull((String.valueOf(this._element.getDeploymentArtifacts()))));
        table.addProperty("Policies", getNotNull((String.valueOf(this._element.getPolicies()))));
        table.addProperty("Requirements", getNotNull((String.valueOf(this._element.getRequirements()))));
    }

}
