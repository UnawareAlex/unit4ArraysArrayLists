import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListPractice
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter words or 'quit' to stop. ");
        String word = s.next();
        while (word.equals("quit") == false)
        {
            words.add(word);
            word = s.next();
        }
        
        System.out.println(words);
        
        for (int i = words.size() - 1; i >= 0; i--)
        {
            word = words.get(i);
            if (word.equals("like"))
            {
                words.remove(i);
            }
        }
        
        System.out.println(words);
    }
}