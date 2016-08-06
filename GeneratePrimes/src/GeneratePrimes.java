import java.util.*;

public class GeneratePrimes
{
	private static boolean[] f;
	private static int[] result;
	
    public static int [] generatePrimes(int maxValue)
    {
    	if (maxValue < 2)
    		return new int[0];
    	else
    	{
    		initializeArrayOfIntegers(maxValue);
    		crossOutMultiples();
    		putUncrossedIntegerIntoRsult();
    		
    		return result;
    	}
    }

    private static void initializeArrayOfIntegers(int maxValue)
    {
    	f = new boolean[maxValue + 1];
    	f[0] = f[1] = false;
        // initialize the array to true
        for (int i = 2; i < f.length; i++)
            f[i] = true;
    }
    
    private static void crossOutMultiples()
    {
    	int i;
    	int j;
    	
        for (i = 2; i < Math.sqrt(f.length) + 1; i++)
        {
        	if (f[i])
        	{
                for (j = 2 * i; j < f.length; j += i)
                {
                     f[j] = false;  // multiple is not primes
                }	        		
        	}
        }
    }
    
    private static void putUncrossedIntegerIntoRsult()
    {
    	int i;
    	int j;
    	int count = 0;
    	
        for (i = 0; i < f.length; i++)
        {
             if (f[i])
                 count++;
        }

        result = new int[count];

        // move the primes into the result
        for (i = 0, j = 0; i < f.length; i++)
        {
             if (f[i])
                result[j++] = i;
        }
    }
}
