/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/04/2024 16:51 by Modelio Studio.
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
 * Proxy class to handle a {@link StaticDiagram} with << CloudServiceArchiveDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("14644635-a422-47d2-a521-6f92f8f4c732")
public class CloudServiceArchiveDiagram implements IMdaProxy {
    @objid ("d9674f19-6621-46b3-ba40-d4d7c4c3dc81")
    public static final String STEREOTYPE_NAME = "CloudServiceArchiveDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     */
    @objid ("e9203439-1a7b-493a-a2fa-a4de463027df")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link CloudServiceArchiveDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << CloudServiceArchiveDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3ac94115-8cd9-42ce-849d-28fe359ff11e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (CloudServiceArchiveDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(CloudServiceArchiveDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << CloudServiceArchiveDiagram >> then instantiate a {@link CloudServiceArchiveDiagram} proxy.
     * 
     * @return a {@link CloudServiceArchiveDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("52db8254-e211-4356-94fb-757c086c5c61")
    public static CloudServiceArchiveDiagram create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.StaticDiagram");
        e.getExtension().add(CloudServiceArchiveDiagram.MdaTypes.STEREOTYPE_ELT);
        return CloudServiceArchiveDiagram.instantiate((StaticDiagram)e);
    }

    /**
     * Tries to instantiate a {@link CloudServiceArchiveDiagram} proxy from a {@link StaticDiagram} stereotyped << CloudServiceArchiveDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a StaticDiagram
     * @return a {@link CloudServiceArchiveDiagram} proxy or <i>null</i>.
     */
    @objid ("33f8e273-9400-487c-bf89-f35c85236c2b")
    public static CloudServiceArchiveDiagram instantiate(final StaticDiagram obj) {
        return CloudServiceArchiveDiagram.canInstantiate(obj) ? new CloudServiceArchiveDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CloudServiceArchiveDiagram} proxy from a {@link StaticDiagram} stereotyped << CloudServiceArchiveDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link StaticDiagram}
     * @return a {@link CloudServiceArchiveDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("eafe9b2c-b6a4-4dec-a033-8c75aec88317")
    public static CloudServiceArchiveDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (CloudServiceArchiveDiagram.canInstantiate(obj))
        	return new CloudServiceArchiveDiagram(obj);
        else
        	throw new IllegalArgumentException("CloudServiceArchiveDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("037435ce-6064-41bc-8f8e-894ad1c95edb")
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
        CloudServiceArchiveDiagram other = (CloudServiceArchiveDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link StaticDiagram}. 
     * @return the StaticDiagram represented by this proxy, never null.
     */
    @objid ("f3f32d1d-12da-44d8-bc48-7a13fe83637e")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("e667332a-0d91-45af-9d85-b7b9c19b202c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("1a70eaec-4a71-44b0-b04b-e7262539ce40")
    protected  CloudServiceArchiveDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("f9b8aa63-12e2-456c-a0b9-3c670d965b7a")
    public static final class MdaTypes {
        @objid ("bd2fb7e3-8992-4f3b-8fd8-67371fe7574d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e62c227c-1379-4f34-861b-d2ccc65b1dff")
        private static Stereotype MDAASSOCDEP;

        @objid ("aaf0d0ec-3057-4eba-b23a-04ae70b5ce42")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("818e679f-aabd-4f9d-b110-f6afec4e291b")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "dddbe647-1f21-42d1-93cd-f61109a8afd3", "CloudServiceArchiveDiagram");
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

}
