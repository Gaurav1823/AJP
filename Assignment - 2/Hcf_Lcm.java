import java.util.Scanner;
class Hcf_Lcm{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the First Number");
int a = sc.nextInt();
System.out.println("Enter the Second Number");
int b = sc.nextInt();
int c = 0;
int d = 0;

//HCF
int hcf = 1;
if(a>b){ c = b;
}else { c = a;
}
for(int i=1; i<=c; i++){
if(a%i==0 && b%i==0){
hcf=i;
}
}
System.out.println("HCF is: "+hcf);

//LCM

if(a>b){ d = a;
}else { d = b;
}
int lcm = d;
while(true){
if (lcm%a==0 && lcm%b==0){
System.out.println("LCM is: "+lcm);
break;
}
lcm++;

}
}
}