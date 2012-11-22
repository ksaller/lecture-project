/**
 */
package org.west.es.context.contextModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Classification</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.west.es.context.contextModel.ContextModelPackage#getClassification()
 * @model
 * @generated
 */
public enum Classification implements Enumerator {
	/**
	 * The '<em><b>UNBOUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNBOUND_VALUE
	 * @generated
	 * @ordered
	 */
	UNBOUND(0, "UNBOUND", "UNBOUND"),

	/**
	 * The '<em><b>ALIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ALIVE(1, "ALIVE", "ALIVE"),

	/**
	 * The '<em><b>DEAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEAD_VALUE
	 * @generated
	 * @ordered
	 */
	DEAD(2, "DEAD", "DEAD");

	/**
	 * The '<em><b>UNBOUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNBOUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNBOUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNBOUND_VALUE = 0;

	/**
	 * The '<em><b>ALIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALIVE_VALUE = 1;

	/**
	 * The '<em><b>DEAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEAD_VALUE = 2;

	/**
	 * An array of all the '<em><b>Classification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Classification[] VALUES_ARRAY =
		new Classification[] {
			UNBOUND,
			ALIVE,
			DEAD,
		};

	/**
	 * A public read-only list of all the '<em><b>Classification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Classification> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Classification</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Classification get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Classification result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Classification</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Classification getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Classification result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Classification</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Classification get(int value) {
		switch (value) {
			case UNBOUND_VALUE: return UNBOUND;
			case ALIVE_VALUE: return ALIVE;
			case DEAD_VALUE: return DEAD;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Classification(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Classification
