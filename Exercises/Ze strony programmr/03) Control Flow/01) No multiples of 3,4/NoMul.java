import java.io.*;
import java.util.Scanner;
import java.util.*;

class NoMul{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		String temp = sc.next();
		int n = (new Integer(temp)).intValue();
		display(n);
	}
	public static void display(int n){
		for (int i = 1 ; i<=n ; i++){
			if (i%3==0 || i%4==0)
				continue;
			System.out.println(i);
		}
	}
}

//display from 1 to n  except multiples of 3 or 4.
