package isp.lab2;
import java.util.Scanner;
public class Exercise6 {

    /**
     * This method should generate the required vector non-recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateVector(int n) {
        int vector[],k=0,c;
        vector=new int [30];
        if(n==1)vector[0]=1;
        else if(n==2)vector[1]=2;
        else
        {
             vector[0]=1;
             vector[1]=2;
            int a=1,b=2;
            k=2;
            for(int i=3;i<=n;i++)
            {
                c=a*b;
                a=b;
                b=c;
                vector[k++]=c;
            }
        }
        int v[];
        v=new int [k];
        for(int i=0;i<k;i++)
            v[i]=vector[i];
        return v;
    }

    /**
     * This method should generate the required vector recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int Recursively(int n)
    {
        if(n==0)return 1;
        else if(n==1)return 2;
        else
        {
            return Recursively(n-1)*Recursively(n-2);
        }
    }
    public static int[] generateRandomVectorRecursively(int n) {
       
        int v[];
        v=new int[100];
        for(int i=0; i<n; i++)
        {
            v[i] = Recursively(i);
        }
        int vector[];
        vector=new int[n];
        for(int i=0;i<n;i++)
        {
            vector[i]=v[i];
        }
        return vector;
    }

    public static void main(String[] args) {
        int v[];
        v=new int [100];
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        v=generateVector(n);
        System.out.println("Array generated non-recursively:");
        for(int i=0;i<n;i++)
            System.out.println(v[i]);
        v=generateRandomVectorRecursively(n);
        System.out.println("Array generated recursively:");
         for(int i=0;i<n;i++)
            System.out.println(v[i]);
        
    }
}
