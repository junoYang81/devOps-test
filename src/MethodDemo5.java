public class MethodDemo5 {
  public static String numbering(int nit, int limit){
    int i = nit;
    String output = "";
    while (i < limit){
      output += i;
      i++;
    }
    return output;
  }

  public static void main(String[] args) {
    String result = numbering(1,5);
    System.out.println(result);
  }
}
