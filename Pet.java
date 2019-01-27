/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author pat
 */
public class Pet 
   {
      private String name;
      private int age;
      private String sound;
      private boolean hunger;

      public Pet()   //default constructor
         {
            name = null;
            age = 0;
            sound = null;
            hunger = false; 
         }
         
    
        public Pet(String n, int a, String s, boolean h) //overloaded constructor
         {
            this.name = n;
            this.age = a;
            this.sound = s;
            this.hunger = h;   
            
            System.out.println("Hi, my name is " + this.getName() + ". I am " + this.getAge() + " years old.");
            System.out.println(this.talk()); 
            this.checkHunger();
        }
        
        public void setName(String n)
        {
            name = n;
        }
        
        public void setAge(int a)
        {
            age = a;
        }
        
        public void setSound(String s)
        {
            sound = s;
        }
        
        public void setHunger(boolean h)
        {
            hunger = h;
        }
        
        public int getAge()
        {
            return age;
        }
        
        public boolean getHunger()
        {
            return hunger;
        }
        
        public String getSound()
        {
            return sound;
        }
        
        public String getName()
        {
            return name;
        }
            
        public void feed()
        {
            System.out.println("Feeding " + this.getName() + "...");
            hunger = false;
        }
        
        public void checkHunger()
        {
            if (this.hunger)
               System.out.println("" + this.getName() + " is hungry.");
            else
               System.out.println("" + this.getName() + " is not hungry.");
        }
        
        public String talk()
         {
            return this.getSound();
         }
    
}