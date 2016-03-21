package przygotowanka;
// rekurywnie wyswietl od 1 do 100 i od 100 do 1

class Rekursywnie {
		final static int countTo=100;		
		public static void main (String [] args){
		int i = 1;
		new Rekursywnie().rekursywnie3(i);
	}
	
	public void rekursywnie3(int n){
		if(n==countTo){
			System.out.println(n);			
		} else{
			System.out.println(n);
			rekursywnie3(n+1);
			System.out.println(n);
		}
	}
}	