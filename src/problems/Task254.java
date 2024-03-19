package problems;

public class Task254 {
    public static void main(String[] args) {
        int[] array = {12, 9, 89, 76, 5, -1, 13, 15, 17, 19, 57, 27};
        int product = 1;
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
        product = min * max;
        System.out.println("The product of maximum and minimum elements of the array is " + product);


    }
}
