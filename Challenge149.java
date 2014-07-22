/**
 * Challenge #149 from Reddit
 * http://www.reddit.com/r/dailyprogrammer
 * 
 * @author Ivan Wong
 * @date 7/22/2014
 */


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
