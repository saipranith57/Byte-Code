import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1 value ");
        System.out.println("Enter Num2 value ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("add "+ (num1 + num2));
        System.out.println("sub "+ (num1 - num2));
        System.out.println("mul "+ (num1 * num2));
        System.out.println("divs "+ (num1 / num2));
        System.out.println("mod "+ (num1 % num2));
        sc.close();
    }
}
