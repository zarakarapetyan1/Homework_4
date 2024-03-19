package problems;

public class Task233 {
    public static void main(String[] args) {
        int[] array = {-12, -97, 8, -82, -54, -8, -2, -91, 88, -210, -9, 9, 17, 13, 17};
        int sum = 0;
        int multiplication = 1;

        for (int j : array) {
            if (j % 2 == 0) {
                sum += j;
                multiplication *= j;
            }
        }
        System.out.println("Sum of even numbers is equal to " + sum);
        System.out.println("Product of even numbers is equal to " + multiplication);

    }
}
