public class Person{

String name;
	public static void main (String [] main){
		Person anna = new Person();
		anna.name="Anna";
		Person kate = new Person();
		kate.name="Kate";
		
		anna.bow(kate);
	}
	
	public void bow(Person person){
		System.out.println("in bow: "+this.name);
		person.bowback(this);
	}
	public void bowback(Person person){
		System.out.println("in bowback: "+this.name);
	}

}






