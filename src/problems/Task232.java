package problems;

public class Task232 {
    public static void main(String[] args) {
        int[] array = {-12, -7, 8, -2, -54, -8, -2, -1, 88, -210, -9, -6, 17, -3};
        int counter = 0;

        for (int j : array) {
            if (j % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
