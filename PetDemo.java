
public class PetDemo
   {
      public static void main(String[] args)
         {
            System.out.println("Creating Dog object...");
            Dog bruno = new Dog("Bruno",3,"Bark Bark!",true);  //creates a dog object, constructor is called
            
            /**
               The following methods are examples of inheritance. These methods are inherited from the Pet class and can apply to any Pet object.
            **/ 
           bruno.feed();
           bruno.checkHunger();
            
            /**
               The following methods are examples of polymorphism. These methods can only be used for Pets who are also Dog objects.
            **/
            bruno.bark();
            bruno.fetch();
            bruno.dig();
            System.out.println("\n\n");
            
            System.out.println("Creating Cat object...");
            Cat nala = new Cat("Nala",6,"Purr!",true);  //creates a cat called nala, superclass constructor is called
            nala.feed();  //super class method
            nala.checkHunger(); //superclass method
            nala.meow();  //cat subclass method
            nala.climb();   //cat subclass method
            nala.nap();  //cat subclass method
             System.out.println("\n\n");
            
            System.out.println("Creating Bird object...");
            Bird paulie = new Bird("Paulie", 18, "Chirp!", false);  //creates a bird called paulie, superclass constructor is called
            paulie.squawk();  //bird subclass method
            paulie.fly();   //bird subclass method
            paulie.nest();  //bird subclass method
             System.out.println("\n\n");
         }
   }