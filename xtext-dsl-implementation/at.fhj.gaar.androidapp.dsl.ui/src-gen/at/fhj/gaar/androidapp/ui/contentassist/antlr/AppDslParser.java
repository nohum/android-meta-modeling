/*
* generated by Xtext
*/
package at.fhj.gaar.androidapp.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import at.fhj.gaar.androidapp.services.AppDslGrammarAccess;

public class AppDslParser extends AbstractContentAssistParser {
	
	@Inject
	private AppDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected at.fhj.gaar.androidapp.ui.contentassist.antlr.internal.InternalAppDslParser createParser() {
		at.fhj.gaar.androidapp.ui.contentassist.antlr.internal.InternalAppDslParser result = new at.fhj.gaar.androidapp.ui.contentassist.antlr.internal.InternalAppDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getApplicationAttributeAccess().getAlternatives(), "rule__ApplicationAttribute__Alternatives");
					put(grammarAccess.getApplicationElementAccess().getAlternatives(), "rule__ApplicationElement__Alternatives");
					put(grammarAccess.getActivityAttributeAccess().getAlternatives(), "rule__ActivityAttribute__Alternatives");
					put(grammarAccess.getBroadcastReceiverAttributeAccess().getAlternatives(), "rule__BroadcastReceiverAttribute__Alternatives");
					put(grammarAccess.getServiceAttributeAccess().getAlternatives(), "rule__ServiceAttribute__Alternatives");
					put(grammarAccess.getLayoutElementAccess().getAlternatives(), "rule__LayoutElement__Alternatives");
					put(grammarAccess.getButtonAttributeAccess().getAlternatives(), "rule__ButtonAttribute__Alternatives");
					put(grammarAccess.getLayoutElementClickActionAccess().getAlternatives(), "rule__LayoutElementClickAction__Alternatives");
					put(grammarAccess.getBroadcastReceiverActionAccess().getAlternatives(), "rule__BroadcastReceiverAction__Alternatives");
					put(grammarAccess.getAndroidAppProjectAccess().getGroup(), "rule__AndroidAppProject__Group__0");
					put(grammarAccess.getAndroidAppProjectAccess().getGroup_1(), "rule__AndroidAppProject__Group_1__0");
					put(grammarAccess.getApplicationAccess().getGroup(), "rule__Application__Group__0");
					put(grammarAccess.getApplicationAccess().getGroup_4(), "rule__Application__Group_4__0");
					put(grammarAccess.getApplicationMinSdkAccess().getGroup(), "rule__ApplicationMinSdk__Group__0");
					put(grammarAccess.getApplicationTargetSdkAccess().getGroup(), "rule__ApplicationTargetSdk__Group__0");
					put(grammarAccess.getApplicationCompileSdkAccess().getGroup(), "rule__ApplicationCompileSdk__Group__0");
					put(grammarAccess.getApplicationPermissionListAccess().getGroup(), "rule__ApplicationPermissionList__Group__0");
					put(grammarAccess.getApplicationPermissionListAccess().getGroup_3(), "rule__ApplicationPermissionList__Group_3__0");
					put(grammarAccess.getApplicationElementListAccess().getGroup(), "rule__ApplicationElementList__Group__0");
					put(grammarAccess.getApplicationElementListAccess().getGroup_3(), "rule__ApplicationElementList__Group_3__0");
					put(grammarAccess.getApplicationMainActivityAccess().getGroup(), "rule__ApplicationMainActivity__Group__0");
					put(grammarAccess.getActivityAccess().getGroup(), "rule__Activity__Group__0");
					put(grammarAccess.getActivityAccess().getGroup_4(), "rule__Activity__Group_4__0");
					put(grammarAccess.getBroadcastReceiverAccess().getGroup(), "rule__BroadcastReceiver__Group__0");
					put(grammarAccess.getBroadcastReceiverAccess().getGroup_4(), "rule__BroadcastReceiver__Group_4__0");
					put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
					put(grammarAccess.getServiceAccess().getGroup_4(), "rule__Service__Group_4__0");
					put(grammarAccess.getElementEnabledAttributeAccess().getGroup(), "rule__ElementEnabledAttribute__Group__0");
					put(grammarAccess.getElementExportedAttributeAccess().getGroup(), "rule__ElementExportedAttribute__Group__0");
					put(grammarAccess.getElementLabelAttributeAccess().getGroup(), "rule__ElementLabelAttribute__Group__0");
					put(grammarAccess.getElementIntentListAccess().getGroup(), "rule__ElementIntentList__Group__0");
					put(grammarAccess.getElementIntentListAccess().getGroup_3(), "rule__ElementIntentList__Group_3__0");
					put(grammarAccess.getActivityParentAttributeAccess().getGroup(), "rule__ActivityParentAttribute__Group__0");
					put(grammarAccess.getActivityLayoutAttributeAccess().getGroup(), "rule__ActivityLayoutAttribute__Group__0");
					put(grammarAccess.getActivityLayoutAttributeAccess().getGroup_3(), "rule__ActivityLayoutAttribute__Group_3__0");
					put(grammarAccess.getButtonAccess().getGroup(), "rule__Button__Group__0");
					put(grammarAccess.getButtonAccess().getGroup_4(), "rule__Button__Group_4__0");
					put(grammarAccess.getButtonLabelAttributeAccess().getGroup(), "rule__ButtonLabelAttribute__Group__0");
					put(grammarAccess.getButtonActionAttributeAccess().getGroup(), "rule__ButtonActionAttribute__Group__0");
					put(grammarAccess.getTextAccess().getGroup(), "rule__Text__Group__0");
					put(grammarAccess.getBroadcastReceiverActionAttributeAccess().getGroup(), "rule__BroadcastReceiverActionAttribute__Group__0");
					put(grammarAccess.getActionShowToastAccess().getGroup(), "rule__ActionShowToast__Group__0");
					put(grammarAccess.getActionStartActivityAccess().getGroup(), "rule__ActionStartActivity__Group__0");
					put(grammarAccess.getActionStartServiceAccess().getGroup(), "rule__ActionStartService__Group__0");
					put(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_0(), "rule__AndroidAppProject__ApplicationsAssignment_0");
					put(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_1_1(), "rule__AndroidAppProject__ApplicationsAssignment_1_1");
					put(grammarAccess.getApplicationAccess().getNameAssignment_1(), "rule__Application__NameAssignment_1");
					put(grammarAccess.getApplicationAccess().getAttributesAssignment_3(), "rule__Application__AttributesAssignment_3");
					put(grammarAccess.getApplicationAccess().getAttributesAssignment_4_1(), "rule__Application__AttributesAssignment_4_1");
					put(grammarAccess.getApplicationMinSdkAccess().getMinSdkAssignment_1(), "rule__ApplicationMinSdk__MinSdkAssignment_1");
					put(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkAssignment_1(), "rule__ApplicationTargetSdk__TargetSdkAssignment_1");
					put(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkAssignment_1(), "rule__ApplicationCompileSdk__CompileSdkAssignment_1");
					put(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_2(), "rule__ApplicationPermissionList__PermissionsAssignment_2");
					put(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_3_1(), "rule__ApplicationPermissionList__PermissionsAssignment_3_1");
					put(grammarAccess.getApplicationElementListAccess().getElementsAssignment_2(), "rule__ApplicationElementList__ElementsAssignment_2");
					put(grammarAccess.getApplicationElementListAccess().getElementsAssignment_3_1(), "rule__ApplicationElementList__ElementsAssignment_3_1");
					put(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityAssignment_1(), "rule__ApplicationMainActivity__LauncherActivityAssignment_1");
					put(grammarAccess.getActivityAccess().getNameAssignment_1(), "rule__Activity__NameAssignment_1");
					put(grammarAccess.getActivityAccess().getAttributesAssignment_3(), "rule__Activity__AttributesAssignment_3");
					put(grammarAccess.getActivityAccess().getAttributesAssignment_4_1(), "rule__Activity__AttributesAssignment_4_1");
					put(grammarAccess.getBroadcastReceiverAccess().getNameAssignment_1(), "rule__BroadcastReceiver__NameAssignment_1");
					put(grammarAccess.getBroadcastReceiverAccess().getAttributesAssignment_3(), "rule__BroadcastReceiver__AttributesAssignment_3");
					put(grammarAccess.getBroadcastReceiverAccess().getAttributesAssignment_4_1(), "rule__BroadcastReceiver__AttributesAssignment_4_1");
					put(grammarAccess.getServiceAccess().getNameAssignment_1(), "rule__Service__NameAssignment_1");
					put(grammarAccess.getServiceAccess().getAttributesAssignment_3(), "rule__Service__AttributesAssignment_3");
					put(grammarAccess.getServiceAccess().getAttributesAssignment_4_1(), "rule__Service__AttributesAssignment_4_1");
					put(grammarAccess.getElementEnabledAttributeAccess().getEnabledAssignment_1(), "rule__ElementEnabledAttribute__EnabledAssignment_1");
					put(grammarAccess.getElementExportedAttributeAccess().getExportedAssignment_1(), "rule__ElementExportedAttribute__ExportedAssignment_1");
					put(grammarAccess.getElementLabelAttributeAccess().getTitleAssignment_1(), "rule__ElementLabelAttribute__TitleAssignment_1");
					put(grammarAccess.getElementIntentListAccess().getIntentsAssignment_2(), "rule__ElementIntentList__IntentsAssignment_2");
					put(grammarAccess.getElementIntentListAccess().getIntentsAssignment_3_1(), "rule__ElementIntentList__IntentsAssignment_3_1");
					put(grammarAccess.getActivityParentAttributeAccess().getParentAssignment_1(), "rule__ActivityParentAttribute__ParentAssignment_1");
					put(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsAssignment_2(), "rule__ActivityLayoutAttribute__LayoutElementsAssignment_2");
					put(grammarAccess.getActivityLayoutAttributeAccess().getLayoutElementsAssignment_3_1(), "rule__ActivityLayoutAttribute__LayoutElementsAssignment_3_1");
					put(grammarAccess.getButtonAccess().getButtonNameAssignment_1(), "rule__Button__ButtonNameAssignment_1");
					put(grammarAccess.getButtonAccess().getAttributesAssignment_3(), "rule__Button__AttributesAssignment_3");
					put(grammarAccess.getButtonAccess().getAttributesAssignment_4_1(), "rule__Button__AttributesAssignment_4_1");
					put(grammarAccess.getButtonLabelAttributeAccess().getTitleAssignment_1(), "rule__ButtonLabelAttribute__TitleAssignment_1");
					put(grammarAccess.getButtonActionAttributeAccess().getActionAssignment_1(), "rule__ButtonActionAttribute__ActionAssignment_1");
					put(grammarAccess.getTextAccess().getTextAssignment_1(), "rule__Text__TextAssignment_1");
					put(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionAssignment_1(), "rule__BroadcastReceiverActionAttribute__ActionAssignment_1");
					put(grammarAccess.getActionShowToastAccess().getToastTextAssignment_1(), "rule__ActionShowToast__ToastTextAssignment_1");
					put(grammarAccess.getActionStartActivityAccess().getActivityAssignment_1(), "rule__ActionStartActivity__ActivityAssignment_1");
					put(grammarAccess.getActionStartServiceAccess().getServiceAssignment_1(), "rule__ActionStartService__ServiceAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			at.fhj.gaar.androidapp.ui.contentassist.antlr.internal.InternalAppDslParser typedParser = (at.fhj.gaar.androidapp.ui.contentassist.antlr.internal.InternalAppDslParser) parser;
			typedParser.entryRuleAndroidAppProject();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AppDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AppDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
