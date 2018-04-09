
/**
 * Write a description of class Proj2 here.
 *https://stackoverflow.com/questions/5959061/cannot-find-symbol-class-scanner-error
 *(without "import java.util.Scanner;" the program was not able to read "Scanner s=new Scanner(System.in);")
 *
 * @author (Shreyas Chaliha)
 * @version (project 2)
 */
import java.text.*;   
import java.util.Scanner;
public class Proj2

{
    public static void main(String[] args)
    {
     Scanner s=new Scanner(System.in); 
     DecimalFormat df = new DecimalFormat("#0.00");
     System.out.print("Enter the base price of a T-shirt:$");
     int price = Integer.parseInt(s.nextLine());
     System.out.print("Enter the number of shirts purchased:");
     int shirt = Integer.parseInt(s.nextLine());
     if (shirt <=5)
            {
                System.out.print(("Total Price:$"+ df.format(price*shirt)));
            }
     else
           {
               System.out.print(("Total Price:$"+ df.format(((5*price)+(((shirt-5)*price)*0.5)))));
           }
    }
}
