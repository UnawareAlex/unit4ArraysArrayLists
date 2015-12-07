import java.util.Scanner;
import java.util.ArrayList;
public class MagicSquares
{
    public static void MagicSquares()
    {
        // initialise instance variables
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter all numbers 1 through 16 in any order you want: ");
        for (int i = 0; i <= 16; i++)
        {
            for (int j = 0
        }
    }
    
    public boolean testInput(ArrayList arrayList)
    {
        boolean state = true;
        for (int i = 1; i <=16; i++)
        {
            if (arrayList.contains(i) == false) {
                state = false;
                break;
            }
        }
        return state;
    }
    
    public int testRow(ArrayList arrayList)
    {
        boolean state = true;
        for (int i = 0; i < 16; i += 4)
        {
            for (int j = 0; j < 4; j++)
            {
                int sumRow = 0;
                sumRow += arrayList.get(i + j);
            }
        }
    }
}
