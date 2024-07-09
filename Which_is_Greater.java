import java.util.Scanner;
public class Which_is_Greater {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two Numbers");
   int num1 = sc.nextInt();
   int num2 = sc.nextInt();
   System.out.println(((num1<50)&&(num1<num2)));
    sc.close();
}
}
