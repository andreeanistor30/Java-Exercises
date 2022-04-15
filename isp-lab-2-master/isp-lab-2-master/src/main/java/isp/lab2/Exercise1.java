package isp.lab2;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;  
public class Exercise1 {
    
    
    /**
     * This method should generate an random number between 2 and 10 then
     * should ask user to enter that amount of numbers from keyboard and
     * store the numbers in an int array which should be returned
     *
     * @return the array of numbers read from keyboard
     */
    private static int[] getUserNumbers() {
    double min = 2;
    double max = 10;
    double n = Math.random()*(max - min+1) + min;
    int array[];
    array=new int[11];
    for(int i=0;i<n;i++)
    {
     array[i]=new Scanner(System.in).nextInt();
     
    }
    return array;
    }

    /**
     * This method should compute the arithmetical mean of the given numbers
     *
     * @param userNumbers the numbers used to calculate the arithmetical mean
     * @return the arithmetical mean of the given numbers
     */
    protected static double computeTheArithmeticalMean(int[] userNumbers) {
        int size=userNumbers.length;
        double sum=0;
        for(int i=0;i<size;i++)
        {
            sum+=userNumbers[i];
        }
        return sum/size;
    }

    public static void main(String[] args) {
        int[] userNumbers = getUserNumbers();
        System.out.println("Mean number is: " + computeTheArithmeticalMean(userNumbers));
    }


}
