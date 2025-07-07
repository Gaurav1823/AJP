package multithreading;


class Hi extends Thread
{
	public void run() {
	for(int i=1;i<=5;i++) //hi- i=1<=5y hi i=2<=5 hi
	{
		System.out.println("Hi");
		try {
			Thread.sleep(400);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	}
}

class Hello extends Thread
{
	public void run() {
	for(int i=1;i<=5;i++) //hello i=1<=5y hello i=2<=5y hello
	{
		System.out.println("Hello");
		try {
			Thread.sleep(400);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	}
}
public class MultithreadingDemo {

	public static void main(String[] args) {
		Hi hi=new Hi();
		Hello hello=new Hello();
		hi.start();
		hello.start();
	}

}
