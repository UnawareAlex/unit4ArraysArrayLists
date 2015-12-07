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
        if (this.currentSize == this.values.length)
        {
            this.growArray();
        }

        currentSize++;
        for (int i = this.currentSize - 1; i > pos; i--)
        {
            this.values[i] = this.values[i - 1];
        }
        
        this.values[pos] = value;
    }
    
    public void swap(int posA, int posB)
    {
        int temp = this.values[posA];
        this.values[posA] = this.values[posB];
        this.values[posB] = temp;
    }
    
    public void growArray()
    {
        int[] newArray = new int[this.currentSize * 2];
        
        for (int i = 0; i < this.currentSize; i++)
        {
            newArray[i] = this.values[i];
        }
        
        this.values = newArray;
    }
    
    public static void main(String[] args)
    {
        PartialArray num = new PartialArray();
        num.swap(0, 1);
        num.insert(20, 21);
    }
}

