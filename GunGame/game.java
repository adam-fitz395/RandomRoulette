import java.util.Scanner;

public class game 
{
    public static void main(String[] args) throws InterruptedException 
    {
        //Initialize user input
        boolean quitFlag = false;
        int userInput;
        Scanner input = new Scanner(System.in);

        gun newGun = new gun();
        reset();
        
        while (quitFlag == false)
        {
            System.out.println("In front of you lies a revolver with 6 chambers. A bullet lies in one.");
            System.out.println("1. Spin");
            System.out.println("2. Shoot");
            userInput = input.nextInt();
            
            if (userInput == 1)
            {
                newGun.spin();
            }
            
            else if (userInput == 2)
            {
                newGun.shoot(quitFlag);
            }

            else
            {
                System.out.println("Invalid option");
            }
                    
        }

        input.close();
    }

    public static void reset()
    {
        gun newGun = new gun();
        //Initialize gun
        newGun.initialize();  
    }
        
}