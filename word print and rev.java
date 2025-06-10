public class Main
{
	public static void main(String[] args) 
	{
	   String str = "india";
	   int len = str.length();
	   for(int i=0;i<str.length();++i)
	   
	   {
	       for(int j=0;j<=i;j++)
	       {
	           System.out.print(str.charAt(j));
	       }
	       System.out.println();
	   }
	   for(int i=len;i>=1;i--)
	   {
	       for(int j=0;j<i;j++)
	       {
	           System.out.print(str.charAt(j));
	       }
	       System.out.println();
	   }
	}
}

