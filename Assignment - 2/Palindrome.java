import java.util.Scanner;
class Palindrome{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the Number");
int a = sc.nextInt();
int b = a;
int r = 0;
while(b>0){
int c = b%10;
r=r*10+c;
b=b/10;
}

if (a==r){System.out.println("Number is Palindrome");
} else{System.out.println("Number is not a Palindrome");
}
}
}