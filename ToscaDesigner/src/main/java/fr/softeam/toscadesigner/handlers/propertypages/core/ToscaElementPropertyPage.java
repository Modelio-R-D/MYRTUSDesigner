package fr.softeam.toscadesigner.handlers.propertypages.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.handlers.propertypages.IPropertyContent;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("d51e7b87-847f-4c69-9032-576d613031b3")
public abstract class ToscaElementPropertyPage<T> implements IPropertyContent {
    @objid ("fce1f69e-9bd3-4777-a87f-d74050de575f")
    protected int _currentRow;

    @objid ("e05a504c-efa1-4f47-b866-b59139e0e115")
    protected T _element;

    @objid ("a5f3a8ba-f147-496b-bc82-430df9d089f7")
    private final String _ownerSeparator = ".";

    @objid ("43e9c34e-77a8-4d44-b0c8-e257d61e5c46")
    protected final String _eltSeparator = "; ";

    @objid ("34f24e8e-bae0-4a85-bcb7-cf094ac3e86a")
    protected final String _add = "Add ";

    @objid ("e9ceee31-9548-4c1f-99be-80907e9ada42")
    protected final String _remove = "Remove ";

    @objid ("f6ee32a6-63cb-4481-9e07-44ae0d3e66bd")
    protected final String _removeAll = "Remove all";

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("0146629a-8759-42b5-acfd-ce7cd8528d9e")
    @Override
    public void changeProperty(int row, String value) {
    }

    /**
     * This method handles the construction of the property table of a selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("ba1a4d37-3f84-42a7-a42e-adf57260b2c8")
    @Override
    public void update(IModulePropertyTable table) {
    }

    public ToscaElementPropertyPage(T elt) {
        this._element = elt;
    }



    /**
     * Compute the name of the Model Element
     * 
     * @param elt : the model Element
     * @return the computed name
     */
    protected String getToscaName(ModelElement elt) {
        return elt.getCompositionOwner().getName() + this._ownerSeparator + elt.getName();
    }

 

    protected ModelElement getModelElt(List<? extends ModelElement> elts, String camelName) {
        String name = camelName.replaceFirst(this._add, "").replaceFirst(this._remove, "");
        
        for (ModelElement elt : elts) {
            if (getToscaName(elt).equals(name)) {
                return elt;
            }
        }
        return null;
    }

    protected ModelElement getElt(List<ModelElement> elts, String name) {
        for (ModelElement elt : elts) {
            if (getToscaName(elt).equals(name))
                return elt;
        }
        return null;
    }

    protected String[] getAddRemove(List<ModelElement> allElt, List<? extends ModelElement> added) {
        // List of added Elts , remove Elts
        List<String> result = new ArrayList<>();
        result.add("");
        result.add(this._removeAll);
        
        //List of already added Elt
        List<ModelElement> addElt = new ArrayList<>();
        for (ModelElement elt : added) {
            addElt.add(elt);
        }
        
        //Compute the list of Added and Removed Elements
        for (ModelElement elt : allElt) {
            if (addElt.contains(elt)) {
                result.add(this._remove + getToscaName(elt));
            }else {
                result.add(this._add + getToscaName(elt));
            }
        }
        return result.toArray(new String[result.size()]);
    }

    protected String getToscaValue(List<? extends ModelElement> elts) {
        String result = "";
        Iterator<? extends ModelElement> it = elts.iterator();
        
        if (it.hasNext()) {
            result += getToscaName(it.next());
        }
        
        while (it.hasNext()) {
            result +=  this._eltSeparator + getToscaName(it.next());
        }
        return result;
    }

    protected ModelElement getToscalElt(List<? extends ModelElement> elts, String toscaName) {
        String name = toscaName.replaceFirst(this._add, "").replaceFirst(this._remove, "");
        
        for (ModelElement elt : elts) {
            if (getToscaName(elt).equals(name)) {
                return elt;
            }
        }
        return null;
    }

    @objid ("18cbfa0e-d73d-4ebe-a3dc-d4f9a02ce256")
    protected String getNotNull(String value) {
        if (value == null)
            return "" ;
        return value;
    }

}
