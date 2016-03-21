import java.nio.file.*;
import java.io.*;

class Test {

	public static void main (String [] args){

		//new Test().pathAndFile();
		new Test().retrievePathInfo();
	}
	// create Path and File 
	void retrievePathInfo(){
		// None of these methods requires that the file corresponding
		// to the Path exists.
		// Microsoft Windows syntax
		Path path = Paths.get("C:\\home\\joe\\foo");
		
		System.out.format("toString: %s%n", path.toString());
		System.out.format("getFileName: %s%n", path.getFileName());
		System.out.format("getName(0): %s%n", path.getName(0));
		System.out.format("getNameCount: %d%n", path.getNameCount());
		System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
		System.out.format("getParent: %s%n", path.getParent());
		System.out.format("getRoot: %s%n", path.getRoot());
	}
	
		

}