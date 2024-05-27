/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 24/05/2024 13:55 by Modelio Studio.
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
 * <tr><td>Class << TNodeTemplate >> </td><td>Class << TNodeTemplate >> </td></tr>
 * 
 * </table>
 */
@objid ("435b1c2d-3b24-4667-a856-17bfac15539e")
public class TRelationshipTemplateExpert implements IMdaExpert {
    @objid ("0e7ca738-0518-472a-b39c-d8546256d415")
    @Override
    public boolean canSource(final Stereotype linkStereotype, final MClass linkMetaclass, final MClass fromMetaclass) {
        MMetamodel metamodel = linkMetaclass.getMetamodel();
        return (fromMetaclass.hasBase(metamodel.getMClass("Standard.Class")));
    }

    @objid ("b28ca1c0-88ee-4f3f-9874-6920bf7ed71b")
    @Override
    public boolean canSource(final Stereotype linkStereotype, final MObject linkElement, final MObject fromElement) {
        MMetamodel metamodel = linkElement.getMClass().getMetamodel();
        return (fromElement.getMClass().hasBase(metamodel.getMClass("Standard.Class")) && ((ModelElement)fromElement).getExtension().stream().anyMatch(s -> s.getUuid().equals("1a20bf91-0a92-434a-9d1f-35c86788784e")));
    }

    @objid ("801b26ae-5d8f-4000-9b3e-26f3903c050d")
    @Override
    public boolean canSource(final ElementScope linkScope, final MObject fromElement) {
        MMetamodel metamodel = linkScope.getMetaclass().getMetamodel();
        return (fromElement.getMClass().hasBase(metamodel.getMClass("Standard.Class")) && ((ModelElement)fromElement).getExtension().stream().anyMatch(s -> s.getUuid().equals("1a20bf91-0a92-434a-9d1f-35c86788784e")));
    }

    @objid ("fb3e4e30-1be6-4bd9-a8da-be7ca8024162")
    @Override
    public boolean canTarget(final Stereotype linkStereotype, final MClass linkMetaclass, final MClass toMetaclass) {
        MMetamodel metamodel = linkMetaclass.getMetamodel();
        return (toMetaclass.hasBase(metamodel.getMClass("Standard.Class")));
    }

    @objid ("e614602f-431d-4406-b004-e03a0dfeae0a")
    @Override
    public boolean canTarget(final Stereotype linkStereotype, final MObject linkElement, final MObject toElement) {
        MMetamodel metamodel = linkElement.getMClass().getMetamodel();
        return (toElement.getMClass().hasBase(metamodel.getMClass("Standard.Class")) && ((ModelElement)toElement).getExtension().stream().anyMatch(s -> s.getUuid().equals("1a20bf91-0a92-434a-9d1f-35c86788784e")));
    }

    @objid ("b0d52f14-978c-4e9c-902f-70baa780d6e7")
    @Override
    public boolean canLink(final Stereotype linkStereotype, final MClass linkMetaclass, final MClass fromMetaclass, final MClass toMetaclass) {
        MMetamodel metamodel = linkMetaclass.getMetamodel();
        return ((fromMetaclass.hasBase(metamodel.getMClass("Standard.Class"))) && (toMetaclass.hasBase(metamodel.getMClass("Standard.Class"))));
    }

    @objid ("ea26f15c-0d27-4aff-82fa-46d2295c404e")
    @Override
    public boolean canLink(final Stereotype linkStereotype, final MClass linkMetaclass, final MObject fromElement, final MObject toElement) {
        MMetamodel metamodel = linkMetaclass.getMetamodel();
        return ((fromElement.getMClass().hasBase(metamodel.getMClass("Standard.Class")) && ((ModelElement)fromElement).getExtension().stream().anyMatch(s -> s.getUuid().equals("1a20bf91-0a92-434a-9d1f-35c86788784e"))) && (toElement.getMClass().hasBase(metamodel.getMClass("Standard.Class")) && ((ModelElement)toElement).getExtension().stream().anyMatch(s -> s.getUuid().equals("1a20bf91-0a92-434a-9d1f-35c86788784e"))));
    }

    @objid ("c9e7246a-3a48-4c1d-ac12-0ed86f446295")
    @Override
    public Collection<MClass> getPossibleSourceMetaclasses(final Stereotype linkStereotype, final MClass targetMetaclass) {
        MMetamodel metamodel = linkStereotype.getMClass().getMetamodel();
        Set<MClass> metaclasses = new HashSet<>();
        if ((targetMetaclass.hasBase(metamodel.getMClass("Standard.Class")))) {
        	MClass mc = metamodel.getMClass("Standard.Class");
        	metaclasses.add(mc);
        	metaclasses.addAll(mc.getSub(true));
        }
        return metaclasses;
    }

    @objid ("a3fae9c6-1160-4ee3-b08f-567c6eca4705")
    @Override
    public Collection<MClass> getPossibleTargetMetaclasses(final Stereotype linkStereotype, final MClass sourceMetaclass) {
        MMetamodel metamodel = linkStereotype.getMClass().getMetamodel();
        Set<MClass> metaclasses = new HashSet<>();
        if ((sourceMetaclass.hasBase(metamodel.getMClass("Standard.Class")))) {
        	MClass mc = metamodel.getMClass("Standard.Class");
        	metaclasses.add(mc);
        	metaclasses.addAll(mc.getSub(true));
        }
        return metaclasses;
    }

    @objid ("9014cd21-f6b3-4c83-8238-26872336b28a")
    @Override
    public boolean isMultiple(final Stereotype linkStereotype) {
        return false;
    }

}
