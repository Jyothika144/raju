package oops;

import java.util.Scanner;

interface Bank
{
	public void showdetaills();
	public void balane();
	public void deposit();
	public void withdraw();
}

class SBIBANK implements Bank
{
   String custmername="jyothika";
   int accno = 12345678;
   int balance=100000;
   String bankdetails="SBI PALAKKAD";
   Scanner sc=new Scanner(System.in);
	
	
	
	@Override
	public void showdetaills() {
	
	System.out.println("Bamk name="+Bankname);
	System.out.println("accno="+accno);
	accono=sc.nextInt();
	System.out.println("showdetails="+showdetails);




		@Override
		public void withdraw() {
			// TODO Auto-generated method 
		}





		@Override
		public void deposit() {
			// TODO Auto-generated method stub
			
		}





		@Override
		public void balance() {
			// TODO Auto-generated method stub
			
		}

	}

	@Override
	public void balane() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}
public class Jyo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
