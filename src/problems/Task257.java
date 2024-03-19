package problems;

public class Task257 {
    public static void main(String[] args) {
        //the index of the first largest element
        int[] array = {12, 9, 78, 76, 5, 2, 78, 15, 17, 19, 57, 27};
        int max = array[0];
        int index = 0;
        for (int j = 1; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j;

            }
        }

        System.out.println(index);

    }
}
