import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Palindrome {
	private static List<String> listOfWords;
	private static List<String> listOfWordsAfterFormatting;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		readFileIn();
		checkIfPalindorome(listOfWords , listOfWordsAfterFormatting);
	}

	public static void checkIfPalindorome(List<String> words, List<String> stream){
		// check if odd, if true -> remove middle element
		for(int i = 0 ; i < stream.size() ; i++){
			if(checkIfOddNumber(stream.get(i).length())){
				stream.set(i, removeMiddleElelement(stream.get(i)));
			}	
		}
		// check if palindrome
		for(int i = 0 ; i < stream.size() ; i++){
			boolean Palindrome = true;
			System.out.println("checking phrase: "+words.get(i));
			
			for(int k=0 ; k < stream.get(i).length()/2 ; k++){
				String temp = stream.get(i);
				if(temp.charAt(k) != temp.charAt((temp.length()-1)-k)){
					System.out.println("Not a palindrome!");
					Palindrome = false;
					break; 
				}
			}
			if (Palindrome)
				System.out.println("This is Palindrome!");
		}
		
	}
	
	private static String removeMiddleElelement(String str){
		String temp;
		temp = str.substring(0, (str.length()/2)) + str.substring((str.length()/2)+1, str.length());
		return temp;
	}
	private static boolean checkIfOddNumber(int number){
		
		for(int i = 2 ; i < number ; i++)
		{
			if(number%i==0)
				return false;//even
		}
		return true;//odd
	}
	public static void readFileIn() throws FileNotFoundException{
		String filePath = "C:\\Users\\thot\\Google Drive\\java\\projecs\\uczenieSie\\Z tej strony programmr\\09) misc\\01_Palindrome_checker\\examples.txt";
		File file = new File(filePath);
		Scanner in = new Scanner(file); 
		listOfWords = new ArrayList<>();
		listOfWordsAfterFormatting = new ArrayList<>();
		while(in.hasNextLine()){
			String temp = in.nextLine();
			listOfWords.add(temp);
			String removedUneccessary = temp.replaceAll("[^a-zA-Z]", "").toLowerCase();
			listOfWordsAfterFormatting.add(removedUneccessary);
		}
		in.close();
	}
	

}
