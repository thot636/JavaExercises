class EvenOrOdd{
	public static void main(String [] agrs){
		System.out.println("number  1 is "+evenOrOdd(1));
		System.out.println("number  3 is "+evenOrOdd(3));
		System.out.println("number  5 is "+evenOrOdd(5));
		System.out.println("number  6 is "+evenOrOdd(6));
		System.out.println("number  9 is "+evenOrOdd(9));
		System.out.println("number 15 is "+evenOrOdd(15));
		System.out.println("number 16 is "+evenOrOdd(16));
		System.out.println("number 17 is "+evenOrOdd(17));
		System.out.println("number 19 is "+evenOrOdd(19));
	}
	public static String evenOrOdd(int number){
		String even = "even";
		String odd = "odd";
		for(int i = 2 ; i < number ; i++)
		{
			if(number%i==0)
				return even;
		}
		return odd;
	}
}