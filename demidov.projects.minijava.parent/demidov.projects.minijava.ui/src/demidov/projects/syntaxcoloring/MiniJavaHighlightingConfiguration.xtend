package demidov.projects.syntaxcoloring

import org.eclipse.swt.graphics.RGB
import org.eclipse.swt.SWT
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle

public class MiniJavaHighlightingConfiguration extends DefaultHighlightingConfiguration {
    public static final String METHOD_ID = 'method';
    public static final String PRINTLN_ID = 'println';
    public static final String ROUND_BRACKETS_ID = 'roundBrackets';
    public static final String CURLY_BRACKETS_ID = 'curlyBrackets';
    public static final String SQUARE_BRACKETS_ID = 'squareBrackets';

    override configure(IHighlightingConfigurationAcceptor acceptor) {      
        addStyle(acceptor, METHOD_ID, 0, 0, 255, SWT.ITALIC)
        addStyle(acceptor, PRINTLN_ID, 0, 150, 0, SWT.BOLD)
        addStyle(acceptor, ROUND_BRACKETS_ID, 0, 150, 200, SWT.NORMAL)
        addStyle(acceptor, CURLY_BRACKETS_ID, 255, 120, 50, SWT.NORMAL)
        addStyle(acceptor, SQUARE_BRACKETS_ID, 150, 0, 50, SWT.NORMAL)
          
        super.configure(acceptor);
    }
    
	def addStyle( IHighlightingConfigurationAcceptor acceptor, String id, int r, int g, int b, int style ) {
 		var textStyle = new TextStyle();
 		textStyle.setBackgroundColor(new RGB(255, 255, 255));
 		textStyle.setColor(new RGB(r, g, b));
 		textStyle.setStyle(style);
 		
 		acceptor.acceptDefaultHighlighting(id, id, textStyle);
	}
}