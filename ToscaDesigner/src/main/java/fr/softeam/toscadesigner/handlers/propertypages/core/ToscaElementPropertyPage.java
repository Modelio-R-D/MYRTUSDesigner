package fr.softeam.toscadesigner.handlers.propertypages.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate;
import fr.softeam.toscadesigner.handlers.propertypages.IPropertyContent;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid("4a086c41-a7ac-4984-8917-85fb7f0be381")
public abstract class ToscaElementPropertyPage<T extends Object> implements IPropertyContent {
	@objid("8d49f630-4b14-44d3-8f25-5f1962392847")
	private final String _ownerSeparator = ".";

	@objid("7069793a-3b14-4b18-8271-6479ed7764b9")
	protected final String _eltSeparator = "; ";

	@objid("aab8ae3f-66ab-4b98-81f4-8e664328228a")
	protected final String _add = "Add ";

	@objid("9c0ff953-a9cd-4c32-8253-0464351b8946")
	protected final String _remove = "Remove ";

	@objid("ee5a8326-d85b-4e80-8edb-11a80491fbea")
	protected final String _removeAll = "Remove all";

	@objid("c843da58-1db9-456c-bf8e-883d19dec1de")
	protected T _element;

	/**
	 * This method handles the changes of the given property, identified by its row
	 * index, of a selected element to a new value.
	 * 
	 * @param row   : the row of the changed property
	 * @param value : the new value of the property
	 */
	@objid("2a58af51-10e8-434c-b3f6-bc451232cf4f")
	@Override
	public void changeProperty(int row, String value) {

	}

	/**
	 * This method handles the construction of the property table of a selected
	 * element
	 * 
	 * @param table : the property table to fulfill
	 */
	@objid("482fd9a4-83bb-4a19-89e1-0d047001b738")
	@Override
	public void update(IModulePropertyTable table) {

	}

	@objid("a146a6fd-e6aa-484b-b160-ef91b41e55d4")
	public ToscaElementPropertyPage(T elt) {
		this._element = elt;
	}

	/**
	 * Compute the name of the Model Element
	 * 
	 * @param elt : the model Element
	 * @return the computed name
	 */
	@objid("4bd8c04b-5b68-4d6c-89f3-d9f6c8038ef0")
	protected String getToscaName(ModelElement elt) {
		return elt.getCompositionOwner().getName() + this._ownerSeparator + elt.getName();
	}

	@objid("ea941bed-7539-4d26-966b-0dee42eee8b2")
	protected String[] getToscaNames(List<? extends ModelElement> elts) {
		List<String> result = new ArrayList<>();
		result.add(" ");
		for (ModelElement elt : elts) {
			result.add(getToscaName(elt));
		}
		return result.toArray(new String[result.size()]);
	}

	@objid("4078347a-bb71-4509-8453-e420b92c5513")
	protected ModelElement getModelElt(List<? extends ModelElement> elts, String camelName) {
		String name = camelName.replaceFirst(this._add, "").replaceFirst(this._remove, "");

		for (ModelElement elt : elts) {
			if (getToscaName(elt).equals(name)) {
				return elt;
			}
		}
		return null;
	}

	@objid("ee1ca449-9570-4775-96af-f19ff9714f02")
	protected ModelElement getElt(List<ModelElement> elts, String name) {
		for (ModelElement elt : elts) {
			if (getToscaName(elt).equals(name))
				return elt;
		}
		return null;
	}

	@objid("708e0f82-6948-469c-a787-a22d28d9a83d")
	protected String[] getAddRemove(List<ModelElement> allElt, List<? extends ModelElement> added) {
		// List of added Elts , remove Elts
		List<String> result = new ArrayList<>();
		result.add("");
		// result.add(this._removeAll);

		// List of already added Elt
		List<ModelElement> addElt = new ArrayList<>();
		for (ModelElement elt : added) {
			addElt.add(elt);
		}

		// Compute the list of Added and Removed Elements
		for (ModelElement elt : allElt) {
			if (addElt.contains(elt)) {
				result.add(this._remove + getToscaName(elt));
			} else {
				result.add(this._add + getToscaName(elt));
			}
		}
		return result.toArray(new String[result.size()]);
	}

	@objid("66738b7f-e046-460a-bc15-6316275e812c")
	protected String getToscaValue(List<? extends ModelElement> elts) {
		String result = "";
		Iterator<? extends ModelElement> it = elts.iterator();

		if (it.hasNext()) {
			result += getToscaName(it.next());
		}

		while (it.hasNext()) {
			result += this._eltSeparator + getToscaName(it.next());
		}
		return result;
	}

	@objid("998eb399-4c0c-41ab-bd55-42ebce68f1c5")
	protected ModelElement getToscalElt(List<? extends ModelElement> elts, String toscaName) {
		String name = toscaName.replaceFirst(this._add, "").replaceFirst(this._remove, "");

		for (ModelElement elt : elts) {
			if (getToscaName(elt).equals(name)) {
				return elt;
			}
		}
		return null;
	}

	@objid("27dccb79-6b31-4e64-9418-dc22d0059848")
	protected String getNotNull(String value) {
		if (value == null)
			return "";
		return value;
	}

	@objid("68cd6e12-17c0-4eff-8f49-fad71962e7cc")
	public static <T extends IMdaProxy> List<ModelElement> extractModelElements(List<T> members) {
		List<ModelElement> members_elt = new ArrayList<>();
		for (int i = 0; i < members.size(); i++) {
			members_elt.add((ModelElement) ((IMdaProxy) members.get(i)).getElement());
		}
		return members_elt;
	}

}
