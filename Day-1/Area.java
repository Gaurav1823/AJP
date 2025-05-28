import java.util.Scanner;
class Area{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the length");
int l = sc.nextInt();

System.out.println("Enter the width");
int b = sc.nextInt();

int a = l*b;

System.out.println("Area of Rectangle is = "+a);
}
}