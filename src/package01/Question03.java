package package01;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		
		// 프로젝트 명 : p01
		// 패키지 명 : package 01
		// 자바 파일 명 : Question02.java
		
		
		String temp = ""; // 입력 받은 문자열을 담기 위한 스트링 변수 초기화
		int step = 0; // 입력 받은 문자열을 숫자로 담기 위한 정수형 변수 초기화
		
		Scanner scan = new Scanner(System.in); // 입력을 받기 위한 스캐너 타입 객체 생성
		
		System.out.print("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.\n단수는? : "); // 입력 받기 위한 메세지 출력
		
		temp = scan.nextLine(); // 콘솔을 통한 문자열 입력
		step = Integer.parseInt(temp); // 문자열을 숫자로 변환
				
		for (int i = 1 ; i <= step ; i++) { // for문 시작
			
			
			for (int j = 0; j < i ; j++) { // 이중for문 시작
				
				System.out.print("*"); // 별 출력
				
			} // 이중for문 종료
			
			System.out.println(); // 단수 구분 출력
			
		} // for 문 종료
		
		System.out.print("왼쪽 위가 직각이니 이등변 삼각형을 표시합니다.\n단수는? : "); // 입력 받기 위한 메세지 출력
		
		temp = scan.nextLine(); // 콘솔을 통한 문자열 입력
		step = Integer.parseInt(temp); // 문자열을 숫자로 변환
		
		for (int i = 1 ; i <= step ; i++) { // for 문 시작
			
			
			for (int j = 0; j <= step - i ; j++) { // 이중 for 문 시작
				
				System.out.print("*"); // 별 출력
				
			} // 이중for문 종료
			
			System.out.println(); // 단수 구분 출력
			
		} // for 문 종료
		
	}
	
	
	
}
