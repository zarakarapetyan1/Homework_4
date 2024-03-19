package problems;

public class Task220 {
    public static void main(String[] args) {
        int[] array = {12, -7, 89, 2, 54, 8, 2, -1, 88, -210, 17, -3};

        int count1 = 0;
        int count2 = 0;

        for (int j : array) {
            if (j > 0) {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println("The number of positive elements is " + count1);
        System.out.println("The number of negative elements is " + count2);
    }
}
