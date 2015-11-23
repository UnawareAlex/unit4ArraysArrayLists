import java.util.Arrays;

/**
 * Changes the size of an already defined array.
 * 
 * Alex Arnold 
 * v1.0
 */
public class ChangeArraySize
{
    /** description of instance variable x (add comment for each instance variable) */
    private int[] initialArray;
    private int increaseBy;

    /**
     * Default constructor for objects of class ChangeArraySize
     */
    public ChangeArraySize(int[] userArray, int value)
    {
        // initialise instance variables
        initialArray = new int[userArray.length];
        increaseBy = value;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void sampleMethod(int y)
    {
        // put your code here
        initialArray = Arrays.copyOf(initialArray, initialArray.length + increaseBy);
    }
}
