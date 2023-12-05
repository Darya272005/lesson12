package com.training.project.element;

public class Main {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		int[] newArray = Element.insertElement(array, 10, 2);

		for (int num : newArray) {
			System.out.print(num + " ");
		}

	}
}
