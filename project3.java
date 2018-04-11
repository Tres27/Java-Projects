
import java.util.*;
public class project3
{
   public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int score[] = new int[10];  
        int count = 0;
        int c = 0;
        for (int i=0; i< score.length; i++)
        {
            System.out.print("Enter score:");
            score[i]= Integer.parseInt(s.nextLine());
                if(score [i] > 79 && score [i] < 90)
                    {
                        count++;
                    }
                if(score [i] > 90 && score [i] < 101)
                    {
                        c++;
                    }
        }
        System.out.println("No of A's:" + c);
        System.out.println("No of B's:" + count);
    }

    
}
