import java.io.*;
import java.util.*;
/**
 * @author Randall Sirota
 * Homework Java 3 assignment
 * Professor Voss CIS 271
 */
public class ReadWrite_Ver4 {
  public static void main(String[] args) 
        throws FileNotFoundException {
    Scanner input = new Scanner(new File("readwrite.txt"));
    PrintStream output = new PrintStream(new File("readwriteoutput.txt"));
    ArrayList<String> words = new ArrayList<String>();
    
    while (input.hasNextLine()) { //process each line
      String text = input.nextLine();
      //System.out.println(reverseText(text)); //can output to Console
      words.add(reverseText(text));      
    }
    for(int j = words.size() - 1; j >= 0; j--) {  //print to file
      output.println(words.get(j));
    }
    output.close();
  }    
    public static String reverseText(String text) {
      String str = "";
        for (int i = text.length() - 1; i >= 0 ; i--) {
          str = str + text.charAt(i);
        }
        return str;
    }
}