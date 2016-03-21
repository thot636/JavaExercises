/*
Static Initialization Block

is used to set values of static field if it cannot be done in one line 
e.g. static final constants, when some calculations preecede value assignment to this constant 
class Test2 is an example

!!! important !!! ->  statick block runs JUST ONE when class is CONSTRUCTED 
contructed it means: 1) when object of class os created, 02) static metohod from that class is used
in another class e.g. Test2.statMeth(); in class Test
*/

class Test {
	static {
		System.out.println("beyond the method in class Test!");
	}
	public static void main (String [] args){
	Test2 t2 = new Test2();
	Test2 t3 = new Test2();
	Test2.statMeth();
	}
}

class Test2 {
	static final MYCONSTANT;
	static {
		int a = Work.doSomeCalculation();
		int b = Work.doSomeCalculation2();
		MYCONSTANT = a + b; // you cannot do this calculation outside this block form static final..
		System.out.println("beyonfd the method in class Test2!");
	}
	public static void statMeth(){
	System.out.println("this is just static metohd");
	}
}