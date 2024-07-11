import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int final_result,sum;
        final_result = sum =0;
        int num = sc.nextInt();
        final_result+=num;
       while (num!=0) {
       int result = num %10;
        sum += result * result * result;
        num =num/10;
       }
     if (final_result == sum) {
       System.out.println("Amstrong"); 
     }
     else{
        System.out.println("Not A amstrong");
     }
        sc.close();
        }  
    }



