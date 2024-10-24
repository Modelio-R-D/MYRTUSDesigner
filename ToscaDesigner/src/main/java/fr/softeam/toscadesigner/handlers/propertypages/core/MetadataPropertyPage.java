package fr.softeam.toscadesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.attribute.Metadata;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("daed0c47-9098-44e5-8818-b0edc0798342")
public class MetadataPropertyPage<T extends Metadata> extends ToscaElementPropertyPage<T> {
    @objid ("99e1297d-9d84-4961-8ed3-eb570b26f595")
    public  MetadataPropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("68738775-cb8a-4888-b13c-3fc51bebdb41")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            this._element.getElement().setName(value);;
            break;
        case 2:
            this._element.getElement().setValue(value);
            break;
        
        }
    }

    @objid ("fc930dd6-9b36-4aa8-a092-b0d6400ca528")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
        table.addProperty("Value", _element.getElement().getValue());
    }

}
