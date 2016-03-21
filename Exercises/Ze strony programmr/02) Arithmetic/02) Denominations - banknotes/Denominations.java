import java.io.*;
import java.util.Scanner;
import java.util.*;

class Denominations{
	public static void  main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("podaj ilosc piniedzy");
		String temp  =  sc.next();
		int money = (new Integer(temp)).intValue();
		display(money);
	}
	public static void display(int money){
	
		if (money/1000 >=1){
			System.out.println("number of 1000 notes are " + money/1000);
			money = money - (money/1000)*1000;
			}
		if (money/500 >=1){
			System.out.println("number of 500 notes are " + money/500);
			money = money - (money/500)*500;
			}
		if (money/200 >=1){
			System.out.println("number of 200 notes are " + money/200);
			money = money - (money/200)*200;
			}
		if (money/100 >=1){
			System.out.println("number of 100 notes are " + money/100);
			money = money - (money/100)*100;
			}
		if (money/50 >=1){
			System.out.println("number of 50 notes are " + money/50);
			money = money - (money/50)*50;
			}
		if (money/20 >=1){
			System.out.println("number of 20 notes are " + money/20);
			money = money - (money/20)*20;
			}
		if (money/10 >=1){
			System.out.println("number of 10 notes are " + money/10);
			money = money - (money/10)*10;
			}
		if (money/5 >=1){
			System.out.println("number of 5 notes are " + money/5);
			money = money - (money/5)*5;
			}
		if (money/2 >=1){
			System.out.println("number of 2 notes are " + money/2);
			money = money - (money/2)*2;
			}
		if (money/1 >=1){
			System.out.println("number of 1 notes are " + money/1);
			money = money - (money/1)*1;
			}
		
			
		
	}
}
// you have notes 1000 , 500, 200, 100, 50 , 20,10, 5 , 2 , 1 
// for input 1521, displays output
// number of 1000 notes are 1
// number of 500 notes are 1
// number of 20 notes are 1
// number of 1 notes are 1
