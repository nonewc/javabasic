
// import java.util.HashMap;
// import java.util.ArrayList;

// class Main {

//   public static void main(String[] args){

//     // System.out.println("Hello World");

//     // /************자료형, 메서드****************/

//     // int a = 3;
//     // //String b = new String("Hello World") - 원칙
//     // String b = "Hello World";
//     // String c = "Hello Java";

//     // char d = 'a'; // 한 글자, String 써도 됨
//     // char e = 97; // ascII code
    
//     // 같다 == 다르다 !=

//     // System.out.println(a);
//     // System.out.println(b);
//     // // a = a + 1 ; a += 1
//     // System.out.println(a++); //출력 후 1 증가
//     // System.out.println(a);
//     // System.out.println(++a); // 1 증가 후 출력

//     // System.out.println(a%2); // 홀짝 검증

//     // System.out.println(b.indexOf("World")); // 문자열 시작 위치

//     // System.out.println(b.equals(c)); //b와 c 값 같은지 비교

//     // System.out.println(b.substring(0,4));
//     // //끝 위치는 포함하지 않는다. 즉 ~미만

//     // System.out.println(c.replaceAll("Java", "World"));
//     // //특정 문자열을 다른 문자열로 치환 *값을 재입력 한 것은 아니고 표현만

//     // System.out.println(c.toUpperCase()); //대문자 치환

//     // boolean isEqual = d == e;
    
//     // if (isEqual) {
//     //   System.out.println("같은 내용입니다.");
//     // }
    
//     // /************** 배열, 리스트 *****************/

//     // //배열은 그 길이가 고정. 기본적으로 수정 불가능 
//     int[] Score = {70,80,90,100,60};
//     // String[] names = new String[5];

//     // names[0] = "Park";
//     // names[1] = "Kim";
//     // names[2] = "Lee";
//     // names[3] = "Choi";
//     // names[4] = "Kang";

//     // System.out.println(Score[3]);
//     // System.out.println(Score.length);
    
//     // String[] names = new String[5];

//     // names[0] = "Park";
//     // names[1] = "Kim";
//     // names[2] = "Lee";
//     // names[3] = "Choi";
//     // names[4] = "Kang";

//     // System.out.println(Score[3]);

//     // for (int i = 0; i < names.length; i++) {
//     //   System.out.println(names[i]);
//     // }

//     // //ArrayList를 사용하기 위해 최상단 import 부분 입력
//     // ArrayList ages = new ArrayList();

//     // ages.add("21"); // list에 들어간 순간 객체
//     // ages.add("24");
//     // ages.add("26");
//     // ages.add("31");
//     // ages.add(0,"18"); //특정 위치 지정 가능
        
//     // System.out.println(ages.get(1)); // 특정 인덱스 값
//     // System.out.println(ages.size()); // 리스트의 갯수
//     // System.out.println(ages.contains("26")); //포함 여부
//     // System.out.println(ages.remove("26")); //삭제
//     // System.out.println(ages.contains("26"));
//     // System.out.println(ages.remove(2)); //해당 인덱스 삭제


//     // ArrayList<String> heights = new ArrayList<String>();
    
//     // heights.add("167"); // list에 들어간 순간 int

//     // String A = (String)ages.get(0); // casting을 이용하여 형변환
//     // String B = heights.get(0); // 제네릭스를 사용해서 형변환 필요 X

//     // System.out.println(A);
//     // System.out.println(B);
    

//   //2021.12.09 목

//     /************** Map 맵 (파이썬의 딕셔너리) ****************/

//   //  import jav.util.HashMap;
//   // 데이터를 키 값과 밸류 값의 쌍으로 저장하눈 구조, 순서(인덱스)가 없이 키 값으로 호출.
//   // 순서로 데이터를 가져올 필요가 있으면 LinkedHashMap TreeMap 등을 사용
//     HashMap<String, String> map = new HashMap<String, String>();

//     map.put("people","사람");
//     map.put("baseball","야구");

//     // 키 값으로 밸류 값 가져오기 get()
//     System.out.println(map.get("people"));

//     // 키 값의 존재 유무 확인 containsKey()
//     System.out.println(map.containsKey("people"));

//     // 크기, map의 갯수를 확인 size()
//     System.out.println(map.size());

//     // map의 항목을 삭제 remove()
//     System.out.println(map.remove("people"));
//     System.out.println(map.size());
//     System.out.println(map.get("people"));

//     /********************* 조건문 **************************/
  
//     int money = 2000;
//     boolean card = true;
    
//     // || 둘 중 하나만 만족해도 true | 은 두 조건 다 체크 cf) &&

//     if (money >= 5000 || card) {

//       System.out.println("택시를 탄다");

//     } else {

//       System.out.println("걸어서 간다");

//     }

//     ArrayList<String> pocket = new ArrayList<String>();

//     pocket.add("paper");
//     pocket.add("card");
//     pocket.add("coin");

//     if (pocket.contains("card")) {

//       System.out.println("택시를 탄다");

//     } else if (pocket.contains("coin")) {

//       System.out.println("택시를 탄다");

//     } else {

//       System.out.println("걸어서 간다");

//     }
  
  

//   }

// }


/***************** 입력값, 객체 생성, do ~ while *************************/

// import java. util.Scanner;
// public class Main {

//   public int IfTest(int value){

//     int ret = 0;

//     if (value % 2 == 0){

//       ret = 2;

//     } else if (value % 3 == 0){

//       ret = 3;

//     } else {

//       ret = 000;

//     }

//     return ret;

//   }

//   public static void main(String[] args){
  
//     int i = 0;
//     Scanner scan = new Scanner(System.in);
//     System.out.println("값을 입력해주세요. (0 입력시 종료)");
  
//     Main exam = new Main();

//     do {
//       i = scan.nextInt();
//        System.out.println(exam.IfTest(i) + " 의 배수입니다. ");

//     } while (i != 0);

//     System.out.println("종료");
   

//   }

// }
/****************************************************/

// class Main {

//   public static void main(String[] agrs){

//     int month = 4;
//     String monthString = "";

//     if (month == 1){
//       monthString = "jan";
//     } else if (month == 2) {
//       monthString = "feb";
//     } else if (month == 3) {
//       monthString = "mar"; 
//     } else if (month == 4) {
//       monthString = "apr"; 
//     } 

//     System.out.println(monthString);
    

//   }

// }

import java.util.Calendar;
class Main {

  public static void main(String[] args){

    int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
    String season = "";

    switch (month) {

      case 12: case 1: case 2:
      season = "겨울";
      break;

      case 3: case 4: case 5:
      season = "봄";
      break;

      case 6: case 7: case 8:
      season = "여름";
      break;

      case 9: case 10: case 11:
      season = "가을";
      break;

    }

    System.out.println("지금은" + month + "월이고," + season + "입니다.");


  }

}
