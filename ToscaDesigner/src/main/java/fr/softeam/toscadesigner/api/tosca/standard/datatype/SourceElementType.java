/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 19/09/2024 15:04 by Modelio Studio.
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
@objid ("991a9be8-5c25-4e55-a773-3d69398c6ad3")
public class SourceElementType implements IMdaProxy {
    @objid ("6db4fdc6-ddd4-4547-8074-8b18b6be12dd")
    public static final String STEREOTYPE_NAME = "SourceElementType";

    @objid ("9712ed99-d936-4dcb-95c4-e9b6cccac9be")
    public static final String REF_TAGTYPE = "ref";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("33230bea-ff9f-47c0-9cf5-1e77c6d838c3")
    protected final DataType elt;

    /**
     * Tells whether a {@link SourceElementType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << SourceElementType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("39671dce-0a18-49e7-9f70-e27777e32406")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && (SourceElementType.MdaTypes.STEREOTYPE_ELT!=null) && ((DataType) elt).isStereotyped(SourceElementType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link DataType} stereotyped << SourceElementType >> then instantiate a {@link SourceElementType} proxy.
     * 
     * @return a {@link SourceElementType} proxy on the created {@link DataType}.
     */
    @objid ("43ce3d10-a8e8-449f-a295-33baf1e1f8a6")
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
    @objid ("f8b9d6f2-78eb-48a6-bf44-7e7880b828fc")
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
    @objid ("fa194691-caa1-46da-a366-9f5656968c46")
    public static SourceElementType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (SourceElementType.canInstantiate(obj))
        	return new SourceElementType(obj);
        else
        	throw new IllegalArgumentException("SourceElementType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4b02664b-854e-4d94-a368-17ab9938ecf3")
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
    @objid ("6ffa9fb1-41ae-44f4-b883-dfe077611b21")
    public DataType getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("91c62629-d419-4f82-b621-e9e3a74705de")
    public String getRef() {
        return this.elt.getTagValue(SourceElementType.MdaTypes.REF_TAGTYPE_ELT);
    }

    @objid ("2d7ca98a-55ea-4bdf-b4f3-a6eb290c870b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dbb86512-0268-411e-aa65-972234aba081")
    public void setRef(final String value) {
        this.elt.putTagValue(SourceElementType.MdaTypes.REF_TAGTYPE_ELT, value);
    }

    @objid ("ea5b7dc5-4370-4443-bfe7-33bd5f89bca4")
    protected  SourceElementType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("ef123d4f-0e90-4f28-9acb-a4042f55c3fb")
    public static final class MdaTypes {
        @objid ("87f1dca0-d35d-4de8-b054-3974c75da7ee")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0b2bd106-3677-44d0-881b-e38e074fc6f5")
        public static TagType REF_TAGTYPE_ELT;

        @objid ("c18b43b6-eafe-489d-99b1-acd22388b8f0")
        private static Stereotype MDAASSOCDEP;

        @objid ("ad82f862-e593-4773-9a10-e9a0fe0b5e62")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6632bada-4b21-48ae-ab51-29aee4e5a2bc")
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
