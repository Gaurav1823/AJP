import java.util.Scanner;
import java.util.ArrayList;

class Employee {
String id, name, department;
double salary;
int attendance;

Employee(String id, String name, String department, double salary) {
this.id = id;
this.name = name;
this.department = department;
this.salary = salary;
this.attendance = 0;
}
void updateDetails(String department, double salary) {
this.department = department;
this.salary = salary;
}

void markAttendance() {
this.attendance++;
}

@Override
public String toString() {
return String.format("ID: %s | Name: %s | Dept: %s | Salary: %.2f | Attendance: %d",
id, name, department, salary, attendance);
}
}


class Employee_Management_System{

static Scanner sc = new Scanner(System.in);
static ArrayList<Employee> employees = new ArrayList<>();

public static void main(String[] args){

String user[] = {"gaurav","sahil","","","",""};
String pass[] = {"singh","kaushik","","","",""};

System.out.println("Hello, Welcome to Employee Management System \nEnter 'continue' to proceed or 'quit' to exit the application");

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


while (true) {
System.out.println("\nEmployee Management System");
System.out.println("1. Add Employee");
System.out.println("2. Search Employee");
System.out.println("3. Update Employee");
System.out.println("4. Delete Employee");
System.out.println("5. List All Employees");
System.out.println("6. Mark Attendance");
System.out.println("7. Filter by Department");
System.out.println("8. Exit");
System.out.print("Choose an option: ");
            
int choice = sc.nextInt();
sc.nextLine(); 

switch (choice) {
case 1 -> addEmployee();
case 2 -> searchEmployee();
case 3 -> updateEmployee();
case 4 -> deleteEmployee();
case 5 -> listEmployees();
case 6 -> markAttendance();
case 7 -> filterByDepartment();
case 8 -> {
feedbackForm();
System.out.println("Exiting Application...");
return;
}
default -> System.out.println("Invalid choice. Try again.");
}
}

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
sc.nextLine();
}
feedbackForm();
sc.close();
}

static void feedbackForm(){
System.out.println("Thank you for using the Application \n Please Provide feedback of application on a scale of 1 to 5");
int feedback = sc.nextInt();

while (feedback<1 || feedback>5){System.out.println("Invalid Input\nEnter between 1 to 5 only");
feedback = sc.nextInt();
}
System.out.println("Thank you");
}

static void addEmployee() {
System.out.print("Enter Employee ID: ");
String id = sc.nextLine();
System.out.print("Enter Name: ");
String name = sc.nextLine();
System.out.print("Enter Department: ");
String department = sc.nextLine();
System.out.print("Enter Salary: ");
double salary = sc.nextDouble();
        
employees.add(new Employee(id, name, department, salary));
System.out.println("Employee added successfully.");
}

static void searchEmployee() {
System.out.print("Enter Employee ID: ");
String id = sc.nextLine();
for (Employee emp : employees) {
if (emp.id.equals(id)) {
System.out.println(emp);
return;
}
}
System.out.println("Employee not found.");
}

static void updateEmployee() {
System.out.print("Enter Employee ID: ");
String id = sc.nextLine();
for (Employee emp : employees) {
if (emp.id.equals(id)) {
System.out.print("Enter New Department: ");
String department = sc.nextLine();
System.out.print("Enter New Salary: ");
double salary = sc.nextDouble();
emp.updateDetails(department, salary);
System.out.println("Employee details updated.");
return;
}
}
System.out.println("Employee not found.");
}

static void deleteEmployee() {
System.out.print("Enter Employee ID: ");
String id = sc.nextLine();
employees.removeIf(emp -> emp.id.equals(id));
System.out.println("Employee deleted.");
}

static void listEmployees() {
if (employees.isEmpty()) {
System.out.println("No employees found.");
return;
}
for (Employee emp : employees) {
System.out.println(emp);
}
}

static void markAttendance() {
System.out.print("Enter Employee ID: ");
String id = sc.nextLine();
for (Employee emp : employees) {
if (emp.id.equals(id)) {
emp.markAttendance();
System.out.println("Attendance marked.");
return;
}
}
System.out.println("Employee not found.");
}

static void filterByDepartment() {
System.out.print("Enter Department: ");
String dept = sc.nextLine();
            
for (Employee emp : employees) {
if (emp.department.equalsIgnoreCase(dept)) {
System.out.println(emp);
}
}
}
}
