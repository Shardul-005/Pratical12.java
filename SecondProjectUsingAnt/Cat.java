/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SecondProjectUsingAnt;

/**
 *
 * @author shard
 */
public class Cat extends Animal {
    private String Breed;
    
    Cat(String Gender, String Breed){
           super(Gender);
           this.Breed = Breed;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nBreed is : " + Breed;
    }
    
   public String Sound(){
        return "Meow Meow";
    }
}
