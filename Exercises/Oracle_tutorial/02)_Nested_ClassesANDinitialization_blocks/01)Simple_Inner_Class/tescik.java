class tescik {
	private String var_tescik;
	tescik(){
	var_tescik="Oto Normlany ja!";
	System.out.println("przed: "+var_tescik);
	//OuterClass.InnerClass innerObject = outerObject.new InnerClass();
	System.out.println(this.new InnerTescik().changeMe());
	}
	class InnerTescik{
		String changeMe(){
		return var_tescik="Jam zmieniony!";
		}
	}
	
	public static void main (String[] args){
		new tescik();
		}
		
}	