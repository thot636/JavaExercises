class CellAndFloor {
	public static void  main (String [] args) {
		System.out.println("number 88.66 ");
		cellAndFloorToString(88.66);
		System.out.println("number 8.6 ");
		cellAndFloorToString(8.6);
	}
	//option no 1 converting to String
	public static void cellAndFloorToString(double number){
		String str = new Double(number).toString();
		int dot = str.indexOf('.');
		String cell  = str.substring(0,dot);
		String floor  = str.substring(dot+1,str.length());
		System.out.println(cell);
		System.out.println(floor);
	}
	
}	
// print out separetetly floor and celling on the number, e.g input 8.6
// output:
// 8
// 6
	