 /*
  * Program:   Homework3.java
  * Author:   Dan Baliczek
  * Last modified:  2/24/2016
  * Description: This will read a file and create a new file in which the line order is reversed, and the word order within the lines is reversed also.
  */

import java.io.*;
import java.util.*;

public class Homework3 {
static ArrayList<String> arr1 = new ArrayList<String>();
public static void main(String[] args) throws FileNotFoundException{
	read("Test");
	reverse("Test");
}
public static void reverse(String file) throws FileNotFoundException{
	PrintStream output = new PrintStream(new File(file+"-Reveresed.txt"));
	for(int i = arr1.size()-1; i>=0;i--){
		String n = arr1.get(i);
		String temp = "";
		Scanner stringCheck = new Scanner(n);
		while(stringCheck.hasNext()){
			temp = stringCheck.next() + " " +temp;
		}
		output.println(temp);
		stringCheck.close();
	}
	output.close();
}
public static void read(String file) throws FileNotFoundException{
	Scanner read = new Scanner(new File(file+".txt"));
	while(read.hasNextLine()){
		arr1.add(read.nextLine());
	}
	read.close();
	}
}
