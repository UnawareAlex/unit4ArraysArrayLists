public class PartialArray
{
    /** description of instance variable x (add comment for each instance variable) */
    private int[] values;
    private int currentSize;

    /**
     * Default constructor for objects of class PartialArray
     */
    public PartialArray()
    {
        // initialise instance variables
        values = new int[100];
        for (this.currentSize = 0; this.currentSize <20; this.currentSize++)
        {
            values[this.currentSize] = this.currentSize * this.currentSize;
        }
    }
    
    public void remove(int pos)
    {
        for (int i = pos +1; i < this.currentSize; i++)
        {
            this.values[i - 1] = this.values[i];
        }
        currentSize--;
    }
    
    public void insert(int pos, int value)
    {
        if (this.currentSize < this.values.length)
        {
            currentSize++;
            for (int i = this.currentSize - 1; i > pos; i--)
            {
                this.values[i] = this.values[i - 1];
            }
        }
    }
    }

