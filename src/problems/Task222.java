package problems;

public class Task222 {
    public static void main(String[] args) {
        int[] array = {12, -7, 89, 2, 54, 8, 2, -1, 88, -210, -9, 6, 17, -3};
        int c = -1;
        int d = 54;
        int multiplication = 1;
        for (int j : array) {
            if (j >= c && j < d) {
                multiplication *= j;
            }
        }
        System.out.println(multiplication);
    }
}
