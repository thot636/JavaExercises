import java.io.*;
import java.util.Scanner;
import java.util.*;
	


public class Test {

	private static boolean ifDisplay;
	private static List<Person> people;

	public static void main (String [] args)throws IOException{
		ifDisplay=true;
		people = read();
		mainMenu();
	}
	
	public static List<Person> read() throws IOException {
		BufferedReader inputStream = null;
		people = new ArrayList<Person>();
		   try {
            inputStream = new BufferedReader(new FileReader("test.txt"));
			String str;
			StringTokenizer st;
            while ((str = inputStream.readLine()) != null) {
				//System.out.println(str);
				st = new StringTokenizer(str, ";");
				
				while (st.hasMoreElements()) {
					//System.out.println(st.nextElement());
					people.add(new Person((String)st.nextElement(),(String)st.nextElement(),
					Integer.parseInt((String)st.nextElement()),(String)st.nextElement()));
				}
				
            }
        } catch (NumberFormatException e) {
				System.out.println("wrong format of number in the file!");
				System.out.println("Check "+e.getMessage());
		} catch (NoSuchElementException e){
				System.out.println("\nThe number of entries in a row /rows is/are wrong...please check txt file.. ");
		} finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
		return people;
	}
	
	public static int readInput(){
		int num=0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter an integer");
		String myStr = keyboard.next();
		//System.out.println(myStr);
		try{
			num = Integer.parseInt(myStr);
		} catch (NumberFormatException e){
			System.out.println("integers are just allowed!");
		}
		return num;
	}
	
	public static void usage(){
		System.out.println("enter an integer from the above range to make your choice");
	}
	
	public static void mainMenu(){
		if(ifDisplay) {
			System.out.println("\n choose from the following options:"); 
			System.out.println("\n1. Display list unsorted");
			System.out.println("2. Display list - sorted by name");
			System.out.println("3. Display list - sorted by surname");
			System.out.println("4. Display list - sorted by phone numbers");
			System.out.println("5. Exit");
		}
		ifDisplay=true;
	
		int input = readInput();
		if(input>=1 && input <= 5){
			switch (input) {
				case 1:  displayTheListofPeople();
						 break;
				case 2:  Collections.sort(people, new NameComparator());
						 displayTheListofPeople();
				  break;
				case 3:  Collections.sort(people, new SurnameComparator());
						 displayTheListofPeople();
				  break;
				case 4:  Collections.sort(people, new PhoneComparator());
						 displayTheListofPeople();	
				  break;
				case 5:  System.exit(0);
				  break;
			}
		} else  {
			usage();
			ifDisplay=false;
			mainMenu();
		}
	}
	
	public  static void displayTheListofPeople(){
		for(Person p: people){
			p.displayAll();
		}
		// implement continue feature... -? it's not working properly...
		String myStr;
		do{
		System.out.println("please press 'c' the space bar to continue...");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter something here");
		myStr = keyboard.next();
		//System.out.println(myStr.charAt(0));
		}
		while(myStr.charAt(0)=='c');
			mainMenu();
		
	}
	
}

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return a.name.compareToIgnoreCase(b.name);
    }
	
}

class SurnameComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return a.surname.compareToIgnoreCase(b.surname);
    }
	
}

class PhoneComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return (a.phone < b.phone ? -1 : a.phone == b.phone ? 0 : 1);
    } // a.phone is string that's why it is an error
}

class Person {
	String name;
	String surname;
    int phone;
	String city;

	public Person(String n, String s, int p, String c){
		name=n;
		surname=s;
		phone=p;
		city=c;
	}
	
	public void displayAll(){
		System.out.println(this.name+" "+this.surname+" "+this.phone+" "+this.city);
	}
}











