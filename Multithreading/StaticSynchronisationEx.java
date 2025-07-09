package multithreading;

class ProductNo
{
	synchronized static public void printProduct(int n)
	{
	//System.out.println("We are going to calculate product of "+ n);	
		 
		for(int i=1;i<=5;i++)	
		{	
		System.out.println(Thread.currentThread().getName()+": "+n*i);
		try {
			Thread.sleep(500);
		}catch (Exception e) {
			System.out.println(e);
		}
		}	
	
	
	//System.out.println("Thank you for visiting this method");
		
	}

}

public class StaticSynchronisationEx {

	public static void main(String[] args) {
		//ProductNo obj=new ProductNo();
		//ProductNo obj1=new ProductNo();
		//lock will be associated with Class
		
		new Thread("T1") {
			
		public void run()	
		{
			ProductNo.printProduct(5);
		}
		}.start();
		
		new Thread("T2") {
			
			public void run()	
			{
				ProductNo.printProduct(100);
			}
			}.start();
			
			new Thread("T3") {
				
				public void run()	
				{
					ProductNo.printProduct(5);
				}
				}.start();
				
				new Thread("T4") {
					
					public void run()	
					{
						ProductNo.printProduct(100);
					}
					}.start();
	}

}
