class tescik {

	public static void main (String[] args){
		String myString = "mysubstring which  mich be read as a sub seb sup sub ";
		String subString ="sub";
		
		test:
		for (int i=0;i<myString.length();i++){
			int length = subString.length();
			int j=i;
			int k=0;
			while (length--!=0) {
				if (subString.charAt(k++)!=myString.charAt(j++))
					continue test;
				}
				System.out.println("found the bastard!");	
			}
		}
}