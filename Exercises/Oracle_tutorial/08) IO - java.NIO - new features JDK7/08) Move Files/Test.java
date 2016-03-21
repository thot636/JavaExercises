import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

class Test{
	public static void main (String [] args) throws IOException{
		
		new Test().copyFile();
		
	}
	
	// it is very simple - target and source folder structure MUST exist before executing 
	
	void copyFile() { // REPLACE_EXISTING -> overwrite if existing
		try{
			Path FROM = Paths.get("C:\\1\\2\\from.txt");
			Path TO = Paths.get("C:\\1\\2\\test\\to.txt");
			//overwrite existing file, if exists
			CopyOption[] options = new CopyOption[]{
				StandardCopyOption.REPLACE_EXISTING,
				//StandardCopyOption.COPY_ATTRIBUTES
			}; 
			Files.move(FROM, TO, options);
		} catch (IOException x){
			System.err.println(x);
		}
	
	}

	
	
}