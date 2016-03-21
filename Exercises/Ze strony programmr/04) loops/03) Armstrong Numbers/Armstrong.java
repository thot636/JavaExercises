class Armstrong{
	public static void main (String [] args){
		int fstDig = 1;
		int sndDig = 0;
		int trdDig = 0;
		int fthDig = 0;
		System.out.println("Searching for a Armstrong number among 3 digits with raise each digit to the third power");
		for (fstDig = 1 ; fstDig <=9 ; fstDig++)
		{
			for (sndDig = 0 ; sndDig <= 9 ; sndDig ++)
			{
				for (trdDig = 0 ; trdDig <= 9 ; trdDig++)
				{
					int tempFst=fstDig*100; //System.out.println(fstDig +" "+sndDig+" "+trdDig+" ");
					int tempSnd=sndDig*10;
					int temptrd=trdDig*1;
					int number = tempFst + tempSnd + temptrd;
					
					//int potega = (sndDig*sndDig*sndDig)+(trdDig*trdDig*trdDig);
					//System.out.println("potega: "+potega);
					//System.out.println("number: "+number);
					
					if((fstDig*fstDig*fstDig)+(sndDig*sndDig*sndDig)+(trdDig*trdDig*trdDig)==number)
						System.out.println("Found Armstrong number! "+number);
				}
			}
		}
		
		System.out.println("Searching for a Armstrong number among 4 digits with raise each digit to the fourth power");
		
		for (fstDig = 2 ; fstDig <=2 ; fstDig++)
		{
			for (sndDig = 0 ; sndDig <= 9 ; sndDig ++)
			{
				for (trdDig = 0 ; trdDig <= 9 ; trdDig++)
				{
					for (fthDig = 0 ; fthDig <= 9 ; fthDig++)
					{
						int tempFst=fstDig*1000; //System.out.println(fstDig +" "+sndDig+" "+trdDig+" ");
						int tempSnd=sndDig*100;
						int temptrd=trdDig*10;
						int tempfth=fthDig*1;
						int number = tempFst + tempSnd + temptrd + tempfth;
						
						//int potega = (fstDig*fstDig*fstDig)+(sndDig*sndDig*sndDig)+(trdDig*trdDig*trdDig)+(fthDig*fthDig*fthDig);
						//System.out.println("potega: "+potega);
						//System.out.println("number: "+number);
						
						if((fstDig*fstDig*fstDig)+(sndDig*sndDig*sndDig)+(trdDig*trdDig*trdDig)+(fthDig*fthDig*fthDig)==number)
							System.out.println("Found Armstrong number! "+number);
					}
				}
			}
		}
	}
}

/*
Using nested for  loops, find all the three-digit Armstrong numbers. Armstrong numbers are three digit numbers such that the sum of the digits cubed is equal to the number itself.

For example, 153 is an Armstrong number because 1³ + 5³ + 3³ = 153

However, 294 is not, because 2³ + 9³ + 4³ = 801 (not 294)

Output:

153

370

371

407
*/