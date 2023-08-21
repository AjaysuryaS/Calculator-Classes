public class Solution {
    public static void main(String[] args) {
        Adder adder = new Adder();
        Multiplier multiplier = new Multiplier() {
            @Override
            int add(int a, int b) {
                return 0;
            }
        };

        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Testing Addition");
        int sum = adder.add(a, b);
        System.out.println("Sum = " + sum);

        System.out.println("Testing Multiplication");
        int product = multiplier.multiply(a, b, adder);
        System.out.println("Product = " + product);
    }
}
