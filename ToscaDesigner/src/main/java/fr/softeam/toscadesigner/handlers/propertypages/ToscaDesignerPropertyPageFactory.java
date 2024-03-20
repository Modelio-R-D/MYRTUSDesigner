/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.1.06

 * This file was generated on 11/30/20 8:06 PM by Modelio Studio.
 */
package fr.softeam.toscadesigner.handlers.propertypages;


import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;

import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.visitors.IDefaultInfrastructureVisitor;
import org.modelio.metamodel.visitors.IDefaultModelVisitor;
import org.modelio.metamodel.visitors.IInfrastructureVisitor;


public class ToscaDesignerPropertyPageFactory {
    private static final PropertyPageVisitor propertyVisitor = new PropertyPageVisitor();

    /**
     * Instantiates the right proxy class the given element.
     * <br/>The model element must be stereotyped by a 'CamelDesigner' module stereotype.
     * <br/>In the other case the method will return <i>null</i>.
     * 
     * @param e A model element
     * @return the right proxy or <i>null</i>.
     */
    @objid ("421d5784-c31b-41f2-8e84-fb05df25016b")
    public static final Object instantiatePropertyPage(final ModelElement e) {
        for (Stereotype s : e.getExtension()) {
            ModuleComponent module = s.getModule();
            if (module != null && module.getName().equals(IToscaDesignerPeerModule.MODULE_NAME)) {
                return instantiatePropertyPage(e, s.getName());
            }
        }
        return null;
    }

    /**
     * Instantiates the right proxy class the given element with a stereotype name.
     * The stereotype must be one of the 'CamelDesigner' module stereotypes.
     * In the other case the method will return <i>null</i>.
     * 
     * @param e A model element.
     * @param stName A stereotype name.
     * @return the right proxy or <i>null</i>.
     */
    @objid ("33aeb9ea-d643-4b55-8c5b-11c7df82eec4")
    public static final Object instantiatePropertyPage(final Element e, final String stName) {
        propertyVisitor.setStereotype(stName);
        return e.accept(propertyVisitor);
    }

    @objid ("18563f46-96b0-4137-bf2c-f82a64e467d9")
    private static class PropertyPageVisitor implements IDefaultModelVisitor, IDefaultInfrastructureVisitor {
        @objid ("8bbd6a2f-ed17-4779-a468-d61617ab0386")
        private String stName;

        @objid ("978eac80-3ce0-45b6-ae6f-e6916b1cd570")
        @Override
        public final Object visitGeneralClass(GeneralClass obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitGeneralClass(obj);
        }

        @Override
        public final Object visitDependency(Dependency obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultInfrastructureVisitor.super.visitDependency(obj);
        }

        @Override
        public final Object visitComponent(Component obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitComponent(obj);
        }

        @Override
        public final Object visitInstance(Instance obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitInstance(obj);
        }

        @Override
        public final Object visitClass(Class obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitClass(obj);
        }

        @Override
        public final Object visitEnumeration(Enumeration obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitEnumeration(obj);
        }

        @Override
        public final Object visitModelElement(ModelElement obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultInfrastructureVisitor.super.visitModelElement(obj);
        }

        @Override
        public final Object visitArtifact(Artifact obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitArtifact(obj);
        }

        @Override
        public final Object visitAttribute(Attribute obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitAttribute(obj);
        }

        @Override
        public final Object visitAttributeLink(AttributeLink obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitAttributeLink(obj);
        }

        @Override
        public final Object visitClassDiagram(ClassDiagram obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitClassDiagram(obj);
        }

        @Override
        public final Object visitPackage(Package obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitPackage(obj);
        }

        @Override
        public final Object visitConnector(Connector obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitConnector(obj);
        }

        @Override
        public final Object visitDataType(DataType obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitDataType(obj);
        }

        @Override
        public final Object visitPort(Port obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitPort(obj);
        }

        /**
         * Get the visitor to delegate to when a {@link IInfrastructureVisitor} is needed.
         * <p>If null is returned the caller will return null.
         * 
         * @return the {@link IInfrastructureVisitor} visitor or <i>null</i>.
         */
        @objid ("65ba04d7-dcfb-43d5-8619-e88870f03f28")
        @Override
        public IInfrastructureVisitor getInfrastructureVisitor() {
            return this;
        }

        @objid ("1dcbce9d-01c0-42b6-89e6-797da0dadd2c")
        public final void setStereotype(final String stName) {
            this.stName = stName;
        }

    }

}
