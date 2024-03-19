package problems;

public class Task221 {
    public static void main(String[] args) {
        int[] array = {12, -7, 89, 2, 54, 8, 2, -1, 88, -210, -9, 6, 17, -3};
        int a = 6;
        int b = 54;
        int sum = 0;
        for (int j : array) {
            if (j >= a && j <= b) {
                sum += j;
            }
        }
        System.out.println(sum);

    }
}
