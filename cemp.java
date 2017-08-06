class cemp
 {
   int x=10;
          void show(int x, cemp z)
            {
          System.out.print(x);
            System.out.print(z.x);
          }
       public static void main(String[] args)
            {
            cemp t=new cemp();
              t.show(20,t);
        System.out.println(t.x);
    }
  }
 