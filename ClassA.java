package Our_Shop;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ClassA 
{
	int bill = 0;
	int quty = 0;
	
  Scanner sc = new Scanner(System.in);
  
  
  
  void meth1() 
  {
  boolean continueshopping = true;
	
while(continueshopping)
{
	System.out.println("=========================================");
	System.out.println("==== * Welcome To All in One Shop * =====");
	System.out.println("=========================================");
	  
	
	System.out.println(" 1.Grocery & Kitchen \n 2.Snacks & Drinks \n 3.Beauty & Personal care \n 4.Electronics \n 5.Sport Items \n 6. Exit & Generate Bill");
	
	System.out.println("-------------------------------------------------");
	System.out.println("  What you want to need... Please Enter the No.");
	System.out.println("-------------------------------------------------");
	int a = sc.nextInt();
	
	if(a==6)
	{
		continueshopping = false;
		break;
	}
	switch(a)
	{

	
	
	case 1://main case 1 
		System.out.println("--**--1.Grocery & Kitchen--**--");
	    System.out.println(" 1.Potato          30.kg");
		System.out.println(" 2.Onion           30.kg");
		System.out.println(" 3.Cucumber        30.kg");
		System.out.println(" 4.Broccoli        120.kg");
		System.out.println(" 5.Cabbage         50.kg");
		System.out.println(" 6.Chilli          90.kg");
		System.out.println(" 7.Capsicum        60.kg");
		System.out.println(" 8.Beetroot        80.kg");
		System.out.println(" 9.Tomato          50.kg");
			
		int b;
		do
		{
			System.out.println("Choose item (1-9) or 10 to go back to Main Menu");
	
	   b = sc.nextInt();
	   if(b==10) {
		   break;
	   }
	   
		switch(b)
		{
		
		case 1:
			System.out.println("  Potato          30.kg");
			System.out.println("  Plss enter quantity: ");
			quty=sc.nextInt();
			bill += quty*30;
			System.out.println("Added.! Current Total : "+bill);
			break;
			
		case 2: 
			System.out.println("  Onion           40.kg");
			System.out.println("  Plss enter quantity: ");
			quty=sc.nextInt();
			bill += quty*40;
			System.out.println("Added.! Current Total : "+bill);
			
		    break;
		case 3:
			System.out.println("  Cucumber        30.kg");
			System.out.println("  Plss enter quantity: ");
			quty=sc.nextInt();
			bill += quty*30;
			System.out.println("Added.! Current Total : "+bill);

			
			break;
		case 4:
			System.out.println("  Broccoli        120.kg");
			System.out.println("  Plss enter quantity: ");
			quty=sc.nextInt();
			bill += quty*120;
			System.out.println("Added.! Current Total : "+bill);

			
			break;
		case 5:
			System.out.println("  Cabbage         50.kg");
			System.out.println("  Plss enter quantity: ");
			quty=sc.nextInt();
			bill += quty*50;
			System.out.println("Added.! Current Total : "+bill);

			
			break;
		case 6:
			System.out.println("  Chilli          90.kg");
			System.out.println("  Plss enter quantity: ");
			quty=sc.nextInt();
			bill += quty*90;
			System.out.println("Added.! Current Total : "+bill);

			
			break;
		case 7:
			System.out.println("  Capsicum        60.kg");
			System.out.println("  Plss enter quantity: ");
			quty=sc.nextInt();
			bill += quty*60;
			System.out.println("Added.! Current Total : "+bill);

			break;
		case 8:	
			System.out.println("  Beetroot        80.kg");
			System.out.println("  Plss enter quantity: ");
			quty=sc.nextInt();
			bill += quty*80;
			System.out.println("Added.! Current Total : "+bill);

			
			break;
		case 9:
			System.out.println("  Tomato          50.kg");
			System.out.println("  Plss enter quantity: ");
			quty=sc.nextInt();
			bill +=quty*50;
			System.out.println("Added.! Current Total : "+bill);
			break;
			
	    default:
				System.out.println("invalid number chosee 1 to 9");
				break;
				
		}
		
	}while (b != 10);
		break;
           

	case 2://main case 2
		System.out.println("--**--2.Snacks & Drinks--**--");
	    System.out.println(" 1.Samosa          20.pc");
		System.out.println(" 2.Veg Puff        30.pc");
		System.out.println(" 3.Sandwich        40.pc");
		System.out.println(" 4.Popcorn         70.pc");
		System.out.println(" 5.Pepsi           50.pc");
		System.out.println(" 6.Cold Coffee     80.pc");
		System.out.println(" 7.Tea             20.pc");
		System.out.println(" 8.Water           20.pc");
		System.out.println(" 9.Lemon Soda      30.pc");
		
		System.out.println("-------------------------------------------------");
		System.out.println("Please choose num 1 to 9 or 10 to go back");

		int c;
		do {
		 
		c = sc.nextInt();
		if(c==10)
		{
			break;
		}
		switch(c)
		{
		case 1:
			System.out.println("  Samosa          20.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*20;
			System.out.println("Added.! Current Total : "+bill);
		break;
		
		case 2:
			System.out.println("  Veg Puff        30.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*30;
			System.out.println("Added.! Current Total : "+bill);
		break;
		
		case 3:
			System.out.println("  Sandwich        40.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*40;
			System.out.println("Added.! Current Total : "+bill);
		break;
		
		case 4:
			System.out.println("  Popcorn         70.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*70;
			System.out.println("Added.! Current Total : "+bill);
		break;
		
		case 5:
			System.out.println("  Pepsi           50.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*50;
			System.out.println("Added.! Current Total : "+bill);
		break;
		
		case 6:
			System.out.println("  Cold Coffee     80.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*80;
			System.out.println("Added.! Current Total : "+bill);
		break;
		
		case 7:
			System.out.println("  Tea             20.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*20;
			System.out.println("Added.! Current Total : "+bill);
		break;
		
		case 8:
			System.out.println("  Water           20.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*20;
			System.out.println("Added.! Current Total : "+bill);
		break;
		
		case 9:
			System.out.println("  Lemon Soda      30.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*30;
			System.out.println("Added.! Current Total : "+bill);
		break;
		
		default:
			System.out.println("Out of Stock..");
		 break;
		}
		 
	  if(c != 10)
		{
            System.out.println("Choose another item (1-9) or 10 to go back");
		}
	}while(c!=10);
		break;
	
	case 3://main case 3
		 System.out.println("--**--3.Beauty & Personal care--**--");
		 System.out.println(" 1.Nivea-Soft      150.pc");
		 System.out.println(" 2.Pond's FW       120.pc");
		 System.out.println(" 3.Himalaya FW     140.pc");
		 System.out.println(" 4.Dove FW         180.pc");
		 System.out.println(" 5.Dove Shampo     200.pc");
		 System.out.println(" 6.Veseline        250.pc");
		 System.out.println(" 7.Lakme ELK       180.pc");
		 System.out.println(" 8.Bellavita       450.pc");
		 System.out.println(" 9.Fogg            200.pc");
		 
		 System.out.println("-------------------------------------------------");
		 System.out.println("Please choose num 1 to 9");
		
		 int d;
		 do
		 {
			d = sc.nextInt();
			
			if(d==10)
			{
				break;
			}
			switch(d)
			{
			
			case 1:
				System.out.println("  Nivea-Soft      150.pc");
				System.out.println("  Plss enter quantity: ");
				quty = sc.nextInt();
				bill += quty*150;
				System.out.println("Added! Current total: "+bill);
			break;
			
			case 2:
				System.out.println("  Pond's FW       120.pc");
				System.out.println("  Plss enter quantity: ");
				quty = sc.nextInt();
				bill += quty*120;
				System.out.println("Added! Current total: "+bill);
			break;
			
			case 3:
				 System.out.println("  Himalaya FW     140.pc");
				System.out.println("   Plss enter quantity: ");
				quty = sc.nextInt();
				bill += quty*140;
				System.out.println("Added! Current total: "+bill);
			break;
			
			case 4:
				System.out.println("  Dove FW         180.pc");
				System.out.println("  Plss enter quantity: ");
				quty = sc.nextInt();
				bill += quty*180;
				System.out.println("Added! Current total: "+bill);
			break;
			
			case 5:
				System.out.println("  Dove Shampo     200.pc");
				System.out.println("  Plss enter quantity: ");
				quty = sc.nextInt();
				bill += quty*200;
				System.out.println("Added! Current total: "+bill);
			break;
			
			case 6:
				System.out.println("  Veseline        250.pc");
				System.out.println("  Plss enter quantity: ");
				quty = sc.nextInt();
				bill += quty*250;
				System.out.println("Added! Current total: "+bill);
			break;
			
			case 7:
				System.out.println("  Lakme ELK       180.pc");
				System.out.println("  Plss enter quantity: ");
				quty = sc.nextInt();
				bill += quty*180;
				System.out.println("Added! Current total: "+bill);
			break;
			
			case 8:
				System.out.println("  Bellavita       450.pc");
				System.out.println("  Plss enter quantity: ");
				quty = sc.nextInt();
				bill += quty*450;
				System.out.println("Added! Current total: "+bill);
			break;
			
			case 9:
				 System.out.println("  Fogg            200.pc");
                 System.out.println("  Plss enter quantity: ");
				quty = sc.nextInt();
				bill += quty*200;
				System.out.println("Added! Current total: "+bill);
			break;
			default:
				System.out.println("Not Avilable...");
			break;
			
			}
			if(d!=10)
			{
				System.out.println("Choose another item (1-9) or 10 to go back");
			}
		 }while(d != 10);
		 break;
	
	case 4://main case 4
		 System.out.println("--**--4.Electronics--**--");
		 System.out.println(" 1.Smartwatch      2500.pc");
		 System.out.println(" 2.Power Bank      1500.pc");
		 System.out.println(" 3.Mouse           1000.pc");
		 System.out.println(" 4.Keyword         500.pc");
		 System.out.println(" 5.LED Bulb        300.pc");
		 System.out.println(" 6.Laptop          50000.pc");
		 System.out.println(" 7.Tab             20000.pc");
		 System.out.println(" 8.Mobile          40000.pc");
		 System.out.println(" 9.Smart TV        25000.pc");
	
		 System.out.println("-------------------------------------------------");
		 System.out.println("Please choose num 1 to 9");
	
	int e;
	
	do {
		e = sc.nextInt();
		
		if(e==10)
		{
			break;
		}
		switch(e)
		{
		
		case 1:
			 System.out.println(" Smartwatch      2500.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*2500;
			System.out.println("Added! Current total: "+bill);
		break;
		
		case 2:
			System.out.println("  Power Bank      1500.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*1500;
			System.out.println("Added! Current total: "+bill);
		break;
		
		case 3:
			System.out.println("  Mouse           1000.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*1000;
			System.out.println("Added! Current total: "+bill);
		break;
		
		case 4:
			System.out.println("  Keyword         500.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*500;
			System.out.println("Added! Current total: "+bill);
		break;
		
		case 5:
			System.out.println("  LED Bulb        300.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*300;
			System.out.println("Added! Current total: "+bill);
		break;
		
		case 6:
			System.out.println("  Laptop          50000.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*50000;
			System.out.println("Added! Current total: "+bill);
		break;
		
		case 7:
			System.out.println("  Tab             20000.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*20000;
			System.out.println("Added! Current total: "+bill);
		break;
		
		case 8:
			System.out.println("  Mobile          40000.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*40000;
			System.out.println("Added! Current total: "+bill);
		break;
		
		case 9:
			System.out.println("  Smart TV        25000.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*25000;
			System.out.println("Added! Current total: "+bill);
		break;
		default:
			System.out.println("Not Avilable...");
		
		}
		if(e!=10)
		{
			System.out.println("Choose another item (1-9) or 10 to back ");
		}
	}while(e != 10);
	break;
	
	case 5 : //main case 5
		 System.out.println("--**--5.Sport Items--**--");
		 System.out.println(" 1.Cricket Bat     2500.pc");
		 System.out.println(" 2.Cricket Ball    200.pc");
		 System.out.println(" 3.Stump Set       1000.pc");
		 System.out.println(" 4.Football        1500.pc");
		 System.out.println(" 5.Badminton       1200.pc");
		 System.out.println(" 6.Table Tennis    800.pc");
		 System.out.println(" 7.Pickleball      2000.pc");
		 System.out.println(" 8.Gloves          500.pc");
		 System.out.println(" 9.Chess Board     500.pc");
		
		 System.out.println("-------------------------------------------------");
		 System.out.println("Please choose num 1 to 9");
	
		int f;
		do {
		f = sc.nextInt();
		
		if(f==10)
		{
			break;
		}
		switch(f)
		{
		case 1:
			System.out.println("  Cricket Bat     2500.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*2500;
			System.out.println("Added! Current total: "+bill);
		break;
		
		case 2:
			System.out.println("  Cricket Ball    200.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*200;
			System.out.println("Added! Current total: "+bill);
		break;
		
		case 3:
			System.out.println("  Stump Set       1000.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*1000;
			System.out.println("Added! Current total: "+bill);
		break;
		
		case 4:
			System.out.println("  Football        1500.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*1500;
			System.out.println("Added! Current total: "+bill);
		break;
		
		case 5:
			System.out.println("  Badminton       1200.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*1200;
			System.out.println("Added! Current total: "+bill);
		break;
		
		case 6:
			System.out.println("  Table Tennis    800.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*800;
			System.out.println("Added! Current total: "+bill);
		break;
		
		case 7:
			System.out.println("  Pickleball      2000.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*2000;
			System.out.println("Added! Current total: "+bill);
		break;
		
		case 8:
			System.out.println("  Gloves          500.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*500;
			System.out.println("Added! Current total: "+bill);
		break;
		
		case 9:
			System.out.println("  Chess Board     500.pc");
			System.out.println("  Plss enter quantity: ");
			quty = sc.nextInt();
			bill += quty*500;
			System.out.println("Added! Current total: "+bill);
		break;
		default:
			System.out.println("Not Avilable...");
		break;
		
	}
		if(f!=10)
		{
			System.out.println("Choose another item (1-9) or 10 to go back");
		}
			
		}while(f != 10);
		break;
		
		default:
			System.out.println("Invalid choice! Please select 1-6");
	
	}
	}
}
  	void finalBill()throws Exception
  	{
  		sc.nextLine();
  		
  		System.out.println("Please Enter your Name : ");
		String name = sc.nextLine();
	
		String num;
	    while (true)
	    {
	        System.out.println("Enter your MobNo (10 digits): ");
	        num = sc.nextLine(); 
	        

	        if (num.matches("\\d{10}"))
	            break;
	        else
	            System.out.println("Invalid mobile number! Try again.\n");
	    }
	  //  sc.nextLine();

		System.out.println("\n=========================================");
		System.out.println("   ======== * Total Bill * ========");
		System.out.println("========================================="); 
		
		System.out.println("Today Date :  "+LocalDateTime.now());
		System.out.println("Your Name  :  "+name);
		System.out.println("Your MobNo :  "+num);
		
		System.out.println("Your Total Bill : "+bill+" Rs");
		
		Thread.sleep(2000);
		System.out.println("========================================="); 
		System.out.println("    Thank you for shopping with us!      ");
		System.out.println("========================================="); 
  	}
 public static void main(String[] args) throws Exception
  {
	 ClassA aobj=new ClassA();
	 aobj.meth1();
	 aobj.finalBill();
  }

}