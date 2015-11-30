import java.util.Arrays;
public class ArrayOperations
{
    public static void ArrayOperations()
    {
        int[] num = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        
        System.out.println("Number of items in array: " + num.length);
        System.out.println("First array item: int " + num[0]);
        System.out.println("Last array item: int " + num[8]);
        System.out.println("num[num.length - 1] is equal to " + num[num.length - 1]);
        System.out.println("");
        for (int i = 0; i < num.length; i++)
        {
            System.out.print(num[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < num.length; i++)
        {
            System.out.print("int " + num[i] + " ");
        }
        System.out.println("");
        for (int i = 8; i >= 0; i--)
        {
            System.out.print("int " + num[i] + " ");
        }
        System.out.println("");
        for (int i : num)
        {
            System.out.print(i + " ");
        }
    }
}