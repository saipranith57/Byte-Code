import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); 
        String number = sc.nextLine();
        boolean isDuckNumber = false;
        int length = number.length();
        if (number.charAt(0)!=0) {
            isDuckNumber =false;
        }
        else{
            for(int i=0; i<length;i++){
                if (number.charAt(i)=='0') {
                    isDuckNumber =true;
                }
            }
        }
        if (isDuckNumber==true) {
            System.out.println("Duck Number");
        }
        else{
            System.out.println("Not A Duck Number");
        }
        sc.close();
    }
}
