/*
And like static class methods, a static nested class cannot refer directly to instance variables or methods defined in its enclosing class — it can use them only through an object reference.

thus - you cannot access to the private members of Outer Class!
*/

class Test {
	
	private int field;
	public static void main (String [] args){
/*
creating static inner class

OuterClass.StaticNestedClass nestedObject =
     new OuterClass.StaticNestedClass();

*/	
	}
	private static void sec() {, parti
	static class MyStaticClass {
		public static void metoda(){ 
			sec();
		
		}
		public void nonStatic(){
		}
	}
}

class Test2 {
 // ivoking
	public void metodka(){
		Test.MyStaticClass.metoda();
		// or
		new Test.MyStaticClass().nonStatic();
		
	}

}