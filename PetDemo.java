
public class PetDemo
   {
      public static void main(String[] args)
         {
            Dog bruno = new Dog("Bruno",3,"Bark Bark!\n",true);
            
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
         }
   }