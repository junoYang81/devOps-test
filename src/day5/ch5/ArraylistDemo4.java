package day5.ch5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistDemo4 {
  public static void main(String[] args) {
    //-값이 입력되면 종료
    //scanner 선언 객체 생성
    Scanner in = new Scanner(System.in);
    //개수가 정해져 있지 않은 여러 명의 점수를 저장할 동적 배열을 선언
    ArrayList<Integer> scores = new ArrayList<>();
    //+값이 입력되면 해당 점수를 배열의 원소에 추가
    int score;
    do {
      System.out.println("숫자를 입력하세요. 종료하려면 -값을 입력해주세요 : ");
      int score = in.nextInt();
    if (score >= 0) {
      scores.add(score);}
    } while (score >= 0);
    //배열의 점수 합 = sum, avg를 구해서 출력해서 프로그램 종료
    int sum = 0;
    for (Integer i : scores) {
      sum += scores.get(i);
    }
    double avg =  sum / (double)scores.size();
    System.out.println(sum);
    System.out.println(avg);
  }
}
