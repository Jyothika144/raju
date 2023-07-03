package jjj;

public class OPERATORS {

	public static void main(String[] args) {
		// Arithmatic Operators
		int a=25,b= 20;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));

		//Assingnment Operators
		int c=35,d=25;
		System.out.println("c=d"+(c+d));
		System.out.println("c-="+(c-=d));
		System.out.println("c*="+(c*=d));
		System.out.println("c/="+(c/=d));
		
		//Regional operators
		
		System.out.println(c>d);
		System.out.println(c<d);
		System.out.println(c==d);
		System.out.println(c!=d);
		System.out.println(c>=d);
		
		//logical operators
//      A      B   A&&B A||B !A !B
//      0      0   0     0    1  1
//      1      0   0     1    0  1
//      0      1   0     1    1  0
//      1      1   1     1    0  0
		
		String username="abc";
		
	    String pswrd=" 123";
	    
	    System.out.println(username=="abc" && pswrd=="123");
	    System.out.println(username=="abc" || pswrd =="1234");
	    System.out.println(username=="abc");
	    
// Unary operator

	    int di=22;
	    		System.out.println(di++);
	    		System.out.println(di);
	    		
	   int a=30,b=20;
			   System.out.println(a++);
	
		
		
		
//
//
//
		
		
		
	}

}
