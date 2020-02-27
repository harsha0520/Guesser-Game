package com.hotelbill;

import java.util.*;


public class Launch1 {
	public static void main(String[] args) 
	{
		
		
		ArrayList<Bill> al=new ArrayList<Bill>();
		
		Scanner scan=new Scanner(System.in);	
		System.out.println("Hesru heloo");
		String name=scan.nextLine();
		System.out.println("Number heloo");
		
		long contactno=scan.nextLong();
		int price=0;
		int subtotal=0;
		int quantity;
		int grandtotal=0;
		String itemname="";

		char continuee='Y';

		while(continuee=='Y')
		{
			
			System.out.println("choose from the following");
			System.out.println("1.Dosa\n2.Idly\n3.Vada\n4.Tea\n5.Coffee");
			int id=scan.nextInt();
			System.out.println("enter the quantity");
			quantity=scan.nextInt();
			switch(id)
			{
			case 1:
				itemname="Dosa";
				price=50;
				subtotal=price*quantity;
		
				break;
				
			case 2:
				itemname="Idly";
				price=30;
				subtotal=price*quantity;
		
				break;	
				
			case 3:
				itemname="Vada";
				price=30;
				subtotal=price*quantity;
				
				break;
				
			case 4:
				itemname="Tea";
				price=10;
				subtotal=price*quantity;
				
				break;
				
			case 5:
				itemname="Coffee";
				price=12;
				subtotal=price*quantity;
				
				break;	
			default:
					System.out.println("no item found");
					
			}
		
		grandtotal+=subtotal;
		al.add((new Bill(id,itemname,price,quantity,subtotal)));
		System.out.println("do you want to continue?(Y/N)");	
		String s=scan.next();
		s=s.toUpperCase();
		continuee=s.charAt(0);
		}
		
		System.out.println("-----------------------------------");
		System.out.println("__Bill Generated__");
		System.out.println("Customer name:"+name);
		System.out.println("Customer number:"+contactno);
		System.out.println("-----------------------------------");
		System.out.println("id     itemname      price       quantity     subtotal      ");
		
		for(Bill x:al)
		{
			System.out.println(x);
		}
		System.out.println("grand total:"+grandtotal);
		}
			
			
		}

	 class Bill
	{
		
		int id;
		String itemname;
		int price;
		int quantity;
		int subtotal;
		
		Bill(int id,String itemname,int price,int quantity,int subtotal)
		{
		this.id=id;
		this.itemname=itemname;
		this.price=price;
		this.quantity=quantity;
		this.subtotal=subtotal;
		}
		
		@Override
		public String toString()
		{
			return id   +" "+     itemname      +" "+     price     +" "+      quantity     +"  "+     subtotal;
			
		}
		
		}
		
		

	


