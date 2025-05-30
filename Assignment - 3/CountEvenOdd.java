class CountEvenOdd{
public static void main(String[] args) 
{
int arr[] = {3, 6, 9, 4, 78};
int a = 0;
int b = 0;
for (int i = 0; i < arr.length; i++) {
if (arr[i] % 2 == 0) {a++;
} else {b++;
}
}
System.out.println("Total even numbers: " +a);
System.out.println("Total odd numbers: " +b);
}
}