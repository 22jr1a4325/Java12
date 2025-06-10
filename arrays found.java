import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        String[] bikes= {"HD", "BMW", "RE", "DUCATI", "APRILLA"};
        String search="HD";
        boolean found= false;
        Arrays.sort(bikes);
         for(String bike: bikes)
         {
             if(bike.equalsIgnoreCase(search))
       {
           found = true;
           break;
       }
         }
       if(found)
       {
          System.out.println(search+ "is found");   
       }
       else
       {
           System.out.println(search+ "is not found"); 
       }
    }
}
       
