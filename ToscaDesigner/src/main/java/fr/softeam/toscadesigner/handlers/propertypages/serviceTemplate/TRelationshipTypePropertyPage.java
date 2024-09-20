package fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipType;
import fr.softeam.toscadesigner.handlers.propertypages.core.TEntityTypePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("76375cca-ef3c-403b-9da3-a87a7dbf0475")
public class TRelationshipTypePropertyPage<T extends TRelationshipType> extends TEntityTypePropertyPage<T> {
    @objid ("234abe0c-77ea-465c-8e37-38119f58c05a")
    public  TRelationshipTypePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("ed7b67d1-80c3-44e9-a7a8-1d487c6cda01")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        
        case 2:
           // this._element.setInstanceStates(null);
            break;
        case 3:
            //this._element.setSourceInterfaces(null);;
            break;
        case 4:
           // this._element.setTargetInterfaces(null);
            break;
        case 5:
            this._element.setValidSource(value);
            break;     
        case 6:
            this._element.setValidTarget(value);
            break; 
                              
         }
    }

    @objid ("45cf89b2-2ce0-4472-a1ff-c81b56a5013c")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        /*
                                        //Instance states
                                        table.addProperty("Instance States",
                                        this._element.getInstanceStates() != null ? this._element.getInstanceStates().getElement() : null,
                                        Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
                                        @Override
                                        public boolean accept(MObject element) {
                                        return TTopologyElementInstanceStates.canInstantiate(element);
                                        }
                                        });
                                        //Source Interfaces
                                        table.addProperty("Source Interfaces",
                                                this._element.getSourceInterfaces() != null ? this._element.getSourceInterfaces().getElement() : null,
                                                Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
                                                    @Override
                                                    public boolean accept(MObject element) {
                                                        return SourceInterfacesType.canInstantiate(element);
                                                    }
                                                });
                                        
                                        //Target Interfaces
                                        table.addProperty("Target Interfaces",
                                                this._element.getTargetInterfaces() != null ? this._element.getTargetInterfaces().getElement() : null,
                                                Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
                                                    @Override
                                                    public boolean accept(MObject element) {
                                                        return TargetInterfacesType.canInstantiate(element);
                                                    }
                                                });
                                                */
        table.addProperty("Valid Source", this._element.getValidSource());
        table.addProperty("Valid Target", this._element.getValidTarget());
    }

}
