package oops;



public class Paliamdrom {

	public static void main(String[] args) {
		
	String s="malayalam";
	String r="";
		
	for (int i=s.length()-1;i>=0;i--)
{
r=r+s.charAt(i);
}
 System.out.println("reverse="+r);
 if (s.equals(r))
 {
	 System.out.println("paliandram");
 }
 else
 {
	 System.out.println("not paliandrome");
 }
 }
}