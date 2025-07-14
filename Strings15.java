package oops;

import java.util.Optional;

//Define Employee class
class Employee{
 String name;

 public Employee(String name) {
     this.name = name;
 }
}

//Define custom exception
class InvalidEmployeeException extends Exception {
 public InvalidEmployeeException(String message) {
     super(message);
 }
}

public class Strings15{

 public static void main(String[] args) {
     Employee emp = null; // Try with: new Employee("Alice");

     try {
         // Use Optional to check and throw custom exception
         Employee validEmployee = Optional.ofNullable(emp)
                 .orElseThrow(() -> new InvalidEmployeeException("Employee object is null"));

         System.out.println("Employee Name: " + validEmployee.name);

     } catch (InvalidEmployeeException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}

