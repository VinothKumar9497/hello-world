import java.util.Scanner;

class a
{
	Scanner inp=new Scanner(System.in);
	String x,y;
	String u="vinoth",v="vinoth123"; 
	int a;
	public void get()
	{
	do{
	System.out.println("USERNAME: ");
	x=inp.next();
	System.out.println("PASSWORD: ");
	y=inp.next();
	System.out.println("type 1 for login");
	a=inp.nextInt();
	if(a==1)
	{
		if(x.equals(u) && y.equals(v))
		{
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("incorrect credentials");
		}
	}
	System.out.println("\nDo you wish to try again...\n1.YES\n2.NO");
	a=inp.nextInt();
	}while(a==1);
	System.out.println("Thank You!!!");
	}
}
class b extends a
{
 public void give()
 {
	 System.out.println("Enter any name...");
	 x=inp.next();
	 a=x.length();
	 for(int i=a-1;i>=0;i--)
	 {
		 System.out.print(""+x.charAt(i));
	 }
 }
}
public class login {

	public static void main(String[] args)
	{
	Scanner inp=new Scanner(System.in);
	a obj1=new a();
	b obj2=new b();
	int a;
	System.out.println("press\n1.login class\n2.string reversal\n");
	a=inp.nextInt();
	if(a==1)
	{
	obj1.get();
	}
	else 
	{
	obj2.give();
	}
	}
}
