package fr.softeam.toscadesigner.impl;

import java.io.File;
import java.nio.file.Path;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.ToscaDesignerProxyFactory;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.modelio.api.modelio.mc.IModelComponentDescriptor;
import org.modelio.api.modelio.mc.IModelComponentService;
import org.modelio.api.module.lifecycle.DefaultModuleLifeCycleHandler;
import org.modelio.api.module.lifecycle.ModuleException;
import org.modelio.vbasic.version.Version;

@objid("e70ed160-3df8-403b-9c56-82de62675ef2")
public class ToscaDesignerLifeCycleHandler extends DefaultModuleLifeCycleHandler {
	private String _ramcVersion = "0.0.01";
	private String _toscaLibrary = "ToscaLibrary";

	@objid("5afa298a-5b22-44ed-b1a3-6e31e05e9a81")
	public ToscaDesignerLifeCycleHandler(final ToscaDesignerModule module) {
		super(module);
	}

	@objid("482bfb70-aa2a-4acf-b75a-f825fe27144b")
	@Override
	public boolean start() throws ModuleException {
		try {
			ToscaDesignerProxyFactory
					.initialize(ToscaDesignerModule.getInstance().getModuleContext().getModelingSession());
		} catch (com.modeliosoft.modelio.api.module.mda.MdaProxyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		installRamc();
		return super.start();
	}

	@objid("1a3ea6b7-823c-4a04-b866-54b6875eb715")
	@Override
	public void stop() throws ModuleException {
		super.stop();
	}

	/**
	 * @return
	 */
	@objid("3c043f01-ab0d-47c6-baea-c7fc364651b9")
	public static boolean install(final String modelioPath, final String mdaPath) throws ModuleException {
		return DefaultModuleLifeCycleHandler.install(modelioPath, mdaPath);
	}

	@objid("442becbc-5092-4706-b1a8-b58241e702cc")
	@Override
	public boolean select() throws ModuleException {
		return super.select();
	}

	@objid("56b555fa-19d5-4048-aa47-25d35dd6e3b2")
	@Override
	public void upgrade(final Version oldVersion, final Map<String, String> oldParameters) throws ModuleException {
		super.upgrade(oldVersion, oldParameters);
	}

	@objid("7c082c67-b93b-49d4-9e2f-3247dcb001d1")
	@Override
	public void unselect() throws ModuleException {
		super.unselect();
	}

	private void installRamc() {
		Path mdaplugsPath = this.module.getModuleContext().getConfiguration().getModuleResourcesPath();

		final IModelComponentService modelComponentService = ToscaDesignerModule.getInstance().getModuleContext()
				.getModelioServices().getModelComponentService();
		for (IModelComponentDescriptor mc : modelComponentService.getModelComponents()) {
			if (mc.getName().equals(_toscaLibrary)) {
				if (new Version(mc.getVersion()).isOlderThan(new Version(this._ramcVersion))) {
					modelComponentService.deployModelComponent(new File(mdaplugsPath
							.resolve("res" + File.separator + "ramc" + File.separator + _toscaLibrary + ".ramc")
							.toString()), new NullProgressMonitor());
				} else {
					// Ramc already deployed...
					return;
				}
			}
		}

		// No ramc found, deploy it
		modelComponentService.deployModelComponent(new File(mdaplugsPath
				.resolve("res" + File.separator + "ramc" + File.separator + _toscaLibrary + ".ramc").toString()),
				new NullProgressMonitor());
	}

}
