import java.nio.file.*;
import java.io.*;

class Test {

	public static void main (String [] args){

		//new Test().pathAndFile();
		new Test().justPath();
	}
	// create Path and File 
	void pathAndFile(){
		try {
			Path pathToFile = Paths.get("c:\\1\\2\\myFile.txt");
			Files.createDirectories(pathToFile.getParent());
			Files.createFile(pathToFile);
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	// create just Path
	void justPath(){
		try {
			Path pathToFile = Paths.get("c:\\1\\2\\3");
			Files.createDirectories(pathToFile);
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	// create a folder in current directory (e.g. where java class is)
	void InCurrentDir(){
		try {
			Path pathToFile = Paths.get("2\\3\\4");
			Files.createDirectories(pathToFile);
			System.out.println("Path to absolute path: " + pathToFile.toString());
		} catch (IOException e){
			e.printStackTrace();
		}
	}
		

}