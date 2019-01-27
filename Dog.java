
class Dog extends Pet
   {  
   
      public Dog()
         {}
      
      public Dog(String n, int a, String s, boolean h)
         {
            super(n,a,s,h);
         }
         
      public void fetch()
         {
            System.out.println("" + this.getName() + " chased the ball!");
         }
         
      public void bark()
         {
            System.out.println("" + this.getName() + " barked!");
         }
      
      public void dig()
         {
            System.out.println("" + this.getName() + " is digging!");
         }
      
   }