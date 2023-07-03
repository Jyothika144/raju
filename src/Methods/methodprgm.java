package Methods;

public class methodprgm {

	public static void main(String[] args) {
		
	methodprgm ob=new methodprgm();
	int subt=ob.sub();
	System.out.println("substraction="+subt);
	System.out.println(ob.mul(20,10));
	ob.div(2.3,3);
	}
//1 .method without returntype and without parameter		
	{
		int a=30,b=45;
		int c=a+b;
		System.out.println(c);
	
	
	}
//2.method with returntype and without parameter
      public int sub()
      {
    	  int a=30,b=20;
    	  int c=a-b;
    	  
    	  return c;
      }
  //3. method with return type and with parameter
      
      public int mul(int a,int b)
      {
    	  int c=a*b;
    	  
    	  return c;
      }
  //4. method without returntype and with parameter
      
      public void div(double a,double b)
      {
    	  double c=a/b;
    	  System.out.println(c);
      }
      }
      }