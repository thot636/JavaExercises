/*
it read whole Line and write it. 
BufferedReader - it reads till the BufferisFull - really convinient becasue you app does not communicate all the time with OS or network conenction
PrintWriter is used isntead of BufferWiriter bcos he 2nd one does not have println method...
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter("characteroutput.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}