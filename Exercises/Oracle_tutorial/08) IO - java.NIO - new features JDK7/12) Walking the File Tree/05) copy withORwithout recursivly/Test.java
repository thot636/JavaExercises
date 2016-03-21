import java.nio.file.*;
class Test{

	static public void main(String [] args){
	Path path = Paths.get("C:\\1\\2a");
	Path path2 = Paths.get("C:\\1\\3a");
	//Path dest = path.resolve(path2.getFileName());
	// output -> C:\1\2a\3a 
	//Path dest = path.resolve(path2);
	// output -> C:\1\\2a\\3a
	Path dest = path.relativize(path2);
	// output -> ..\3a
	Files.isDirectory(path); 
	// returns true only if path is DIR (not a file at the end) AND DIR exist in system!
	System.out.println(dest);
	}

}