import java.util.Scanner;
class Odd{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number");
int a = sc.nextInt();

if(a%2==0){
System.out.println("Even Number");
} else {System.out.println("Odd Number");
}
}
}