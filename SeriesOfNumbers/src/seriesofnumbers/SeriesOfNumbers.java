package seriesofnumbers;
import java.util.*;
public class SeriesOfNumbers 
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while(number < 1 || number > 10)
        {
            System.out.println("Enter a positive whole number.");
            number = scanner.nextInt();
            if(number > 10)
            {
                System.out.println("Number too large.");
            }
            else
            {
                if(number<1)
                {
                    System.out.println("Not a positive number.");
                }
            }
        }
        
        int c = 1;
        
        for(int k = 0; k <= number -1; k++)
        {
            System.out.println(c);
            c = ((c * (number - 1 - k))/(k + 1));
        }
    }
    
}
