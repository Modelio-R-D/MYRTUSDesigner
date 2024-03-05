package fr.softeam.toscadesigner.handlers.commands.submodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;
import fr.softeam.toscadesigner.impl.ToscaDesignerModule;

import org.modelio.api.modelio.IModelioServices;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramService;
import org.modelio.api.modelio.diagram.dg.IDiagramDG;
import org.modelio.api.modelio.diagram.style.IStyleHandle;
import org.modelio.api.module.command.standard.DiagramCreationStandardHandler;
import org.modelio.metamodel.diagrams.AbstractDiagram;

public abstract class CreateSubModelCommand extends DiagramCreationStandardHandler {
    @objid ("0d76d8b8-2f41-4d56-9b8b-b5fe8bcfa7ca")
    protected void openDiagram(AbstractDiagram diagram) {
        IModelioServices modelioServices = ToscaDesignerModule.getInstance().getModuleContext().getModelioServices();
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
