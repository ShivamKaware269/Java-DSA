import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0, rem = 0;

        while (temp != 0) {
            rem = temp % 10;
            sum += Math.pow(rem, 3);
            temp /= 10;
        }

        System.out.println(sum);

        if (sum == num) {
            System.out.println("The number is a Armstrong Number");
        } else {
            System.out.println("The number is not a Armstrong Number");
        }
        
        sc.close();
    }
}
