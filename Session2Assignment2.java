public class Session2Assignment2
{
    public static void main(String [] args)
    {
         for(int i=0;i < 5; i++)
          { 
             for(int j = 0;j < 5;j++)
             {
                if(i==j || j==(5-i-1))
                {
                    System.out.print("*");
                }                                       
                else
                {
                   System.out.print("_");
                }
             }
           System.out.println();

        }

     }
}


