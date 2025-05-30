class Maximum_Minimum{
public static void main(String[] args){

int arr[] = {3,6,9,4,78};

int max = arr[0];
int min = arr[0];

for (int i = 1; i < arr.length; i++) {
if (arr[i] > max) {
max = arr[i];
}if (arr[i] < min) {
min = arr[i];
}
}
System.out.println("Maximum Element of array: " + max);
System.out.println("Minimum Element of array: " + min);
}
}