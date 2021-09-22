package com.datastructure.datastructures;

import java.util.Scanner;
/*
 * class to display prime numbers in given range
 * range is taken from user
 * if any number in that range has only 2 factors then that is prime number
 */
public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Starting Number : ");
		int start = sc.nextInt();
		System.out.print("Enter Ending Number : ");
		int end = sc.nextInt();
		if (start >= 0 && end <= 1000) {
			System.out.println("Prime numbers in the range " + start + " and " + end + " are : ");
			int count;
			// loop for finding and printing all prime numbers between given range
			for (int index = start; index <= end; index++) {
				//  checks if number is prime or not
				count = 0;
				for (int divisor = 1; divisor <= index; divisor++) {
					if (index % divisor == 0)
						count = count + 1;
				}
				if (count == 2)
					System.out.print(index + " ");

			}
		} else {
			System.out.println("Range should be within 0-1000");
		}
		sc.close();
	}
}
