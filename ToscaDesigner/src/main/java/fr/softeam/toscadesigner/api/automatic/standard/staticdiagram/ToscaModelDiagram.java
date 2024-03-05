/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 01/03/2024 11:13 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.automatic.standard.staticdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.api.module.MManualAssociationRole;
import com.modeliosoft.modelio.api.module.MManualAttribute;
import com.modeliosoft.modelio.api.module.MManualClass;
import com.modeliosoft.modelio.api.module.MManualImport;
import com.modeliosoft.modelio.api.module.MManualOperation;
import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import com.modeliosoft.modelio.api.module.mda.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.ToscaDesignerProxyFactory;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ModelingSessionRegistry;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link StaticDiagram} with << ToscaModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1b9702cd-501a-4ee5-91de-974ad67bfec1")
public class ToscaModelDiagram implements IMdaProxy {
    @objid ("d7084897-f950-4ed6-8437-592183f8d102")
    public static final String STEREOTYPE_NAME = "ToscaModelDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     */
    @objid ("f3537f14-05a1-4cfe-adc2-23c5cd69ef18")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link ToscaModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << ToscaModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("34bed851-f095-4e0d-947e-b1611f8597da")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (ToscaModelDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(ToscaModelDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << ToscaModelDiagram >> then instantiate a {@link ToscaModelDiagram} proxy.
     * 
     * @return a {@link ToscaModelDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("e9a791d3-1711-4d78-a705-ccf31d4abef7")
    public static ToscaModelDiagram create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.StaticDiagram");
        e.getExtension().add(ToscaModelDiagram.MdaTypes.STEREOTYPE_ELT);
        return ToscaModelDiagram.instantiate((StaticDiagram)e);
    }

    /**
     * Tries to instantiate a {@link ToscaModelDiagram} proxy from a {@link StaticDiagram} stereotyped << ToscaModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a StaticDiagram
     * @return a {@link ToscaModelDiagram} proxy or <i>null</i>.
     */
    @objid ("dfd053a6-5884-4f20-b2f9-e5f261404f24")
    public static ToscaModelDiagram instantiate(final StaticDiagram obj) {
        return ToscaModelDiagram.canInstantiate(obj) ? new ToscaModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ToscaModelDiagram} proxy from a {@link StaticDiagram} stereotyped << ToscaModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link StaticDiagram}
     * @return a {@link ToscaModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a5e64c9a-d218-4e87-bacd-52fbc399927d")
    public static ToscaModelDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (ToscaModelDiagram.canInstantiate(obj))
        	return new ToscaModelDiagram(obj);
        else
        	throw new IllegalArgumentException("ToscaModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9f9b36f3-9c32-41f2-8e34-020c7898c2a2")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ToscaModelDiagram other = (ToscaModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link StaticDiagram}. 
     * @return the StaticDiagram represented by this proxy, never null.
     */
    @objid ("3070ef61-068a-4209-b70b-d0dc0aabb02f")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("ea50f5a7-48b6-4fb3-9dfa-aae96f1e52f3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("3ff37576-5190-47f0-984e-1bf8616700f6")
    protected  ToscaModelDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("cea04f35-0aca-4061-9934-20437f943c1d")
    public static final class MdaTypes {
        @objid ("50543da6-ae94-48df-a893-8bb604bcdea8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d7f0a5b5-c384-4b73-9cbd-73f1bb1d123d")
        private static Stereotype MDAASSOCDEP;

        @objid ("4b4ee1ef-a085-4f93-b88e-2d8bf97c3ad8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("83bbc285-146e-45e9-9d89-a1aa8cb8d9e5")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "3f7293c0-4896-443d-82d2-dbf6cad3caf4", "ToscaModelDiagram");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(Stereotype.MQNAME, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e", "MDAAssocDep");
            MDAASSOCDEP = (Stereotype) session.findByRef(mRef);
            if (MDAASSOCDEP==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd", "MDAAssocDepRole");
            MDAASSOCDEP_ROLE = (TagType) session.findByRef(mRef);
            if (MDAASSOCDEP_ROLE==null) missingRefs.add(mRef);
            
            if (! missingRefs.isEmpty()) throw new MdaProxyException(MdaProxyException.MdaProxyExceptionReason.MISSING_MDA_ELEMENT, missingRefs);
            
        }

    }

	public void setDefaultName(String string) {
		// TODO Auto-generated method stub
		
	}

}
