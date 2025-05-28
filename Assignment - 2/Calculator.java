import java.util.Scanner;
class Calculator{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter first number");
double a = sc.nextDouble();
System.out.println("Enter an Operator");
String b = sc.next();
System.out.println("Enter second number");
double c = sc.nextDouble();

if(b.equalsIgnoreCase("+")){System.out.println(a+c);
} else if (b.equalsIgnoreCase("-")){System.out.println(a-c);
} else if (b.equalsIgnoreCase("*")){System.out.println(a*c);
} else if (b.equalsIgnoreCase("/") && c!=0 ){System.out.println(a/c);
} else {System.out.println("Invalid Input");
}
}
}