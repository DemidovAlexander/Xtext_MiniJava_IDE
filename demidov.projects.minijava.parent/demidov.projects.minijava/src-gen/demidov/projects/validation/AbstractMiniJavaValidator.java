/*
 * generated by Xtext 2.9.1
 */
package demidov.projects.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMiniJavaValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(demidov.projects.miniJava.MiniJavaPackage.eINSTANCE);
		return result;
	}
	
}