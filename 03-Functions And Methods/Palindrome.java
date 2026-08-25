// A program to find wheteher a number is Palindrome or not using methods (Functions)

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input = sc.nextInt();

        int x = checkPalindrome(input);
        if (x == 1) {
            System.out.println(input + " is a palindrome number.");
        } else {
            System.out.println(input + " is not a palindrome number.");
        }

        sc.close();
    }

    static int checkPalindrome(int n) {
        int originalNumber = n;
        int reversedNumber = 0;

        while (n != 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }

        if (originalNumber == reversedNumber) {
            return 1; // Palindrome
        } else {
            return 0; // Not a palindrome
        }
    }   
}
