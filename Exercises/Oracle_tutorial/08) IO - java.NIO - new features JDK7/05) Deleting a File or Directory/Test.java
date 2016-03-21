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
	/* 						 !!!! IMPORTANT !!!!
	
		this method deletes the file, but if the file does NOT EXIST, NO EXCEPTION IS THROWN. Failing silently is useful when you have MULTIPLE THREADS deleting files and you don't want to throw an exception just because one thread did so first.
	*/
	void dekleteWithSilentException(){
		Path fileinPath = Paths.get("c:\\1\\2\\myFile.txt");
		
		try{
			Files. deleteIfExists(fileinPath);
		} catch (IOException e){
			System.err.println(e);
		}
		
	}
}