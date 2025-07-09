package multithreading;

//shared resource
class Count
{
	
int count;//by default 0

public void increment()
{
count++; //count=count+1  1,2,3......500
}
}



public class JoinRealEx {

	public static void main(String[] args) {
		
  Count c=new Count();//shared object
  
  Thread t1=new Thread() {
  	public void run() {
  		
  		for(int i=1;i<=500;i++)//i=1;i<100t
  		{
  			c.increment();
  		}
  	}
  	
  };
  t1.start();
  try {
  t1.join();
  }catch (Exception e) {
		// TODO: handle exception
	}
System.out.println("Count value: "+ c.count);//500
	}

}
