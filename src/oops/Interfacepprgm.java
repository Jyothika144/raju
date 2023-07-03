package oops;
interface basicanimal
{
	public void eat();
	public void sleep();
}

class monkey{
	public void jump()
	{
		System.out.println("jump ");
	
	}

public void bite()
{
   System.out.println(" bite ");
}
}
class Human extends monkey implements basicanimal
{

	@Override
	public void eat() {
		System.out.println("eat");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleep");
		
	}
	
	
	
	
}

class human extends monkey{
	
	
public class Interfacepprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


public void eat() {
	// TODO Auto-generated method stub
	
}

public void sleep() {
	// TODO Auto-generated method stub
	
}