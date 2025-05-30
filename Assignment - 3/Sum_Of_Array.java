import java.util.Scanner;
class Sum_Of_Array{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

int arr[] = {5,7,5,9,8};
int sum = 0;

for(int i=0; i<arr.length;i++){
sum = sum+arr[i];
} 
System.out.println("Sum of array elements is: "+sum);

}
}