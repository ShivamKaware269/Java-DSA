
import java.util.Scanner;

public class Commission_Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total sales amount : ");
        double totalSales = sc.nextDouble();

        System.out.print("Enter the commission percentage : ");
        double commissionPercentage = sc.nextDouble();

        double commissionAmount = (commissionPercentage / 100) * totalSales;

        System.out.println("Commission Amount : " + commissionAmount);

        sc.close();
    }
}

