/*
 * generated by Xtext
 */
package at.fhj.gaar.androidapp.validation

import at.fhj.gaar.androidapp.appDsl.Activity
import at.fhj.gaar.androidapp.appDsl.ActivityAttribute
import at.fhj.gaar.androidapp.appDsl.ActivityLayoutAttribute
import at.fhj.gaar.androidapp.appDsl.AppDslPackage
import at.fhj.gaar.androidapp.appDsl.Application
import at.fhj.gaar.androidapp.appDsl.ApplicationAttribute
import at.fhj.gaar.androidapp.appDsl.ApplicationCompileSdk
import at.fhj.gaar.androidapp.appDsl.ApplicationElement
import at.fhj.gaar.androidapp.appDsl.ApplicationElementList
import at.fhj.gaar.androidapp.appDsl.ApplicationMinSdk
import at.fhj.gaar.androidapp.appDsl.ApplicationPermissionList
import at.fhj.gaar.androidapp.appDsl.ApplicationTargetSdk
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiver
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiverAttribute
import at.fhj.gaar.androidapp.appDsl.Button
import at.fhj.gaar.androidapp.appDsl.ElementIntentList
import at.fhj.gaar.androidapp.appDsl.LayoutElement
import at.fhj.gaar.androidapp.appDsl.Service
import at.fhj.gaar.androidapp.appDsl.ServiceAttribute
import java.util.ArrayList
import java.util.Iterator
import java.util.List
import java.util.logging.Logger
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.validation.Check
import at.fhj.gaar.androidapp.appDsl.PackageName

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class AppDslValidator extends AbstractAppDslValidator {

	private static Logger logger = Logger.getLogger("DslValidation");

	/**
	 * Every attribute in an application is only allowed once.
	 */
	@Check
    def void disallowDuplicateApplicationAttributes(Application application) {
    	var List<String> occuredAttrs = new ArrayList<String>();
    	
    	for (ApplicationAttribute attr : application.attributes) {
    		var String attrName = attr.class.name;
    		
    		if (occuredAttrs.contains(attrName)) {
    			error("This element occurred already in this application and must only occur once at most", attr, null);
			} else {
    			occuredAttrs.add(attrName);
    		}
    	}
    }
    
    /**
     * Every attribute in an element is only allowed once.
     * @todo refactoring
     */
    @Check
    def void disallowDuplicateElementAttributes(ApplicationElement element) {
		var List<String> occuredAttrs = new ArrayList<String>();
		
		if (element instanceof Activity) {
			for (ActivityAttribute attr : (element as Activity).attributes) {
	    		var String attrName = attr.class.name;
	    		
	    		if (occuredAttrs.contains(attrName)) {
	    			error("This element occurred already in this activity and must only occur once at most",
	    				attr, null
	    			);
				} else {
	    			occuredAttrs.add(attrName);
	    		}
    		}
		} else if (element instanceof Service) {
			for (ServiceAttribute attr : (element as Service).attributes) {
	    		var String attrName = attr.class.name;
	    		
	    		if (occuredAttrs.contains(attrName)) {
	    			error("This element occurred already in this service and must only occur once at most",
	    				attr, null
	    			);
				} else {
	    			occuredAttrs.add(attrName);
	    		}
    		}
		} else if (element instanceof BroadcastReceiver) {
			for (BroadcastReceiverAttribute attr : (element as BroadcastReceiver).attributes) {
	    		var String attrName = attr.class.name;
	    		
	    		if (occuredAttrs.contains(attrName)) {
	    			error("This element occurred already in this broadcast receiver and must only occur once at most",
	    				attr, null
	    			);
				} else {
	    			occuredAttrs.add(attrName);
	    		}
    		}
		}
    }

    @Check
    def void checkCompileSdkBounds(Application application) {
    	var ApplicationMinSdk minSdk = getApplicationField(application, typeof(ApplicationMinSdk));
    	if (minSdk == null) {
    		logger.info("checkCompileSdkBounds: no minSdk found");
    		return;
    	}
    	
    	var ApplicationCompileSdk compileSdk = getApplicationField(application, typeof(ApplicationCompileSdk));
    	if (compileSdk == null) {
    		logger.info("checkCompileSdkBounds: no compileSdk found");
    		return;
    	}
    	
    	if (compileSdk.compileSdk >= minSdk.minSdk) {
    		return;
    	}
    	
    	warning("compile-sdk should be higher or equal to min-sdk", compileSdk,
    		AppDslPackage.Literals::APPLICATION_COMPILE_SDK__COMPILE_SDK
    	);
    }
    
    @Check
    def void checkTargetSdkBounds(Application application) {	
		var ApplicationMinSdk minSdk = getApplicationField(application, typeof(ApplicationMinSdk));
    	if (minSdk == null) {
    		logger.info("checkTargetSdkBounds: no minSdk found");
    		return;
    	}
    	
    	var ApplicationTargetSdk targetSdk = getApplicationField(application,typeof(ApplicationTargetSdk));
    	if (targetSdk == null) {
    		logger.info("checkTargetSdkBounds: no targetSdk found");
    		return;
    	}
    	
    	if (targetSdk.targetSdk >= minSdk.minSdk) {
    		return;
    	}
    	
    	warning("target-sdk should be higher or equal to min-sdk", targetSdk,
    		AppDslPackage.Literals::APPLICATION_TARGET_SDK__TARGET_SDK
    	);
    }
    
    @Check
    def void checkForDuplicatePermission(ApplicationPermissionList permissions) {
    	findPackageNameDuplicates(permissions.permissions, [ name, index |
    		error("Permissions have to be unique",
    			AppDslPackage.Literals::APPLICATION_PERMISSION_LIST__PERMISSIONS, index
    		);
    	]);
    }
    
    @Check
    def void checkForDuplicateIntent(ElementIntentList intents) {
    	
    	
    	findPackageNameDuplicates(intents.intents, [ name, index |
    		error(String.format("Intent \"%s\" is not unique", name),
    			AppDslPackage.Literals::ELEMENT_INTENT_LIST__INTENTS, index
    		);
    	]);
    }
    
    @Check
    def void checkForDuplicateElementIdentifier(ApplicationElementList elements) {
    	var List<String> foundElementNames = new ArrayList<String>();

    	for (ApplicationElement element : elements.elements) {
    		if (foundElementNames.contains(element.name)) {
    			error(String.format("Identifier \"%s\" has already been used", element.name),
    				element, AppDslPackage.Literals::APPLICATION_ELEMENT__NAME
    			);
    		}
    		
    		foundElementNames.add(element.name);
    	}
    }
    
    @Check
    def void checkForDuplicateButtonIdentifier(ActivityLayoutAttribute layoutElements) {
    	var List<String> foundNames = new ArrayList<String>();

    	for (LayoutElement element : layoutElements.layoutElements) {
    		if (element instanceof Button) {
    			var String buttonName = (element as Button).name;

    			// button names must be unique within an activity
    			if (foundNames.contains(buttonName)) {
    				error(String.format("Button name \"%s\" is not unique", buttonName), element,
    					AppDslPackage.Literals::BUTTON__NAME
    				);
    			}
    			
    			foundNames.add(buttonName);
    		}
    	}
    }
    
    /**
     * General method to get attribute of application.
     */
    private def <T> T getApplicationField(Application application, Class<T> resultClass) {
    	var Iterator<ApplicationAttribute> appIterator = application.attributes.iterator();
    	
    	// okay, pull out the needed attribute
    	while (appIterator.hasNext()) {
    		var ApplicationAttribute attr = (appIterator.next() as ApplicationAttribute);
    		if (resultClass.isAssignableFrom(attr.class)) {
    			return attr as T;
    		}
    	}
    	
    	return null;
    }
    
    /**
     * General method to handle duplicate searches in string lists. Calls the supplied
     * callback for each found duplicate.
     */
    private def findPackageNameDuplicates(EList<PackageName> list, DuplicateCallback callback) {
    	var List<String> knownElements = new ArrayList<String>();
    	var int listIndex = 0;
    	
    	for (element : list) {
    		if (knownElements.contains(element)) {
    			callback.onDuplicateFound(element.name, listIndex);
    		}
    		
    		knownElements.add(element.name);
    		listIndex++;
    	}
    }
    
    private static interface DuplicateCallback {
    	public def void onDuplicateFound(String item, int index);
    }
}
