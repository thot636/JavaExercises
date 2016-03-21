/*
it will print out all dir and files under specyfied location 
*/
import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;
import java.util.concurrent.TimeUnit;
import java.nio.charset.Charset;
import java.util.*;
import java.nio.channels.*;
import java.nio.ByteBuffer;
import static java.nio.file.StandardCopyOption.*;
import static java.nio.file.FileVisitResult.*;

class Test{
	private static Path startingDir;
	public static void main (String [] args)throws IOException {
		startingDir = Paths.get("C:\\1");
		//Path startingDir = ...;
		PrintFiles pf = new PrintFiles();
		Files.walkFileTree(startingDir, pf);
	
		//new Test().writeSomewhereToFile();
		
		}
	public static class PrintFiles
		extends SimpleFileVisitor<Path> {

		// Print information about
		// each type of file.
		@Override
		public FileVisitResult visitFile(Path file,
									   BasicFileAttributes attr) {
			if (attr.isSymbolicLink()) {
				System.out.format("Symbolic link: %s ", file);
			} else if (attr.isRegularFile()) {
				System.out.format("Regular file: %s ", file);
			} else {
				System.out.format("Other: %s ", file);
			}
			System.out.println("(" + attr.size() + "bytes)");
			return CONTINUE;
		}

		// Print each directory visited.
		@Override
		public FileVisitResult postVisitDirectory(Path dir,
											  IOException exc) {
			System.out.format("Directory: %s%n", dir);
			return CONTINUE;
		}

		// If there is some error accessing
		// the file, let the user know.
		// If you don't override this method
		// and an error occurs, an IOException 
		// is thrown.
		@Override
		public FileVisitResult visitFileFailed(Path file,
										   IOException exc) {
			System.err.println(exc);
			return CONTINUE;
		}
	}
	
	
		
		
	
	
}