package chapter4practice;

import java.util.Scanner;

/* 홀수 값(줄의 갯수) 입력 후 다이아몬드를 입력한 홀수 값에 맞게 출력하는 프로그램을 만들어라
- 중간 줄 기준으로 중간보다 위는 아래로 내려올 떄마다 공백은 1 감소, *은 2증가 || 중간보다 아래는 아래로 내려올 때마다 공백은 1증가, *은 2감소
*/

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("줄의 수(홀수 값)을 입력하세요");
		int lineCount= scanner.nextInt();
		int spaceCount= (lineCount / 2) + 1;
		int starCount= 1;
		
		for(int i=0; i<lineCount; i++) {
			for(int j=0; j<spaceCount; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<starCount; j++) {
				System.out.print("*");
			}
			
			for(int j=0; j<spaceCount; j++) {
				System.out.print(" ");
			}
			
			if(i< lineCount/2) {
				spaceCount -= 1;
				starCount +=2;
			}
			else {
				spaceCount +=1;
				starCount -=2;
			}
			
			System.out.println();
			
		}
		
		scanner.close();
		
	}

}
