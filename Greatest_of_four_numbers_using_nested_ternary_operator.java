public class Greatest_of_four_numbers_using_nested_ternary_operator {
    public static void main(String[] args) {
        int a = 25, b = 42, c = 15, d = 30;
        int greatest = (a > b) ? ((a > c) ? ((a > d) ? a : d) : (c > d ? c : d))
                               : ((b > c) ? ((b > d) ? b : d) : (c > d ? c : d));

        System.out.println("The greatest number is: " + greatest);

    }
}
