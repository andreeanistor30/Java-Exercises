package isp.lab2;
import java.lang.Math;
public class Exercise3 {

    /**
     * This method should verify if a number is prime
     *
     * @param number the number to check
     * @return true if number is prime and false otherwise
     */
    public static boolean isPrimeNumber(final int number) {
        boolean ok=true;
        if(number==0||number==1)return false;
        for(int j=2;j*j<=number;j++)
            if(number%j==0)ok=false;
        return ok;
    }

    /**
     * This method should calculate the sum of digits of a given number
     *
     * @param number the number used to calculate the sum of digits
     * @return an int representing the sum of digits of the given number
     */
    public static int calculateSumOfDigits(int number) {
        int sum=0;
        while(number!=0)
        {
            sum+=number%10;
            number/=10;
        }
        return sum;
    }

    /**
     * This method should extract the prime numbers from a given interval
     * using isPrimeNumber(final int number) method defined above
     * NOTE* a < b
     *
     * @param a the left end of the interval
     * @param b the right end of the interval
     * @return and int array consisting of the prime numbers from the given interval
     */
    public static int[] getPrimeNumbersFromInterval(int a, int b) {
        // TODO: Use isPrimeNumber(final int number)
        int primeNumbers[],k=0;
        primeNumbers=new int[100];
        for(int i=a;i<=b;i++)
        {
            if(isPrimeNumber(i)==true)
                primeNumbers[k++]=i;
            
        }
        int[] p = new int[k];
        for(int i=0; i<k; i++)
            p[i]=primeNumbers[i];
        return p;
    }

    /**
     * This method should calculate the geometric mean of the given prime numbers
     *
     * @param primeNumbers the numbers used to calculate the geometric mean
     * @return the geometric mean of the given numbers
     */
    public static double calculateGeometricMean(int[] primeNumbers) {
        double product=1;
        for(int i=0;i<primeNumbers.length;i++){
            product=product*primeNumbers[i];
            System.out.println(primeNumbers[i]);}
        System.out.println(product);
        return Math.pow(product,1.0/primeNumbers.length);
    }

    /**
     * This method should calculate the number of prime numbers which
     * have the sum of digits an even number
     * NOTE* use calculateSumOfDigits(int number)
     *
     * @param primeNumbers prime numbers used for calculation
     * @return the numbers which respect the given condition
     */
    public static int numberOfPNWithEvenSumOfDigits(int[] primeNumbers) {
        // TODO: Use calculateSumOfDigits(int number)
        int k=0;
        for(int i=0;i<primeNumbers.length;i++)
        {
            if(calculateSumOfDigits(primeNumbers[i])%2==0)k++;
        }
        return k;
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        System.out.println("The geometric mean is: " + calculateGeometricMean(getPrimeNumbersFromInterval(a, b)));
        int[] v = getPrimeNumbersFromInterval(a,b);
        for(int i=0; i<v.length; i++)
            System.out.print(v[i]+" ");
        System.out.println("The number of prime numbers which have the sum of digits an even number is: " + numberOfPNWithEvenSumOfDigits(getPrimeNumbersFromInterval(a, b)));
    }
}
