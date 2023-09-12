import java.util.*;

public class gun
{
    Scanner input = new Scanner(System.in);
    int userInput = 0;
    int currentChamber = 0;
    int bulletChamber = 0;
    
    Random rand = new Random();
    // Obtain a number between [0 - 5].
    int n = rand.nextInt(5);

    public void initialize()
    {
        Random rand = new Random();
        // Obtain a number between [0 - 5].
        int n = rand.nextInt(5);
        bulletChamber = n;
    }

    public void spin()
    {
        int n = rand.nextInt(5);
        currentChamber = n;
        System.out.println("The gun lands on chamber " + currentChamber + ".");
    }

    public void shoot(boolean quitFlag)
    {
        System.out.println("You pull the trigger....");
        pause(500);
        if (currentChamber == bulletChamber)
        {
            System.out.println("BANG! GAME OVER!");
            System.out.println("-------------------");
            System.out.println("Quit Game?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("-> ");
            userInput = input.nextInt();

            if (userInput == 1)
            {
                quitFlag = true;
            }

            if (userInput == 2)
            {
               game.reset(); 
            }
            
        }

        else
        {
            System.out.println("Safe. The chamber is spun.");
            int n = rand.nextInt(5);
            currentChamber = n;
            System.out.println("The gun lands on chamber " + currentChamber + ".");
        }
    }

    public static void pause(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.err.format("InterruptedException : %s%n", e);
        }
    }
}
