package oops;
//Main class to test polymorphism
public class Main7 {
 public static void main(String[] args) {
     // Using base class reference to point to subclass objects
     Shape c = new Circle();
     Shape t = new Triangle();
     Shape s = new Square();

     // Polymorphic method calls
     c.draw();
     c.erase();

     t.draw();
     t.erase();

     s.draw();
     s.erase();
 }
}

//Base class
class Shape {
 void draw() {
     System.out.println("Drawing Shape");
 }

 void erase() {
     System.out.println("Erasing Shape");
 }
}

//Subclass Circle
class Circle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing Circle");
 }

 @Override
 void erase() {
     System.out.println("Erasing Circle");
 }
}

//Subclass Triangle
class Triangle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing Triangle");
 }

 @Override
 void erase() {
     System.out.println("Erasing Triangle");
 }
}

//Subclass Square
class Square extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing Square");
 }

 @Override
 void erase() {
     System.out.println("Erasing Square");
 }
}
