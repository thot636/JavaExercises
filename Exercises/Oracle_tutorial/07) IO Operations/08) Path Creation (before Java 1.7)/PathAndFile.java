import java.io.*;
class PathAndFile {
	public static void main (String [] args){
		try {
			File dir = new File("C:\\1\\Desktop\\dir1\\dir2");
			dir.mkdirs();
			File file = new File(dir, "filename.txt");
			FileWriter newJsp = new FileWriter(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}