/*
 * generated by Xtext 2.9.1
 */
package demidov.projects.ui.tests;

import com.google.inject.Injector;
import demidov.projects.minijava.ui.internal.MinijavaActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class MiniJavaUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MinijavaActivator.getInstance().getInjector("demidov.projects.MiniJava");
	}

}
