import java.util.Scanner;
class Larger{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the First Number");
int a = sc.nextInt();
System.out.println("Enter the Second Number");
int b = sc.nextInt();

if(a>b){System.out.println(a+" is larger than the other");
} else {System.out.println(b+" is larger than the other");
}
}
}