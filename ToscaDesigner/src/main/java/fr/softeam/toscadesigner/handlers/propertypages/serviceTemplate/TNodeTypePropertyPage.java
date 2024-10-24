package fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate;

import java.util.Arrays;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.CapabilitiesType;
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.InterfacesType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinitionsType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyElementInstanceStates;
import fr.softeam.toscadesigner.handlers.propertypages.core.TEntityTypePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("8e6ae627-578f-422f-8de0-77c04824219b")
public class TNodeTypePropertyPage<T extends TNodeType> extends TEntityTypePropertyPage<T> {
    @objid ("b129e2d0-20bf-4b53-9bdf-8b625ba37529")
    public  TNodeTypePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("f7311659-e3b9-43bb-b939-e143682cce9f")
    @Override
    public void changeProperty(int row, String value) {
        switch (row) {
        case 1:
            this._element.getElement().setName(value);
            break;
        case 2:
            for (ModelElement el : TNodeType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
                if (value.contains(el.getUuid())) {
                    this._element.setDerivedFrom(TNodeType.instantiate((org.modelio.metamodel.uml.statik.Class) el));
                }
            }
            break;
        case 3:
            for (ModelElement dep : InterfacesType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
                if (value.contains(dep.getUuid())) {
                    this._element
                            .setInterfaces(InterfacesType.instantiate((org.modelio.metamodel.uml.statik.Class) dep));
                }
            }
            break;
        
        case 4:
            for (ModelElement dep : TTopologyElementInstanceStates.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
                if (value.contains(dep.getUuid())) {
                    this._element.setInstanceStates(
                            TTopologyElementInstanceStates.instantiate((org.modelio.metamodel.uml.statik.Class) dep));
                }
            }
            break;
        
        case 5:
            for (ModelElement dep : TCapabilityDefinitionsType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
                if (value.contains(dep.getUuid())) {
                    this._element.setCapabilityDefinitions(
                            TCapabilityDefinitionsType.instantiate((org.modelio.metamodel.uml.statik.Class) dep));
                }
            }
            break;
        
        }
    }

    @objid ("3df2e3b9-f8a2-4c5c-9a5b-60799c369b20")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
        table.addProperty("Derived From",
                this._element.getDerivedFrom() != null ? this._element.getDerivedFrom().getElement() : null,
                Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
                    @Override
                    public boolean accept(MObject element) {
                        return TNodeType.canInstantiate(element);
                    }
                });
        // Interfaces Type
        table.addProperty("Interfaces Type",
                this._element.getInterfaces() != null ? this._element.getInterfaces().getElement() : null,
                Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
                    @Override
                    public boolean accept(MObject element) {
                        return InterfacesType.canInstantiate(element);
                    }
                });
        
        // Instance States
        table.addProperty("Instance States",
                this._element.getInstanceStates() != null ? this._element.getInstanceStates().getElement() : null,
                Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
                    @Override
                    public boolean accept(MObject element) {
                        return TTopologyElementInstanceStates.canInstantiate(element);
                    }
                });
        
        // Capability Definition
        table.addProperty("Capability Definition",
                this._element.getCapabilityDefinitions() != null ? this._element.getCapabilityDefinitions().getElement()
                        : null,
                Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
                    @Override
                    public boolean accept(MObject element) {
                        return CapabilitiesType.canInstantiate(element);
                    }
                });
    }

}
