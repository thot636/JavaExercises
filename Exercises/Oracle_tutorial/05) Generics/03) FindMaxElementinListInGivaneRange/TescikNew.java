/*Write a generic method to find the maximal element in the range [begin, end) of a list.*/
 import java.util.*;                                                               
public class TescikNew {
		
	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(3));
		list.add(new Integer(2));
		list.add(new Integer(7));
		list.add(new Integer(8));
		list.add(new Integer(6));
		new Find<Integer>().findTheBiggestInteger(list,0,4, new CheckforInteger() );
	}	
}

class Find <T> {

	public <T> void findTheBiggestInteger(List <T> list,int from,int to,Numberable<T> n ){
	
		list.subList(0, from).clear();
		list.subList((to-from), list.size()).clear();
		System.out.println(list.size());
		n.check(list);	
	}
}

interface Numberable<T>{

	public void check(List<T> t);
}

class CheckforInteger implements Numberable <Integer>{

	public void check(List<Integer> list){
	
		Integer temp = new Integer(0);
		for (Integer counter : list){
			if(counter>temp)
				temp=counter;
		}
		System.out.println("Najwiekszy Integer "+temp);
	}
} 
