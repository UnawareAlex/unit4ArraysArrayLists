

/**
 * Write a description of class ArrayMethods here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayMethods
{
    private int[] values;
    
    public ArrayMethods(int[] initialValues)
    {
        this.values = initialValues;
    }
    
    public void swapFirstAndLast()
    {
        int temp = values[0];
        values[0] = values[values.length - 1];
        values[values.length - 1] = temp;
    }
    
    public void shiftRight()
    {
        int temp = values[values.length - 1];
        for (int i = 1; i < values.length; i++)
        {
            values[i] = values[i - 1];
        }
        values[0] = temp;
    }
    
    public void evenReplace()
    {
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] % 2 == 0)
            {
                values[i] = 0;
            }
        }
    }
    
    public void largerNeighbor()
    {
        for (int i = 1; i < values.length - 1; i++)
        {
            int leftNeighbor = values[i - 1];
            int rightNeighbor = values[i + 1];
            if (values[i - 1] > values[i + 1])
            {
                values[i] = values[i - 1];
            }
            else
            {
                values[i] = values[i + 1];
            }
        }
    }
    
    public void replaceMiddle()
    {
        if (values.length % 2 == 0)
        {
            int[] newArray = new int[values.length - 2];
            for (int i = 0; i < ((values.length/2) - 1); i++)
            {
                newArray[i] = values[i];
            }
            for (int i = ((values.length/2) - 1); i < values.length; i++)
            {
                newArray[i] = values[i + 2];
            }
        }
        else
        {
            int[] newArray = new int[values.length - 1];
            for (int i = 0; i < ((values.length - 1)/2); i++)
            {
                newArray[i] = values[i];
            }
            for (int i = ((values.length - 1)/2); i < values.length; i++)
            {
                newArray[i] = values[i + 1];
            }
        }
    }

    public void evensToFront()
    {
        int[] newArray = new int[values.length];
        for (int i = 0; i < values.length; i++)
        {
            for (int num = 0; values[i] % 2 == 0; num++)
            {
                newArray[num] = values[i];
            }
        } 
    }
    
    public int secondLargest()
    {
        int largest = values[0];
        for (int i = 1; i < values.length; i++)
        {
            if (values[i] > largest)
            {
                largest = values[i];
            }
        }
        return largest;
    }
    
    public boolean increasingOrder()
    //returns true if array IS sorted in increasing order
    {
        boolean state = true;
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] < values[i - 1])
            {
                state = false;
                break;
            }
        }
        return state;
    }
    
    public boolean adjacentDuplicates()
    //returns false if there are NO adjacent duplicates
    {
        boolean adjacent = false;
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] == values[i - 1])
            {
                adjacent = true;
                break;
            }
        }
        return adjacent;
    }
    
    public boolean duplicateElements()
    //returns false if there are NO duplicates
    {
        boolean duplicates = false;
        for (int i = 0; i < values.length; i++)
        {
            for (int n = 0; n < values.length; n++)
            {
                if (values[i] == values[n])
                {
                    duplicates = true;
                    break;
                }
            }
        }
        return duplicates;
    }
}
