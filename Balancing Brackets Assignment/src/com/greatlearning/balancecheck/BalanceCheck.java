package com.greatlearning.balancecheck;

import java.util.Stack;

public class BalanceCheck {
	public boolean bracketBalanceCheck(String str) {
		char[] arr = str.toCharArray();
		Stack<Character> str1 = new Stack<Character>();
		char temp;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
				str1.push(arr[i]);
				continue;
			}
			if (str1.isEmpty())
				return false;

			switch (arr[i]) {
			case ')':
				temp = str1.pop();
				if (temp == '{' || temp == '[')
					return false;
				break;

			case '}':
				temp = str1.pop();
				if (temp == '(' || temp == '[')
					return false;
				break;

			case ']':
				temp = str1.pop();
				if (temp == '{' || temp == '(')
					return false;
				break;
			}
		}
		return str1.isEmpty();
	}
}