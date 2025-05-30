class Palindrome {
public static void main(String[] args) {
int arr[] = {2, 4, 56, 4, 2};
int l = arr.length;
boolean isPalindrome = true;

for (int i = 0; i < l / 2; i++) {
if (arr[i] != arr[l - 1 - i]) {
isPalindrome = false;
break;
}
}
if (isPalindrome) {System.out.println("Array is a Palindrome");
} else {System.out.println("Array is not a Palindrome");
}
}
}