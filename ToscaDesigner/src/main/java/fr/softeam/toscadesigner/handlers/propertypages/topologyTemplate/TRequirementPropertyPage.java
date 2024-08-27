package fr.softeam.toscadesigner.handlers.propertypages.topologyTemplate;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirement;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("2f77160e-23d4-4fae-b3e2-c6bbee980d2e")
public class TRequirementPropertyPage<T extends TRequirement> extends ToscaElementPropertyPage<T> {
    @objid ("37b66234-b059-4229-a386-8ee7c4327764")
    public  TRequirementPropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("0f3b25da-6f83-4cc1-a773-7fbb22518d4d")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            this._element.getElement().setName(value);
            break;
        case 2:
            this._element.setRequirementDef(value);
            break;
        case 3:
            this._element.setNode(value);
            break;
        case 4:
            this._element.setCapability(value);
            break;
        }
    }

    @objid ("4df4e502-5035-4c7a-a7cf-81681019a431")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
        table.addProperty("Requirement Def", _element.getRequirementDef());
        table.addProperty("Node", _element.getNode());
        table.addProperty("Capability", _element.getCapability());
    }

}
