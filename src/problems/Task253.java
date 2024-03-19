package problems;

public class Task253 {
    public static void main(String[] args) {
        int[] array = {12, 9, 89, 76, 5, 2, 13, 15, 17, 19, 57, 27};
        int sum = 0;
        int max = array[0];
        int min = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }

        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        sum = min + max;
        System.out.println("The sum of maximum and minimum elements of the array is " + sum);

    }
}
