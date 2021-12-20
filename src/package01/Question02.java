package package01;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		// 원하는 기호를 입력하세요 >> @
		// 원하는 횟수를 입력하세요 >> 5
		// @@@@@
		
		// 1) 증가  2) 감소  3) 종료 >> 1 
		// 1) 카운트 : 1
		// 1) 증가  2) 감소  3) 종료  >> 1
		// 1) 카운트 : 2
		// 1) 증가  2) 감소  3) 종료  >> 2
		// 1) 카운트 : 1
		// 1) 증가  2) 감소  3) 종료  >> 1
		// 1) 카운트 : 2
		// 1) 증가  2) 감소  3) 종료  >> 3
		// 1) 프로그램 종료		최종 카운트 : 2

		
		
		
		
		// 프로젝트 명 : p01
		// 패키지 명 : package 01
		// 자바 파일 명 : Question02.java
		
		
		Scanner scan = new Scanner(System.in); // 사용자 입력을 위한 스캐너 타입 객체 생성
		
		String sign = ""; // 표시할 기호를 담을 스트링 변수 초기화
		int num = 0; // 횟수를 담을 정수형 변수 초기화
		
		System.out.print("원하는 기호를 입력하세요 >> "); // 기호 입력 메세지 출력
		
		sign = scan.nextLine(); // 콘솔을 통해 sign 변수에 입력
		
		System.out.print("원하는 횟수를 입력하세요 >> "); // 횟수 입력 메세지 출력
		
		num = scan.nextInt(); // 콘솔을 통해 num 변수에 입력
		
		int i = 0; // while 구문 반복을 위한 임시 변수 i 초기화
		
		while (i < num) { // while 구문 시작, i < num 인 조건 하에서 반복
			
			System.out.print(sign); // 기호출력
			
			i++; // i = i + 1
		} // while 구문 끝
		
		System.out.println(); // 다음 문제 작성을 위한 줄바꿈
		
		/**/
		
		int num2 = 0; // 사용자 입력 숫자를 받기 위한 정수형 변수 초기화
		int count = 0; // 결과값 출력을 위한 정수형 변수 초기화
		
		
		while(num2 != 3) { // while 구문 시작, num2 != 3 조건 하에서 반복
			
			System.out.print("1) 증가  2) 감소  3) 종료 >> "); // 입력을 위한 메세지 출력
			
			num2 = scan.nextInt(); // 콘솔을 통해 num2 변수에 사용자 입력값 입력
			
			if(num2 == 1) { // num2 변수 구분을 위한 if문 시작
				
				count++; // 결과값 연산
				System.out.println("카운트 : "+count); // 결과값 출력
				
			} else if(num2 == 2) { // num2 변수 구분을 위한 else if
				 
				count--; // 결과값 연산
				System.out.println("카운트 : "+count); // 결과값 출력
			} // if 문 종료
			
		} // while 문 종료
		
		System.out.println("프로그램 종료\t최종 카운트 : "+count); // 최종 결과값 출력
		
		
	}
	
}
