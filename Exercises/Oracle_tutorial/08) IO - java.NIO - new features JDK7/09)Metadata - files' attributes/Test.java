import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;
import java.util.concurrent.TimeUnit;

class Test{
	public static void main (String [] args)throws IOException {
		Path file = Paths.get("c:\\1\\2\\myFile.txt");
		BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
		new Test().basicOperations(attr);
	}
	public void basicOperations(BasicFileAttributes attr) throws IOException{
		
		System.out.println("creationTime: " + attr.creationTime());
		System.out.println("lastAccessTime: " + attr.lastAccessTime());
		System.out.println("lastModifiedTime: " + attr.lastModifiedTime());
		System.out.println("isDirectory: " + attr.isDirectory());
		System.out.println("isOther: " + attr.isOther());
		System.out.println("isRegularFile: " + attr.isRegularFile());
		System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
		System.out.println("size: " + attr.size());
	
	}
	
}