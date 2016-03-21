class MyTest {
	public static void main (String [] args){
		new TestAnonymous().display();
		new MyTest().testOfAnanymousClass();
		new MyTest().testOfAnanymousClass2();
	}
	// override display() method - visible just in this method
	public void testOfAnanymousClass(){
		TestAnonymous ta = new TestAnonymous(){
			public void display(){
				System.out.println("Anonymously ovveridden!");
			}
		};
		ta.display();
	}
	// adding an initialization block  - visisble just in this method!
	public void testOfAnanymousClass2(){
		TestAnonymous ta = new TestAnonymous(){{
			System.out.println("initiazliation block!");
		}};
	}
}

class TestAnonymous {
	public void display(){
		System.out.println("original!!");
	}
}