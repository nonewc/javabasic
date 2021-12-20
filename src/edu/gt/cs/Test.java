package edu.gt.cs;

import java.util.Random;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
	
//		// edu.gt.cs.Test
//		// 패키지는 여러 개가 있을 수 있고 하나의 패키지 내에는 자바 클래스 파일을 여러 개 가질 수 있다.
//		// edu 패키지 아래에 gt 패키지 아래에 cs패키지 안에 Test라는 클래스가 위치하고 있다.
//		
//		
//		// 자바에서의 데이터 종류를 설명...
//		// 논리형 boolean은 true와 false 값을 가진다.
//		// 정수형에는 int long short byte이 있다.
//		// 실수형에는 double float이 있다.
//		// 문자형에는 char String이 있다.
//		
//		for(int i = 0; i <= 10 ; i++) {
//			
//			System.out.println(i);
//			
//		}
//		
//		// for 반복문으로서, integer 변수 i의 초깃값 0에서 1씩 증가하며 i를 출력한다. 
//		//이 때, i가 10보다 작거나 같은 동안에만 유효하며, 10 초과값을 가지면 탈출한다.
//		
//		// 작동예)
//		// i = 0, i <= 10 이므로 i 값 0을 출력 후 i = 0+1.
//		// i = 1, i <= 10 이므로 i 값 1을 출력 후 i = 1+1.
//		// i = 2, i <= 10 이므로 i 값 2을 출력 후 i = 2+1.
//		// i = 3, i <= 10 이므로 i 값 3을 출력 후 i = 3+1.
//		// i = 4, i <= 10 이므로 i 값 4을 출력 후 i = 4+1.
//		// i = 5, i <= 10 이므로 i 값 5을 출력 후 i = 5+1.
//		// i = 6, i <= 10 이므로 i 값 6을 출력 후 i = 6+1.
//		// i = 7, i <= 10 이므로 i 값 7을 출력 후 i = 7+1.
//		// i = 8, i <= 10 이므로 i 값 8을 출력 후 i = 8+1.
//		// i = 9, i <= 10 이므로 i 값 9을 출력 후 i = 9+1.
//		// i = 10, i <= 10 이므로 i 값 10을 출력 후 i = 10+1.
//		// i = 11, i <= 10 을 만족하지 못하므로 for문을 종료한다 .
//		
//		// 0
//		// 1
//		// ...
//		// 10
//		
//		
//		int [] n1 = new int[5];
//		// n1(변수:주소)에 {0,0,0,0,0} 	length(5)
//		
//		int[][] n2 = new int[2][2];
//		// n2(변수:주소)에 {{0,0},			length(2)
//		//				 (0,0}}
//		
//		int[] n3 = {1,2,3};
//		// n3(변수:주소)에 {1,2,3,}		length(3)
//
//		
//		
//		int x = 100;
//		int y = 200;
//		int z = x + y;
//		
//		// 메모리(ram)에 있는 변수들의 값을 cpu가 가지고 와서 "산술 연산"을 하여 다시 메모리에 저장한다.
//		
//		int age = 23;
//		String name = "kim";
//		String a = name + "의 나이는" + age;
//		
//		// 메모리(ram)에 있는 변수들의 값을 cpu가 가지고 와서 "결합 연산"을 하여 다시 메모리에 저장한다.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름을 입력하세요>>");		//-1
//		String name2 = sc.nextLine();			//-2
//		System.out.print("나이을 입력하세요>>");
//		int age2 = sc.nextInt();				//-3
//		
//		// sc라는 Scanner type의 객체를 만들어 매개 변수로 System 아래 있는 in을 설정해 입력을 받을 수 있게 한다.
//		// "이름을 입력하세요>>" 를 출력한다. 
//		// name2라는 String type 변수에 입력 받은 내용을 저장한다.
//		// "나이를 입력하세요>>" 를 출력한다.
//		// age2라는 int type 변수에 입력 받은 내용을 저장한다.
//		
//		//-1. 화면에 사용자로 하여금 입력하도록 프롬프트를 출력한다.
//		//-2. 사용자가 콘솔에서 스트링(문자열)으로 "입력"한 값을 변수 name에 저장한다.
//		//-3. 입력한 스트링(문자) 나이 데이터를 정수로 변경하여 age 변수에 저장한다.
//		
//		
//			String h = "안녕하세요"; //참고 : 한글은 한 글자가 2 byte 이다.
//		 // 10 byte(string) = 10 byte(char) = 총 20 byte 차지
//			
//		int n = Integer.parseInt("100");
//		Scanner sc2 = new Scanner(System.in);
//		Random r = new Random(10);
//		
//		// 100이라는 문자열(String)을 계산이 가능한 int 정수형으로 "변경(변환)"하여 변수명 n에 저장 
//		// System.in을 매개변수로 하는 sc2라는 이름의 Scanner type 객체를 생성해 사용자의 키보드 입력을
//		//	받을 수 있게 한다. >> 키보드 입력을 콘솔을 통해 받을 수 있는 Scanner 객체 sc를 생성
//		// integer 10을 매개변수 초깃값으로 하는 r이라는 이름의 Random type 객체를 생성한다.
//		// >> 시드 값 10으로 랜덤한 값을 생성할 수 있는 객체 r을 생성
		
		/***************** 서술형 끝 ******************/
		
		// -----------------
		// 당신의 정보를 입력하세요
		// -----------------
		// 당신의 부서는 >>>
		// 당신의 소속은 ___ 입니다.
		// 당신의 나이는 >>>
		// 당신의 작년 나이는 ___ 이였습니다.
		// 당신의 키는 >>>
		// 당신은 키가 (크다/보통이다/작다) // 키가 180 이상이면 크다. 170 이상이면 보통이다 160 이상이면 작다.
		
		
		// 프로젝트 명: p1
		// 패키지 명 : package2
		// 자바 파일 명 : Test1
		
		// 입력을 받기 위한 Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		
		// 프롬프터 출력
		System.out.println("-----------------\n 당신의 정보를 입력하세요.\n-----------------");
		System.out.println();
		
		System.out.print("당신의 부서는 >>> ");
		// 콘솔을 통한 부서명 입력 받기
		String dep = scan.nextLine();
		System.out.println("당신의 소속은 " + dep + "입니다.");
		
		System.out.print("당신의 나이는 >>> ");
		int age = scan.nextInt();
		System.out.printf("당신의 작년 나이는 %d이였습니다.%n",age-1);
		
		System.out.print("당신의 키는 >>> ");
		int height = scan.nextInt();
		
		if (height >= 180) {
			System.out.println("당신은 키가 크다.");
		} else if (height >= 170) {
			System.out.println("당신은 키가 보통이다.");
		} else {
		System.out.println("당신은 키가 작다.");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
		
	}
	
	