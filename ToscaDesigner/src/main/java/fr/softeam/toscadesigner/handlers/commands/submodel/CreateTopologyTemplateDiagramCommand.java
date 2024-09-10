package fr.softeam.toscadesigner.handlers.commands.submodel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.TopologyTemplateDiagram;
import fr.softeam.toscadesigner.api.tosca.standard.package_.ToscaModel;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("548ea3b4-adac-4bc1-83d1-e86585b18dc9")
public class CreateTopologyTemplateDiagramCommand extends CreateSubModelCommand {
    @objid ("d4dcc033-8364-468a-b9f2-fb8d2722d1f6")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        org.modelio.metamodel.uml.statik.Package packageOwner = (org.modelio.metamodel.uml.statik.Package) selectedElements.get(0);
        
        IModuleContext moduleContext = module.getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();
        
        try( ITransaction transaction = session.createTransaction("Create Topology Template")){
        
            ToscaModel subModel = ToscaModel.create(session);
            TopologyTemplateDiagram diagram = TopologyTemplateDiagram.create(session);
        
            packageOwner.getOwnedElement().add(subModel.getElement());
            subModel.getElement().getProduct().add(diagram.getElement());
        
            subModel.getElement().setName("Topology Template");
            diagram.getElement().setName(subModel.getElement().getName() + " diagram");            
            this.openDiagram(diagram.getElement());
        
            transaction.commit();
            
        }
    }

}
