package day5.ch5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistDemo5 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> scores = new ArrayList<>();
    System.out.println("숫자를 입력하세요. 종료하려면 -값을 입력해주세요 : ");
    int score = in.nextInt();
    while (score >= 0) {
      scores.add(score);
      System.out.println("숫자를 입력하세요. 종료하려면 -값을 입력해주세요 : ");
    }
    int sum = 0;
    for (Integer i : scores) {
      sum += scores.get(i);
    }
    double avg =  sum / (double)scores.size();
    System.out.println(sum);
    System.out.println(avg);
  }
}
