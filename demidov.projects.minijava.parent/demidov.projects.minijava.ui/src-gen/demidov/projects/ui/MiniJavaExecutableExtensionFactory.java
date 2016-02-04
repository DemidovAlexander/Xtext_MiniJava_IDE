/*
 * generated by Xtext 2.9.1
 */
package demidov.projects.ui;

import com.google.inject.Injector;
import demidov.projects.minijava.ui.internal.MinijavaActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MiniJavaExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MinijavaActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MinijavaActivator.getInstance().getInjector(MinijavaActivator.DEMIDOV_PROJECTS_MINIJAVA);
	}
	
}