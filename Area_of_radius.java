import java.util.Scanner;
public class Area_of_radius {
    public static void main(String[] args) {
             double area;
        double pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius ");
        double radius = sc.nextDouble();
        area =pi*radius*radius;
        System.out.println(area);
        sc.close();
    }
}
