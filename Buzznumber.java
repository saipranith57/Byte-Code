import java.util.Scanner;
public class Buzznumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int result=0;
        int num = sc.nextInt();
        if (num%7==0) {
            System.out.println("Buzz Number");
        }
        else{
            while (true) {
               result = num %10 ;
               if (result==7) {
                System.out.println("Buzz Number");
                break;
               }
               else{
                System.out.println("Not A buzz Number ");
                break;
               }
            }
        }
        sc.close();
    }
    
}
