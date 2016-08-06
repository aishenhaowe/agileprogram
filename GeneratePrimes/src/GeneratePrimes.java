import java.util.*;

public class GeneratePrimes
{
    public static int [] generatePrimes(int maxValue)
    {
        //the only valid case
        if (maxValue >= 2)
        {
            // declarations
            int s = maxValue + 1;
            boolean[] f = new boolean[s];
            int i;

            // initialize the array to true
            for (i = 0; i < s; i++)
                f[i] = true;

            // get rid of known non-primes
            f[0] = f[1] = false;

            // sieve
            int j;
            for (i = 2; i < Math.sqrt(s) + 1; i++)
            {
                for (j = 2 * i; j < s; j += i)
                {
                     f[j] = false;  // multiple is not primes
                }
            }

            // how many primes are there
            int count = 0;
            for (i = 0; i < s; i++)
            {
                 if (f[i])
                     count++;
            }

            int [] primes = new int[count];

            // move the primes into the result
            for (i = 0, j = 0; i < s; i++)
            {
                 if (f[i])
                    primes[j++] = i;
            }

            return primes;
        }
        else
            return new int[0];
    }
}
