package day5.ch5;

import java.util.Scanner;

public class ArrayDemo3 {
  public static void main(String[] args) {
    //Scanner 객체 새성
    Scanner in = new Scanner(System.in);
    //int형 점수 5개를 저장할 수 있는 배열 scores을 선언하라
    int[] scores = new int[5];
    //5개의 정수를 입력받아서 각각의 정수를 scores의 배열에 저장해라.
    System.out.println("5과목의 점수를 입력하세요");
    for (int i = 0; i < scores.length; i++) {
      scores[i] = in.nextInt();
    }
    //5 과목의 점수의 합(sum)과 평균(avg)을 구하라.
    int sum = 0;
    double avg;
    for (int score : scores) {
      sum += score;
    }
    avg = (double) sum / scores.length;
    System.out.printf("sum = %d이고, 평균은 %.2f입니다", sum, avg);
    //printf는 포멧 설정자 전용 프린트 함수 -> 예를 들어 %d, %.1f(소수점 자리 실수)
    //뒤에 매개 변수를 쳐주어야 한다. 포멧 설정자에 들어가서 치환될 코드 ex. sum, avg
  }
}
