package fr.softeam.toscadesigner.handlers.tools;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.ServiceTemplateDiagram;
import fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.TopologyTemplateDiagram;
import fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.ToscaDiagram;
import fr.softeam.toscadesigner.api.tosca.standard.package_.TServiceTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.package_.TTopologyTemplate;
import fr.softeam.toscadesigner.impl.ToscaDesignerModule;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.statik.Package;

@objid ("38660880-fd1b-4cde-a783-81a6445de6f9")
public class CreateTopologyTemplateTool extends CreateSubModelTool {
    @objid ("30df4183-a121-4d53-87a1-6c9d4bddd20d")
    @Override
    public boolean acceptElement(IDiagramHandle arg0, IDiagramGraphic arg1) {
        // TODO Auto-generated method stub
        return super.acceptElement(arg1);
    }

    @objid ("f6c7b5f1-44b2-4ae0-9148-d6038942c9e4")
    @Override
    public void actionPerformed(IDiagramHandle diagramHandle, IDiagramGraphic parent, Rectangle rect) {
        /*
                ClassDiagram diag = (ClassDiagram) parent.getElement();
                org.modelio.metamodel.uml.statik.Package packageOwner = (org.modelio.metamodel.uml.statik.Package) diag
                        .getOrigin();
                */
        Package packageOwner = (Package) parent.getElement().getCompositionOwner();
        
        IModuleContext moduleContext = ToscaDesignerModule.getInstance().getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();
        
              try( ITransaction transaction = session.createTransaction("Create Topology Template")){
                  
                  TTopologyTemplate subModel = TTopologyTemplate.create(session);
                  TopologyTemplateDiagram diagram = TopologyTemplateDiagram.create(session);
              
                  packageOwner.getOwnedElement().add(subModel.getElement());
                  subModel.getElement().getProduct().add(diagram.getElement());
              
                  subModel.getElement().setName("Topology Template");
                  diagram.getElement().setName(subModel.getElement().getName() + " diagram");            
                  this.openDiagram(diagram);
              
                  transaction.commit();
        }
    }

}
