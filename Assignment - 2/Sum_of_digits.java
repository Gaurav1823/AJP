import java.util.Scanner;
class Sum_of_digits{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

int a = sc.nextInt();


if(10>a || a>99){System.out.println("Enter a Two Digit Number Only");
} else {
System.out.println(a/10+a%10);
}
}
}