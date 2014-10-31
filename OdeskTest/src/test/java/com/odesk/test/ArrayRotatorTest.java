package com.odesk.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * @author francisco.ribeiro
 * 
 * JUnit test for ArrayRotator class
 * 
 */
public class ArrayRotatorTest  
{
	
	Object[] arrayToRotate = new Object[] {1,2,3,4,5,6};
	ArrayRotator app = new ArrayRotator();
    
    @Test
    public void rotateByNLowerThanArraySize() {
    	Object[] rotatedArray = app.rotate(arrayToRotate, 1);
    	assertArrayEquals(new Object[] {6, 1, 2, 3, 4, 5}, rotatedArray);
    	
    	rotatedArray = app.rotate(arrayToRotate, 5);
    	assertArrayEquals(new Object[] {2, 3, 4, 5, 6, 1}, rotatedArray);
    }
    
    @Test
    public void rotateByArraySizeShouldReturnTheSameArray() {
    	Object[] rotatedArray = app.rotate(arrayToRotate, 6);
    	assertArrayEquals(arrayToRotate, rotatedArray);
    }
    
    @Test
    public void rotatedByNHigherThanArraySize() {
    	Object[] rotatedArray = app.rotate(arrayToRotate, 7);
    	assertArrayEquals(new Object[] {6, 1, 2, 3, 4, 5}, rotatedArray);
    	
    	rotatedArray = app.rotate(arrayToRotate, 11);
    	assertArrayEquals(new Object[] {2, 3, 4, 5, 6, 1}, rotatedArray);
    }
    
    @Test
    public void rotateByZeroShouldReturnTheSameArray() {
    	Object[] rotatedArray = app.rotate(arrayToRotate, 0);
    	assertArrayEquals(arrayToRotate, rotatedArray);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void rotatedByNegativeShouldThrowException() {
    	app.rotate(arrayToRotate, -1);
    }
}
