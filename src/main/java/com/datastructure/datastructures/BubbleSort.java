package com.datastructure.datastructures;

import java.util.Scanner;

/*
 * class to sort given array in ascending order
 */
public class BubbleSort {

	/**
	 * sort method to sort an array in ascending array is an integer array ,given as
	 * parameter to this method temp is used to temporarily hold data during
	 * swapping
	 */
	public static void bubbleSort(int[] array) {
		int n = array.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter the array elements");
		int[] array = new int[size];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		bubbleSort(array);
	}
}