import java.util.Scanner;

public class DiamondShape{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		display(number);
	}
	public static void display(int number){
		int numberOdIntendedRows = number/2;
		int numberOfCharactersInFirstRow = number - numberOdIntendedRows;
		
		for(int i = 1 ; i < number ; i++){
			for(int k = 1 ; k <= numberOfCharactersInFirstRow ; k++){
				if( i <= number/2 && k <= numberOdIntendedRows) {
					System.out.print("-"); 
				} else if(i <= number/2 && k > numberOdIntendedRows){
					System.out.print("*");
				}
				if( i > number/2 && k <= numberOdIntendedRows) {
					System.out.print("-"); 
				} else if (i > number/2 && k > numberOdIntendedRows) {
					System.out.print("*");
				}
			}
			System.out.println("");
			if(i==((number/2))){
				for(int l = 1 ; l <= number ; l++){
					System.out.print("*");
				}
				System.out.println("");
			}
			if(i<number/2){
				numberOfCharactersInFirstRow+=1;
				numberOdIntendedRows--;
			}
			if(i>number/2){
				numberOfCharactersInFirstRow-=1;
				numberOdIntendedRows++;
			}
		}
		
		
	}
}

/*

5: 2 3
--*
-***
*****
-***
--*
7: 3 4

---*
--***
-*****
*******
-*****
--***
---*
9: 4 5
----*
---***
--*****
-*******
*********
-*******
--*****
---***
----*

11 5 6  


*/
