import java.util.Scanner;
import java.util.Arrays;
class Console_Based_Application{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

String user[] = {"gaurav","sahil","","","",""};

String pass[] = {"singh","kaushik","","","",""};




System.out.println("Hello, Welcome! \nEnter 'continue' to proceed or 'quit' to exit the application");

String a = sc.next();

while(!a.equalsIgnoreCase("quit")){

if(a.equalsIgnoreCase("continue")){System.out.println("To Log in press 1 \nTo Sign up press 2 ");
int b = sc.nextInt();


if(b==1){ 
System.out.println("Enter your username");
String username = sc.next();
System.out.println("Enter your password");
String password = sc.next();

boolean loggedIn = false;
for(int i=0; i<user.length;i++){
if (username.equals(user[i]) && password.equals(pass[i])) {
loggedIn = true;
break;
}
}

if(loggedIn){System.out.println("login Successful.");

/*




























*/

}else{System.out.println("Invalid credentials. Please try again");
}


} else if(b==2){
System.out.println("Enter new username");
String username = sc.next();
System.out.println("Enter your new password");
String password = sc.next();
System.out.println("Confirm your new password");
String confirmPassword = sc.next();

if(password.equals(confirmPassword)){System.out.println("Signup Successful");

for(int i=0; i<user.length; i++){
if (user[i].isEmpty()){
user[i] = username;
pass[i] = password;
break;
}
}

} else {
System.out.println("Passwords do not match! Please try again.");
}

} else {
System.out.println("Invalid Option. Please enter 1 or 2.");
}

} else {
System.out.println("Invalid Input");
}

System.out.println("Enter 'continue' to proceed or 'quit' to exit the application");
a = sc.next();
}
 
System.out.println("Thank you for using the Application \n Please Provide feedback of application on a scale of 1 to 5");
int feedback = sc.nextInt();

while (feedback<1 || feedback>5){System.out.println("Invalid Input\nEnter between 1 to 5 only");
feedback = sc.nextInt();
}
System.out.println("Thank you");
sc.close();
}
}
