package oops;

//Parent class
class Animal {
 public void eat() {
     System.out.println("Animal is eating...");
 }

 public void sleep() {
     System.out.println("Animal is sleeping...");
 }
}

//Child class
class Bird extends Animal {
 // Overriding eat method
 @Override
 public void eat() {
     System.out.println("Bird is pecking food...");
 }

 // Overriding sleep method
 @Override
 public void sleep() {
     System.out.println("Bird is sleeping in its nest...");
 }

 // New method specific to Bird
 public void fly() {
     System.out.println("Bird is flying...");
 }
}

//Main class to test functionality
public class Main4 {
 public static void main(String[] args) {
     // Creating Animal object
     Animal a = new Animal();
     System.out.println("Animal class:");
     a.eat();
     a.sleep();

     System.out.println();

     // Creating Bird object
     Bird b = new Bird();
     System.out.println("Bird class:");
     b.eat();    // overridden
     b.sleep();  // overridden
     b.fly();    // new method
 }
}

