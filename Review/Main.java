import java.util.ArrayList;

class Main {

  public static void main(String[] args){

    System.out.println("Hello World");

    /************자료형, 메서드****************/

    int a = 3;
    //String b = new String("Hello World") - 원칙
    String b = "Hello World";
    String c = "Hello Java";

    char d = 'a'; // 한 글자, String 써도 됨
    char e = 97; // ascII code
    

    System.out.println(a);
    System.out.println(b);
    // a = a + 1 ; a += 1
    System.out.println(a++); //출력 후 1 증가
    System.out.println(a);
    System.out.println(++a); // 1 증가 후 출력

    System.out.println(a%2); // 홀짝 검증

    System.out.println(b.indexOf("World")); // 문자열 시작 위치

    System.out.println(b.equals(c)); //b와 c 값 같은지 비교

    System.out.println(b.substring(0,4));
    //끝 위치는 포함하지 않는다. 즉 ~미만

    System.out.println(c.replaceAll("Java", "World"));
    //특정 문자열을 다른 문자열로 치환 *값을 재입력 한 것은 아니고 표현만

    System.out.println(c.toUpperCase()); //대문자 치환

    boolean isEqual = d == e;
    
    if (isEqual) {
      System.out.println("같은 내용입니다.");
    }
    
    /************** 배열, 리스트 *****************/

    //배열은 그 길이가 고정. 기본적으로 수정 불가능 
    int[] Score = {70,80,90,100,60};
    String[] names = new String[5];

    names[0] = "Park";
    names[1] = "Kim";
    names[2] = "Lee";
    names[3] = "Choi";
    names[4] = "Kang";

    System.out.println(Score[3]);

    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }

    //ArrayList를 사용하기 위해 최상단 import 부분 입력
    ArrayList ages = new ArrayList();

    ages.add("21"); // list에 들어간 순간 객체
    ages.add("24");
    ages.add("26");
    ages.add("31");
    ages.add(0,"18"); //특정 위치 지정 가능
        
    System.out.println(ages.get(1)); // 특정 인덱스 값
    System.out.println(ages.size()); // 리스트의 갯수
    System.out.println(ages.contains("26")); //포함 여부
    System.out.println(ages.remove("26")); //삭제
    System.out.println(ages.contains("26"));
    System.out.println(ages.remove(2)); //해당 인덱스 삭제


    ArrayList<int> heights = new ArrayList<int>();
    
    heights.add(167); // list에 들어간 순간 int

    String A = (String)ages.get(0); // casting을 이용하여 형변환
    String B = heights.get(0); // 제네릭스를 사용해서 형변환 필요 X

    System.out.println(A);
    System.out.println(B);
    

  }

}