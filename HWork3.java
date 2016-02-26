/*
 * HWork3.java"
 * Joshua Greer
 * February 19, 2016
 * Homework Assignment #3 CIS 271
 */
import java.util.*;
import java.io.*;
public class HWork3{
  public static void main (String [] args) throws FileNotFoundException {
    
    Scanner input = new Scanner (new File("HW3.txt"));
    PrintStream output = new PrintStream(new File("results.txt"));
    ArrayList<String> array1 = new ArrayList<String>();     
   
    while(input.hasNextLine()) {      
      array1.add(reverseString(input.nextLine()));       
    }         
    for(int i = array1.size() - 1; i >= 0; i--) {       
        output.println(array1.get(i)+ " ");        
      }
    input.close();
    output.close();
      }
 
  public static String reverseString(String y) {
   String str = "";
   for(int x = y.length()- 1; x >= 0; x--) {
    str = str + y.charAt(x);
   }
    return str; 
}
}
