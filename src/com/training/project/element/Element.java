package com.training.project.element;

public class Element {

	public static int[] insertElement(int[] array, int element, int position) {
	        if (position < 0 || position > array.length) {
	            throw new IllegalArgumentException("Неверная позиция для вставки элемента");
	        }
	        
	        int[] newArray = new int[array.length + 1];  

	       
	        for (int i = 0; i < position; i++) {
	            newArray[i] = array[i];
	        }

	        newArray[position] = element;  

	        
	        for (int i = position; i < array.length; i++) {
	            newArray[i + 1] = array[i];
	        }

	        return newArray;  
	}
}
