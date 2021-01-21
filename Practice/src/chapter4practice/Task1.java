package chapter4practice;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/* 1. 연산자와 두 수를 변수로 선언한 후 사칙연산이 수행되는 프로그램을 만들어라  (if - else 문)
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("연산을 할 두 숫자를 입력(숫자 사이에 한칸 공백)");
		int num1= scanner.nextInt();
		int num2= scanner.nextInt();
		
		System.out.println("연산자를 입력하시오");
		char op= scanner.next().charAt(0);
		
		int result= 0;
		if(op == '+') {
			result= num1 + num2;
			System.out.println("연산 결과: " + num1 + " " + op + " " + num2 +"= " + result);
		}
		else if(op == '-') {
			result= num1 - num2;
			System.out.println("연산 결과: " + num1 + " " + op + " " + num2 +"= " + result);
		}
		else if(op == '*') {
			result= num1 * num2;
			System.out.println("연산 결과: " + num1 + " " + op + " " + num2 +"= " + result);
		}
		else if(op == '/') {
			result= num1 / num2;
			System.out.println("연산 결과: " + num1 + " " + op + " " + num2 +"= " + result);
		}
		else {
			System.out.println("Error");
		}
		
		scanner.close();
		*/
		
		/* 2. 연산자와 두 수를 변수로 선언한 후 사칙연산이 수행되는 프로그램을 만들어라  (switch -case 문)  */
		Scanner scanner= new Scanner(System.in);
		System.out.println("연산 할 두 수를 입력하세요(숫자 사이에 한 칸 공백)");
		int num1= scanner.nextInt();
		int num2= scanner.nextInt();
		
		System.out.println("연산자를 입력하세요");
		char op= scanner.next().charAt(0);
		
		switch(op) {
			case '+':
				System.out.println(num1 + " + " + num2 + "= " + (num1+num2));
				break;
				
			case '-':
				System.out.println(num1 + " - " + num2 + "= " + (num1-num2));
				break;
				
			case '*':
				System.out.println(num1 + " x " + num2 + "= " + (num1*num2));
				break;
				
			case '/':
				if(num2 == 0) {
					System.out.println("분모가 0이 될 수는 없습니다.");
				}
				else {
					System.out.println(num1 + " / " + num2 + "= " + (num1/num2));
				}
				break;
				
			default:
				System.out.println("연산자를 다시 입력하세요");
		}
		scanner.close();
		
	}

}
