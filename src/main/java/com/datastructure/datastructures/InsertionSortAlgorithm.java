package com.datastructure.datastructures;

import java.util.Scanner;

/*
 * this calss implements Insertion Sort algorithm
 */
public class InsertionSortAlgorithm {
	/**
	 * method to sort the string array array is array of strings
	 */
	public static void inSort(String[] array) {
		int n = array.length;
		for (int i = 1; i < n; i++) {
			String key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j].compareTo(key) > 0) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter array elements");
		String[] array = new String[size];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.next();
		}
		sc.close();
		inSort(array);
	}
}
