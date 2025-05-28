import java.util.Scanner;

class Interest{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter Principal Amount");
double p = sc.nextDouble();
System.out.println("Enter Rate of Interest per annum");
double r = sc.nextDouble();
System.out.println("Enter Time in years");
double t = sc.nextDouble();

double a = p*r*t;

double s = a/100;

System.out.println("Simple Interest is = "+s);
}
}