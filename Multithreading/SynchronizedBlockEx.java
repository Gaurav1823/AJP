package multithreading;

class ProductNo
{
	public void printProduct(int n)
	{
	System.out.println("We are going to calculate product of "+ n);	
		
	synchronized (ProductNo.class) {
		for(int i=1;i<=5;i++)	
		{	
		System.out.println(n*i);
		}	
	}
	
	System.out.println("Thank you for visiting this method");
		
	}

}

public class SynchronizedBlockEx {

	public static void main(String[] args) {
		ProductNo obj=new ProductNo();
		
		new Thread() {
			
		public void run()	
		{
			obj.printProduct(5);
		}
		}.start();
		
		new Thread() {
			
			public void run()	
			{
				obj.printProduct(100);
			}
			}.start();
	}

}
