package fr.softeam.toscadesigner.export;

import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.context.log.ILogService;
import org.modelio.vcore.smkernel.mapi.MObject;

class ToscaFileGenerator extends AbstractToscaFileGenerator {
	private static final String[] TOSCA_FILE_EXTENSIONS = { "*.tosca" };
	private ILogService logger;

	public ToscaFileGenerator(ILogService logger) {
		this.logger = logger;
	}

	@Override
	protected String getFileType() {
		return "TOSCA file";
	}

	@Override
	protected String[] getFileExtensions() {
		return TOSCA_FILE_EXTENSIONS;
	}

	@Override
	public void generateContent(MObject object) throws IOException {
		String filePath = saveToFile(getFileExtensions(), getFileType());
		if (filePath != null) {
			try (FileWriter fileWriter = new FileWriter(filePath)) {
				String content = renderTemplate(handlebars, object);
				fileWriter.write(content);
				MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Success",
						getFileType() + " saved successfully");
			} catch (IOException ex) {
				logger.error(ex);
				MessageDialog.openError(Display.getCurrent().getActiveShell(), getFileType() + " export error",
						ex.getLocalizedMessage());
			}
		}
	}

}
