package multithreading;
class Account
{
int accBalance=20000;

synchronized void withdraw(int amount)
{
System.out.println("Going to withdraw amount:"+amount);	
if(this.accBalance<amount)
{
System.out.println("Insufficient balance!!! Deposit first");
try {
	
	wait();
	
}catch (InterruptedException e) {
	System.out.println(e);
}
 check bal()
 {
	//wait()
	 //once deposit done,then withdraw will and balance will display
 }
 

}

//this.accBalance-=amount;
this.accBalance=accBalance-amount;
System.out.println("Withdraw is completed.your account balance is: "+accBalance);
}

synchronized void deposit(int amount)
{
	System.out.println("going to deposit");
	this.accBalance+=amount;//20000+50000
	System.out.println("deposit done!!");
	notify();
	}

}
public class InterThreadCommunicationEx {

	public static void main(String[] args) {
		Account acc=new Account();//lock with Object
		new Thread() {
			public void run()
			{
				acc.withdraw(30000);
			}
			
		}.start();

		
		new Thread() {
			public void run()
			{
				acc.deposit(50000);
			}
			
		}.start();

	}

}
