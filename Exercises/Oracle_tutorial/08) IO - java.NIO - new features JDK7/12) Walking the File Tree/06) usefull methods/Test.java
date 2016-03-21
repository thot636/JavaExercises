import java.nio.file.*;
class Test{

	static public void main(String [] args){
	Path path = Paths.get("C:\\1\\2a");
	Path path2 = Paths.get("C:\\2\\3a\\3b");
	Path path3 = Paths.get("C:\\2\\3a\\3b\\3c");
	//Path dest = path.resolve(path2.getFileName());
	// output -> C:\1\2a\3b -> took 3b from 'path2' and add to the 'path' 
	//Path dest = path.resolve(path2);
	// output -> C:\2\3a\3b -> overwrite 'path' into 'path2' (even 'path' is longer than 'path2'
	//Path dest = path.relativize(path2);
	// output -> ..\..\2\3a\3b
	//Path dest = path2.relativize(path3);
	// output -> 3c	
	// below -? really good if u wanna copy with WalkTreeFile and maintain dir structure
	//Path dest = path.resolve(path2.relativize(path3));
	// output -> C:\1\2a\3c
	//boolean isDir = Files.isDirectory(path);
	// returns true only if path is DIR (not a file at the end) AND DIR exist in system!
	System.out.println(dest);
	}

}