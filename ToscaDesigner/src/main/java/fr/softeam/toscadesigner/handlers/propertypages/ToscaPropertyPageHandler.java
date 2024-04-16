package fr.softeam.toscadesigner.handlers.propertypages;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.api.module.propertiesPage.AbstractModulePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.toscadesigner.handlers.propertypages.IPropertyContent;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MObject;

public class ToscaPropertyPageHandler extends AbstractModulePropertyPage {
    public ToscaPropertyPageHandler(final IModule module, final String name, final String label, final String bitmap) {
        super(module, name, label, bitmap);
    }

    @Override
    public void update(final List<MObject> selectedElements, final IModulePropertyTable table) {
        if ((selectedElements != null) && (selectedElements.size() > 0)
                && (selectedElements.get(0) != null)
                && (selectedElements.get(0) instanceof ModelElement)){
        
            ModelElement selectedElement = ((ModelElement) selectedElements.get(0));
        
            IPropertyContent propertyPage = getPropertyPage(selectedElement);
        
            if (propertyPage != null) {
                propertyPage.update(table);
            }
        }
    }

    @Override
    public void changeProperty(final List<MObject> selectedElements, final int row, final String value) {
        if ((selectedElements != null) && (selectedElements.size() > 0) && (selectedElements.get(0) instanceof ModelElement)){
            ModelElement selectedElement = ((ModelElement) selectedElements.get(0));
        
            IPropertyContent propertyPage = getPropertyPage(selectedElement);
        
            if (propertyPage != null) {
                propertyPage.changeProperty(row, value);
            }
        }
    }

    @objid ("c48bcc8b-54c2-4cec-ae04-cdde28640a1e")
    private IPropertyContent getPropertyPage(ModelElement elt) {
        Object result = ToscaDesignerPropertyPageFactory.instantiatePropertyPage(elt);
        if (result instanceof IPropertyContent) {
            return (IPropertyContent) result;
        }
        return null;
    }

}
