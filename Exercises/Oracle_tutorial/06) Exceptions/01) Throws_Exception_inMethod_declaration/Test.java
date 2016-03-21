/*
it will throw that wexception becasue metodka1() throws checked ExceptionFileNotFoundException and metodka1() invoke metodka1() so it need to catch or throw ExceptionFileNotFoundException as well
Test.java:13: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
*/
                


import java.io.*;

public class Test {
    public static void main(String [] args) {

        
    }
}

class Second{
	
	public void metodka1() /*throws FileNotFoundException*/{
		metodka();
	}

	public void metodka() throws FileNotFoundException{
		// The name of the file to open.
        String fileName = "temp.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }	

            // Always close files.
            bufferedReader.close();			
        }
        /*catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");				
        } */
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");					
            // Or we could just do this: 
            // ex.printStackTrace();
			}
	}
}