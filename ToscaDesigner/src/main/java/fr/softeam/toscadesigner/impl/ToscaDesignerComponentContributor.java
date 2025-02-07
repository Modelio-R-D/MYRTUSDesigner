package fr.softeam.toscadesigner.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;
import fr.softeam.toscadesigner.api.ToscaDesignerStereotypes;
import org.modelio.api.modelio.mc.AbstractModelComponentContributor;
import org.modelio.api.modelio.model.IMetamodelExtensions;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.IModule;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("fd5a3fbb-8b37-47ee-94bc-8089b2e25505")
public class ToscaDesignerComponentContributor extends AbstractModelComponentContributor {
    @objid ("51023e26-aebc-438e-bb61-2e581567000c")
    private IModelingSession session = ToscaDesignerModule.getInstance().getModuleContext().getModelingSession();

    @objid ("be7cd68f-c576-493e-8964-ac019d3b1584")
    public  ToscaDesignerComponentContributor(IModule module) {
        super(module);
    }

    @objid ("66541882-990a-4278-95b2-bc0219065505")
    private TagType getTagType(java.lang.Class<? extends MObject> metaclass, String tagTypeName) {
        IMetamodelExtensions metamodel = this.session.getMetamodelExtensions();
        return metamodel.getTagType(IToscaDesignerPeerModule.MODULE_NAME, tagTypeName, ToscaDesignerModule.getInstance()
                .getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(metaclass));
    }

    @objid ("3fc7a120-1f7e-4874-b624-1860dc9aa69d")
    private Stereotype getStereotype(java.lang.Class<? extends MObject> metaclass, String stereotypeName) {
        IMetamodelExtensions metamodel = this.session.getMetamodelExtensions();
        return metamodel.getStereotype(IToscaDesignerPeerModule.MODULE_NAME, stereotypeName,
                ToscaDesignerModule.getInstance().getModuleContext().getModelioServices().getMetamodelService()
                        .getMetamodel().getMClass(metaclass));
    }

    @objid ("c23d7165-5790-46c8-a95a-a7aa5761b55e")
    private NoteType getNoteType(java.lang.Class<? extends MObject> metaclass, String noteTypeName) {
        IMetamodelExtensions metamodel = this.session.getMetamodelExtensions();
        return metamodel.getNoteType(IToscaDesignerPeerModule.MODULE_NAME, noteTypeName,
                ToscaDesignerModule.getInstance().getModuleContext().getModelioServices().getMetamodelService()
                        .getMetamodel().getMClass(metaclass));
    }

    @objid ("84216a74-05a6-43e9-acda-21cd6ebd2ad2")
    @Override
    public Set<Stereotype> getDependencyStereotypes() {
        Set<Stereotype> stereotypes = new HashSet<>();
        stereotypes.add(getStereotype(Class.class, ToscaDesignerStereotypes.TNODETYPE));
        stereotypes.add(getStereotype(Class.class, ToscaDesignerStereotypes.TRELATIONSHIPTYPE));
        stereotypes.add(getStereotype(Class.class, ToscaDesignerStereotypes.TARTIFACTTYPE));
        stereotypes.add(getStereotype(ModelElement.class, ToscaDesignerStereotypes.TINTERFACE));
        stereotypes.add(getStereotype(ModelElement.class, ToscaDesignerStereotypes.TOPERATION));
        stereotypes.add(getStereotype(Package.class, ToscaDesignerStereotypes.TGROUP));
        stereotypes.add(getStereotype(Class.class, ToscaDesignerStereotypes.TPOLICY));
        stereotypes.add(getStereotype(Class.class, ToscaDesignerStereotypes.TPOLICY_TYPE));
        stereotypes.add(getStereotype(Class.class, ToscaDesignerStereotypes.TCAPABILITY_DEFINITION));
        stereotypes.add(getStereotype(Class.class, ToscaDesignerStereotypes.TCAPABILITY_TYPE));
        stereotypes.add(getStereotype(Class.class, ToscaDesignerStereotypes.CAPABILITY_DEFINITIONS_TYPE));
        
        return stereotypes;
    }

    @objid ("d5a56d23-f7d8-47dc-ac26-bb7c53e413f6")
    @Override
    public Set<MObject> getElements() {
        return Collections.emptySet();
    }

    @objid ("6e599c26-c29d-4f74-8967-3ca62218732b")
    @Override
    public Set<ExportedFileEntry> getFiles() {
        return Collections.emptySet();
    }

    @objid ("d96e28a4-fddb-44d5-a9da-59ef300604c9")
    @Override
    public Set<NoteType> getNoteTypes() {
        // TODO Auto-generated method stub
        return Collections.emptySet();
    }

    @objid ("5a2b758b-0512-4363-936f-a8be8caf56de")
    @Override
    public Set<TagType> getTagTypes() {
        // TODO Auto-generated method stub
        return Collections.emptySet();
    }

}
