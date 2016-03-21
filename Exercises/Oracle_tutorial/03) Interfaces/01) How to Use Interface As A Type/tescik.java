/*
it is very usefull, becasue, once a class implements Comparable Interface, it needs to deliver its 
own implmentation of isLargetThan method, thus everywhere in a code you can invoke findLargest
this method can be used for all CLASS WHICH IMPLEMENT COMPARABLE INTERFACE, you dont need to re-write
this metohod - it is really cool.
*/
interface Comparable {
	public int isLargetThan(Comparable comparable);
}
class tescik {
	
	public  Object findLargest(Object obj1, Object obj2){
		Comparable comparable1 = (Comparable)obj1;	
		Comparable comparable2 = (Comparable)obj2;
		if ((comparable1).isLargetThan(comparable2) > 0) {
			return obj1;
		} else if (comparable1.isLargetThan(comparable2) < 0){
			return obj2;
		} else
			return null;
	}
	
	
	public static void main (String[] args){
		Person person1 = new Person();
		person1.age=10;
		Person person2 = new Person();
		person2.age=20;
		System.out.println(((Person) new tescik().findLargest(person1,person2)).age);
	}	
}	

class Person implements Comparable {
	int age;
	public int isLargetThan(Comparable comparable){
		Person person2 = (Person)comparable;
		if (this.age > person2.age )	{
			return 1;
		}else if (this.age == person2.age){
			return 0;
		}else {
			return -1;
		}		
	}
}








