package problems;

public class Task231 {
    public static void main(String[] args) {
        int[] array = {-12, -7, 8, -2, -54, -8, -2, -1, 88, -210, -9, -6, 17, -3};
        int sum = 0;

        for (int j : array) {
            if (j % 2 == 0) {
                sum += j * j;
            }
        }
        System.out.println(sum);
    }
}
