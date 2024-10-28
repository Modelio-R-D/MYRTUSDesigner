package fr.softeam.toscadesigner.handlers.tools;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;
import fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.ServiceTemplateDiagram;
import fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.TopologyTemplateDiagram;
import fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.ToscaDiagram;
import fr.softeam.toscadesigner.impl.ToscaDesignerModule;
import org.modelio.api.modelio.IModelioServices;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramService;
import org.modelio.api.modelio.diagram.dg.IDiagramDG;
import org.modelio.api.modelio.diagram.style.IStyleHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.StaticDiagram;

@objid ("5faaea2b-ac53-4282-8fcc-76d0ef5d003a")
public abstract class CreateSubModelTool extends DefaultBoxTool {
    @objid ("bee2f975-04ad-4792-8d2c-7714138d3b54")
    public boolean acceptElement(final IDiagramGraphic targetNode) {
        return true;
    }

    @objid ("98036cb6-a5a7-4839-b3de-04e8e47afab0")
    protected void openDiagram(ServiceTemplateDiagram diagram2) {
        IModelioServices modelioServices = ToscaDesignerModule.getInstance().getModuleContext().getModelioServices();
        StaticDiagram diagram = diagram2.getElement();
        IDiagramService ds = modelioServices.getDiagramService();
        
        try(  IDiagramHandle handler = ds.getDiagramHandle(diagram);){
            IDiagramDG dg = handler.getDiagramNode();
        
            for (IStyleHandle style : ds.listStyles()){
                if (style.getName().equals(IToscaDesignerPeerModule.TOSCA_STYLE)){
                    dg.setStyle(style);
                    break;
                }
            }
        
            handler.save();
            handler.close();
        
            modelioServices.getEditionService().openEditor(diagram);
        }
    }

    @objid ("54778d9b-c162-47fc-8446-89e5a517624f")
    protected void openDiagram(TopologyTemplateDiagram diagram2) {
        IModelioServices modelioServices = ToscaDesignerModule.getInstance().getModuleContext().getModelioServices();
        StaticDiagram diagram = diagram2.getElement();
        IDiagramService ds = modelioServices.getDiagramService();
        
        try(  IDiagramHandle handler = ds.getDiagramHandle(diagram);){
            IDiagramDG dg = handler.getDiagramNode();
        
            for (IStyleHandle style : ds.listStyles()){
                if (style.getName().equals(IToscaDesignerPeerModule.TOSCA_STYLE)){
                    dg.setStyle(style);
                    break;
                }
            }
        
            handler.save();
            handler.close();
        
            modelioServices.getEditionService().openEditor(diagram);
        }
    }

}
