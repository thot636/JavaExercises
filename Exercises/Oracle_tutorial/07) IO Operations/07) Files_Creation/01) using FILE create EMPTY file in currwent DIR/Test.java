import java.io.*;

class Test {

	public static void main (String [] args){
		
		try {
		   //create a file named "testfile.txt" in the current working directory
			File myFile = new File("testfile.txt");
			if ( myFile.createNewFile() ) {
				System.out.println("Success!");
			} else {
				System.out.println("Failure!");
		    }
		} catch ( IOException ioe ) { 
			ioe.printStackTrace(); 
		}
	}

}