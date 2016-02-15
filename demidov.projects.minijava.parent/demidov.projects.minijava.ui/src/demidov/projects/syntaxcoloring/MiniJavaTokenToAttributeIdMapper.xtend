package demidov.projects.syntaxcoloring

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper

public class MiniJavaTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

	override calculateId(String tokenName, int tokenType) {
		if( tokenName.equals("'('") || tokenName.equals("')'") ) {
			return MiniJavaHighlightingConfiguration.ROUND_BRACKETS_ID;
		}
		
		if( tokenName.equals("'{'") || tokenName.equals("'}'") ) {
			return MiniJavaHighlightingConfiguration.CURLY_BRACKETS_ID;
		}
		
		if( tokenName.equals("'['") || tokenName.equals("']'") ) {
			return MiniJavaHighlightingConfiguration.SQUARE_BRACKETS_ID;
		}
		
		return super.calculateId(tokenName, tokenType);
	}
}