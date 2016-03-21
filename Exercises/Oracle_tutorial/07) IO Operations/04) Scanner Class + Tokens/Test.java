import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {

        Scanner s = null;

        try {
			// by default it white space when you want to use other delimitaers you need to use //method useDelimiter,below delimiters are space, comma and tab
            //s = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));
			//s = new Scanner(new BufferedReader(new FileReader("comma.txt"))).useDelimiter(",");
			s = new Scanner(new BufferedReader(new FileReader("tab.txt"))).useDelimiter("\t");
            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}