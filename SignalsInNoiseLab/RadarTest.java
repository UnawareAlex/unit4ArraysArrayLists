import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;
/**
 * The test class RadarTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RadarTest
{
    /**
     * Default constructor for test class RadarTest
     */
    public RadarTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * Constucts a Radar object with given dimensions and determines a monster location which is 
     * tested after scanned through the radar 200 times
     */
    @Test
    public void testMonsterLocation1()
    {
        final int ROWS = 100;
        final int COLS = 100;
        Radar radar = new Radar(ROWS, COLS);
        radar.setMonsterLocation(42, 42); //The Answer to the Universe
        radar.setNoiseFraction(.15);
        for (int i = 0; i < 200; i++)
        {
            radar.scan(); 
        }
       
        int largestValue = 0;
        int largestRow = 0;
        int largestCol = 0;
        for (int i = 0; i < 100; i++) 
        {
            for (int j = 0; j < 100; j++)
            {
                if (radar.getAccumulatedDetection(i, j) > largestValue) //Monster will always have largest value out of all cells in accumulator array
                {
                    largestValue = radar.getAccumulatedDetection(i, j); 
                    largestRow = i;
                    largestCol = j;
                }
            }
        }
        
        assertEquals(42, largestRow);
        assertEquals(42, largestCol);
    }
    
    /**
     * Constucts a Radar object with given dimensions and determines a monster location which is 
     * tested after scanned through the radar 200 times
     */
    @Test
    public void testMonsterLocation2()
    {
        final int ROWS = 100;
        final int COLS = 100;
        Radar radar = new Radar(ROWS, COLS);
        radar.setMonsterLocation(12, 34);
        radar.setNoiseFraction(.2);
        for (int i = 0; i < 200; i++)
        {
            radar.scan(); 
        }
       
        int largestValue = 0;
        int largestRow = 0;
        int largestCol = 0;
        for (int i = 0; i < 100; i++) 
        {
            for (int j = 0; j < 100; j++)
            {
                if (radar.getAccumulatedDetection(i, j) > largestValue)
                {
                    largestValue = radar.getAccumulatedDetection(i, j);
                    largestRow = i;
                    largestCol = j;
                }
            }
        }
        
        assertEquals(12, largestRow);
        assertEquals(34, largestCol);
    }
    
    /**
     * Constucts a Radar object with given dimensions and determines a random monster location using
     * the Random Class which is tested after the radar is scanned 200 times
     */
    @Test
    public void testMonsterLocationRandom()
    {
        final int ROWS = 100;
        final int COLS = 100;
        Radar radar = new Radar(ROWS, COLS);
        Random generator = new Random(); //create random object
        int x = generator.nextInt(100); //randomy determine row and column values for the monster
        int y = generator.nextInt(100);
        radar.setMonsterLocation(x, y);
        radar.setNoiseFraction(.25);
        for (int i = 0; i < 200; i++)
        {
            radar.scan(); 
        }
       
        int largestValue = 0;
        int largestRow = 0;
        int largestCol = 0;
        for (int i = 0; i < 100; i++) 
        {
            for (int j = 0; j < 100; j++)
            {
                if (radar.getAccumulatedDetection(i, j) > largestValue)
                {
                    largestValue = radar.getAccumulatedDetection(i, j);
                    largestRow = i;
                    largestCol = j;
                }
            }
        }
        
        assertEquals(x, largestRow);
        assertEquals(y, largestCol);
    }
}
