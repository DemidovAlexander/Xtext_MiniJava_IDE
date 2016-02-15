package demidov.projects.syntaxcoloring;

import demidov.projects.miniJava.MethodCall;
import demidov.projects.miniJava.MiniJavaPackage;
import demidov.projects.miniJava.Statement;
import demidov.projects.syntaxcoloring.MiniJavaHighlightingConfiguration;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;

@SuppressWarnings("all")
public class MiniJavaSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
  @Override
  public void doProvideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor, final CancelIndicator ci) {
    IParseResult _parseResult = resource.getParseResult();
    final EObject rootObject = _parseResult.getRootASTElement();
    List<Statement> _allContentsOfType = EcoreUtil2.<Statement>getAllContentsOfType(rootObject, Statement.class);
    for (final Statement statement : _allContentsOfType) {
      String _statementType = statement.getStatementType();
      boolean _equals = _statementType.equals("System.out.println");
      if (_equals) {
        List<INode> _findNodesForFeature = NodeModelUtils.findNodesForFeature(statement, MiniJavaPackage.Literals.STATEMENT__STATEMENT_TYPE);
        for (final INode node : _findNodesForFeature) {
          int _offset = node.getOffset();
          int _length = node.getLength();
          acceptor.addPosition(_offset, _length, MiniJavaHighlightingConfiguration.PRINTLN_ID);
        }
      }
    }
    List<MethodCall> _allContentsOfType_1 = EcoreUtil2.<MethodCall>getAllContentsOfType(rootObject, MethodCall.class);
    for (final MethodCall methodCall : _allContentsOfType_1) {
      List<INode> _findNodesForFeature_1 = NodeModelUtils.findNodesForFeature(methodCall, MiniJavaPackage.Literals.METHOD_CALL__METHOD);
      for (final INode node_1 : _findNodesForFeature_1) {
        int _offset_1 = node_1.getOffset();
        int _length_1 = node_1.getLength();
        acceptor.addPosition(_offset_1, _length_1, MiniJavaHighlightingConfiguration.METHOD_ID);
      }
    }
    super.doProvideHighlightingFor(resource, acceptor, ci);
  }
}
