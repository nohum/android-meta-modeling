package at.fhj.gaar.androidapp.serializer;

import at.fhj.gaar.androidapp.appDsl.AndroidAppProject;
import at.fhj.gaar.androidapp.appDsl.AppDslPackage;
import at.fhj.gaar.androidapp.appDsl.Application;
import at.fhj.gaar.androidapp.appDsl.ApplicationCompileSdk;
import at.fhj.gaar.androidapp.appDsl.ApplicationElementList;
import at.fhj.gaar.androidapp.appDsl.ApplicationMainActivity;
import at.fhj.gaar.androidapp.appDsl.ApplicationMinSdk;
import at.fhj.gaar.androidapp.appDsl.ApplicationPermissionList;
import at.fhj.gaar.androidapp.appDsl.ApplicationTargetSdk;
import at.fhj.gaar.androidapp.appDsl.ApplicationTitle;
import at.fhj.gaar.androidapp.services.AppDslGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AppDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AppDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AppDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AppDslPackage.ANDROID_APP_PROJECT:
				if(context == grammarAccess.getAndroidAppProjectRule()) {
					sequence_AndroidAppProject(context, (AndroidAppProject) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.APPLICATION:
				if(context == grammarAccess.getApplicationRule()) {
					sequence_Application(context, (Application) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.APPLICATION_COMPILE_SDK:
				if(context == grammarAccess.getApplicationAttributeRule() ||
				   context == grammarAccess.getApplicationCompileSdkRule()) {
					sequence_ApplicationCompileSdk(context, (ApplicationCompileSdk) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.APPLICATION_ELEMENT_LIST:
				if(context == grammarAccess.getApplicationAttributeRule() ||
				   context == grammarAccess.getApplicationElementListRule()) {
					sequence_ApplicationElementList(context, (ApplicationElementList) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.APPLICATION_MAIN_ACTIVITY:
				if(context == grammarAccess.getApplicationAttributeRule() ||
				   context == grammarAccess.getApplicationMainActivityRule()) {
					sequence_ApplicationMainActivity(context, (ApplicationMainActivity) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.APPLICATION_MIN_SDK:
				if(context == grammarAccess.getApplicationAttributeRule() ||
				   context == grammarAccess.getApplicationMinSdkRule()) {
					sequence_ApplicationMinSdk(context, (ApplicationMinSdk) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.APPLICATION_PERMISSION_LIST:
				if(context == grammarAccess.getApplicationAttributeRule() ||
				   context == grammarAccess.getApplicationPermissionListRule()) {
					sequence_ApplicationPermissionList(context, (ApplicationPermissionList) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.APPLICATION_TARGET_SDK:
				if(context == grammarAccess.getApplicationAttributeRule() ||
				   context == grammarAccess.getApplicationTargetSdkRule()) {
					sequence_ApplicationTargetSdk(context, (ApplicationTargetSdk) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.APPLICATION_TITLE:
				if(context == grammarAccess.getApplicationAttributeRule() ||
				   context == grammarAccess.getApplicationTitleRule()) {
					sequence_ApplicationTitle(context, (ApplicationTitle) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (applications+=Application applications+=Application*)
	 */
	protected void sequence_AndroidAppProject(EObject context, AndroidAppProject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     compileSdk=INT
	 */
	protected void sequence_ApplicationCompileSdk(EObject context, ApplicationCompileSdk semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.APPLICATION_COMPILE_SDK__COMPILE_SDK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.APPLICATION_COMPILE_SDK__COMPILE_SDK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkINTTerminalRuleCall_1_0(), semanticObject.getCompileSdk());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=IntentStartable elements+=IntentStartable*)
	 */
	protected void sequence_ApplicationElementList(EObject context, ApplicationElementList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     launcherActivity=STRING
	 */
	protected void sequence_ApplicationMainActivity(EObject context, ApplicationMainActivity semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.APPLICATION_MAIN_ACTIVITY__LAUNCHER_ACTIVITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.APPLICATION_MAIN_ACTIVITY__LAUNCHER_ACTIVITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getApplicationMainActivityAccess().getLauncherActivitySTRINGTerminalRuleCall_1_0(), semanticObject.getLauncherActivity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     minSdk=INT
	 */
	protected void sequence_ApplicationMinSdk(EObject context, ApplicationMinSdk semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.APPLICATION_MIN_SDK__MIN_SDK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.APPLICATION_MIN_SDK__MIN_SDK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getApplicationMinSdkAccess().getMinSdkINTTerminalRuleCall_1_0(), semanticObject.getMinSdk());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (permissions+=Permission permissions+=Permission*)
	 */
	protected void sequence_ApplicationPermissionList(EObject context, ApplicationPermissionList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     targetSdk=INT
	 */
	protected void sequence_ApplicationTargetSdk(EObject context, ApplicationTargetSdk semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.APPLICATION_TARGET_SDK__TARGET_SDK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.APPLICATION_TARGET_SDK__TARGET_SDK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkINTTerminalRuleCall_1_0(), semanticObject.getTargetSdk());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     title=STRING
	 */
	protected void sequence_ApplicationTitle(EObject context, ApplicationTitle semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.APPLICATION_TITLE__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.APPLICATION_TITLE__TITLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getApplicationTitleAccess().getTitleSTRINGTerminalRuleCall_1_0(), semanticObject.getTitle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (packageName=PackageName attributes+=ApplicationAttribute attributes+=ApplicationAttribute*)
	 */
	protected void sequence_Application(EObject context, Application semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
