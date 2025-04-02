/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SecondProjectUsingAnt;

/**
 *
 * @author shard
 */
public class Animal implements SoundMaker{
    private String Gender;
    
    
    Animal(String Gender){
        this.Gender = Gender;
        
    }
    
    @Override
    public String toString(){
        System.out.println("Inside Animals's toString");
        return "Gender is : " + Gender;
    }
    
    @Override
    public String sound(){
           return "This is a Sound ";
    }
    
    public static void main(String [] args){
        SoundMaker s = new Animal("");
        Dog d = new Dog("Male", "RotWHiller");
        System.out.println(d +  "\n" + d.Sound());
        System.out.println(s.sound());
        
        System.out.println("-----");
        
        Cat c = new Cat("female", "Persia");
        System.out.println(c +  "\n" + c.Sound());
        System.out.println(s.sound());
        
    }
}
