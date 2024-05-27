package fr.softeam.toscadesigner.handlers.commands.submodel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;
import fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.ToscaModelDiagram;
import fr.softeam.toscadesigner.api.tosca.standard.package_.ToscaModel;
import fr.softeam.toscadesigner.impl.ToscaDesignerModule;
import org.modelio.api.modelio.IModelioServices;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramService;
import org.modelio.api.modelio.diagram.dg.IDiagramDG;
import org.modelio.api.modelio.diagram.style.IStyleHandle;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.standard.DiagramCreationStandardHandler;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("acdf9546-c20b-4952-96f8-6f1f71847f75")
public abstract class CreateServiceTemplateDigramCommand extends CreateSubModelCommand {
    @objid ("d751cb02-6396-42de-8783-5d9efed17443")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        org.modelio.metamodel.uml.statik.Package packageOwner = (org.modelio.metamodel.uml.statik.Package) selectedElements.get(0);
        
        IModuleContext moduleContext = module.getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();
        
        try( ITransaction transaction = session.createTransaction("Create Service Template")){
        
            ToscaModel subModel = ToscaModel.create(session);
            ToscaModelDiagram diagram = ToscaModelDiagram.create(session);
        
            packageOwner.getOwnedElement().add(subModel.getElement());
            subModel.getElement().getProduct().add(diagram.getElement());
        
            subModel.setDefaultName("Service Template");
            diagram.setDefaultName(subModel.getName() + " diagram");            
            this.openDiagram(diagram.getElement());
        
            transaction.commit();
            
        }
    }

}
