import java.util.Scanner;
class Multiplication_Table{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

int a = sc.nextInt();

for(int i=1; i<11; i++ )
{
System.out.println(a*i);
}
}
}