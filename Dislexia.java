/* Jared Horvat
   Homework 3
   February 28, 2016
   CIS 271 */
   
import java.util.*;
import java.io.*;

public class Dislexia{
 public static void main(String[] args) throws FileNotFoundException{
  
  Scanner file = new Scanner(new File("HW3.txt"));
  PrintStream result = new PrintStream(new File("results.txt"));
  ArrayList<String> array = new ArrayList<String>();
  
  while(file.hasNextLine()) {
   array.add(reverseString(file.nextLine()));
   }
   
   for(int i = array.size()-1; i >= 0; i--) {
    result.println(array.get(i) + " ");
    }
  
    file.close();
    result.close();
  }
  
   public static String reverseString(String y) {
    String  str = "";
    
    for(int x = y.length() - 1; x >=0; x--) {
     str = str + y.charAt(x);
     }
     return str;
    } 
}