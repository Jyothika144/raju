package oops;

abstract class car{
	abstract public void speedlimit();
	public void czrengine()
	{
		System.out.println("car engine");
	}

}
class marthi extends car
{

	@Override
	public void speedlimit() {
		System.out.println("marthispeedlimit");
		
	}

}
class BMW extends car
{




public class Abstactionpgrm {
	
	public static void main(String[] args) {

	marthi m=new marthi();
	m.czrengine();
	m.speedlimit();

}

}
	

