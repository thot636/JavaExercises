//1.)For Overriding(Sub classing) ,When class definition is not usable except current case:

class A{
   public void methodA() {
      System.out.println("methodA");
    }
}
class B{
    A a = new A() {
     public void methodA() {
        System.out.println("anonymous methodA");
     }
   };
}

//2.)For implementing an interface,When implemention of interface is required only for current case:

interface interfaceA{
   public void methodA();
}
class B{
   interfaceA a = new interfaceA() {
     public void methodA() {
        System.out.println("anonymous methodA implementer");
     }
   };
}

