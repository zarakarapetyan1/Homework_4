package problems;

public class Task217 {
    public static void main(String[] args) {
        int[] array = {12, 7, 89, 2, 54, 8, 2, 1, 0, 21, 17, 3};
        int multiplication = 1;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.println(array[i]);
                multiplication *= array[i] * array[i];
            }
        }
        System.out.println(multiplication);

    }
}
