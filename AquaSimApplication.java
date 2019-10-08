import java.awt.Color;
import java.util.Random;

/** Aquarium Lab Series: <br>    
 *      The AquaSimApplication class contains the main function that will
 *      run the Aquarium Simulation. (This description should be updated
 *      when the behavior of the program changes.)<br>
 *
 * Modifications: <br>
 *   23 March 2008,  Alyce Brady,  Created skeleton main that constructs and
 *                                 displays an empty aquarium.<br>
 *   (date), (your name), Modified to .... <br>
 *
 *  @author  Alyce Brady  (should be Your Name)
 *  @version 23 March 2008  (should be today's date)
 *  @see AquariumController
 **/
public class AquaSimApplication
{
    /**
     *  This is the main function.  It executes the program.
     *  @param    String args[] is never used
     **/
    public static void main(String args[])
    {
        System.out.println("This is the aquarium lab.");

        // CONSTRUCT OBJECTS NEEDED FOR THE AQUARIUM SIMULATION.

        // Construct the aquarium.  Specify its dimensions when creating it.
        Aquarium aqua;  // create reference to an Aquarium ...
        //aqua = new Aquarium(600, 400);
        aqua = new Aquarium(1000, 1000); // ... object that has now been created

        // Construct fish and add them to the aquarium.
        //      CODE MISSING HERE!
        // Add AquaFish to aquarium
        AquaFish black = new AquaFish(aqua, Color.black);
            aqua.add(black);
        AquaFish white = new AquaFish(aqua);
            aqua.add(white);
        AquaFish blue = new AquaFish(aqua, Color.blue);
            aqua.add(blue);
        

        // Construct a graphical user interface (GUI) to display and control
        // the simulation.  The user interface needs to know about the
        // aquarium, so we pass aqua to the user interface constructor.
        AquaSimGUI userInterface;              // create reference to GUI ...
        userInterface = new AquaSimGUI(aqua);  // ... and then GUI itself

        // Tell the user how to start the aquarium simulation.
        System.out.println("Press the Start button to start the simulation.");

        // Now wait for the user to press the start button.
        userInterface.waitForStart();

        // Draw the initial view of the aquarium and its contents.
        userInterface.showAquarium();


        // RUN THE AQUARIUM SIMULATION.

        // Make the fish move and redisplay.
        //      CODE MISSING HERE!
        for (;;)
        {
            black.moveForward();
            blue.moveForward();
            white.moveForward();
            userInterface.showAquarium();
            if (black.atWall())
            {
                black.changeDir();
                black.moveForward();
                blue.moveForward();
                white.moveForward();
                userInterface.showAquarium();
            }
            if (blue.atWall())
            {
                blue.changeDir();
                black.moveForward();
                blue.moveForward();
                white.moveForward();
                userInterface.showAquarium();
            }
            if (white.atWall())
            {
                white.changeDir();
                black.moveForward();
                blue.moveForward();
                white.moveForward();
                userInterface.showAquarium();
            }
        }
        /*while (!blue.atWall())
        {
            blue.moveForward();
            userInterface.showAquarium();
            if (blue.atWall())
            {
                blue.changeDir();
                blue.moveForward();
                userInterface.showAquarium();
            }
        }
        while (!white.atWall())
        {
            white.moveForward();
            userInterface.showAquarium();
            if (white.atWall())
            {
                white.changeDir();
                white.moveForward();
                userInterface.showAquarium();
            }
        }
        userInterface.showAquarium();*/

        // WRAP UP.

        // Remind user how to quit application.
        

    }//end main

}//end class
