package demidov.projects.syntaxcoloring;

import demidov.projects.syntaxcoloring.MiniJavaHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

@SuppressWarnings("all")
public class MiniJavaTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
  @Override
  public String calculateId(final String tokenName, final int tokenType) {
    boolean _or = false;
    boolean _equals = tokenName.equals("\'(\'");
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = tokenName.equals("\')\'");
      _or = _equals_1;
    }
    if (_or) {
      return MiniJavaHighlightingConfiguration.ROUND_BRACKETS_ID;
    }
    boolean _or_1 = false;
    boolean _equals_2 = tokenName.equals("\'{\'");
    if (_equals_2) {
      _or_1 = true;
    } else {
      boolean _equals_3 = tokenName.equals("\'}\'");
      _or_1 = _equals_3;
    }
    if (_or_1) {
      return MiniJavaHighlightingConfiguration.CURLY_BRACKETS_ID;
    }
    boolean _or_2 = false;
    boolean _equals_4 = tokenName.equals("\'[\'");
    if (_equals_4) {
      _or_2 = true;
    } else {
      boolean _equals_5 = tokenName.equals("\']\'");
      _or_2 = _equals_5;
    }
    if (_or_2) {
      return MiniJavaHighlightingConfiguration.SQUARE_BRACKETS_ID;
    }
    return super.calculateId(tokenName, tokenType);
  }
}
