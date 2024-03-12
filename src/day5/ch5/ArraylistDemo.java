package day5.ch5;

public class ArraylistDemo {
  public static void main(String[] args) {
    int[] Arr = {1, 2, 3, 4};
    int[] newArr = new int[5];

    for (int i = 0; i < Arr.length; i++) {
      newArr[i] = Arr[i];
    }

    Arr = newArr;
    newArr[4] = 5;

    int sum =0;
    for (int i : Arr) {
      sum+= i;
    }
    System.out.println(sum);

    //크기를 5에서 4로 변경하는데 5번째 원소는 삭제

  }
}
