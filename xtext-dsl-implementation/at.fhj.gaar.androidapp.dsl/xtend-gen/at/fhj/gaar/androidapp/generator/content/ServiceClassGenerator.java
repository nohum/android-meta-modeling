package at.fhj.gaar.androidapp.generator.content;

import at.fhj.gaar.androidapp.appDsl.Application;
import at.fhj.gaar.androidapp.appDsl.ApplicationElement;
import at.fhj.gaar.androidapp.appDsl.Service;
import at.fhj.gaar.androidapp.generator.content.AbstractClassGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ServiceClassGenerator extends AbstractClassGenerator {
  protected String getSubClassPath() {
    return "service";
  }
  
  protected boolean isAllowedElement(final ApplicationElement element) {
    return (element instanceof Service);
  }
  
  protected String retrieveElementTemplate(final Application application, final ApplicationElement element) {
    Service service = ((Service) element);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _name = application.getName();
    _builder.append(_name, "");
    _builder.append(".service;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import android.app.Service;");
    _builder.newLine();
    _builder.append("import android.content.Context;");
    _builder.newLine();
    _builder.append("import android.content.Intent;");
    _builder.newLine();
    _builder.append("import android.os.IBinder;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name_1 = service.getName();
    _builder.append(_name_1, "");
    _builder.append(" extends Service {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    String _name_2 = service.getName();
    _builder.append(_name_2, "    ");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public IBinder onBind(Intent intent) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static void startService(Context context) {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("Intent intent = new Intent(context, ");
    String _name_3 = service.getName();
    _builder.append(_name_3, "    \t");
    _builder.append(".class);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("context.startService(intent);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static void stopService(Context context) {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("Intent intent = new Intent(context, ");
    String _name_4 = service.getName();
    _builder.append(_name_4, "    \t");
    _builder.append(".class);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("context.stopService(intent);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
}