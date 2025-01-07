package fr.softeam.toscadesigner.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.Class;

import org.modelio.api.modelio.mc.AbstractModelComponentContributor;
import org.modelio.api.modelio.model.IMetamodelExtensions;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.IModule;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vcore.smkernel.mapi.MObject;

import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;
import fr.softeam.toscadesigner.api.ToscaDesignerStereotypes;

public class ToscaDesignerComponentContributor extends AbstractModelComponentContributor {

    private IModelingSession session = ToscaDesignerModule.getInstance().getModuleContext().getModelingSession();

	public ToscaDesignerComponentContributor(IModule module) {
		super(module);
	}

	  /**
     * Get a TagType from the metamodel extensions.
     */
    
    private TagType getTagType(java.lang.Class<? extends MObject> metaclass, String tagTypeName) {
        IMetamodelExtensions metamodel = this.session.getMetamodelExtensions();
        return metamodel.getTagType(IToscaDesignerPeerModule.MODULE_NAME, tagTypeName, 	ToscaDesignerModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(metaclass));
    }

    /**
     * Get a Steretotype from the metamodel extensions.
     */
    
    private Stereotype getStereotype(java.lang.Class<? extends MObject> metaclass, String stereotypeName) {
        IMetamodelExtensions metamodel = this.session.getMetamodelExtensions();
        return metamodel.getStereotype(IToscaDesignerPeerModule.MODULE_NAME, stereotypeName, ToscaDesignerModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(metaclass));
    }

    /**
     * Get a NoteType from the metamodel extensions.
     */
    
    private NoteType getNoteType(java.lang.Class<? extends MObject> metaclass, String noteTypeName) {
        IMetamodelExtensions metamodel = this.session.getMetamodelExtensions();
        return metamodel.getNoteType(IToscaDesignerPeerModule.MODULE_NAME, noteTypeName, ToscaDesignerModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(metaclass));
    }
	@Override
	
public Set<Stereotype> getDependencyStereotypes() {
        Set<Stereotype> stereotypes = new HashSet<>();
        stereotypes.add(getStereotype(Class.class, ToscaDesignerStereotypes.TNODETYPE));
        stereotypes.add(getStereotype(Class.class, ToscaDesignerStereotypes.TRELATIONSHIPTYPE));
        stereotypes.add(getStereotype(Class.class, ToscaDesignerStereotypes.TARTIFACTTYPE));
        stereotypes.add(getStereotype(ModelElement.class, ToscaDesignerStereotypes.TINTERFACE));
        
        stereotypes.add(getStereotype(Package.class, ToscaDesignerStereotypes.TGROUP));
        stereotypes.add(getStereotype(Class.class, ToscaDesignerStereotypes.TPOLICY));
        stereotypes.add(getStereotype(Class.class, ToscaDesignerStereotypes.TCAPABILITY_DEFINITION));
        stereotypes.add(getStereotype(Class.class, ToscaDesignerStereotypes.CAPABILITY_DEFINITIONS_TYPE));
        
        return stereotypes;
	}

	@Override
	public Set<MObject> getElements() {

        return Collections.emptySet();
	}

	@Override
	public Set<ExportedFileEntry> getFiles() {
        return Collections.emptySet();
	}

	@Override
	public Set<NoteType> getNoteTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<TagType> getTagTypes() {
		// TODO Auto-generated method stub
		return null;
	}

}
