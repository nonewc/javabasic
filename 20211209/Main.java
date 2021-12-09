// public class Main {

// public static void main(String[] args) {

// // if (5 > 4){

// // System.out.print(50);

// // } else {

// // System.out.print(40);

// // }

// // if를 사용하지 않고 조건문 -> 삼항연산자

// System.out.println((5>4) ? 50 : 40); // 조건 ? true : false

// }

// }

/*
 * 반복문 - do ~ while do ~ while 은 조건이 참일 동안 반복 수행한다. 무조건 한 번은 반드시 실행된다.
 */

/*
 * 반복문 - for
 * 
 * 
 */

// //for each

// class Main {

// public static void main(String[] args) {

// String[] number = {"one","two","three"};

// // for(int i = 0 ; i < number.length ; i++) {

// for(String num: number){

// // System.out.println(number[i]);

// System.out.println(num);

// //number에서 하나씩 num으로 뽑아서 print

// }

// }

// }

// public class Main {

// public static void main(String[] args){

// int sum = 0;

// for (int i = 1 ; i <= 100 ; i++){

// if(i % 2 == 0){
// continue;
// }

// sum = sum + i;

// if(i == 50) {
// break;
// }

// }

// System.out.println(sum);

// }

// }

// // 1부터 100까지의 수 중 홀수들의 누적 합계
// // continue를 사용할 것

// public class Main {

// public static void main(String[] args){

// int sum = 0;

// for (int i = 1 ; i <= 100 ; i++){
// //start 초기문 stop 조건문 step 증강문
// if(i % 2 == 0){
// continue;
// }

// sum = sum + i;

// }

// System.out.println(sum);

// }

// }

// public class Main {

// public static void main(String[] args){

// int sum = 0;

// for(int i = 1 ; i <= 100 ; i++) {
// //start ; stop ; step
// sum = sum + i;
// // System.out.println(i+" 번째 " + sum);

// }

// System.out.println(sum);

// }

// }

// import java.util.Scanner;
// public class Main{

// public static void main(String[] args){

// Scanner scan = new Scanner(System.in);

// int value = 0;
// int sum = 0;

// do {

// value = scan.nextInt();
// sum = sum + value;
// // System.out.println(sum);

// } while (value <= 100);

// System.out.println("sum = " + sum);

// }

// }

// // 키보드 입력 받기
// // import java.util.Scanner;
// // Scanner scan = new Scanner(System.in);
// // i = scan.nextInt();

// import java.util.Scanner;
// class Main {

// public static void main(String[] args){

// int i = 0;
// Scanner scan = new Scanner(System.in);
// System.out.println("값을 입력해주세요.");

// do {

// i = scan.nextInt();
// System.out.println("입력 받은 값 : "+ i);
// System.out.println("재입력해주세요.");

// } while(i != 0);
// System.out.println("종료");

// }

// }

/*
 * 반복문 - while while 은 조건이 참일 동안 계속 반복실행한다.
 */

// class Main {

// public static void main(String[] args){

// int i = 0;

// while(i < 10){

// i++;

// if(i % 2 == 1){

// continue;

// }

// System.out.println(i);

// }

// }

// }

// class Main {

// public static void main(String[] args){

// int total = 0;
// int i = 1;

// while (i <= 100){

// total = total + i;
// System.out.println("i = "+ i + " total = " + total);
// i++;

// }

// }

// }

// class Main {

// public static void main(String[] args){

// int i = 0;

// while (i < 10) {

// i++;

// System.out.println(i);

// }

// }

// }

// // continue 조건에 맞지 않는 경우 실행하지 않고 다시 반복문의 처음으로 돌아가도록 하는 방법 (break랑 continue는 몇
// 번 돌 지 모르는 while하고 궁합이 잘맞아)

// class Main {

// public static void main(String[] args){

// int i = 0;

// while (i < 10) {

// i++;

// if (i % 2 == 0){

// continue;

// }

// System.out.println(i);

// }

// }

// }

//// break : 반복문을 실행하다가 break 를 만나면
//// 구문을 빠져 나간다.
// class Main {

// public static void main(String[] args){

// int coffee = 10;
// int money = 300;

// //마지막에 체크까지 하고 나감

// while(money > 0){

// System.out.println("커피를 드립니다");

// coffee --;

// System.out.println("남은 커피는 " + coffee + " 잔 입니다.");

// if (coffee == 0) {

// System.out.println("커피가 다 떨어졌습니다. 판매를 종료합니다.");

// break;

// }

// }

// }

// }

// class Main {

// public static void main(String[] args){

// int i = 0;

// //마지막에 체크까지 하고 나감

// while(true){

// i++; // i = i + 1 ; i += 1

// System.out.println("나무를 " + i +" 번 찍었습니다. ");

// if (i == 10) {

// System.out.println("나무 넘어간다~");

// break;

// }

// }

// }

// }

// class Main {

// public static void main(String[] args){

// int i = 0;

// //마지막에 체크까지 하고 나감

// while(i < 10){

// System.out.println(i + " hi~");
// i++;

// }

// }

// }

/*
 * switch-case 구문 - if문과 비슷하지만 좀 더 절차를 단순화 시키는 조건 판단문이다.
 * 
 * 
 */

// import java.util.Calendar;
// public class Main{
// public static void main(String[] args){

// //MONTH도 0부터 시작하기 때문에 + 1
// int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
// String season = "";

// if (month <= 2){
// season = "겨울";
// } else if (month <=5){
// season = "봄";
// } else if (month <=8){
// season = "여름";
// } else if (month <=11){
// season = "가을";
// } else {
// season = "겨울";
// }
// System.out.println("지금은"+ month + "월이고, "+ season + "입니다.");

// }
// }

// import java.util.Calendar;
// public class Main{
// public static void main(String[] args){

// //MONTH도 0부터 시작하기 때문에 + 1
// int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
// String season = "";

// switch (month) {

// case 12: case 1: case 2:
// season= "겨울";
// break;

// case 3: case 4: case 5:
// season= "봄";
// break;

// case 6: case 7: case 8:
// season= "여름";
// break;

// case 9: case 10: case 11:
// season= "가을";
// break;

// }

// System.out.println("지금은"+ month + "월이고, "+ season + "입니다.");

// }
// }

// class Main {

// public static void main(String[] args){

// int month = 20;
// String monthString = "";

// if (month == 1){

// monthString = "jan";

// } else if (month == 2){

// monthString = "feb";

// } else if (month == 3){

// monthString = "mar";

// } else if (month == 4){

// monthString = "apr";

// } else if (month == 5){

// monthString = "may";

// } else if (month == 6){

// monthString = "jun";

// } else if (month == 7){

// monthString = "jul";

// } else if (month == 8){

// monthString = "aug";

// } else if (month == 9){

// monthString = "sep";

// } else if (month == 10){

// monthString = "oct";

// } else if (month == 11){

// monthString = "nov";

// } else if (month == 12){

// monthString = "dec";

// } else {

// System.out.println("잘못된 월 입력");

// }

// System.out.println(monthString);

// }

// }

// class Main {

// public static void main(String[] args){

// int month = 12;
// String monthString = "";

// switch (month) {

// //break를 만나는 순간 탈출
// case 1: monthString = "jan";
// break;
// case 2: monthString = "fev";
// break;
// case 3: monthString = "mar";
// break;
// case 4: monthString = "apr";
// break;
// case 5: monthString = "may";
// break;
// case 6: monthString = "jun";
// break;
// case 7: monthString = "jul";
// break;
// case 8: monthString = "aug";
// break;
// case 9: monthString = "sep";
// break;
// case 10: monthString = "oct";
// break;
// case 11: monthString = "nov";
// break;
// case 12: monthString = "dec";
// break;

// }

// System.out.println(monthString);

// }

// }

/*
 * if
 * 
 */

// public class Main {

// public int IfTest(int value) {

// //변수를 쓰기 위해 초기화
// int ret = 0;

// if ( value % 3 == 0){

// ret = 3;

// } else if ( value % 4 == 0) {

// ret = 4;
// }

// //IfTest() = ret
// return ret;

// }

// // 무조건 main에서 시작
// public static void main(String[] args){

// // 객체 생성
// Main exam = new Main();
// // 객체exam으로 IfTest라는 매서드를 호출, value값에 6, 8 각각 입력
// System.out.println(exam.IfTest(6));
// System.out.println(exam.IfTest(8));
// System.out.println(exam.IfTest(12));

// }

// }

// class Main {

// public static void main(String[] args){

// int value = 6;

// if (value%3 == 0) {

// System.out.println(value+"는(은) 3의 배수입니다.");

// }

// }

// }

// class Main {

// public static void main(String[] args) {

// int x = 50;
// int y = 60;

// if (x == y) {

// System.out.println("x는 y와 같습니다.");

// } else if (x > y) {

// System.out.println("x는 y보다 큽니다.");

// } else {

// System.out.println("x는 y와 다릅니다.");

// }

// }

// }

// class Main {

// public static void main(String[] args) {

// int x = 50;
// int y = 60;

// if(x == y)//다르다는 !=
// {

// System.out.println("x는 y와 같습니다.");

// } else {

// System.out.println("x는 y와 다릅니다.");

// }

// }

// }

// class Main {

// public static void main(String[] args){

// int x = 50;
// int y = 60;

// if(x > y) {

// System.out.println("x는 y보다 큽니다.");
// System.out.println("test 1");

// }

// if(x > y)

// System.out.println("x는 y보다 큽니다.");
// System.out.println("test 2");

// //중괄호가 없어서 한 줄만 인정해줘서 test2만 return

// }

// }

// class Main {

// public static void main(String[]args){

// int x = 50;
// int y = 60;

// if(x > y) {

// System.out.println("x는 y보다 작습니다.");

// }

// }

// }

// import java.util.ArrayList;
// class Main {

// public static void main(String[] args){

// ArrayList<String> pocket = new ArrayList<String>();

// pocket.add("paper");
// pocket.add("handphone");
// pocket.add("money");

// if (pocket.contains("card")) {

// System.out.println("택시");

// } else if (pockeet. contains("money")){

// System.out.println("택시");

// } else {

// System.out.println("걸어간다");

// }

// }

// }

// import java.util.ArrayList;
// class Main {

// public static void main(String[] args){

// ArrayList<String> pocket = new ArrayList<String>();

// pocket.add("paper");
// pocket.add("handphone");
// pocket.add("money");

// if (pocket.contains("card")) {

// System.out.println("택시");

// } else if (pockeet. contains("money")){

// System.out.println("택시");

// } else {

// System.out.println("걸어간다");

// }

// }

// }

// import java.util.ArrayList;
// class Main {

// public static void main(String[] args){

// ArrayList<String> pocket = new ArrayList<String>();

// pocket.add("paper");
// pocket.add("handphone");
// pocket.add("money");

// if (pocket.contains("card")) {

// System.out.println("택시");

// } else {

// if (pocket.contains("money")) {

// System.out.println("택시");

// } else {

// System.out.println("걸어간다");

// }

// // if 안에 if를 쓸 수는 있지만 가독성 떨어져서 좋지 않음

// }

// }

// }

// import java.util.ArrayList;
// class Main {

// public static void main(String[] args){

// ArrayList<String> pocket = new ArrayList<String>();

// pocket.add("paper");
// pocket.add("handphone");
// pocket.add("money");

// if (pocket.contains("card")) {

// System.out.println("택시");

// } else {

// System.out.println("걸어간다");

// }

// }

// }

// class Main {

// public static void main(String[] args){

// int money = 5000;
// boolean card = true;

// if (money >= 5000 && card) {

// System.out.println("택시");

// } else {

// System.out.println("걸어간다");

// // && and 둘 다 만족해야만 true
// // & 도 and지만 &&이 앞에것만 false 나와도 넘어감

// }

// }

// }

// class Main {

// public static void main(String[] args){

// int money = 2000;
// boolean card = false;

// if (money >= 5000 || card) {

// System.out.println("택시");

// } else {

// System.out.println("걸어간다");

// // || or 둘 중 하나만 만족해도 true
// // | 도 or긴 한데 ||은 앞의 조건만 true 나와도 넘어감

// }

// }

// }

// class Main {

// public static void main(String[] args){

// int money = 13000;

// if (money >= 5000) {

// System.out.println("택시");

// } else {

// System.out.println("걸어간다");

// }

// }

// }

// class Main {

// public static void main(String[] args){

// boolean money = true;

// if (money) {

// System.out.println("택시");

// } else {

// System.out.println("걸어간다");

// }

// }

// }

/*
 * Map 맵 - 파이썬의 딕셔너리와 같은 자료구조, JS 에선 json 데이터를 키값과 밸류값의 쌍으로 저장하는 구조 순서(인덱스)가 없이
 * 키값으로만 밸류값을 얻는다.
 * 
 * key value name 홍길동 age 16
 */

// import java.util.HashMap;
// class Main {

// public static void main(String[] args){

// HashMap<String, String> map = new HashMap<String, String>();

// map.put("people","사람");
// map.put("baseball","야구");

// // 키값으로 밸류값 가져오기 get()
// System.out.println(map.get("people"));

// // 키값의 존재 유무 확인 containsKey()
// System.out.println(map.containsKey("people"));

// // 크기, map의 갯수를 확인 size()
// System.out.println(map.size());

// // map의 항목을 삭제 remove()
// System.out.println(map.remove("people"));

// System.out.println(map.size());

// // map의 가장 큰 특징은 순서에 의존하지 않고
// // key값으로 value값을 가져오는데 있다.
// // 그렇지만 순서로 데이터를 가져올 필요가 있으면
// // LinkedHashMap TreeMap 등을 사용한다.
// }

// }

// class Main {
// public static void main(String[] args) {
// System.out.println("Hello world!");
// }
// }