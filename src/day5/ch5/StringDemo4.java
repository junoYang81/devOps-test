package day5.ch5;

public class StringDemo4 {
  public static void main(String[] args) {
    String s1 = "abc";

    System.out.println(String.format("%s %d","JDK",17));

    System.out.println(String.join(": ", "A","B","C","D"));

    System.out.println(String.valueOf(10)+10);
    System.out.println(String.valueOf(3.14)+3.14);
    System.out.println(String.valueOf('c') + 27);

    String html2 = """
        <html>
          <body>
          </body>
        </html>""";
  }
}
