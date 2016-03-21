/*
adventage: no matter which contructor you invoke this code always runs!

Instance Initialization blocks run every time a class instance is created.
Instance Initialization blocks run after the constructor’s call to super().

why to use it ?

- When you have multiple constructors or overloaded constructors in your class, And you have certain common operation or initialization in each constructor then you can write those common operations in instance initialization block.

- This way we make sure that irrespective of any constructor invoked that common operations would be executed or taken care by JVM itself.


*/

class Test extends MySuperClass {
	public static void  main (String [] args){
		new Test(); // here will invoke my super class Initialization Block! 
	}
}

class MySuperClass {
	{
		System.out.println("this is my Super Class!");
	}
}