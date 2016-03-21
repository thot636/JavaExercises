public class JoinExample{
	private static Thread t;
	
	static void threadMessage(String message, int i) {
        String threadName =
            Thread.currentThread().getName();
        System.out.format("%s: %s%n",
                          threadName,
                          message+" "+i);
    }
	private static class MessageLoop implements Runnable {
        public void run() {
			int i=0;
			try {
				for(i=1 ; i<=7;i++)
					{
						Thread.sleep(1000);
						threadMessage("counting ",i);
						
					} 
				} catch (InterruptedException e) {
					threadMessage("I wasn't done! ",i);
				}
				
		}
	}
	public static void main(String [] args) throws InterruptedException {
		t = new Thread(new MessageLoop());
        t.start();
		runIt(5000);
	}
	static void runIt(int interruptAfterSeconds ) throws InterruptedException {
		
		t.join(interruptAfterSeconds);
		if(t.isAlive())
			t.interrupt();
		System.out.println("breaked!");
		
	}
}