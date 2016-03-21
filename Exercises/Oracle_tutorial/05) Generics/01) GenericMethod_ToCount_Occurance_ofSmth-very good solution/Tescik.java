 import java.util.*;                                                               
public class Tescik {
		
	public static void main(String[] args) {
		List <Integer> list = new ArrayList<Integer>();
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(new Integer(5));
		list.add(new Integer(15));
		list.add(new Integer(17));
		System.out.println(Checking.checkOccurance(list,new OddNumbers())); // return 5
		System.out.println(Checking.checkOccurance(list,new PrimeNumbers())); // retunr 4
		}
}
class Checking <T>{

// beceuse you are using Testable Interface you can pass here any class which implmenet thos
// this interface and it is proper to check occurance for your type of objects...
// important to look: Testable <T> p, i , p.test(elem) -> it invoke class which we specify 
// in 2nd argumnet for rhis method

public static <T> int checkOccurance(Collection <T>collec, Testable <T> p){
	int count=0;
	for (T elem : collec){
			if (p.test(elem)) // magic :)
				++count;
		}
	return count;
	}	
}
interface Testable <T>{
	public boolean test(T obj);
}

class OddNumbers  implements Testable <Integer>{ //1,3,5,7,9,11,13,15,17,19,21,23,25...} 
	int elem;
	public  boolean test (Integer obj){
		elem = obj.intValue();
		if ((elem%2)==0)
			return false;
	return true;
	}
}
class PrimeNumbers implements Testable <Integer> { //1.3.5.7.11.13.17.19...
	int elem;
	public  boolean test (Integer obj){
	elem = obj.intValue();
	for(int i=2;i<elem;i++){
		if((elem%i)==0)
			return false;
		return true;
	}
	return false;
	}
}
