
import java.util.Scanner;

public class Demo037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st number: ");
        int num1 = scanner.nextInt();
        System.out.println("enter 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.println("enter 3rd number: ");
        int num3 = scanner.nextInt();
        System.out.println("enter 4th number: ");
        int num4 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " 1st number is largest");
        } else if (num3 > num1) {
            System.out.println(num3 + " 3rd number is largest");
        } else if (num4 > num3) {
            System.out.println(num4 + " 4th number is largest");
        } else if (num2 > num4) {
            System.out.println(num2 + " 2nd number is largest");
        } else {
            System.out.println("error");
        }
        }
    }
