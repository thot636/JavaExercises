class tescik {
	//OuterClass.InnerClass innerObject = outerObject.new InnerClass();
	//private int [] anArray = new int[20];
	int next=0;
	int [] anArray = new int [10];
	//anArray = {0,1,2,3,4,5,6,7,8,9};
	
	tescik(){
	
	tescik.MyIterator mi = this.new MyIterator();
	while(mi.hasNext()){
		System.out.println(mi.getnext()); 
		}
	while(mi.hasNext()){
		System.out.println(mi.getnext()); 
		}	
	}
	
	class MyIterator{
		//int lenght = anArray.length;
		int getnext(){
			return anArray[next++];
		}
		boolean hasNext(){
			boolean bool=true;
			if (next<anArray.length) {
				bool = true;
			} else {
				bool = false;
				next=0;
			}	
		return bool;
		}
		
	}	