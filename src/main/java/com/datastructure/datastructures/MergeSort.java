package com.datastructure.datastructures;

import java.util.*;

import java.util.Scanner;

/*
 * this class implements merge sort algorithm
 */
public class MergeSort {
	/**
	 * merges two sub arrays arr string array start start index mid middle index end
	 * end index
	 */
	public static void merge(String[] arr, int start, int mid, int end) {
		// Find sizes of two subarrays to be merged
		int n1 = mid - start + 1;
		int n2 = end - mid;
		/* Create temp arrays */
		String Left[] = new String[n1];
		String Right[] = new String[n2];
		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			Left[i] = arr[start + i];
		for (int j = 0; j < n2; ++j)
			Right[j] = arr[mid + 1 + j];
		int i = 0, j = 0;
		int k = start;
		while (i < n1 && j < n2) {
			if (Left[i].compareTo(Right[j]) <= 0) {
				arr[k] = Left[i];
				i++;
			} else {
				arr[k] = Right[j];
				j++;
			}
			k++;
		}
		/* Copy remaining elements of Left[] if any */
		while (i < n1) {
			arr[k] = Left[i];
			i++;
			k++;
		}
		/* Copy remaining elements of Right[] if any */
		while (j < n2) {
			arr[k] = Right[j];
			j++;
			k++;
		}
	}

	/**
	 * merge sort method arr is a string array start is a start index end is a end
	 * index
	 */
	public static void sort(String[] arr, int start, int end) {
		if (start < end) {
			int m = (start + end) / 2;
			// Sort first and second halves
			sort(arr, start, m);
			sort(arr, m + 1, end);
			// Merge the sorted halves
			merge(arr, start, m, end);
		}
	}

	/* A utility function to print array of size n */
	static void printArray(String[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
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
		int l = 0;
		int r = array.length - 1;
		sort(array, l, r);
		printArray(array);
	}
}