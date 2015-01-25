/**
 */
package at.fhj.androidappmeta.androidappmeta.util;

import at.fhj.androidappmeta.androidappmeta.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.fhj.androidappmeta.androidappmeta.AndroidappmetaPackage
 * @generated
 */
public class AndroidappmetaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AndroidappmetaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndroidappmetaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AndroidappmetaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndroidappmetaSwitch<Adapter> modelSwitch =
		new AndroidappmetaSwitch<Adapter>() {
			@Override
			public Adapter caseMApplication(MApplication object) {
				return createMApplicationAdapter();
			}
			@Override
			public Adapter caseMPermission(MPermission object) {
				return createMPermissionAdapter();
			}
			@Override
			public Adapter caseMIntent(MIntent object) {
				return createMIntentAdapter();
			}
			@Override
			public Adapter caseMIntentStartable(MIntentStartable object) {
				return createMIntentStartableAdapter();
			}
			@Override
			public Adapter caseMActivity(MActivity object) {
				return createMActivityAdapter();
			}
			@Override
			public Adapter caseMService(MService object) {
				return createMServiceAdapter();
			}
			@Override
			public Adapter caseMBroadcastReceiver(MBroadcastReceiver object) {
				return createMBroadcastReceiverAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link at.fhj.androidappmeta.androidappmeta.MApplication <em>MApplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.fhj.androidappmeta.androidappmeta.MApplication
	 * @generated
	 */
	public Adapter createMApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.fhj.androidappmeta.androidappmeta.MPermission <em>MPermission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.fhj.androidappmeta.androidappmeta.MPermission
	 * @generated
	 */
	public Adapter createMPermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.fhj.androidappmeta.androidappmeta.MIntent <em>MIntent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.fhj.androidappmeta.androidappmeta.MIntent
	 * @generated
	 */
	public Adapter createMIntentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.fhj.androidappmeta.androidappmeta.MIntentStartable <em>MIntent Startable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.fhj.androidappmeta.androidappmeta.MIntentStartable
	 * @generated
	 */
	public Adapter createMIntentStartableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.fhj.androidappmeta.androidappmeta.MActivity <em>MActivity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.fhj.androidappmeta.androidappmeta.MActivity
	 * @generated
	 */
	public Adapter createMActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.fhj.androidappmeta.androidappmeta.MService <em>MService</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.fhj.androidappmeta.androidappmeta.MService
	 * @generated
	 */
	public Adapter createMServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.fhj.androidappmeta.androidappmeta.MBroadcastReceiver <em>MBroadcast Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.fhj.androidappmeta.androidappmeta.MBroadcastReceiver
	 * @generated
	 */
	public Adapter createMBroadcastReceiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AndroidappmetaAdapterFactory
