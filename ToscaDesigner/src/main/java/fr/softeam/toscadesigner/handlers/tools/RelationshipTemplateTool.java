package fr.softeam.toscadesigner.handlers.tools;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.impl.ToscaDesignerModule;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.ILinkPath;
import org.modelio.api.modelio.diagram.ILinkRoute;
import org.modelio.api.modelio.diagram.tools.DefaultLinkTool;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;

@objid ("1d1a3b00-63d7-41b1-a3e0-137271d640f6")
public class RelationshipTemplateTool extends DefaultLinkTool {
    @objid ("d8953096-35c2-44ae-94bf-b91a29a47d82")
    @Override
    public boolean acceptFirstElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        // TODO Auto-generated method stub
        return false;
    }

    @objid ("e12e06bd-fca6-45f7-a695-8c1fcd35dfb0")
    @Override
    public boolean acceptSecondElement(final IDiagramHandle diagramHandle, final IDiagramGraphic originNode, final IDiagramGraphic targetNode) {
        // TODO Auto-generated method stub
        return false;
    }

    @objid ("bcfa634d-4c04-40fc-a602-d2bcccc0b01b")
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic originNode, final IDiagramGraphic targetNode, final LinkRouterKind touterType, final ILinkPath path) {
        // TODO implement the RelationshipTemplateTool handler. 
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "RelationshipTemplateTool", "Tool not implemented!");
        
        IModelingSession session = ToscaDesignerModule.getInstance().getModuleContext().getModelingSession();
        try (ITransaction transaction = session.createTransaction(" RelationshipTemplate")) {
        /*
                                                                                                                                    TRelationshipTemplate toscaElt = TRelationshipTemplate.create(session);
                                                                                                                                    toscaElt.setSourceElement(this.nodeT1.getName());
                                                                                                                                    toscaElt.setTargetElement(this.nodeT2.getName());
                                                                                                                                
                                                                                                                                    diagramHandle.unmask(toscaElt.getElement(), path.getPoints().get(0).x, path.getPoints().get(1).x);
                                                                                                                                
                                                                                                                                    diagramHandle.save();
                                                                                                                                    diagramHandle.close();
                                                                                                                                    transaction.commit();
                                                                                                                                */
        }
    }

    @objid ("8d0f7e46-2ec1-4eaf-8501-3f08d3432d6e")
    @Override
    public void actionPerformed(IDiagramHandle arg0, IDiagramGraphic arg1, IDiagramGraphic arg2, LinkRouterKind arg3, ILinkRoute arg4) {
        // TODO Auto-generated method stub
    }

}
