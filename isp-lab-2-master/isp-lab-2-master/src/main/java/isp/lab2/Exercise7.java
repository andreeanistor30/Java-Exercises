package isp.lab2;

import java.util.Scanner;

public class Exercise7 {

    /**
     * This method should generate a random number which represent the position
     * in the given arrays,so the random should be between 0 and 7
     *
     * @return the generated random
     */
    public static int generateARandom() {

        int min = 0;
        int max = 7;
        int randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return randomNumber;
    }

    public static void main(String[] args) {
        int[] ucl = new int[]{1, 2, 3, 4, 5, 6, 7, 13};
        int[] answers = new int[]{10, 4, 2, 1, 2, 1, 1, 1};
        int times = generateARandom();

        int number , numberOfTries = 0, previousNumber = -1;

        while (true) {
            System.out.println("Enter a number:");
            Scanner scan = new Scanner(System.in);
            number = scan.nextInt();
            if (previousNumber != number) {
                numberOfTries++;
                previousNumber = number;
            }
            if (number == times) {
                break;
            }
            if (number < times) {
                System.out.println("The number is too small");
            } else {
                System.out.println("The number is too large");
            }
        }
        System.out.println(numberOfTries);

    }
}

