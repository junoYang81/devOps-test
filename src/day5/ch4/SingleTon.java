package day5.ch4;

public class SingleTon {
  //Static 멤버(필드,메서드)
  private static SingleTon singleton = new SingleTon();
  //생성자
  private SingleTon(){

  }
  //접근자(게터)
  public static SingleTon getSingleton() {
    return singleton;
  }
}
