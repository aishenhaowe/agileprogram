
public class GeneratePrimes
{
	private static boolean[] isCrossed;
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
    	isCrossed = new boolean[maxValue + 1];
    	isCrossed[0] = isCrossed[1] = false;
        for (int i = 2; i < isCrossed.length; i++)
            isCrossed[i] = true;
    }
    
    private static void crossOutMultiples()
    {
    	double maxPrimeFactor = Math.sqrt(isCrossed.length) + 1;
    	
        for (int i = 2; i < maxPrimeFactor; i++)
        {
        	if (notCrossed(i))
        		crossOutMultiplesOf(i);
        }
    }
    
    private static void crossOutMultiplesOf(int i)
    {
    	for (int multiple = 2 * i; multiple < isCrossed.length; multiple += i)
    	{
    		isCrossed[multiple] = false;
    	}
    }
    
    private static boolean notCrossed(int i)
    {
    	return isCrossed[i] == true;
    }
    
    private static void putUncrossedIntegerIntoRsult()
    {
    	int i;
    	int j;
    	int count = 0;
    	
        for (i = 0; i < isCrossed.length; i++)
        {
             if (isCrossed[i])
                 count++;
        }

        result = new int[count];

        // move the primes into the result
        for (i = 0, j = 0; i < isCrossed.length; i++)
        {
             if (isCrossed[i])
                result[j++] = i;
        }
    }
}
