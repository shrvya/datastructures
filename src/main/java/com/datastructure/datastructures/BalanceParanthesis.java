package com.datastructure.datastructures;

import java.util.Stack;

/*
 * class to see if mathematical expression is balanced
 */
public class BalanceParanthesis {
	/*
	 * Function to check for parenthesis is balanced or not sequence the String
	 * containing arithmetic expression which needs to be checked method returns
	 * true if its balanced or false if its not balanced
	 */
	static boolean check(String sequence) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < sequence.length(); i++) {
			/*
			 * push open parenthesis “(“ and pop closed parenthesis “)”. At the End of the
			 * Expression if the Stack is Empty then the Arithmetic Expression is Balanced.
			 */
			char c = sequence.charAt(i);
			if (c == '(')
				st.push(sequence.charAt(i));
			else if (c == ')')
				st.pop();
		}
		return st.isEmpty();
	}

	public static void main(String[] args) {

		String sequence = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3";
		String result = (check(sequence)) ? "Balanced" : "Not Balanced";
		System.out.println(result);
	}
}