public class Divide {
	public static void main(String args[]){
		System.out.println(divide(7,56));
	}
	static int divide(int divisor, int dividend) {

		int quotient = 0;
		while (divisor <= dividend) {
			dividend = dividend - divisor;
			quotient++;
			}
		return quotient;
	}
}