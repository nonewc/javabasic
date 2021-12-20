package package01;

import java.util.Scanner;

public class PreExam {

/*
	1) 패키지 설명
	
		클래스를 분류하기 위한 폴더에 대응되는 개념으로, 한 프로젝트 안에 패키지는 여러 개 생성 할 수 있고 한 패키지 안에 클래스 역시 여러 개 생성 할 수 있다.
	
	2) 데이터 종류 설명
	
		integer; 정수형 : int, long, short, byte
		실수형 : double, float
		문자형 : char, String
		boolean; 논리형 : true, false
		
	3) for(int i = 0; i <=5 ; i++) {
		System.out.println(i);
	}
	
	0부터 구문 실행 당 1씩 커지는 정수형 변수 i에 대하여 i가 5보다 작은 동안, 구문 내용을 반복한다.
	
	 실행 예)
	 
	 i = 0 : i<=5 을 만족하므로, i 값 0을 출력하고 줄바꿈 한 뒤, i = i + 1 이 된다.
	 i = 1 : i<=5 을 만족하므로, i 값 1을 출력하고 줄바꿈 한 뒤, i = i + 1 이 된다.
	 i = 2 : i<=5 을 만족하므로, i 값 2을 출력하고 줄바꿈 한 뒤, i = i + 1 이 된다.
	 i = 3 : i<=5 을 만족하므로, i 값 3을 출력하고 줄바꿈 한 뒤, i = i + 1 이 된다.
	 i = 4 : i<=5 을 만족하므로, i 값 4을 출력하고 줄바꿈 한 뒤, i = i + 1 이 된다.
	 i = 5 : i<=5 을 만족하므로, i 값 5을 출력하고 줄바꿈 한 뒤, i = i + 1 이 된다.
	 i = 6 : i<=5 을 만족하지 않으므로, for 구문이 종료된다.
	 
	 결과)
	 0
	 1
	 2
	 3
	 4
	 5
	 	
	
	4) 
	int [] n1 = new int[5];
	int [][] n2 = new int[2][2];
	int [] n3 = {1,2,3);
	
	길이가 5인 n1이라는 이름의 정수형 배열을 생성한다. n1 = {0,0,0,0,0} length = 5
	길이가 2인 n2라는 이름의 정수형 2차원 배열을 생성한다. n2 = {{0,0},
	 											   {0,0}} length = 2
	길이가 3인 n3라는 이름의 정수형 배열을 생성하고 1,2,3을 넣는다. n3 = {1,2,3}
	
	5)
	
	int x = 100;
	int y = 200;
	int z = x + y;
	
	x값 100과 y값 200을 산술연산한 결과값을 정수형 변수 z에 대입한다.
	
	int age = 23;
	String name = "kim";
	String a = name + "의 나이는" + age;
	
	age값 23과 name값 "kim" 을 문자열로 결합연산한 결과를 String type 변수 a에 대입한다.
	
	6)
	
	Scanner sc = new Scanner(System.in); // 콘솔을 통한 사용자 입력을 받기 위한 Scanner 객체 생성
	System.out.print("이름을 입력하세요 >> "); // "이름"에 대응하는 사용자 입력을 받기 위한 메세지 (프롬프트) 출력
	String name2 = sc.nextLine(); // 콘솔을 통한 사용자 입력값을 String type 변수 name2에 입력
	System.out.print("나이를 입력하세요 >> "); // "나이"에 대응하는 사용자 입력을 받기 위한 메세지 (프롬프트) 출력
	int age2 = sc.nextInt(); // 콘솔을 통한 사용자 입력값을 integer type 변수 age2에 입력
	
	
	

	7) String h = "안녕하세요"; // 10 byte + (2 * 5) byte = 20 byte

	
	8) 
	
	int n = Integer.parseInt("100"); // "100" 이라는 String type 값을 연산을 위해 Int값으로 변환하여 Integer type 변수 n에 대입
	Scanner sc2 = new Scanner(System.in); // 콘솔을 통한 사용자 입력값을 받기 위한 Scanner 객체 생성
	Random r = new Random(10); // 난수 발생을 위한 시드값 10 의 Random 객체 생성
	
	
	
*/	
	
	public static void main(String[] args) {
		
	// -----------------
	// 당신의 정보를 입력하세요
	// -----------------
	// 당신의 부서는 >>>
	// 당신의 소속은 ___ 입니다.
	// 당신의 나이는 >>>
	// 당신의 작년 나이는 ___ 이였습니다.
	// 당신의 키는 >>>
	// 당신은 키가 (크다/보통이다/작다) // 180이상, 170이상, 160이상
		
	//프로젝트명 : p01
	// 패키지명 : package01
	// 자바 파일명 : PreExam
		
		
//	Scanner scan = new Scanner(System.in);
//	
//	String dep = "";
//	int age = 0;
//	int height = 0;
//	
//	System.out.println("-----------------");
//	System.out.println("당신의 정보를 입력하세요.");
//	System.out.println("-----------------");
//	
//	System.out.print("당신의 부서는 >>> ");
//	dep = scan.nextLine();
//	
//	System.out.printf("당신의 소속은 %s 입니다.%n",dep);
//	
//	System.out.print("당신의 나이는 >>> ");
//	age = scan.nextInt();
//	
//	System.out.printf("당신의 작년 나이는 %d 이였습니다.%n",age-1);
//	
//	System.out.print("당신의 키는 >>> ");
//	height = scan.nextInt();
//	
//	if (height >= 180) {
//		
//		System.out.println("당신은 키가 크다.");
//		
//	} else if (height >= 170) {
//		
//		System.out.println("당신은 키가 보통이다.");
//		
//	} else if (height >= 160) {
//		
//		System.out.println("당신은 키가 작다.");
//		
//	}
	
	
		
		
		
	/**/
	
	// 크기 판별
		
	// 숫자를 입력하세요 >> 33
	// 숫자를 입력하세요 >> 23
	
	// 앞 숫자가 큽니다.
	// 계속 할까요? (계속: o, 중단: x):
	
	// 프로그램을 종료합니다.
	// 시도 횟수 : 	앞 숫자가 큰 경우 : 	뒷 숫자가 큰 경우 : 
		
	
	int forNum = 0;
	int bacNum = 0;
	int case1 = 0;
	int case2 = 0;
	char reset = 'o';
		
	Scanner scan = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	
	while (reset == 'o') {
		
		System.out.print("숫자를 입력하세요 >> ");
		forNum = scan.nextInt();
			
		System.out.print("숫자를 입력하세요 >> ");
		bacNum = scan.nextInt();
		
		String temp = "";
		
		if (forNum > bacNum) {
			
			System.out.println("앞 숫자가 큽니다.");
			case1++;
			
		} else if (bacNum > forNum) {
			
			System.out.println("뒷 숫자가 큽니다.");
			case2++;
			
		}
		
		
		System.out.print("계속 할까요? (계속 o, 중단x) : ");
		
		temp = scan2.nextLine();
		reset = temp.charAt(0);
		
	}
	
	System.out.println("프로그램을 종료합니다.");
	System.out.printf("시도 횟수 : %d\t 앞 숫자가 큰 경우 : %d\t 뒷 숫자가 큰 경우 : %d\t",case1+case2,case1,case2);
		
		
		
		
	/**/
		
	// 원하는 기호를 입력하세요 >> @
	// 원하는 횟수를 입력하세요 >> 5
	// 1) 증가	2) 감소	3) 종료 >> 1
	// 카운트 : 1
	// 1) 증가	2) 감소	3) 종료 >> 1
	// 카운트 : 2
	// 1) 증가	2) 감소	3) 종료 >> 2
	// 카운트 : 1
	// 1) 증가	2) 감소	3) 종료 >> 1
	// 카운트 : 2
	// 1) 증가	2) 감소	3) 종료 >> 3
	// 프로그램 종료	최종 카운트 : 2
		
	
		
	/**/
		
	// 왼쪽 아래 직각 삼각별
	// 왼쪽 위 직각 삼각별
		
	}
	
	
}
