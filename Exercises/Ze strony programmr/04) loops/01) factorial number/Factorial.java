class Factorial{
	public static void main (String [] args){
		System.out.println("Factorial number for 2 is: "+ countFactorial(2));
		System.out.println("Factorial number for 4 is: "+ countFactorial(4));
		System.out.println("Factorial number for 5 is: "+ countFactorial(5));
	}
	public static int countFactorial(int number){
		int factorialNumber=1;
		for(int i =1 ; i <number;i++){
			factorialNumber = factorialNumber*(i+1);
		}
		
		return factorialNumber;
	}
}