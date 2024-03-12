package day5.ch5;

import java.util.ArrayList;

public class ArraylistDemo3 {
  public static void main(String[] args) {
    //문자열을 가지는 동적 배열 생성
    //a,b,c,d,e 하나씩 추가 및 출력
    ArrayList<String> sArrayList = new ArrayList<>();
    sArrayList.add("A");
    System.out.println(sArrayList.toArray().length);
    sArrayList.add("B");
    System.out.println(sArrayList.toArray().length);
    sArrayList.add("C");
    System.out.println(sArrayList.toArray().length);
    sArrayList.add("D");
    System.out.println(sArrayList.toArray().length);
    sArrayList.add("E");
    System.out.println(sArrayList.toArray().length);

    System.out.println(sArrayList);
    System.out.println("3번째 원소의 값은" + sArrayList.get(2));
    System.out.println(sArrayList.toArray().length);
  }
}
