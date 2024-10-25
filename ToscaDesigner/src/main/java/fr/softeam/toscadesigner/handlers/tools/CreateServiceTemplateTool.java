package fr.softeam.toscadesigner.handlers.tools;

import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.statik.Package;

import fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.ServiceTemplateDiagram;
import fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.ToscaDiagram;
import fr.softeam.toscadesigner.api.tosca.standard.package_.TServiceTemplate;
import fr.softeam.toscadesigner.impl.ToscaDesignerModule;

public class CreateServiceTemplateTool extends CreateSubModelTool {

	@Override
	public boolean acceptElement(IDiagramHandle arg0, IDiagramGraphic arg1) {
		// TODO Auto-generated method stub
		return super.acceptElement(arg1);
	}

	@Override
	public void actionPerformed(IDiagramHandle diagramHandle, IDiagramGraphic parent, Rectangle rect) {
		
		/*
		 * System.out.print(parent);
		ClassDiagram diag = (ClassDiagram) parent.getElement().getCompositionOwner();
		org.modelio.metamodel.uml.statik.Package packageOwner = (org.modelio.metamodel.uml.statik.Package) diag
				.getOrigin();
		*/
		Package packageOwner = (Package) parent.getElement().getCompositionOwner();

		IModuleContext moduleContext = ToscaDesignerModule.getInstance().getModuleContext();
		IModelingSession session = moduleContext.getModelingSession();

		try (ITransaction transaction = session.createTransaction("Create Service Template")) {

			TServiceTemplate subModel = TServiceTemplate.create(session);
			ServiceTemplateDiagram diagram = ServiceTemplateDiagram.create(session);

			packageOwner.getOwnedElement().add(subModel.getElement());
			subModel.getElement().getProduct().add(diagram.getElement());

			subModel.getElement().setName("Service Template");
			diagram.getElement().setName(subModel.getElement().getName() + " diagram");
			this.openDiagram(diagram);

			transaction.commit();
		}
	}

}
