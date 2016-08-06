import junit.framework.*;

public class GeneratePrimesTest extends TestCase
{
    public static void main(String args[])
    {
        junit.swingui.TestRunner.main(new String[] {"GeneratePrimesTest"});
    }

    public GeneratePrimesTest(String name)
    {
        super(name);
    }

    public void testPrimes01()
    {
        int[] nullArray = GeneratePrimes.generatePrimes(0);
        assertEquals(nullArray.length, 0);
    }
    
    public void testPrimes02()
    {
        int[] minArray = GeneratePrimes.generatePrimes(2);
        assertEquals(minArray.length, 1);
        assertEquals(minArray[0], 2);
    }
    
    public void testPrimes03()
    {
        int[] threeArray = GeneratePrimes.generatePrimes(3);
        assertEquals(threeArray.length, 2);
        assertEquals(threeArray[0], 2);
        assertEquals(threeArray[1], 3);
    }
    
    public void testPrimes04()
    {
        int[] centArray = GeneratePrimes.generatePrimes(100);
        assertEquals(centArray.length, 25);
        assertEquals(centArray[24], 97);
    }
    
}
