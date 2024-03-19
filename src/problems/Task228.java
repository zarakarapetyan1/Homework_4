package problems;

public class Task228 {
    public static void main(String[] args) {
        int[] array = {12, -7, 89, 2, 54, 8, 2, -1, 88, -210, -9, 6, 17, -3};
        int k = 7;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % k == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
