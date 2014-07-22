import java.util.Scanner;

public class Challenge149 {
  
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    String temp = input.nextLine();
    
    temp = temp.replaceAll(" ", "");
    System.out.println(temp.replaceAll("[aeiou]", ""));
    System.out.println(temp.replaceAll("[^aeiou]", ""));
    
    input.close();
    
  }
  
}
