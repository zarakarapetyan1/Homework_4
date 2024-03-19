package problems;

public class Task256 {

    public static void main(String[] args) {
        int[] array = {12, 9, 89, 76, 5, 2, 13, 15, 17, 19, 57, 27};
        int sum = 0;
        int min = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j;

            }
        }
        sum = min + index;
        System.out.println(sum);
    }
}

