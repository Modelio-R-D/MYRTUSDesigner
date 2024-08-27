package fr.softeam.toscadesigner.handlers.commands.submodel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.ToscaDiagram;
import fr.softeam.toscadesigner.api.tosca.standard.package_.ToscaModel;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("cb111baa-cad6-4863-be35-cc7f94bab92a")
public class CreateCloudServiceArchiveCommand extends CreateSubModelCommand {
    @objid ("de2be737-ee19-4387-ab04-13e6dd21b937")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        org.modelio.metamodel.uml.statik.Package packageOwner = (org.modelio.metamodel.uml.statik.Package) selectedElements.get(0);
        
        IModuleContext moduleContext = module.getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();
        
        try( ITransaction transaction = session.createTransaction("Create Cloud Service Archive")){
        
            ToscaModel subModel = ToscaModel.create(session);
            ToscaDiagram diagram = ToscaDiagram.create(session);
        
            packageOwner.getOwnedElement().add(subModel.getElement());
            subModel.getElement().getProduct().add(diagram.getElement());
            
            //subModel.setDefaultName("Cloud Service Archive");
            diagram.getElement().setName(subModel.getElement().getName() + " diagram");
            this.openDiagram(diagram.getElement());
            transaction.commit();
            
        }
    }

    @objid ("40d64938-d033-40ee-9f7e-454c58b3a4a1")
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1)){
            MObject selectedElt = selectedElements.get(0);
            return (
                    (((selectedElt instanceof Package)
                            && !(selectedElt instanceof Profile)
                            && selectedElt.getStatus().isModifiable()))
                    && ((Package) selectedElt).getExtension().isEmpty());
        }
        return false;
    }

}
