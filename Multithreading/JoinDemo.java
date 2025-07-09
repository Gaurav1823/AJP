package multithreading;

class Product extends Thread
{
	
	public Product(String name)
	{
		super(name);
	}
public void run()
{
	
for(int i=0;i<=5;i++)
{
System.out.println(Thread.currentThread().getName()+": "+i);	

try {
	Thread.sleep(500);
} catch (Exception e) {
	System.out.println(e);
}
}
}

}

public class JoinDemo {

	public static void main(String[] args) {
		Product t1=new Product("T1");
		Product t2=new Product("T2");
		Product t3=new Product("T3");
		t1.start();
		try {
			t1.join(700);
		}
		catch (Exception e) {
		System.out.println(e);
		}
		t2.start();
		t3.start();
		
		
	}

}
