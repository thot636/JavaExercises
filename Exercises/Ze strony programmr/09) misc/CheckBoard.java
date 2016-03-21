package przygotowanka;
import java.util.Scanner;

class CheckBoard{
	public static void main(String [] args){
		int iterations  = 0;
 
		System.out.println("Enter how big you want to have your CheckBoard.");
		Scanner in = new Scanner(System.in);
		iterations = in.nextInt();
		display(iterations);
	} 
	public static void display(int iterations){
		for (int columns = 1 ; columns <= iterations ; columns++ ){
			int i = 0;
			// check if column is odd 
			if(columns%2 != 0){
				while(i <= iterations){
					System.out.print("%");
					i++;
					if(i>=iterations)
						break;
					System.out.print("_");
					i++;
				}
			}
			// check if column is even
			if(columns%2 ==0){
				while(i <= iterations){
					System.out.print("_");
					i++;
					if(i>=iterations)
						break;
					System.out.print("%");
					i++;
				}
					
			}
			System.out.println();
			
		}
		
	}
}