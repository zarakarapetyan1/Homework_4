package problems;

public class Task245 {
    public static void main(String[] args) {
        int[] array = {12, 9, 89, 76, 5, 2, 13, 15, 17, 19, 57, 27};
        int sum = 0;


        for (int i = 0; i < array.length; i++) {
            if ((array[i] + i) % 3 == 0) {
                //System.out.println(array[i]);
                sum += array[i] * array[i];
            }
        }

        System.out.println(sum);
    }
}
