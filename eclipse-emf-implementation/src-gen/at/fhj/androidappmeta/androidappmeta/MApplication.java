/**
 */
package at.fhj.androidappmeta.androidappmeta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MApplication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.fhj.androidappmeta.androidappmeta.MApplication#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link at.fhj.androidappmeta.androidappmeta.MApplication#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link at.fhj.androidappmeta.androidappmeta.MApplication#getMinSdk <em>Min Sdk</em>}</li>
 *   <li>{@link at.fhj.androidappmeta.androidappmeta.MApplication#getTargetSdk <em>Target Sdk</em>}</li>
 *   <li>{@link at.fhj.androidappmeta.androidappmeta.MApplication#getName <em>Name</em>}</li>
 *   <li>{@link at.fhj.androidappmeta.androidappmeta.MApplication#getElements <em>Elements</em>}</li>
 *   <li>{@link at.fhj.androidappmeta.androidappmeta.MApplication#getLauncherActivity <em>Launcher Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.fhj.androidappmeta.androidappmeta.AndroidappmetaPackage#getMApplication()
 * @model
 * @generated
 */
public interface MApplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see at.fhj.androidappmeta.androidappmeta.AndroidappmetaPackage#getMApplication_PackageName()
	 * @model default="" required="true"
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link at.fhj.androidappmeta.androidappmeta.MApplication#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' reference list.
	 * The list contents are of type {@link at.fhj.androidappmeta.androidappmeta.MPermission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' reference list.
	 * @see at.fhj.androidappmeta.androidappmeta.AndroidappmetaPackage#getMApplication_Permissions()
	 * @model
	 * @generated
	 */
	EList<MPermission> getPermissions();

	/**
	 * Returns the value of the '<em><b>Min Sdk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Sdk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Sdk</em>' attribute.
	 * @see #setMinSdk(int)
	 * @see at.fhj.androidappmeta.androidappmeta.AndroidappmetaPackage#getMApplication_MinSdk()
	 * @model required="true"
	 * @generated
	 */
	int getMinSdk();

	/**
	 * Sets the value of the '{@link at.fhj.androidappmeta.androidappmeta.MApplication#getMinSdk <em>Min Sdk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Sdk</em>' attribute.
	 * @see #getMinSdk()
	 * @generated
	 */
	void setMinSdk(int value);

	/**
	 * Returns the value of the '<em><b>Target Sdk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Sdk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Sdk</em>' attribute.
	 * @see #setTargetSdk(int)
	 * @see at.fhj.androidappmeta.androidappmeta.AndroidappmetaPackage#getMApplication_TargetSdk()
	 * @model required="true"
	 * @generated
	 */
	int getTargetSdk();

	/**
	 * Sets the value of the '{@link at.fhj.androidappmeta.androidappmeta.MApplication#getTargetSdk <em>Target Sdk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Sdk</em>' attribute.
	 * @see #getTargetSdk()
	 * @generated
	 */
	void setTargetSdk(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.fhj.androidappmeta.androidappmeta.AndroidappmetaPackage#getMApplication_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.fhj.androidappmeta.androidappmeta.MApplication#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link at.fhj.androidappmeta.androidappmeta.MIntentStartable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see at.fhj.androidappmeta.androidappmeta.AndroidappmetaPackage#getMApplication_Elements()
	 * @model
	 * @generated
	 */
	EList<MIntentStartable> getElements();

	/**
	 * Returns the value of the '<em><b>Launcher Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Launcher Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launcher Activity</em>' reference.
	 * @see #setLauncherActivity(MActivity)
	 * @see at.fhj.androidappmeta.androidappmeta.AndroidappmetaPackage#getMApplication_LauncherActivity()
	 * @model required="true"
	 * @generated
	 */
	MActivity getLauncherActivity();

	/**
	 * Sets the value of the '{@link at.fhj.androidappmeta.androidappmeta.MApplication#getLauncherActivity <em>Launcher Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launcher Activity</em>' reference.
	 * @see #getLauncherActivity()
	 * @generated
	 */
	void setLauncherActivity(MActivity value);

} // MApplication
