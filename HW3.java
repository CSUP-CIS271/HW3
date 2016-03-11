/*
David Giordano
Java 271
2/24/16
HW#3
*/

import java.io.*;
import java.util.*;
public class HW3 {
public static void main (String [] args)
  throws FileNotFoundException {
Scanner scanner = new Scanner (new File ("HW3.txt"));
PrintStream output = new PrintStream (new File("HW3reverse.txt"));
ArrayList <String> a = new ArrayList<String>();

while (scanner.hasNextLine()) {
  a.add(reverseString(scanner.nextLine()));
 }

for (int i = a.size() -1; i >= 0; i--) {
  output.println(a.get(i));
}

scanner.close();
output.close();
}

public static String reverseString (String s) {
  String str = "";
  for (int j = s.length()-1; j >= 0; j--){
    str = str + s.charAt(j);
  }
  return str;
  }
 }
