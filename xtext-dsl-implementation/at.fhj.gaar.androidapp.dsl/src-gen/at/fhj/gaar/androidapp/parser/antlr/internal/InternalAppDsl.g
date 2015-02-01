/*
* generated by Xtext
*/
grammar InternalAppDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package at.fhj.gaar.androidapp.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package at.fhj.gaar.androidapp.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.fhj.gaar.androidapp.services.AppDslGrammarAccess;

}

@parser::members {

 	private AppDslGrammarAccess grammarAccess;
 	
    public InternalAppDslParser(TokenStream input, AppDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "AndroidAppProject";	
   	}
   	
   	@Override
   	protected AppDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleAndroidAppProject
entryRuleAndroidAppProject returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAndroidAppProjectRule()); }
	 iv_ruleAndroidAppProject=ruleAndroidAppProject 
	 { $current=$iv_ruleAndroidAppProject.current; } 
	 EOF 
;

// Rule AndroidAppProject
ruleAndroidAppProject returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_0_0()); 
	    }
		lv_applications_0_0=ruleApplication		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAndroidAppProjectRule());
	        }
       		add(
       			$current, 
       			"applications",
        		lv_applications_0_0, 
        		"Application");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_1=',' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAndroidAppProjectAccess().getCommaKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_1_1_0()); 
	    }
		lv_applications_2_0=ruleApplication		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAndroidAppProjectRule());
	        }
       		add(
       			$current, 
       			"applications",
        		lv_applications_2_0, 
        		"Application");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleApplication
entryRuleApplication returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getApplicationRule()); }
	 iv_ruleApplication=ruleApplication 
	 { $current=$iv_ruleApplication.current; } 
	 EOF 
;

// Rule Application
ruleApplication returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='application' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getApplicationAccess().getPackageNamePackageNameParserRuleCall_1_0()); 
	    }
		lv_packageName_1_0=rulePackageName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getApplicationRule());
	        }
       		set(
       			$current, 
       			"packageName",
        		lv_packageName_1_0, 
        		"PackageName");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_3_0()); 
	    }
		lv_attributes_3_0=ruleApplicationAttribute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getApplicationRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_3_0, 
        		"ApplicationAttribute");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getApplicationAccess().getCommaKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_4_1_0()); 
	    }
		lv_attributes_5_0=ruleApplicationAttribute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getApplicationRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_5_0, 
        		"ApplicationAttribute");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleClassName
entryRuleClassName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getClassNameRule()); } 
	 iv_ruleClassName=ruleClassName 
	 { $current=$iv_ruleClassName.current.getText(); }  
	 EOF 
;

// Rule ClassName
ruleClassName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_JAVA_IDENTIFIER_0=RULE_JAVA_IDENTIFIER    {
		$current.merge(this_JAVA_IDENTIFIER_0);
    }

    { 
    newLeafNode(this_JAVA_IDENTIFIER_0, grammarAccess.getClassNameAccess().getJAVA_IDENTIFIERTerminalRuleCall()); 
    }

    ;





// Entry rule entryRulePackageName
entryRulePackageName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getPackageNameRule()); } 
	 iv_rulePackageName=rulePackageName 
	 { $current=$iv_rulePackageName.current.getText(); }  
	 EOF 
;

// Rule PackageName
rulePackageName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_JAVA_IDENTIFIER_0=RULE_JAVA_IDENTIFIER    {
		$current.merge(this_JAVA_IDENTIFIER_0);
    }

    { 
    newLeafNode(this_JAVA_IDENTIFIER_0, grammarAccess.getPackageNameAccess().getJAVA_IDENTIFIERTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPackageNameAccess().getFullStopKeyword_1_0()); 
    }
    this_JAVA_IDENTIFIER_2=RULE_JAVA_IDENTIFIER    {
		$current.merge(this_JAVA_IDENTIFIER_2);
    }

    { 
    newLeafNode(this_JAVA_IDENTIFIER_2, grammarAccess.getPackageNameAccess().getJAVA_IDENTIFIERTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Entry rule entryRuleApplicationAttribute
entryRuleApplicationAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getApplicationAttributeRule()); }
	 iv_ruleApplicationAttribute=ruleApplicationAttribute 
	 { $current=$iv_ruleApplicationAttribute.current; } 
	 EOF 
;

// Rule ApplicationAttribute
ruleApplicationAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationTitleParserRuleCall_0()); 
    }
    this_ApplicationTitle_0=ruleApplicationTitle
    { 
        $current = $this_ApplicationTitle_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationMinSdkParserRuleCall_1()); 
    }
    this_ApplicationMinSdk_1=ruleApplicationMinSdk
    { 
        $current = $this_ApplicationMinSdk_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationTargetSdkParserRuleCall_2()); 
    }
    this_ApplicationTargetSdk_2=ruleApplicationTargetSdk
    { 
        $current = $this_ApplicationTargetSdk_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationCompileSdkParserRuleCall_3()); 
    }
    this_ApplicationCompileSdk_3=ruleApplicationCompileSdk
    { 
        $current = $this_ApplicationCompileSdk_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationPermissionListParserRuleCall_4()); 
    }
    this_ApplicationPermissionList_4=ruleApplicationPermissionList
    { 
        $current = $this_ApplicationPermissionList_4.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationElementListParserRuleCall_5()); 
    }
    this_ApplicationElementList_5=ruleApplicationElementList
    { 
        $current = $this_ApplicationElementList_5.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationMainActivityParserRuleCall_6()); 
    }
    this_ApplicationMainActivity_6=ruleApplicationMainActivity
    { 
        $current = $this_ApplicationMainActivity_6.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleApplicationTitle
entryRuleApplicationTitle returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getApplicationTitleRule()); }
	 iv_ruleApplicationTitle=ruleApplicationTitle 
	 { $current=$iv_ruleApplicationTitle.current; } 
	 EOF 
;

// Rule ApplicationTitle
ruleApplicationTitle returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='title' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getApplicationTitleAccess().getTitleKeyword_0());
    }
(
(
		lv_title_1_0=RULE_STRING
		{
			newLeafNode(lv_title_1_0, grammarAccess.getApplicationTitleAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getApplicationTitleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"title",
        		lv_title_1_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleApplicationMinSdk
entryRuleApplicationMinSdk returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getApplicationMinSdkRule()); }
	 iv_ruleApplicationMinSdk=ruleApplicationMinSdk 
	 { $current=$iv_ruleApplicationMinSdk.current; } 
	 EOF 
;

// Rule ApplicationMinSdk
ruleApplicationMinSdk returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='min-sdk' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getApplicationMinSdkAccess().getMinSdkKeyword_0());
    }
(
(
		lv_minSdk_1_0=RULE_INT
		{
			newLeafNode(lv_minSdk_1_0, grammarAccess.getApplicationMinSdkAccess().getMinSdkINTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getApplicationMinSdkRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"minSdk",
        		lv_minSdk_1_0, 
        		"INT");
	    }

)
))
;





// Entry rule entryRuleApplicationTargetSdk
entryRuleApplicationTargetSdk returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getApplicationTargetSdkRule()); }
	 iv_ruleApplicationTargetSdk=ruleApplicationTargetSdk 
	 { $current=$iv_ruleApplicationTargetSdk.current; } 
	 EOF 
;

// Rule ApplicationTargetSdk
ruleApplicationTargetSdk returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='target-sdk' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getApplicationTargetSdkAccess().getTargetSdkKeyword_0());
    }
(
(
		lv_targetSdk_1_0=RULE_INT
		{
			newLeafNode(lv_targetSdk_1_0, grammarAccess.getApplicationTargetSdkAccess().getTargetSdkINTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getApplicationTargetSdkRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"targetSdk",
        		lv_targetSdk_1_0, 
        		"INT");
	    }

)
))
;





// Entry rule entryRuleApplicationCompileSdk
entryRuleApplicationCompileSdk returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getApplicationCompileSdkRule()); }
	 iv_ruleApplicationCompileSdk=ruleApplicationCompileSdk 
	 { $current=$iv_ruleApplicationCompileSdk.current; } 
	 EOF 
;

// Rule ApplicationCompileSdk
ruleApplicationCompileSdk returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='compile-sdk' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getApplicationCompileSdkAccess().getCompileSdkKeyword_0());
    }
(
(
		lv_compileSdk_1_0=RULE_INT
		{
			newLeafNode(lv_compileSdk_1_0, grammarAccess.getApplicationCompileSdkAccess().getCompileSdkINTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getApplicationCompileSdkRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"compileSdk",
        		lv_compileSdk_1_0, 
        		"INT");
	    }

)
))
;





// Entry rule entryRuleApplicationPermissionList
entryRuleApplicationPermissionList returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getApplicationPermissionListRule()); }
	 iv_ruleApplicationPermissionList=ruleApplicationPermissionList 
	 { $current=$iv_ruleApplicationPermissionList.current; } 
	 EOF 
;

// Rule ApplicationPermissionList
ruleApplicationPermissionList returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='permissions' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getApplicationPermissionListAccess().getPermissionsKeyword_0());
    }
	otherlv_1='[' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getApplicationPermissionListAccess().getLeftSquareBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_2_0()); 
	    }
		lv_permissions_2_0=rulePermission		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getApplicationPermissionListRule());
	        }
       		add(
       			$current, 
       			"permissions",
        		lv_permissions_2_0, 
        		"Permission");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getApplicationPermissionListAccess().getCommaKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_3_1_0()); 
	    }
		lv_permissions_4_0=rulePermission		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getApplicationPermissionListRule());
	        }
       		add(
       			$current, 
       			"permissions",
        		lv_permissions_4_0, 
        		"Permission");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_5=']' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getApplicationPermissionListAccess().getRightSquareBracketKeyword_4());
    }
)
;





// Entry rule entryRuleApplicationElementList
entryRuleApplicationElementList returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getApplicationElementListRule()); }
	 iv_ruleApplicationElementList=ruleApplicationElementList 
	 { $current=$iv_ruleApplicationElementList.current; } 
	 EOF 
;

// Rule ApplicationElementList
ruleApplicationElementList returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='elements' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getApplicationElementListAccess().getElementsKeyword_0());
    }
	otherlv_1='[' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getApplicationElementListAccess().getLeftSquareBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_2_0()); 
	    }
		lv_elements_2_0=ruleApplicationElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getApplicationElementListRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_2_0, 
        		"ApplicationElement");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getApplicationElementListAccess().getCommaKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_3_1_0()); 
	    }
		lv_elements_4_0=ruleApplicationElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getApplicationElementListRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_4_0, 
        		"ApplicationElement");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_5=']' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getApplicationElementListAccess().getRightSquareBracketKeyword_4());
    }
)
;





// Entry rule entryRuleApplicationMainActivity
entryRuleApplicationMainActivity returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getApplicationMainActivityRule()); }
	 iv_ruleApplicationMainActivity=ruleApplicationMainActivity 
	 { $current=$iv_ruleApplicationMainActivity.current; } 
	 EOF 
;

// Rule ApplicationMainActivity
ruleApplicationMainActivity returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='main-activity' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getApplicationMainActivityAccess().getMainActivityKeyword_0());
    }
(
(
		lv_launcherActivity_1_0=RULE_STRING
		{
			newLeafNode(lv_launcherActivity_1_0, grammarAccess.getApplicationMainActivityAccess().getLauncherActivitySTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getApplicationMainActivityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"launcherActivity",
        		lv_launcherActivity_1_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRulePermission
entryRulePermission returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getPermissionRule()); } 
	 iv_rulePermission=rulePermission 
	 { $current=$iv_rulePermission.current.getText(); }  
	 EOF 
;

// Rule Permission
rulePermission returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getPermissionAccess().getPackageNameParserRuleCall()); 
    }
    this_PackageName_0=rulePackageName    {
		$current.merge(this_PackageName_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    ;





// Entry rule entryRuleApplicationElement
entryRuleApplicationElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getApplicationElementRule()); }
	 iv_ruleApplicationElement=ruleApplicationElement 
	 { $current=$iv_ruleApplicationElement.current; } 
	 EOF 
;

// Rule ApplicationElement
ruleApplicationElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getApplicationElementAccess().getActivityParserRuleCall_0()); 
    }
    this_Activity_0=ruleActivity
    { 
        $current = $this_Activity_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getApplicationElementAccess().getBroadcastReceiverParserRuleCall_1()); 
    }
    this_BroadcastReceiver_1=ruleBroadcastReceiver
    { 
        $current = $this_BroadcastReceiver_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getApplicationElementAccess().getServiceParserRuleCall_2()); 
    }
    this_Service_2=ruleService
    { 
        $current = $this_Service_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleActivity
entryRuleActivity returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActivityRule()); }
	 iv_ruleActivity=ruleActivity 
	 { $current=$iv_ruleActivity.current; } 
	 EOF 
;

// Rule Activity
ruleActivity returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='activity' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActivityAccess().getClassNameClassNameParserRuleCall_1_0()); 
	    }
		lv_className_1_0=ruleClassName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActivityRule());
	        }
       		set(
       			$current, 
       			"className",
        		lv_className_1_0, 
        		"ClassName");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActivityAccess().getAttributesActivityAttributeParserRuleCall_3_0()); 
	    }
		lv_attributes_3_0=ruleActivityAttribute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActivityRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_3_0, 
        		"ActivityAttribute");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getCommaKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActivityAccess().getAttributesActivityAttributeParserRuleCall_4_1_0()); 
	    }
		lv_attributes_5_0=ruleActivityAttribute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActivityRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_5_0, 
        		"ActivityAttribute");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleBroadcastReceiver
entryRuleBroadcastReceiver returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBroadcastReceiverRule()); }
	 iv_ruleBroadcastReceiver=ruleBroadcastReceiver 
	 { $current=$iv_ruleBroadcastReceiver.current; } 
	 EOF 
;

// Rule BroadcastReceiver
ruleBroadcastReceiver returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='receiver' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getBroadcastReceiverAccess().getReceiverKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBroadcastReceiverAccess().getClassNameClassNameParserRuleCall_1_0()); 
	    }
		lv_className_1_0=ruleClassName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBroadcastReceiverRule());
	        }
       		set(
       			$current, 
       			"className",
        		lv_className_1_0, 
        		"ClassName");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getBroadcastReceiverAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBroadcastReceiverAccess().getAttributesBroadcastReceiverAttributeParserRuleCall_3_0()); 
	    }
		lv_attributes_3_0=ruleBroadcastReceiverAttribute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBroadcastReceiverRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_3_0, 
        		"BroadcastReceiverAttribute");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getBroadcastReceiverAccess().getCommaKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBroadcastReceiverAccess().getAttributesBroadcastReceiverAttributeParserRuleCall_4_1_0()); 
	    }
		lv_attributes_5_0=ruleBroadcastReceiverAttribute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBroadcastReceiverRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_5_0, 
        		"BroadcastReceiverAttribute");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getBroadcastReceiverAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleService
entryRuleService returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getServiceRule()); }
	 iv_ruleService=ruleService 
	 { $current=$iv_ruleService.current; } 
	 EOF 
;

// Rule Service
ruleService returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='service' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getServiceAccess().getClassNameClassNameParserRuleCall_1_0()); 
	    }
		lv_className_1_0=ruleClassName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getServiceRule());
	        }
       		set(
       			$current, 
       			"className",
        		lv_className_1_0, 
        		"ClassName");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getServiceAccess().getAttributesServiceAttributeParserRuleCall_3_0()); 
	    }
		lv_attributes_3_0=ruleServiceAttribute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getServiceRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_3_0, 
        		"ServiceAttribute");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getCommaKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getServiceAccess().getAttributesServiceAttributeParserRuleCall_4_1_0()); 
	    }
		lv_attributes_5_0=ruleServiceAttribute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getServiceRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_5_0, 
        		"ServiceAttribute");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleActivityAttribute
entryRuleActivityAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActivityAttributeRule()); }
	 iv_ruleActivityAttribute=ruleActivityAttribute 
	 { $current=$iv_ruleActivityAttribute.current; } 
	 EOF 
;

// Rule ActivityAttribute
ruleActivityAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getActivityAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
    }
    this_ElementEnabledAttribute_0=ruleElementEnabledAttribute
    { 
        $current = $this_ElementEnabledAttribute_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getActivityAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
    }
    this_ElementExportedAttribute_1=ruleElementExportedAttribute
    { 
        $current = $this_ElementExportedAttribute_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleBroadcastReceiverAttribute
entryRuleBroadcastReceiverAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBroadcastReceiverAttributeRule()); }
	 iv_ruleBroadcastReceiverAttribute=ruleBroadcastReceiverAttribute 
	 { $current=$iv_ruleBroadcastReceiverAttribute.current; } 
	 EOF 
;

// Rule BroadcastReceiverAttribute
ruleBroadcastReceiverAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getBroadcastReceiverAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
    }
    this_ElementEnabledAttribute_0=ruleElementEnabledAttribute
    { 
        $current = $this_ElementEnabledAttribute_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getBroadcastReceiverAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
    }
    this_ElementExportedAttribute_1=ruleElementExportedAttribute
    { 
        $current = $this_ElementExportedAttribute_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleServiceAttribute
entryRuleServiceAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getServiceAttributeRule()); }
	 iv_ruleServiceAttribute=ruleServiceAttribute 
	 { $current=$iv_ruleServiceAttribute.current; } 
	 EOF 
;

// Rule ServiceAttribute
ruleServiceAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getServiceAttributeAccess().getElementEnabledAttributeParserRuleCall_0()); 
    }
    this_ElementEnabledAttribute_0=ruleElementEnabledAttribute
    { 
        $current = $this_ElementEnabledAttribute_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getServiceAttributeAccess().getElementExportedAttributeParserRuleCall_1()); 
    }
    this_ElementExportedAttribute_1=ruleElementExportedAttribute
    { 
        $current = $this_ElementExportedAttribute_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleElementEnabledAttribute
entryRuleElementEnabledAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getElementEnabledAttributeRule()); }
	 iv_ruleElementEnabledAttribute=ruleElementEnabledAttribute 
	 { $current=$iv_ruleElementEnabledAttribute.current; } 
	 EOF 
;

// Rule ElementEnabledAttribute
ruleElementEnabledAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='enabled' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getElementEnabledAttributeAccess().getEnabledKeyword_0());
    }
(
(
		lv_enabled_1_0=RULE_BOOLEAN
		{
			newLeafNode(lv_enabled_1_0, grammarAccess.getElementEnabledAttributeAccess().getEnabledBOOLEANTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getElementEnabledAttributeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"enabled",
        		lv_enabled_1_0, 
        		"BOOLEAN");
	    }

)
))
;





// Entry rule entryRuleElementExportedAttribute
entryRuleElementExportedAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getElementExportedAttributeRule()); }
	 iv_ruleElementExportedAttribute=ruleElementExportedAttribute 
	 { $current=$iv_ruleElementExportedAttribute.current; } 
	 EOF 
;

// Rule ElementExportedAttribute
ruleElementExportedAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='exported' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getElementExportedAttributeAccess().getExportedKeyword_0());
    }
(
(
		lv_exported_1_0=RULE_BOOLEAN
		{
			newLeafNode(lv_exported_1_0, grammarAccess.getElementExportedAttributeAccess().getExportedBOOLEANTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getElementExportedAttributeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"exported",
        		lv_exported_1_0, 
        		"BOOLEAN");
	    }

)
))
;





RULE_BOOLEAN : ('true'|'false'|'TRUE'|'FALSE');

RULE_JAVA_IDENTIFIER : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


