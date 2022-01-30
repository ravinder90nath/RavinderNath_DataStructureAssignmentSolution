package com.greateLearninglab3;

import java.util.Stack;

public class BalancingBrackets {
	
	public static boolean isBalanced(String bracket) {
		
		int len = bracket.length();
		
		if (len <=0 || len % 2 != 0) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < len; i++) {
			char currentCharacter = bracket.charAt(i);
			
			if (currentCharacter == '[' || currentCharacter == '{' || currentCharacter =='(') {
				stack.push(currentCharacter);
			}else if(!stack.isEmpty()) {
				if (currentCharacter == ']' || currentCharacter == '}' || currentCharacter == ')') {
					char top = stack.peek();
					boolean isParenthisis = top == '(' && currentCharacter == ')';
					boolean isFlower = top =='{' && currentCharacter =='}';
					boolean isSquare = top =='[' && currentCharacter == ']';
					
					if (isParenthisis || isFlower || isSquare) {
						stack.pop();
					}else {
						return false;
					}
				}else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Are these brackets are balanced : " + isBalanced("([{}])"));

	}

}
