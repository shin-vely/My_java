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

//삼겹살 n 인분의 총 칼로리 반환
 public static double calculate(int n) {
  int gram = n * 180;             // 1인분 -> 180g
  double kcal = gram * 5.179;     // 1g -> 5.179kcal
  return kcal;
}    

```


# 38강 조건문 배우기
## if, if-else, else-if
## 비교연산자, 논리연산자

