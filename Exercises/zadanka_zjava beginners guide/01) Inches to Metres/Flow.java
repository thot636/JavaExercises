import java.text.DecimalFormat;
class Flow{
	public static void main(String[] args){
		convert();
	}
	public static void convert(){
		double inches, meters;
		//int feet;
		for ( int feet=0;feet<12;feet++){
			for (int i=1;i<=12;i++){
				meters = (((feet*12)+i)*0.0254);
				DecimalFormat df = new DecimalFormat("#.####");
				System.out.println("feet: "+feet+" in: "+i+" equals meters:"+df.format(meters));
				if(i==12)
					System.out.println();
			}
		}
	}
}