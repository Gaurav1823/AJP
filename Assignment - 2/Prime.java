import java.util.Scanner;
class Prime{ 
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
Boolean isPrime = true;

if(a<2){
isPrime = false;
} else {
for(int i=2; i<a; i++){
if (a%i==0){isPrime = false;
break;
}
}
}
if(isPrime){System.out.println(a+" is a Prime Number");
} else {System.out.println(a+" is not a Prime Number");
}
}
}