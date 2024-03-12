package day5.ch5;

import java.util.ArrayList;

public class ArraylistDemo2 {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(10);
    System.out.println(arrayList.toArray().length);
    arrayList.add(20);
    System.out.println(arrayList.toArray().length);
    arrayList.add(30);
    System.out.println(arrayList.toArray().length);
    arrayList.add(40);
    System.out.println(arrayList.toArray().length);
    arrayList.add(50);
    System.out.println(arrayList.toArray().length);

    System.out.println("삭제된 아이템" + arrayList.remove(4));
    System.out.println("현재 배열의 길이" + arrayList.toArray().length);

  }
}
