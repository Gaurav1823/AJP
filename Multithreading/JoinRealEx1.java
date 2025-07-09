package multithreading;

//shared resource
class Count
{
	
int count;//by default 0

synchronized public void increment()
{
count++; //count=count+1  count=402 t1 count=500+1=501+1=502
}

}



public class JoinRealEx1 {

	public static void main(String[] args) {
		
  Count c=new Count();//shared object-lock is associated with object
  
  Thread t1=new Thread() {
  	public void run() {
  		
  		for(int i=1;i<=500;i++)//i=1;i<100t
  		{
  			c.increment();
  		}
  	}
  	
  };
  
  Thread t2=new Thread() {
  	public void run() {
  		
  		for(int i=1;i<=500;i++)//i=1;i<100t
  		{
  			c.increment();
  		}
  	}
  	
  };
  t1.start();
  t2.start();
  try {
  t1.join();
  }catch (Exception e) {
		// TODO: handle exception
	}
  
  try {
      t2.join();
      }catch (Exception e) {
  		// TODO: handle exception
  	}
System.out.println("Count value: "+ c.count);//1000
	}

}
