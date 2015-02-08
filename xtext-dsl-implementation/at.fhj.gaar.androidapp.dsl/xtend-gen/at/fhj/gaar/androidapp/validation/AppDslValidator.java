/**
 * generated by Xtext
 */
package at.fhj.gaar.androidapp.validation;

import at.fhj.gaar.androidapp.appDsl.Activity;
import at.fhj.gaar.androidapp.appDsl.ActivityAttribute;
import at.fhj.gaar.androidapp.appDsl.ActivityLayoutAttribute;
import at.fhj.gaar.androidapp.appDsl.AppDslPackage;
import at.fhj.gaar.androidapp.appDsl.Application;
import at.fhj.gaar.androidapp.appDsl.ApplicationAttribute;
import at.fhj.gaar.androidapp.appDsl.ApplicationCompileSdk;
import at.fhj.gaar.androidapp.appDsl.ApplicationElement;
import at.fhj.gaar.androidapp.appDsl.ApplicationElementList;
import at.fhj.gaar.androidapp.appDsl.ApplicationMinSdk;
import at.fhj.gaar.androidapp.appDsl.ApplicationPermissionList;
import at.fhj.gaar.androidapp.appDsl.ApplicationTargetSdk;
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiver;
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiverAttribute;
import at.fhj.gaar.androidapp.appDsl.Button;
import at.fhj.gaar.androidapp.appDsl.ElementIntentList;
import at.fhj.gaar.androidapp.appDsl.LayoutElement;
import at.fhj.gaar.androidapp.appDsl.Service;
import at.fhj.gaar.androidapp.appDsl.ServiceAttribute;
import at.fhj.gaar.androidapp.validation.AbstractAppDslValidator;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class AppDslValidator extends AbstractAppDslValidator {
  private interface DuplicateCallback {
    public abstract void onDuplicateFound(final String item, final int index);
  }
  
  private static Logger logger = Logger.getLogger("DslValidation");
  
  /**
   * Every attribute in an application is only allowed once.
   */
  @Check
  public void disallowDuplicateApplicationAttributes(final Application application) {
    List<String> occuredAttrs = new ArrayList<String>();
    EList<ApplicationAttribute> _attributes = application.getAttributes();
    for (final ApplicationAttribute attr : _attributes) {
      {
        Class<? extends ApplicationAttribute> _class = attr.getClass();
        String attrName = _class.getName();
        boolean _contains = occuredAttrs.contains(attrName);
        if (_contains) {
          this.error("This element occurred already in this application and must only occur once at most", attr, null);
        } else {
          occuredAttrs.add(attrName);
        }
      }
    }
  }
  
  /**
   * Every attribute in an element is only allowed once.
   * @todo refactoring
   */
  @Check
  public void disallowDuplicateElementAttributes(final ApplicationElement element) {
    List<String> occuredAttrs = new ArrayList<String>();
    if ((element instanceof Activity)) {
      EList<ActivityAttribute> _attributes = ((Activity) element).getAttributes();
      for (final ActivityAttribute attr : _attributes) {
        {
          Class<? extends ActivityAttribute> _class = attr.getClass();
          String attrName = _class.getName();
          boolean _contains = occuredAttrs.contains(attrName);
          if (_contains) {
            this.error("This element occurred already in this activity and must only occur once at most", attr, null);
          } else {
            occuredAttrs.add(attrName);
          }
        }
      }
    } else {
      if ((element instanceof Service)) {
        EList<ServiceAttribute> _attributes_1 = ((Service) element).getAttributes();
        for (final ServiceAttribute attr_1 : _attributes_1) {
          {
            Class<? extends ServiceAttribute> _class = attr_1.getClass();
            String attrName = _class.getName();
            boolean _contains = occuredAttrs.contains(attrName);
            if (_contains) {
              this.error("This element occurred already in this service and must only occur once at most", attr_1, null);
            } else {
              occuredAttrs.add(attrName);
            }
          }
        }
      } else {
        if ((element instanceof BroadcastReceiver)) {
          EList<BroadcastReceiverAttribute> _attributes_2 = ((BroadcastReceiver) element).getAttributes();
          for (final BroadcastReceiverAttribute attr_2 : _attributes_2) {
            {
              Class<? extends BroadcastReceiverAttribute> _class = attr_2.getClass();
              String attrName = _class.getName();
              boolean _contains = occuredAttrs.contains(attrName);
              if (_contains) {
                this.error("This element occurred already in this broadcast receiver and must only occur once at most", attr_2, null);
              } else {
                occuredAttrs.add(attrName);
              }
            }
          }
        }
      }
    }
  }
  
  @Check
  public void checkCompileSdkBounds(final Application application) {
    ApplicationMinSdk minSdk = this.<ApplicationMinSdk>getApplicationField(application, ApplicationMinSdk.class);
    boolean _equals = Objects.equal(minSdk, null);
    if (_equals) {
      AppDslValidator.logger.info("checkCompileSdkBounds: no minSdk found");
      return;
    }
    ApplicationCompileSdk compileSdk = this.<ApplicationCompileSdk>getApplicationField(application, ApplicationCompileSdk.class);
    boolean _equals_1 = Objects.equal(compileSdk, null);
    if (_equals_1) {
      AppDslValidator.logger.info("checkCompileSdkBounds: no compileSdk found");
      return;
    }
    int _compileSdk = compileSdk.getCompileSdk();
    int _minSdk = minSdk.getMinSdk();
    boolean _greaterEqualsThan = (_compileSdk >= _minSdk);
    if (_greaterEqualsThan) {
      return;
    }
    this.warning("compile-sdk should be higher or equal to min-sdk", compileSdk, 
      AppDslPackage.Literals.APPLICATION_COMPILE_SDK__COMPILE_SDK);
  }
  
  @Check
  public void checkTargetSdkBounds(final Application application) {
    ApplicationMinSdk minSdk = this.<ApplicationMinSdk>getApplicationField(application, ApplicationMinSdk.class);
    boolean _equals = Objects.equal(minSdk, null);
    if (_equals) {
      AppDslValidator.logger.info("checkTargetSdkBounds: no minSdk found");
      return;
    }
    ApplicationTargetSdk targetSdk = this.<ApplicationTargetSdk>getApplicationField(application, ApplicationTargetSdk.class);
    boolean _equals_1 = Objects.equal(targetSdk, null);
    if (_equals_1) {
      AppDslValidator.logger.info("checkTargetSdkBounds: no targetSdk found");
      return;
    }
    int _targetSdk = targetSdk.getTargetSdk();
    int _minSdk = minSdk.getMinSdk();
    boolean _greaterEqualsThan = (_targetSdk >= _minSdk);
    if (_greaterEqualsThan) {
      return;
    }
    this.warning("target-sdk should be higher or equal to min-sdk", targetSdk, 
      AppDslPackage.Literals.APPLICATION_TARGET_SDK__TARGET_SDK);
  }
  
  @Check
  public void checkForDuplicatePermission(final ApplicationPermissionList permissions) {
    EList<String> _permissions = permissions.getPermissions();
    final AppDslValidator.DuplicateCallback _function = new AppDslValidator.DuplicateCallback() {
      public void onDuplicateFound(final String name, final int index) {
        AppDslValidator.this.error("Permissions have to be unique", 
          AppDslPackage.Literals.APPLICATION_PERMISSION_LIST__PERMISSIONS, index);
      }
    };
    this.findStringDuplicates(_permissions, _function);
  }
  
  @Check
  public void checkForDuplicateIntent(final ElementIntentList intents) {
    EList<String> _intents = intents.getIntents();
    final AppDslValidator.DuplicateCallback _function = new AppDslValidator.DuplicateCallback() {
      public void onDuplicateFound(final String name, final int index) {
        String _format = String.format("Intent \"%s\" is not unique", name);
        AppDslValidator.this.error(_format, 
          AppDslPackage.Literals.ELEMENT_INTENT_LIST__INTENTS, index);
      }
    };
    this.findStringDuplicates(_intents, _function);
  }
  
  @Check
  public void checkForDuplicateElementIdentifier(final ApplicationElementList elements) {
    List<String> foundElementNames = new ArrayList<String>();
    EList<ApplicationElement> _elements = elements.getElements();
    for (final ApplicationElement element : _elements) {
      {
        String _name = element.getName();
        boolean _contains = foundElementNames.contains(_name);
        if (_contains) {
          String _name_1 = element.getName();
          String _format = String.format("Identifier \"%s\" has already been used", _name_1);
          this.error(_format, element, AppDslPackage.Literals.APPLICATION_ELEMENT__NAME);
        }
        String _name_2 = element.getName();
        foundElementNames.add(_name_2);
      }
    }
  }
  
  @Check
  public void checkForDuplicateButtonIdentifier(final ActivityLayoutAttribute layoutElements) {
    List<String> foundNames = new ArrayList<String>();
    EList<LayoutElement> _layoutElements = layoutElements.getLayoutElements();
    for (final LayoutElement element : _layoutElements) {
      if ((element instanceof Button)) {
        String buttonName = ((Button) element).getName();
        boolean _contains = foundNames.contains(buttonName);
        if (_contains) {
          String _format = String.format("Button name \"%s\" is not unique", buttonName);
          this.error(_format, element, 
            AppDslPackage.Literals.BUTTON__NAME);
        }
        foundNames.add(buttonName);
      }
    }
  }
  
  /**
   * General method to get attribute of application.
   */
  private <T extends Object> T getApplicationField(final Application application, final Class<T> resultClass) {
    EList<ApplicationAttribute> _attributes = application.getAttributes();
    Iterator<ApplicationAttribute> appIterator = _attributes.iterator();
    while (appIterator.hasNext()) {
      {
        ApplicationAttribute _next = appIterator.next();
        ApplicationAttribute attr = ((ApplicationAttribute) _next);
        Class<? extends ApplicationAttribute> _class = attr.getClass();
        boolean _isAssignableFrom = resultClass.isAssignableFrom(_class);
        if (_isAssignableFrom) {
          return ((T) attr);
        }
      }
    }
    return null;
  }
  
  /**
   * General method to handle duplicate searches in string lists. Calls the supplied
   * callback for each found duplicate.
   */
  private void findStringDuplicates(final EList<String> list, final AppDslValidator.DuplicateCallback callback) {
    List<String> foundIntents = new ArrayList<String>();
    int listIndex = 0;
    for (final String element : list) {
      {
        boolean _contains = foundIntents.contains(element);
        if (_contains) {
          callback.onDuplicateFound(element, listIndex);
        }
        foundIntents.add(element);
        listIndex++;
      }
    }
  }
}
