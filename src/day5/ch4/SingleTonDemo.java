package day5.ch4;

public class SingleTonDemo {
  public static void main(String[] args) {
    SingleTon singleTon = SingleTon.getSingleton();
    SingleTon singleTon2 = SingleTon.getSingleton();

    System.out.println(singleTon);
    System.out.println(singleTon2);

    if (singleTon == singleTon2){
      System.out.println("두 객체는 동일한 singleton 객체입니다");
    }
  }

}
