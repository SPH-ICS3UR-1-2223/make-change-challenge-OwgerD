import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Your challenge is to read in a price
		System.out.println("What is the price of the product?");
		double price = in.nextDouble();
		//Read in the amount paid
		System.out.println("How much did you pay for it?");
		double pay = in.nextDouble();
		//Print out the amount of change
		double change = pay - price;
		int leftover = (int)((change*100)%10);
		if (leftover==1 || leftover ==2) {
			change=change-(leftover/100.0);
		}else if (leftover==3 || leftover==4) {
			change=change + ((5-leftover)/100.0);
		}
		if(change<0) {
			System.out.println("Sorry, but this isn't enough.");
		}
		else if(pay==price) {
			System.out.println("Your change is $0.00");
		}
		//Break the change into all denominations: 
		//$100,$50,$20,$10,$5,$2,$1,$0.25,$0.10,$0.05
	if (change / 100 >=1) {
		int hund =(int) change/100;
		System.out.println("$100s:"+hund);
		change=change-hund*100;
		change=Math.round(change*100)/100.0;
	}
	if(change / 50>=1) {
		int fifty =(int) change/50;
		System.out.println("$50s:"+fifty);
		change=change-fifty*50;
		change=Math.round(change*100)/100.0;
	}
	if(change / 20>=1) {
		int twen =(int) change/20;
		System.out.println("$20s:"+twen);
		change=change-twen*20;
		change=Math.round(change*100)/100.0;
	}
	if(change / 10>=1) {
		int ten =(int) change/10;
		System.out.println("$10s:"+ten);
		change=change-ten*10;
		change=Math.round(change*100)/100.0;
	}
	if(change / 5>=1) {
		int five =(int) change/5;
		System.out.println("$5s:"+five);
		change=change-five*5;
		change=Math.round(change*100)/100.0;
	}
	if(change / 2>=1) {
		int two =(int) change/2;
		System.out.println("$2s:"+ two);
		change=change-two*2;
		change=Math.round(change*100)/100.0;
	}
	if(change / 1>=1) {
		int one =(int) change/1;
		System.out.println("$1s:"+ one);
		change=change-one*1;
		change=Math.round(change*100)/100.0;
	}
	if(change / 0.25>=1) {
		int quart = (int) (change/0.25);
		System.out.println("$0.25s:"+ quart);
		change=change-quart*0.25;
		change=Math.round(change*100)/100.0;
	}	
	
	
	if(change / 0.10>=1) {
		int dime = (int) (change/0.10);
		System.out.println("$0.10s:"+ dime);
		change=change-dime*0.10;
		change=Math.round(change*100)/100.0;
	}		
	if(change / 0.05>=1) {
		int Nick = (int) (change/0.05);
		System.out.println("$0.05s:"+ Nick);
		change=change-Nick*0.05;
	}	

	
	


	
		//As a bonus, make your project round to the nearest $0.05 like actual stores.

		in.close();
	
	
}
}
