import java.nio.file.*;
//import java.io.*;

class Test {

	public static void main (String [] args){

		//new Test().pathAndFile();
		new Test().verifyingtheExistence();
	}
	//  
	void verifyingtheExistence()
		Path path = Paths.get("c:\\1\\2\\3");
		Path fileinPath = Paths.get("c:\\1\\2\\myFile.txt");
		System.out.println("is this folder exist? "+Files.exists(path));
		System.out.println("is this file exist? "+Files.exists(fileinPath));
	}
	
		

}