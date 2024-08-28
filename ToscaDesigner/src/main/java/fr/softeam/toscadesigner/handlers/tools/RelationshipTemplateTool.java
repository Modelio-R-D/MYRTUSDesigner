package fr.softeam.toscadesigner.handlers.tools;

import java.util.List;

import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.ILinkRoute;
import org.modelio.api.modelio.diagram.tools.DefaultLinkTool;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Classifier;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate;
import fr.softeam.toscadesigner.impl.ToscaDesignerModule;

@objid("1d1a3b00-63d7-41b1-a3e0-137271d640f6")
public class RelationshipTemplateTool extends DefaultLinkTool {
	@objid("d8953096-35c2-44ae-94bf-b91a29a47d82")
	@Override
	public boolean acceptFirstElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
		return true;
	}

	@objid("e12e06bd-fca6-45f7-a695-8c1fcd35dfb0")
	@Override
	public boolean acceptSecondElement(final IDiagramHandle diagramHandle, final IDiagramGraphic originNode,
			final IDiagramGraphic targetNode) {
		return true;
	}

	@objid("8d0f7e46-2ec1-4eaf-8501-3f08d3432d6e")
	@Override
	public void actionPerformed(IDiagramHandle diagramHandle, IDiagramGraphic source, IDiagramGraphic target,
			LinkRouterKind routerKInd, ILinkRoute route) {
		IModelingSession session = ToscaDesignerModule.getInstance().getModuleContext().getModelingSession();
		try (ITransaction transaction = session.createTransaction(" RelationshipTemplate")) {
			Association newAssoc = session.getModel().createAssociation((Classifier) source.getElement(),(Classifier) target.getElement(), "");
			newAssoc.getExtension().add(TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT);
			 
			List<IDiagramGraphic> graphics = diagramHandle.unmask(newAssoc, 0,0);
			if(graphics.size() > 0 && graphics.get(0) instanceof IDiagramLink) {
				IDiagramLink link = (IDiagramLink)graphics.get(0);
				link.setRouterKind(routerKInd);
				link.setRoute(route);
			}

			diagramHandle.save();
			diagramHandle.close();
			transaction.commit();

		}
	}

}
