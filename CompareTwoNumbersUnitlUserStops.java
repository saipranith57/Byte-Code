import java.util.Scanner;;
public class CompareTwoNumbersUnitlUserStops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
      int previous_number=0;
      while (true) {
        System.out.println("Enter A number or Enter 0 to Stop ");
         int  num = sc.nextInt();
         if (num>previous_number) {
            previous_number=num;
         }
         if (num==0) {
            System.out.println(previous_number);
            break;
         }
      }
        sc.close();
    }
}
