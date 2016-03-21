// Recursive method which display String backwards
class RecursiveMethod {
	public static void main (String [] args){
		reverse("WIOLA");
		
	}
	public static void reverse (String str){
		char temp=str.charAt(str.length()-1);
		System.out.print(temp);
		str= str.substring(0,str.length()-1);
		if(str.length()!=0){
				reverse(str);
		}
		
		
		
	}
}