import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;
import java.util.concurrent.TimeUnit;
import java.nio.charset.Charset;
import java.util.*;

public class PartNumberComperator{
	private static Path lincolnFile;
	private static Path normalChinaFile;
	private static List <String>lincolnPartsNumberList;
	private static List <String>NormalChinePartsNumberList;
	
	public static void main(String [] args) throws IOException{
		normalChinaFile = Paths.get("C:\\Users\\kderezinski\\Google Drive\\java\\Infomedia\\partNumberComperator\\Files\\China.Spl");
		lincolnFile = Paths.get("C:\\Users\\kderezinski\\Google Drive\\java\\Infomedia\\partNumberComperator\\Files\\Lincoln.Spl");
		lincolnPartsNumberList = new ArrayList<String>();
		NormalChinePartsNumberList = new ArrayList<String>();
		
		readUsinfNewBufferedReader(lincolnPartsNumberList,lincolnFile );	
		//disiplayList(lincolnPartsNumberList);
		
		readUsinfNewBufferedReader(NormalChinePartsNumberList,normalChinaFile );	
		disiplayList(listComperator(lincolnPartsNumberList,NormalChinePartsNumberList));
		
	}
	public static List<String> listComperator (List<String> list1 , List<String> list2){
		List <String>result = new ArrayList<String>();
		for(String s1: list1){
			for (String s2:list2)
			{
				if(s1.compareTo(s2)==0)
					result.add(s1);
			}
		}
		return result;
	}
	
	public static void readUsinfNewBufferedReader(List <String> partsList, Path path){
				String tempRemoveWhiteSpaces;
				String trimLeadingAndTrailingWhitespaces;
				
				Charset charset = Charset.forName("US-ASCII");
				try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
					String line = null;
					while ((line = reader.readLine()) != null) {
						//System.out.println(line);
						//tempRemoveWhiteSpaces=line.replaceAll("\\s","");
						trimLeadingAndTrailingWhitespaces=line.trim();
						if(trimLeadingAndTrailingWhitespaces.startsWith("<PART_NUMBER>")){
							//partsList.add(trimLeadingAndTrailingWhitespaces);
							partsList.add(trimLeadingAndTrailingWhitespaces.substring(13,33).replaceAll("\\s",""));
						}
					}
					
				} catch (IOException x) {
					System.err.format("IOException: %s%n", x);
				}
			
			}
			public static void disiplayList(List <String> partsList){
				
				for(String s: partsList ){
						//System.out.println(partsList.size());
						System.out.println(s);
					}
			}	
}