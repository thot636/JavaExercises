                                                                
public class Tescik {
		
	public static void main(String[] args) {
		
		String firstA = "Ala,.' MaKota"; // should be true
		String firstB = "KotaA,.l: aMa";
		String secA = "Alra,.' MaKota"; // should be wrong
		String secB = "KotaA,.l: aMa";
		String thA = "Ala,.' MaKota"; // should be wrong
		String thB = "KortaA,.l: aMa";
		String frA = "Ala,.' MaKota"; // should be true
		String frB = "KOTaA,.l: aMa";	
		System.out.println("1: " +new Checking().check(firstA, firstB));
		System.out.println("2: " +new Checking().check(secA, secB));
		System.out.println("2: " +new Checking().check(thA, thB));
		System.out.println("2: " +new Checking().check(frA, frB));
	}
}
class Checking {
	
	public boolean check (String s1, String s2){
		// cut all besides a-z
		String regex = "[^a-zA-Z]"; 
		String org = s1.replaceAll(regex,"").toLowerCase();
		String sec = s2.replaceAll(regex,"").toLowerCase();
		String secCopy=sec;
		char c;
		for(int i=0;i<org.length();i++){
			c = org.charAt(i);
			String ch = String.valueOf(c);
			if (sec.indexOf(c)==-1)
				return false;
			secCopy=sec.replaceFirst(ch,"");
			sec=secCopy;
			//System.out.println("to: "+sec);
		}
		if (secCopy.length()==0){
			return true;
		}
		return false;
	}
	



}