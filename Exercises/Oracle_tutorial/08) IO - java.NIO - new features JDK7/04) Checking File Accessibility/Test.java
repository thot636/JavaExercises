import java.nio.file.*;
//import java.io.*;

/*
Note: Once any of these methods completes, there is no guarantee that the file can be accessed. A common security flaw in many applications is to perform a check and then access the file. For more information, use your favorite search engine to look up TOCTTOU (pronounced TOCK-too).
*/

class Test {

	public static void main (String [] args){

		//new Test().pathAndFile();
		new Test().CheckAccessibility();
	}
	//  
	void CheckAccessibility(){
		
		Path fileinPath = Paths.get("c:\\1\\2\\myFile.txt");
		
		System.out.println("is this file acessible? "+ (Files.isRegularFile(fileinPath) &
         Files.isReadable(fileinPath) & Files.isExecutable(fileinPath)));
	}
}