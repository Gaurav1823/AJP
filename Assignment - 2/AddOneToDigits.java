import java.util.Scanner;
class AddOneToDigits {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
int a = sc.nextInt();
int r = 0;
int f = 1;

while(a>0){
int b = a%10+1;
r=r+(b*f);
f=10*f;
a=a/10;
}
System.out.println("The number after adding 1 to digits is: "+r);
}
}