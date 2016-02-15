package demidov.projects.syntaxcoloring

import demidov.projects.miniJava.Statement
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.EcoreUtil2
import demidov.projects.miniJava.MiniJavaPackage
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import demidov.projects.miniJava.MethodCall

class MiniJavaSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
	override doProvideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator ci) {
		val rootObject = resource.getParseResult().getRootASTElement();
		
		for (Statement statement : EcoreUtil2.getAllContentsOfType(rootObject, Statement)) {
			if (statement.statementType.equals('System.out.println')) {
				for (INode node : NodeModelUtils.findNodesForFeature(statement, MiniJavaPackage.Literals.STATEMENT__STATEMENT_TYPE)) {
				
					acceptor.addPosition(node.getOffset(), node.getLength(), MiniJavaHighlightingConfiguration.PRINTLN_ID);
				}
			}
		}
		
		for (MethodCall methodCall : EcoreUtil2.getAllContentsOfType(rootObject, MethodCall)) {
			for (INode node : NodeModelUtils.findNodesForFeature(methodCall, MiniJavaPackage.Literals.METHOD_CALL__METHOD)) {
				
				acceptor.addPosition(node.getOffset(), node.getLength(), MiniJavaHighlightingConfiguration.METHOD_ID);
			}
		}
		
		super.doProvideHighlightingFor(resource, acceptor, ci);
	}
}