import java.util.Scanner;

public class Number_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        int rev = 0;
        int temp = num;

        while (temp != 0) {
            int rem = temp % 10;
            rev = rev*10 + rem;
            temp = temp / 10;
        }
        System.out.println("The reverse of number is : " + rev);

        if (num == rev) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not a Palindrome");
        }

        sc.close();
    }
}
