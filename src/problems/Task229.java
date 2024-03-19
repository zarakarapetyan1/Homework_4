package problems;

public class Task229 {
    public static void main(String[] args) {
        int[] array = {-12, -7, 8, -2, -54, -8, -2, -1, 88, -210, -9, -6, 17, -3};
        int multiplication = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] - i > 0) {
                multiplication *= array[i];
            }
        }
        System.out.println(multiplication);
    }
}
