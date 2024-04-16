/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/04/2024 16:51 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.association;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.scope.ElementScope;
import org.modelio.api.module.mda.IMdaExpert;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MMetamodel;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * MDA expert to handle a {@link Association} with << TRelationshipTemplate >> stereotype.
 * <p>
 * This link can be created between:
 * </p>
 * <table summary="Creation rules" border="1">
 * <tr>
 *   <th>Possible source</th>
 *   <th>Possible target</th>
 * </tr>
 * <tr><td>ModelElement</td><td>ModelElement</td></tr>
 * 
 * </table>
 */
@objid ("435b1c2d-3b24-4667-a856-17bfac15539e")
public class TRelationshipTemplateExpert implements IMdaExpert {
    @objid ("04e7a24b-7ffd-4251-b97d-8a596af046f8")
    @Override
    public boolean canSource(final Stereotype linkStereotype, final MClass linkMetaclass, final MClass fromMetaclass) {
        MMetamodel metamodel = linkMetaclass.getMetamodel();
        return (fromMetaclass.hasBase(metamodel.getMClass("Infrastructure.ModelElement")));
    }

    @objid ("6b8fba79-fb36-4df6-9f61-db16ea49b80c")
    @Override
    public boolean canSource(final Stereotype linkStereotype, final MObject linkElement, final MObject fromElement) {
        MMetamodel metamodel = linkElement.getMClass().getMetamodel();
        return (fromElement.getMClass().hasBase(metamodel.getMClass("Infrastructure.ModelElement")));
    }

    @objid ("dbcc18b8-0ab1-4f43-b97a-1725fe5b99df")
    @Override
    public boolean canSource(final ElementScope linkScope, final MObject fromElement) {
        MMetamodel metamodel = linkScope.getMetaclass().getMetamodel();
        return (fromElement.getMClass().hasBase(metamodel.getMClass("Infrastructure.ModelElement")));
    }

    @objid ("be29e9d3-e0f8-4571-9ef1-1d8f62210ea0")
    @Override
    public boolean canTarget(final Stereotype linkStereotype, final MClass linkMetaclass, final MClass toMetaclass) {
        MMetamodel metamodel = linkMetaclass.getMetamodel();
        return (toMetaclass.hasBase(metamodel.getMClass("Infrastructure.ModelElement")));
    }

    @objid ("53181c68-282a-4e06-b74e-9b6d8a5f9a03")
    @Override
    public boolean canTarget(final Stereotype linkStereotype, final MObject linkElement, final MObject toElement) {
        MMetamodel metamodel = linkElement.getMClass().getMetamodel();
        return (toElement.getMClass().hasBase(metamodel.getMClass("Infrastructure.ModelElement")));
    }

    @objid ("6fe58790-53c8-442d-80c7-c4eb151a426a")
    @Override
    public boolean canLink(final Stereotype linkStereotype, final MClass linkMetaclass, final MClass fromMetaclass, final MClass toMetaclass) {
        MMetamodel metamodel = linkMetaclass.getMetamodel();
        return ((fromMetaclass.hasBase(metamodel.getMClass("Infrastructure.ModelElement"))) && (toMetaclass.hasBase(metamodel.getMClass("Infrastructure.ModelElement"))));
    }

    @objid ("8e71ed32-3fa0-426c-89cc-691433e09f57")
    @Override
    public boolean canLink(final Stereotype linkStereotype, final MClass linkMetaclass, final MObject fromElement, final MObject toElement) {
        MMetamodel metamodel = linkMetaclass.getMetamodel();
        return ((fromElement.getMClass().hasBase(metamodel.getMClass("Infrastructure.ModelElement"))) && (toElement.getMClass().hasBase(metamodel.getMClass("Infrastructure.ModelElement"))));
    }

    @objid ("b3f530f1-9cf4-4b44-91db-594710846828")
    @Override
    public Collection<MClass> getPossibleSourceMetaclasses(final Stereotype linkStereotype, final MClass targetMetaclass) {
        MMetamodel metamodel = linkStereotype.getMClass().getMetamodel();
        Set<MClass> metaclasses = new HashSet<>();
        if ((targetMetaclass.hasBase(metamodel.getMClass("Infrastructure.ModelElement")))) {
        	MClass mc = metamodel.getMClass("Infrastructure.ModelElement");
        	metaclasses.add(mc);
        	metaclasses.addAll(mc.getSub(true));
        }
        return metaclasses;
    }

    @objid ("0a2f8713-257c-4636-8e7a-88a339b52243")
    @Override
    public Collection<MClass> getPossibleTargetMetaclasses(final Stereotype linkStereotype, final MClass sourceMetaclass) {
        MMetamodel metamodel = linkStereotype.getMClass().getMetamodel();
        Set<MClass> metaclasses = new HashSet<>();
        if ((sourceMetaclass.hasBase(metamodel.getMClass("Infrastructure.ModelElement")))) {
        	MClass mc = metamodel.getMClass("Infrastructure.ModelElement");
        	metaclasses.add(mc);
        	metaclasses.addAll(mc.getSub(true));
        }
        return metaclasses;
    }

    @objid ("7f4c5cee-e746-4b29-b4e4-99b5417f8425")
    @Override
    public boolean isMultiple(final Stereotype linkStereotype) {
        return false;
    }

}
