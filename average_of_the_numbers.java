import java.util.Scanner;
public class average_of_the_numbers {
    public static void main(String[] args) {
        int avg;
        int i =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Number");
        int Num1 =sc.nextInt();
        i+=1;
        int Num2 =sc.nextInt();
        i+=1;
        int Num3 =sc.nextInt();
        i+=1;
        int Num4 =sc.nextInt();
        i+=1;
        int Num5 =sc.nextInt();
        i+=1;
        avg = (Num1 + Num2 +Num3 +Num4 +Num5)/i;
        System.out.println("avg " +avg);
        sc.close();
        
    }
}
