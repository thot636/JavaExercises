class tescik {

	public static void main (String[] args){
		int [] tab = {11,12,12,45,23,45,34,34,35,12,12,34,35,13,23,34,45};
		int searchfor = 12;
		int found = 0;
		int []onindex;
		for (int i=0; i<tab.length;i++){
			if(tab[i]!=12)
				continue;
			onindex[found]=i;found++; 
		}
		System.out.println("I found 12 "+found+" times");
		for (int i =0;i<onindex.length;i++)
			System.out.println("found on index: "+onindex[i]);
		}
	
}