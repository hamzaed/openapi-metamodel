/**
 */
package edu.uoc.som.openapi3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.ResponseDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.ResponseDefinition#getHeaders <em>Headers</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.ResponseDefinition#getExamples <em>Examples</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.ResponseDefinition#getCode <em>Code</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.ResponseDefinition#getDeclaringContext <em>Declaring Context</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi3.Openapi3Package#getResponseDefinition()
 * @model
 * @generated
 */
public interface ResponseDefinition extends SchemaContainer, SchemaContext {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getResponseDefinition_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.ResponseDefinition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi3.Header}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' containment reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getResponseDefinition_Headers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Header> getHeaders();

	/**
	 * Returns the value of the '<em><b>Examples</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.openapi3.Example}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examples</em>' containment reference list.
	 * @see edu.uoc.som.openapi3.Openapi3Package#getResponseDefinition_Examples()
	 * @model containment="true"
	 * @generated
	 */
	EList<Example> getExamples();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getResponseDefinition_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.ResponseDefinition#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Declaring Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaring Context</em>' reference.
	 * @see #setDeclaringContext(ResponseContainer)
	 * @see edu.uoc.som.openapi3.Openapi3Package#getResponseDefinition_DeclaringContext()
	 * @model
	 * @generated
	 */
	ResponseContainer getDeclaringContext();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi3.ResponseDefinition#getDeclaringContext <em>Declaring Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaring Context</em>' reference.
	 * @see #getDeclaringContext()
	 * @generated
	 */
	void setDeclaringContext(ResponseContainer value);

} // ResponseDefinition