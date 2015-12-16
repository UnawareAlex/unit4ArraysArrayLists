import javax.swing.JFrame;
import java.util.Scanner;
import java.util.Random;
/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @gcschmit
 * @version 19 July 2014
 */
public class RadarViewer
{
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create the radar, set the monster location, and perform the initial scan
        int again = 0;
        int row = 0;
        int column = 0;
        while (again == 0) //loops user back to initial question if they enter an invalid input (NOT set or guess)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Would you like to set the monster location or guess it's position (set/guess)? ");
            String input = scan.next();
            if (input.equals("set")) //monster location determined by the user
            {
                System.out.println("What row would you like the monster to be in (0-99): ");
                row = scan.nextInt();
                System.out.println("What column would you like the monster to be in (0-99): ");
                column = scan.nextInt();
                again = 1;
            }
            else if (input.equals("guess")) //monster location randomly selected and user guess a row and colum
            {
                Random generator = new Random();
                row = generator.nextInt(100); //random row
                column = generator.nextInt(100); //random col
                System.out.println("What row would you like to guess (0-99): ");
                int rowGuess = scan.nextInt();
                System.out.println("What column would you like to guess (0-99): ");
                int columnGuess = scan.nextInt();
                
                if (Math.abs(row - rowGuess) >= 35 || Math.abs(column - columnGuess) >= 35)
                {
                    System.out.println("The monster is at row " + row + " column " + column + ". Better luck next time!");
                }
                else if (Math.abs(row - rowGuess) >= 15 || Math.abs(column - columnGuess) >= 15)
                {
                    System.out.println("The monster is at row " + row + " column " + column + ". Not bad!");
                }
                else if (Math.abs(row - rowGuess) >= 1 || Math.abs(column - columnGuess) >= 1)
                {
                    System.out.println("The monster is at row " + row + " column " + column + ". So close!");
                }
                else //when guess is right on point!
                {
                    System.out.println("The monster is at row " + row + " column " + column + ". Perfect guess!");
                }
                again = 1;
            }
            else 
            {
                System.out.println("Please enter either 'set' or 'guess' ");
            }
        }
        
        
        //determine size of grid
        final int ROWS = 100;
        final int COLS = 100;
        Radar radar = new Radar(ROWS, COLS);
        radar.setMonsterLocation(row, column);
        radar.setNoiseFraction(0.10);
        radar.scan();
        
        JFrame frame = new JFrame();
        
        frame.setTitle("Signals in Noise Lab");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // a frame contains a single component; create the radar component and add it to the frame
        RadarComponent component = new RadarComponent(radar);
        frame.add(component);
        
        // set the size of the frame to encompass the contained component
        frame.pack();
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        
        // perform 100 scans of the radar wiht a slight pause between each
        // after each scan, instruct the Java Run-Time to redraw the window
        for(int i = 0; i < 100; i++)
        {
            Thread.sleep(100); // sleep 100 milliseconds (1/10 second)
            
            radar.scan();
            
            frame.repaint();
        }
    }

}
