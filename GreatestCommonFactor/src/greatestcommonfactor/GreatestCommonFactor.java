package greatestcommonfactor;
import java.util.*;
public class GreatestCommonFactor 
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a whole number.");
        int number1 = scanner.nextInt();
        System.out.println("Please enter another whole number.");
        int number2 = scanner.nextInt();
        int temp1 = number1;
        int temp2 = number2;
        
        while(temp1 != temp2)
        {
            if(temp1 > temp2)
            {
                temp1 = temp1-temp2;
            }
            else
            {
                temp2 = temp2 - temp1;
            }
        }
        
        int result = temp1;
        
        System.out.println(result + " is the GCF of " + number1 + " and " + number2);
    }
    
}
