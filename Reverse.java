package hw3;

import java.io.*;
import java.util.*;

public class Reverse {
	public static ArrayList<String> aList = new ArrayList<String>();
	public static String fileName = "Marvel.txt";
	public static File file = new File(fileName);
	
	public static void main(String[] args) {
		
		readList();
		rList();
	}
	
public static void readList(){
	
	try{
		Scanner s = new Scanner(file);
		while(s.hasNextLine()){
			String text = s.nextLine();
			aList.add(text);
		}
		System.out.println(aList);
		s.close();
	}//end try
	
	catch(Exception e){
		System.out.println("File not found");
	}
	
	}//end readList

public static void rList(){
	String fName = "NewMarvel.txt";
	File f = new File(fName);
	FileWriter fs;
	try {
		fs = new FileWriter(f, false);
		int i = aList.size()-1;
		
		for(String c: aList){
			int y = aList.indexOf(c);
			int z = i-y ;
			String w = (aList.get(z));
			
			fs.write(w + " \n");
			System.out.print(w +" ");
		}
		fs.close();
		System.out.println("\n");
		System.out.println("It worked!");
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
}//rList

}//end Reverse	
	
