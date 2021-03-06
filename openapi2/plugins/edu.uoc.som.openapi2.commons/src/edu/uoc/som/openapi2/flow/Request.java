/**
 */
package edu.uoc.som.openapi2.flow;

import edu.uoc.som.openapi2.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.flow.Request#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi2.flow.OpenAPI2FlowPackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends Step {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see edu.uoc.som.openapi2.flow.OpenAPI2FlowPackage#getRequest_Operation()
	 * @model
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.flow.Request#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // Request
