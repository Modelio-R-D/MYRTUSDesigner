/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.1.06

 * This file was generated on 11/30/20 8:06 PM by Modelio Studio.
 */
package fr.softeam.toscadesigner.handlers.propertypages;


import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.IToscaDesignerPeerModule;
import fr.softeam.toscadesigner.handlers.propertypages.serviceTemplate.TNodeTemplatePropertyPage;

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
    public static final Object instantiatePropertyPage(final Element e, final String stName) {
        propertyVisitor.setStereotype(stName);
        return e.accept(propertyVisitor);
    }

    private static class PropertyPageVisitor implements IDefaultModelVisitor, IDefaultInfrastructureVisitor {
        private String stName;

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
            case fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate.STEREOTYPE_NAME: return new TNodeTemplatePropertyPage<>(fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate.instantiate(obj));

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
        
        @Override
        public IInfrastructureVisitor getInfrastructureVisitor() {
            return this;
        }

        public final void setStereotype(final String stName) {
            this.stName = stName;
        }

    }

}
