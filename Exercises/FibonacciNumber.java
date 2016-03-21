public class FibonacciNumber {
	public static final int ITERATIONS = 5;
	private static int [] tab;
	private static int [] tabRecur;
	private static int recursiveCount=1;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tabRecur = new int [ITERATIONS];
		tabRecur[0]=0;
		tabRecur[1]=1;
		//loopMethod(ITERATIONS);
		recursiveMethod(tabRecur);
	}

	static void loopMethod(int iter){
		tab = new int [iter];
		tab[0]=0;
		tab[1]=1;
		
		for (int i=0;i<ITERATIONS;i++){
			if (i==0)
				System.out.println(tab[0]);
			else if (i==1)
				System.out.println(tab[1]);
			else{
				tab[i] = tab[i-1]+tab[i-2];
				System.out.println(tab[i]);
			}
		}
	}
	
	static void recursiveMethod(int [] tabRecur){
		if(recursiveCount==1){
			System.out.println(tabRecur[recursiveCount]);
			recursiveCount++;
		}
		if(recursiveCount == ITERATIONS)
			System.out.println(tabRecur[recursiveCount-1]+tabRecur[recursiveCount-2]);
		
		else{
			tabRecur[recursiveCount]=tabRecur[recursiveCount-1]+tabRecur[recursiveCount-2];
			System.out.println(tabRecur[recursiveCount]);
			recursiveCount+=1;
			recursiveMethod(tabRecur);
		}
	}
}













