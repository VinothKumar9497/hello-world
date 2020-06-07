
abstract class abc
{
	abstract public void give();
}
class boss extends abc
{
	public void give()
	{
		System.out.println("Hello Boss");
	}
}
//first project edit
public class Demo {

	public static void main(String[] args) {
		abc n=new boss();
		System.out.println("Hello World");
		n.give();

	}

}
//completed