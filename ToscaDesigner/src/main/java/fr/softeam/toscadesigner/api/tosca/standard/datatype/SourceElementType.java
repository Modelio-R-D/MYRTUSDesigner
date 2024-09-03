/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 03/09/2024 15:34 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.datatype;

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
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link DataType} with << SourceElementType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("221b69a8-7f99-4b0c-8e38-5cca4a5810e0")
public class SourceElementType implements IMdaProxy {
    @objid ("8aa6b681-e716-4b0d-94e9-fe2586a1af2d")
    public static final String STEREOTYPE_NAME = "SourceElementType";

    @objid ("5e11e347-dcc5-42fa-aaee-c23dc579d0f4")
    public static final String REF_TAGTYPE = "ref";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("ff0c2626-a42d-4f99-ac7f-73eba3cf5fa3")
    protected final DataType elt;

    /**
     * Tells whether a {@link SourceElementType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << SourceElementType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3c55e8ea-fed6-4e4b-925f-818cd520c396")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && (SourceElementType.MdaTypes.STEREOTYPE_ELT!=null) && ((DataType) elt).isStereotyped(SourceElementType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link DataType} stereotyped << SourceElementType >> then instantiate a {@link SourceElementType} proxy.
     * 
     * @return a {@link SourceElementType} proxy on the created {@link DataType}.
     */
    @objid ("1d0b4b24-d50e-40e4-88d2-b70963bb3ee8")
    public static SourceElementType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.DataType");
        e.getExtension().add(SourceElementType.MdaTypes.STEREOTYPE_ELT);
        return SourceElementType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link SourceElementType} proxy from a {@link DataType} stereotyped << SourceElementType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link SourceElementType} proxy or <i>null</i>.
     */
    @objid ("e6b88e29-9110-4284-a7cd-9dc04a1d2f2b")
    public static SourceElementType instantiate(final DataType obj) {
        return SourceElementType.canInstantiate(obj) ? new SourceElementType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SourceElementType} proxy from a {@link DataType} stereotyped << SourceElementType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link SourceElementType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8d6b4887-647d-473c-a232-019db703ed52")
    public static SourceElementType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (SourceElementType.canInstantiate(obj))
        	return new SourceElementType(obj);
        else
        	throw new IllegalArgumentException("SourceElementType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5428af49-c104-46e8-9d7d-476f842e12e1")
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
        SourceElementType other = (SourceElementType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("930cbb76-56f0-4506-8540-3e45d7001a8f")
    public DataType getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("07939908-bf48-47be-a90b-cba6b12c0f4c")
    public String getRef() {
        return this.elt.getTagValue(SourceElementType.MdaTypes.REF_TAGTYPE_ELT);
    }

    @objid ("b128f631-6010-49b3-9c56-99006233b0b6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("81182d9c-5ee7-42cc-8bb1-0fc0c10cbdda")
    public void setRef(final String value) {
        this.elt.putTagValue(SourceElementType.MdaTypes.REF_TAGTYPE_ELT, value);
    }

    @objid ("5edba4b5-d3c0-40e5-80ee-499b974b18a8")
    protected  SourceElementType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("05afd263-12c4-4b89-a577-2233af856878")
    public static final class MdaTypes {
        @objid ("c38d3994-63f2-4853-9491-4870ab6343bf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("da2b34eb-3b5b-4ea0-a07a-04b3661f9671")
        public static TagType REF_TAGTYPE_ELT;

        @objid ("1af1141d-b007-4a42-b018-244bf4e1e18d")
        private static Stereotype MDAASSOCDEP;

        @objid ("75de985b-2c73-4317-8bd2-47e479c53012")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e874f1c8-672a-4c0c-b322-9dfb98b6ce64")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "4c7a9935-4795-4b01-bba1-4e88b3f061d6", "SourceElementType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "3bade1e4-3a43-4c6f-906c-27dca8e8590b", "ref");
            REF_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (REF_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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
