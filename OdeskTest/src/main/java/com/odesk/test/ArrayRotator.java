package com.odesk.test;


/**
 * @author francisco.ribeiro 
 * 
 * Class that is responsible to rotate Arrays
 */
public class ArrayRotator {
	public static void main(String[] args) {
		new ArrayRotator().rotate(new Object[] { 1, 2, 3 }, 50);
	}

	/**
	 * 
	 * @param array - array to be rotated
	 * @param positions - number of positions to rotate, it must be positive
	 * @return - rotatedArray
	 * 
	 * The method receives an array and rotates it by the given number of positions.
	 * If positions is negative it throws an IllegalArgumentException
	 * 
	 */
	public Object[] rotate(Object[] array, int positions) {

		if (positions < 0) {
			throw new IllegalArgumentException(
					"Position should be a positive number");
		}

		Object[] rotatedArray = new Object[array.length];
		if (positions >= array.length) {
			positions = positions % array.length;
		}
		for (int i = 0; i < array.length; i++) {
			int rotatedIndex = positions;
			int calculatedIndex = i + rotatedIndex;
			if (calculatedIndex >= array.length) {
				calculatedIndex = calculatedIndex - array.length;
				
			} 
			rotatedArray[calculatedIndex] = array[i];

		}

		return rotatedArray;
	}
}
