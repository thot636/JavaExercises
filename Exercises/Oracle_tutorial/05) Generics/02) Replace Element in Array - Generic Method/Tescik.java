 import java.util.*;                                                               
public class Tescik {
		
	public static void main(String[] args) {
		List <Integer> list = new ArrayList<Integer>();
		Integer [] myArray = new Integer[2];
		myArray[0]=new Integer(1);
		myArray[1]=new Integer(2);
		Double [] myArray1 = new Double[2];
		myArray1[0]=new Double(1.1);
		myArray1[1]=new Double(2.2);
		testClass [] ts = new testClass [2];
		ts[0]= new testClass();
		ts[1]= new testClass();
		new Exchange<Integer>().exchange(myArray);
		new Exchange<Double>().exchange(myArray1);
		new Exchange<testClass>().exchange(ts);
		}
	
}
class testClass {}
class Exchange <T>{
	T  [] tempTab;
	T t1;
	public T[] exchange(T [] tab){
		// NEVER EVER DO THIS !!!!! when tou want to switch elements in attays
		/*tempTab = tab; // two variables one instance....
		tab[0]=tempTab[1];
		tab[0]=tempTab[1];*/
		System.out.println("before "+tab[0]);
		System.out.println("before "+tab[1]);
		T t0 =tab[0];
		T t1 =tab[1];
		tab[0]=t1;
		tab[1]=t0;
		System.out.println("after "+tab[0]);
		System.out.println("after "+tab[1]);
		return tab;
		}
	//public <T> void set(T t) { t1 = t; }
}
