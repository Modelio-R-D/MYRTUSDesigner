package fr.softeam.toscadesigner.handlers.commands.submodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;

@objid ("10047190-fed6-4d4c-80ee-d7479ff6dcf5")
public class CreateTopologyTemplateDigramCommand extends DefaultBoxTool {
    @objid ("d2098c21-de33-4b3e-bf54-bdc8718fc955")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        // TODO Auto-generated method stub
        return false;
    }

    @objid ("66f3e2bc-d65f-4cc7-9622-9b5ac8169c55")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        // TODO implement the CreateTopologyTemplateDigramCommand handler. 
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "CreateTopologyTemplateDigramCommand", "Tool not implemented!");
    }

}
