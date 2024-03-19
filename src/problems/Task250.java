package problems;

public class Task250 {
    public static void main(String[] args) {
        int[] array = {12, 9, 89, 76, 5, 2, 13, 15, 17, 19, 57, 27};
        int multiplication = 1;

        for (int i = 0; i < array.length; i++) {
            int sum = array[i] + i;
            if (array[i] * i % 3 == 2) {
                multiplication *= array[i]*array[i];
            }
        }
        System.out.println("The product of square is " + multiplication);
    }
}
