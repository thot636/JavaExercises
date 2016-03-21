import java.util.Scanner;

class Pin {
	private final static int CORRECT_PIN = 1234;
	public static void main (String [] args){
		tryPin();
	}
	public static void tryPin(){
		Scanner sc = new Scanner(System.in);
		for (int i = 1 ; i <= 3 ; i++){
			System.out.println("Enter PIN number");
			int pin = sc.nextInt();
			if(pin == CORRECT_PIN){
				System.out.println("PIN is correct");
				break;
				}
			if(i==3){
				System.out.println("your account is locekd now!");
				break;
			}			
			System.out.println("wrong PIN, try again!");
			
			
		}
	}
}