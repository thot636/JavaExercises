class Prime{
	public static void main(String [] args){
		int currentnumber=1;
		search:
		for ( int number=currentnumber; number<=100 ; number++ ) {
			for(int divisor=1;divisor<=number;divisor++){
				if( (number%divisor)==0 && divisor < number && divisor > 1 || number==1 || number==2 ){
					currentnumber=number+1;
					continue search;
				}
			}
			System.out.println(number);
		}
	}
}