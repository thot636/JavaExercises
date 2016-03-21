import java.io.*;

class Test{
	static DataOutputStream out;
	static DataInputStream in;
	static final String dataFile = "invoicedata";
	static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
	static final int[] units = { 12, 8, 13, 29, 50 };
	static final String[] descs = {
		"Java T-shirt",
		"Java Mug",
		"Duke Juggling Dolls",
		"Java Pin",
		"Java Key Chain"
	};
	public static void main(String [] args){
		write();
		read();
	}
	static void write(){
		try{
			out = new DataOutputStream(new BufferedOutputStream(
              new FileOutputStream("output.txt")));
			for (int i = 0; i < prices.length; i ++) {
				out.writeDouble(prices[i]);
				out.writeInt(units[i]);
				out.writeUTF(descs[i]);
			}
			out.close();
		} catch (FileNotFoundException e){
			System.out.println("blad");
		} catch (IOException e){
			System.out.println("IOException...blad");
		}
	}
	static void read(){
		try {
			in = new DataInputStream(new
				BufferedInputStream(new FileInputStream("output.txt")));

			double price;
			int unit;
			String desc;
			double total = 0.0;
		
		
			while (true) {
				price = in.readDouble();
				unit = in.readInt();
				desc = in.readUTF();
				System.out.format("You ordered %d" + " units of %s at $%.2f%n",
					unit, desc, price);
				//System.out.println("You ordered " + " units of  at "+
				//	unit + desc + price); // normlany println tez dziala
				total += unit * price;
			}
		} catch (EOFException e) {
			System.out.println("EOFException - it needs to be catch here it is correct");
		} catch (IOException e){
			System.out.println("IOException");
		}
	}

}