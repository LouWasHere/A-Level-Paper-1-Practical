package fizzbuzz;
import java.util.*;
public class FizzBuzz 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How far to count?");
        int howFar = scanner.nextInt();
        
        while(howFar < 1)
        {
            System.out.println("Not a valid number, please try again.");
            howFar = scanner.nextInt();
        }
        
        for(int myLoop = 1; myLoop <= howFar; myLoop++)
        {
            if(myLoop % 3 == 0 && myLoop % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else
            {
                if(myLoop % 3 == 0)
                {
                    System.out.println("Fizz");
                }
                else
                {
                    if(myLoop % 5 == 0)
                    {
                        System.out.println("Buzz");
                    }
                    else
                    {
                        System.out.println(myLoop);
                    }
                }
            }
        }
    }
    
}
