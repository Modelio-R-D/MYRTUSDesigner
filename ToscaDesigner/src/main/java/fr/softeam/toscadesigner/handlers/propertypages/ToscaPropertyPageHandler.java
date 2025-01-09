package fr.softeam.toscadesigner.handlers.propertypages;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.api.module.propertiesPage.AbstractModulePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid("5635dc32-d607-44ef-bf38-78a08ccba98b")
public class ToscaPropertyPageHandler extends AbstractModulePropertyPage {
	@objid("f74ce1e1-4019-4519-b1cc-99ce2aa23c8f")
	public ToscaPropertyPageHandler(final IModule module, final String name, final String label, final String bitmap) {
		super(module, name, label, bitmap);
	}

	@objid("89b5f73a-8bd7-4f39-b06a-e0e66d31b574")
	@Override
	public void update(final List<MObject> selectedElements, final IModulePropertyTable table) {
		if ((selectedElements != null) && (selectedElements.size() > 0) && (selectedElements.get(0) != null)
				&& (selectedElements.get(0) instanceof ModelElement)) {

			ModelElement selectedElement = ((ModelElement) selectedElements.get(0));

			IPropertyContent propertyPage = getPropertyPage(selectedElement);

			if (propertyPage != null) {
				propertyPage.update(table);
			}
		}
	}

	@objid("5e770529-3f99-4217-bae9-012284fe56df")
	@Override
	public void changeProperty(final List<MObject> selectedElements, final int row, final String value) {
		if ((selectedElements != null) && (selectedElements.size() > 0)
				&& (selectedElements.get(0) instanceof ModelElement)) {
			ModelElement selectedElement = ((ModelElement) selectedElements.get(0));

			IPropertyContent propertyPage = getPropertyPage(selectedElement);

			if (propertyPage != null) {
				propertyPage.changeProperty(row, value);
			}
		}
	}

	@objid("4a688c5f-1d34-4778-aa11-ca313898aab3")
	private IPropertyContent getPropertyPage(ModelElement elt) {
		Object result = ToscaDesignerPropertyPageFactory.instantiatePropertyPage(elt);
		if (result instanceof IPropertyContent) {
			return (IPropertyContent) result;
		}
		return null;
	}

}
