package problems;

public class Task248 {
    public static void main(String[] args) {
        int[] array = {12, 9, 89, 76, 5, 2, 13, 15, 17, 19, 57, 27};
        int k = 2;
        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = array[i] + i;
            if (sum * sum % k == 0) {
                //System.out.println(array[i]);
                sum1 += array[i];
            }
        }
        System.out.println("Their sum is " + sum1);
    }
}
