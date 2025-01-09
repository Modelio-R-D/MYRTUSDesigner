package fr.softeam.toscadesigner.handlers.propertypages.core;

import java.util.Arrays;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TPolicyType;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("62a37016-c86c-44e9-8d5e-18bdb760a58b")
public class TPolicyTypePropertyPage<T extends TPolicyType> extends ToscaElementPropertyPage<T> {
    @objid ("9a86b35e-d3d2-4053-a006-ece86366d796")
    public  TPolicyTypePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("a01b4b65-d2ef-483d-bb90-c0f4a59e3791")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        
        case 1:
            this._element.getElement().setName(value);
            ;
            break;
        
        case 2:
            this._element.setPolicyLanguage(value);
            break;
        
        }
    }

    @objid ("278d87f3-3320-4a1d-83b3-6021e53abe1f")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
        table.addProperty("Language", _element.getPolicyLanguage());
    }

}
