import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class HW3 {

    /**
     * @param args the command line arguments
     */
    ArrayList<String> text;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner s = new Scanner(new File("HW3.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNextLine()) {
            list.add(s.nextLine());
        }
        s.close();
        ArrayList<String> newList = new ArrayList<String>();;
        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(reverse(list.get(i)));
        }
        
        FileWriter writer = new FileWriter("OutputHW3.txt");
        for (String str : newList) {
            writer.write(str);
            writer.write(System.getProperty("line.separator"));
        }
        writer.close();
    }

    public static String reverse(String line) {
        if (line.isEmpty()) {
            return line;
        }
        
        StringBuilder rev = new StringBuilder();
        String[] newRev = line.split("\\s");
        for (int i = newRev.length - 1; i >= 0; i--) {
            rev.append(newRev[i]);
            rev.append(' ');
        }
        return rev.toString().trim();
    }

}
