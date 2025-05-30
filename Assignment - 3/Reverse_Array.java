import java.util.Arrays;
class Reverse_Array{
public static void main(String[] args){

int arr[] = {2,4,56,7,8};

int temp = 0;
int l = arr.length;

for(int i=0; i<l/2; i++) {
temp = arr[i];
arr[i]=arr[l-1-i];
arr[l-1-i]=temp;
} 
System.out.println(Arrays.toString(arr));
}
}