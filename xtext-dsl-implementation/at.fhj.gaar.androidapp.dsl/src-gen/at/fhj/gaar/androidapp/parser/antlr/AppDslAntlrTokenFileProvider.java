/*
* generated by Xtext
*/
package at.fhj.gaar.androidapp.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AppDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("at/fhj/gaar/androidapp/parser/antlr/internal/InternalAppDsl.tokens");
	}
}
