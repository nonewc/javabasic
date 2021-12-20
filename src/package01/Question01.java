package package01;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {

//		// 크기 판별
//		
//		// 숫자를 입력하세요 >> 33
//		// 숫자를 입력하세요 >> 23
//		
//		// 앞 숫자가 큽니다.
//		// 계속 할까요? (계속: o, 중단: x):
//		
//		// 프로그램을 종료합니다.
//		// 시도 횟수 :		앞 숫자가 큰 경우 : 		뒷 숫자가 큰 경우 :
//		
//		
//		// 프로젝트 명 : p01
//		// 패키지 명 : package 01
//		// 자바 파일 명 : Question01.java
//		
//		
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
				
		
		
	
						
		int case1 = 0;
		int case2 = 0;
		String temp = "";
		char ox = 'o';
		
		
		
		while (ox == 'o') {
									
			
			System.out.print("\n숫자를 입력하세요 >> ");
			
			int firstNum = scan.nextInt();
			
			System.out.print("\n숫자를 입력하세요 >> ");
			
			int secondNum = scan.nextInt();
					
			if(firstNum > secondNum) {
				
				System.out.println("앞 숫자가 큽니다.");
				
				case1++;
				
				System.out.println("계속 할까요? (계속: o, 중단 : x)");
				temp = scan2.nextLine();
				ox = temp.charAt(0);
				
			} else if (secondNum > firstNum) {
				
				System.out.println("뒷 숫자가 큽니다.");
				
				case2++;
				
				System.out.println("계속 할까요? (계속: o, 중단 : x)");
				temp = scan2.nextLine();
				ox = temp.charAt(0);
				
			} else {
				
				System.out.println("두 숫자가 같습니다. 다시 입력해주세요.");				
			}
			
							
		} 
		
		
		System.out.println("프로그램을 종료합니다.");
		System.out.printf("시도 횟수 : %d\t 앞 숫자가 큰 경우 : %d\t 뒷 숫자가 큰 경우 : %d",(case1+case2),case1,case2);
		
//		
//		
//		
		
		/*
		 * int count = 0; // 전체 질문 횟수 변수 int fno = 0; // 앞 숫자 큰 경우 변수 int lno = 0; // 뒷
		 * 숫자 큰 경우 변수 char ox = 'o'; // 계속 진행 여부 변수
		 * 
		 * Scanner sc = new Scanner(System.in); // 입력 객체 생성
		 * 
		 * while (ox != 'x') { // 반복 구문 시작
		 * 
		 * System.out.print("숫자를 입력하세요>>"); // 입력 구문 int a = sc.nextInt();
		 * 
		 * System.out.print("숫자를 입력하세요>>"); // 입력 구문 int b = sc.nextInt();
		 * 
		 * 
		 * if(a>b) {
		 * 
		 * System.out.println("앞 숫자가 큽니다."); fno ++; count ++;
		 * 
		 * } else {
		 * 
		 * System.out.println("뒷 숫자가 큽니다."); fno ++; count ++; }
		 * 
		 * System.out.println("계속 할까요?(계속: o, 중단: x")); ox = (char) sc.nextInt();
		 * 
		 * }
		 * 
		 * System.out.println("프로그램을 종료합니다.");
		 * System.out.printf("시도 횟수 : %d\t 앞 숫자가 큰 경우 : %d\t 뒷 숫자가 큰 경우 : %d",count,fno,
		 * lno);
		 */
		
		
		
		
		
		
	}

}
