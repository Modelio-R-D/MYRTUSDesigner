package fr.softeam.toscadesigner.handlers.propertypages.core;

import java.util.Arrays;
import java.util.List;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.smkernel.mapi.MObject;

import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;
import fr.softeam.toscadesigner.api.ToscaDesignerProxyFactory;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TGroupType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.package_.TGroup;

public class TGroupPropertyPage<T extends TGroup> extends ToscaElementPropertyPage<T> {
	public TGroupPropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeProperty(int row, String value) {
		switch (row) {
		case 1:
			this._element.getElement().setName(value);
			break;

		case 2:
			for (ModelElement dep : TGroupType.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) {
				if (value.contains(dep.getUuid())) {
					this._element.setType(TGroupType.instantiate((org.modelio.metamodel.uml.statik.Class) dep));
				}
			}
			break;

		case 3:
			Class elt1 = (Class) getModelElt(TNodeTemplate.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
			if ((elt1 != null)&& (elt1.isStereotyped(IToscaDesignerPeerModule.MODULE_NAME, TNodeTemplate.STEREOTYPE_NAME))) {
				Object pc = ToscaDesignerProxyFactory.instantiate(elt1);
				if (value.startsWith(this._add)) {
					this._element.addMembers((TNodeTemplate) pc);
				} else {
					this._element.removeMembers((TNodeTemplate) pc);
				}
			}
			break;
		}
	}

	@Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Name", _element.getElement().getName());
        table.addProperty("Type",
                this._element.getType() != null ? this._element.getType().getElement() : null,
                Arrays.asList(Metamodel.getMClass("Class")), new IMObjectFilter() {
                    @Override
                    public boolean accept(MObject element) {
                        return TGroupType.canInstantiate(element);
                    }
                });
        
        List<? extends ModelElement> members = (List<? extends ModelElement>) this._element.getMembers();
		/*
        table.addProperty(
        	    "Members", 
        	    getToscaValue(members), 
        	    getAddRemove(
        	        (TNodeTemplate.MdaTypes.STEREOTYPE_ELT.getExtendedElement() != null) 
        	            ? TNodeTemplate.MdaTypes.STEREOTYPE_ELT.getExtendedElement() : Collections.emptyList(), 
        	        members
        	    )
        	);
        	*/
	

  

 
    }

}
