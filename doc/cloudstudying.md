# 강의 리뷰
---
문제 : 삼겹살 3인분 칼로리 계산하기

```java
public class Park {
 public static void main(String[] args) {
  //변수 생성
  int num = 3; //3인분
  
  //칼로리 계산
 double result = calculate(num);
 
  //결과 출력
  System.out.printf("삼겹살 %d인분 : %.2f kcal", num, result
}
0
//삼겹살 n 인분의 총 칼로리 반환
 public static double calculate(int n) {
  int gram = n * 180;             // 1인분 -> 180g
  double kcal = gram * 5.179;     // 1g -> 5.179kcal
  return kcal;
}    

```
```
삼겹살 3인분: 2796.66 kcal
```

# 38강 조건문 배우기
## if, if-else, else-if

---
#### if문 문제 - 하거나 말거나

```java

public class Beer {
 public static void main(String[] args) {
  order(18); // 18세가 캔맥주를 사려 함
  order(19); // 19세가 캔맥주를 사려 함
  order(20); // 20세가 캔맥주를 사려 함
  
  }
  
  public static void order(int age) {
   if (age >= 19) {
    System.out.printf("%d세, 성인인증 완료 => 캔맥주가 나왔습니다.\n", age);
    }
  }
}

```
```
19세, 성인인증 완료 => 캔맥주가 나왔습니다.
20세, 성인인증 완료 => 캔맥주가 나왔습니다.
```

---
#### 1월 29일 if-else문 문제 - 둘 중 하나!

```java
public class Tobacco {
 public static void main(String[] args) {
  buy(15); // 15세, 담배 구매 시도
  buy(19); // 19세, 담배 구매 시도
  buy(22); // 22세, 담배 구매 시도
  }
 public  static void buy(int age) {
 //변수 생성
 String result="담배판매";
  //조건에 따른 결과 생성
  if(age>=19){
   result = "O";
  } else {
   result = "X"; 
  }
  //결과 출력
  System.out.printf(%d세 => 담배판매(%s)\n", age, result);
   }
  }
  ```
```
15세 => 담배판매(X)
19세 => 담배판매(O)
22세 => 담배판매(O)
```

#### else-if 여럿 중 하나
```java
public class BusCard {
  public static void main(String[] args) {
    printRole(22); // 22살 => 성인
    printRole(16); // 16살 => 청소년
    printRole(10); // 10살 => 어린이
    printRole(4); // 4살 => 유아
  }
  
  public static void printRole(int age) {
    // 변수 생성
    String role = "";
    
    // 조건별 결과 선택
    if (age>=18) {
      role = "성인";
    } else if (age>=13) {
      role = "청소년";
    } else if (age>=6){
      role = "어린이";
    } else {
      role = "유아";
    }
    
    // 결과 출력
    System.out.printf("%d살 => %s입니다.\n", age, role);
  }
}
```
```
22살 => 성인입니다.
16살 => 청소년입니다.
10살 => 어린이입니다.
4살 => 유아입니다.
```
## 비교연산자, 논리연산자



