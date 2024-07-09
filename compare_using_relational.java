import java.util.Scanner;
public class compare_using_relational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 value ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 value ");
        int num2 = sc.nextInt();
        System.out.println(num1==num2);
        System.out.println(num1!=num2);
        System.out.println(num1<num2);
        System.out.println(num1>num2);
        System.out.println(num1<=num2);
        System.out.println(num1>=num2);
        sc.close();

    }
}