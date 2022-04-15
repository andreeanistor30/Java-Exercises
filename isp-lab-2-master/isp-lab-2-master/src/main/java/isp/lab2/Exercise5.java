package isp.lab2;
import java.util.Random;
public class Exercise5 {

    /**
     * This method should generate an array that have 20 random nubers between -1000 and 1000
     *
     * @return the random numbers
     */
    public static int[] generateRandomNumbers() {
        int min = -1000;  
        int max = 1000;  
        int randomNumbers[];
        randomNumbers=new int [20];
        double a = Math.random()*(max-min+1)+min;   
        Random I  = new Random();
        int number; 
        for(int i=0; i<20;i++){
            {
                number = I.nextInt(20);
                randomNumbers[i]=number;
            }
            
        
    }
    return randomNumbers;
    }

    /**
     * This method should sort the given random numbers
     *
     * @param randomNumbers numbers generated random
     * @return sorted int array
     */
    public static int[] getSortedNumbers(int[] randomNumbers) {
        
        int i,j=0,ok,aux;
        do
        {
            ok=1;
            j++;
            for(i=0;i<randomNumbers.length-j;i++)
            {
                if(randomNumbers[i]>randomNumbers[i+1])
                {
                    ok=0;
                    aux=randomNumbers[i];
                    randomNumbers[i]=randomNumbers[i+1];
                    randomNumbers[i+1]=aux;
                    
                }
            }
        }while(ok==0);
        return randomNumbers;
    }

    public static void main(String[] args) {
        // display the random generated numbers
        int[] randomNumbers = generateRandomNumbers();
        System.out.println("The random generated numbers are:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + ", ");
        }
        int[] sortedNumbers = getSortedNumbers(randomNumbers);
        // display the sorted numbers
        System.out.println("The sorted numbers are:");
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.print(sortedNumbers[i] + ", ");
        }
    }
}
