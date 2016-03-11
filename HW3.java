/* Proj: HW3.java
 * Date: February 25, 2016
 * Name: Matt S. Ham
 * Desc:
 */
 import java.io.*;
 import java.util.*;

 public class HW3 {
   public static void main(String[] args) throws FileNotFoundException{
     Scanner input = new Scanner(new File("Input.txt"));
     PrintStream output = new PrintStream(new File("Reverse.txt"));
     ArrayList<String> array1 = new ArrayList<String>();

     while(input.hasNextLine()){
       array1.add(reverseString(input.nextLine()));
     }
     for(int i = array1.size() -1; i >= 0; i--){
       output.println(array1.get(i));
     }
     input.close();
     output.close();
   }

   public static String reverseString(String text){
     String str = "";
     for(int z = text.length() -1; z >= 0; z--){
       str = str + text.charAt(z);
     }
     return str;
   }
 }
