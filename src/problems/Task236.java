package problems;

public class Task236 {
    public static void main(String[] args) {
        int[] array = {12, 89, 76, 5, 2, 13, 17, 19, 57};
        int counter = 0;
        int multiplication = 1;
        for (int j : array) {
            if (j % 2 != 0) {
                multiplication *= j;
                counter++;
            }
        }
        System.out.println("The number of odd elements is " + counter);
        System.out.println("The product of odd elements is " + multiplication);
    }
}
