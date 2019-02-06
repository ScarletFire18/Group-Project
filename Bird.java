
class Bird extends Pet
   {  
   
      public Bird()
         {}
      
      public Bird(String n, int a, String s, boolean h)
         {
            super(n,a,s,h);
         }
         
      public void fly()
         {
            System.out.println("" + this.getName() + " flew high in the sky!");
         }
         
      public void squawk()
         {
            System.out.println("" + this.getName() + " squawked!");
         }
      
      public void nest()
         {
            System.out.println("" + this.getName() + " is building a nest!");
         }
      
   }