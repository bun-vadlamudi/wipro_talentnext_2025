package oops;
//Main class to test everything
public class Main6 {
 public static void main(String[] args) {
     // Create Apple and Orange objects
     Fruit apple = new Apple();
     Fruit orange = new Orange();

     // Call eat() method for both
     apple.eat();
     orange.eat();
 }
}

//Base class Fruit
class Fruit {
 String name;
 String taste;
 int size;

 // Method to be overridden
 void eat() {
     System.out.println("This fruit is " + name + " and tastes " + taste);
 }
}

//Subclass Apple
class Apple extends Fruit {
 // Constructor
 Apple() {
     name = "Apple";
     taste = "Sweet";
     size = 5; // arbitrary size value
 }

 // Overriding eat method
 @Override
 void eat() {
     System.out.println("Fruit: " + name + ", Taste: " + taste);
 }
}

//Subclass Orange
class Orange extends Fruit {
 // Constructor
 Orange() {
     name = "Orange";
     taste = "Tangy";
     size = 4;
 }

 // Overriding eat method
 @Override
 void eat() {
     System.out.println("Fruit: " + name + ", Taste: " + taste);
 }
}


