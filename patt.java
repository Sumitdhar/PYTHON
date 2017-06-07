class patt
{
   public static void main(String s[])
   { 
      int i,j;
      for(i=1;i<=3;i++)
           {
           for(j=1;j<=3;j++) 
                {
              if(i==1||i==3||j==1)
               {
              System.out.print("*");
           }
            else
     System.out.print(" HELLO ");
            }
              System.out.print("\n");
           }
       }
}