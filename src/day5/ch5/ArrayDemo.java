package day5.ch5;

public class ArrayDemo {
  public static void main(String[] args) {
    int [] score = new int[]{100, 90, 80, 70, 60};
    for (int i = 0; i < 5; i++)
      score[i] = 100;
      System.out.println(score[1]);

    int[] scores = {100, 90, 80, 70, 60};
    System.out.println("3번째 학생의 점수는" + scores[2] + "입니다");

    scores[2] = 85;

    System.out.println(scores.length);



  }
}
