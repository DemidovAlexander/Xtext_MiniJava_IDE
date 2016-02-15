package demidov.projects.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

@SuppressWarnings("all")
public class MiniJavaHighlightingConfiguration extends DefaultHighlightingConfiguration {
  public final static String METHOD_ID = "method";
  
  public final static String PRINTLN_ID = "println";
  
  public final static String ROUND_BRACKETS_ID = "roundBrackets";
  
  public final static String CURLY_BRACKETS_ID = "curlyBrackets";
  
  public final static String SQUARE_BRACKETS_ID = "squareBrackets";
  
  @Override
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    this.addStyle(acceptor, MiniJavaHighlightingConfiguration.METHOD_ID, 0, 0, 255, SWT.ITALIC);
    this.addStyle(acceptor, MiniJavaHighlightingConfiguration.PRINTLN_ID, 0, 150, 0, SWT.BOLD);
    this.addStyle(acceptor, MiniJavaHighlightingConfiguration.ROUND_BRACKETS_ID, 0, 150, 200, SWT.NORMAL);
    this.addStyle(acceptor, MiniJavaHighlightingConfiguration.CURLY_BRACKETS_ID, 255, 120, 50, SWT.NORMAL);
    this.addStyle(acceptor, MiniJavaHighlightingConfiguration.SQUARE_BRACKETS_ID, 150, 0, 50, SWT.NORMAL);
    super.configure(acceptor);
  }
  
  public void addStyle(final IHighlightingConfigurationAcceptor acceptor, final String id, final int r, final int g, final int b, final int style) {
    TextStyle textStyle = new TextStyle();
    RGB _rGB = new RGB(255, 255, 255);
    textStyle.setBackgroundColor(_rGB);
    RGB _rGB_1 = new RGB(r, g, b);
    textStyle.setColor(_rGB_1);
    textStyle.setStyle(style);
    acceptor.acceptDefaultHighlighting(id, id, textStyle);
  }
}
