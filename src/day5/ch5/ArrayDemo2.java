package day5.ch5;


import java.util.Arrays;

public class ArrayDemo2 {
  public static void main(String[] args) {
 // 문자열을 원소로 가지는 배열을 생성 = ("A", "B", "C", "D", "E")
    // 참조 변수 strArr에 저장한다
    // strArr 배열의 원소를 전부 출력하라. (1. foreach 2. Arrays 메소드를 활용)
    String[] strArr = {"A", "B", "C", "D", "E"};
    for (String s : strArr) {
      System.out.println(s);


    }

    System.out.println(Arrays.toString(strArr));

    //숫자(float)을 원소로 가지는 배열 farr을 생성(*,*,*) 생성하면서 값을 초기화하세요
    //farr배열의 원소를 전부 출력 (1. foreach 2. Arrays 매서드의 활용)
    float[] fArr = {0.5f, 1.5f, 2.5f};
    for (float v : fArr) {
      System.out.println(v);

    }
    System.out.println(Arrays.toString(fArr));




    }
  }