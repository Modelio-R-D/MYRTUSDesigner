package fr.softeam.toscadesigner.handlers.commands.submodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;

@objid ("7f9a6eeb-631a-42b2-a905-818a2d2404f7")
public class CreateTopologyTemplateDigramCommand extends DefaultBoxTool {
    @objid ("24330cea-b48d-423b-b111-c6f4be006e30")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        // TODO Auto-generated method stub
        return false;
    }

    @objid ("6a2178b6-2d54-45ec-b61d-2b4381b00893")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        // TODO implement the CreateTopologyTemplateDigramCommand handler. 
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "CreateTopologyTemplateDigramCommand", "Tool not implemented!");
    }

}
