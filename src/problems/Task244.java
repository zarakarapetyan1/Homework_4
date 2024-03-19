package problems;

public class Task244 {
    public static void main(String[] args) {

        int[] array = {12, 9, 89, 76, 5, 2, 13, 15, 17, 19, 57, 27};
        int multiplication = 1;

        for (int j : array) {
            if (j % 5 == 2) {
                System.out.println(j);
                multiplication *= j;
            }
        }

        System.out.println("The product of elements with a reminder of 2 when divided by 5 is " + multiplication);
    }
}

