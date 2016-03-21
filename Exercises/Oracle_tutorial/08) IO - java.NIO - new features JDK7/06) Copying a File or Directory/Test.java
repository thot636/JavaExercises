import java.nio.file.*;
import java.io.*;



class Test {

	public static void main (String [] args){

		//new Test().pathAndFile();
		//new Test().delete();
		new Test().dekleteWithSilentException();
	}
	//  
	void delete(){
		
		Path fileinPath = Paths.get("c:\\1\\2\\myFile.txt");
		
		try {
			Files.delete(fileinPath);
		} catch (NoSuchFileException x) {
			System.err.format("%s: no such" + " file or directory%n", fileinPath);
		} catch (DirectoryNotEmptyException x) {
			System.err.format("%s not empty%n", fileinPath);
		} catch (IOException x) {
			// File permission problems are caught here.
			System.err.println(x);
		}
	}
	
}