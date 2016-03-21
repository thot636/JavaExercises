/*
srookaa
*/

class tescik implements CharSequence  {

	String reversedString="";
	String orgString;
	
	public tescik() {}
	public tescik(String varString) {
		orgString = varString;
	}
	public char charAt(int index){
		char thisChar ='a';
		if(reversedString == "")
			this.reverse();
		return thisChar=reversedString.charAt(index);
	}
	public int length(){
		if(reversedString == "")
			this.reverse();
		return reversedString.length();
	}
	public CharSequence subSequence (int start, int end){
		// alaMa -> (1.4) -> laM
		String subSeq = "";
		char [] seqArr = new char [orgString.length()];
			if(reversedString == "")
				this.reverse();
		for(int i = 0; i<reversedString.length();i++ ){
			seqArr[i]=reversedString.charAt(i);
			//System.out.println("to? "+seqArr[i]);
			if(i>=start && i<end)
				subSeq += Character.toString(seqArr[i]);
		}
		System.out.println("ok "+subSeq);
		
		CharSequence charSeq = new tescik(subSeq);
		System.out.println("heh "+((tescik)charSeq).orgString);
		//return charSeq;
		return subSeq;
	}
	public String toString(){
		if(reversedString == "")
			this.reverse();
		return reversedString;
	}
	public String reverse(){
		int length = orgString.length();
		int count = length;
		char [] arrChar = new char[length];
		for (int i = 0;i<length;i++){
			arrChar[i]=orgString.charAt((--count));
			reversedString +=Character.toString(arrChar[i]);
		}
		return reversedString;
	}

	public static void main (String[] args){
		//new tescik().test();
		String ts="ABCDEF"; //FEDCBA
		tescik tes = new tescik(ts);
		System.out.println("nowe: "+tes.subSequence(1,4));
	}
	void test(){
		//String testString = //"WriteaClassThatImplementsTheCharSequenceInterfaceFound";
		String testString = "alaMaKotaAKotMaAle";
		
		tescik testingObj = new tescik(testString); 
		System.out.println(testingObj.reverse());
		System.out.println(testingObj.charAt(3));
		System.out.println(testingObj.length());
		System.out.println(testingObj.toString());
		System.out.println(testingObj.subSequence(1,4));
	}
}	

/*
String mojString ="alaMaKotaAKotMaAle";
		char mojChar = mojString.charAt(3);
		System.out.println(mojChar);
		// M
		int length = mojString.length();
		System.out.println(length);
		// 18
		CharSequence cq = mojString.subSequence(1,4);
		System.out.println(cq);
		// laM
		// this one should return reverse String
		String newString = mojString.toString();
		System.out.println(newString);
*/
