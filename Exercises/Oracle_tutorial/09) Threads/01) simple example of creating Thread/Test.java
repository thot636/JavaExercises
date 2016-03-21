
// check the order of the output!!!!!

class Test implements Runnable {
	public void run() {
		for (int i =0; i<10;i++){
		
			System.out.println("Hello from a thread! "+i);
		}
    }
	public static void main (String [] args){
		(new Thread(new Test())).start();
		System.out.println("Hello I am outta thread!!!!");
	}
}