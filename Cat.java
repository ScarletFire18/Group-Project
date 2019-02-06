
class Cat extends Pet
   {  
   
      public Cat()
         {}
      
      public Cat(String n, int a, String s, boolean h)
         {
            super(n,a,s,h);
         }
         
      public void climb()
         {
            System.out.println("" + this.getName() + " is climbing a tree!");
         }
         
      public void meow()
         {
            System.out.println("" + this.getName() + " meowed!");
         }
      
      public void nap()
         {
            System.out.println("" + this.getName() + " is taking a nap!");
         }
      
   }