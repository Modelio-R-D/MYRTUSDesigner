package fr.softeam.toscadesigner.handlers.propertypages.types;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityType;
import fr.softeam.toscadesigner.handlers.propertypages.core.ToscaElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("a5e24f42-dfbb-4164-ac65-6e9b6078242c")
public class TCapabilityTypePropertyPage<T extends TCapabilityType> extends ToscaElementPropertyPage<T> {
    @objid ("ad5f3d46-c5f3-4bc5-813c-41497a2213da")
    public  TCapabilityTypePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("324a8b00-a497-453e-b178-506094460523")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            break;
        
        }
    }

    @objid ("4dde6d6a-effd-4413-bd71-9118f2e7c32b")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

}
