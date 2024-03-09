// Java Utilizes this memory as - 

// When we write a java program then all the variables, methods, etc are stored in the stack memory.
// And when we create any object in the java program then that object was created in the heap memory. And it was referenced from the stack memory.

// instance vs local variable

import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;

class Athlete {
    public String athleteName;
    public double athleteSpeed;
    public int athleteAge;

    public Athlete(String name, double speed, int age ) {
        this.athleteName = name;
        this.athleteSpeed = speed;
        this.athleteAge = age;
    }
}


// Data Encapsulation is an Object-Oriented Programming concept of hiding the data attributes and their behaviours in a single unit.

// constructor
class MyClass {
    private int intValue;
    private String stringValue;

    // default constructor
    public MyClass(){
        this.intValue = 0;
        this.stringValue = "default";
    }

    //parameterised constructor
    public MyClass(int intValue, String stringValue){
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    // copy constructor
    public MyClass(MyClass other){
        this.intValue = other.intValue;
        this.stringValue = other.stringValue;
    }

    // Getter and setter methods (not required for the copy constructor)
    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        MyClass originalObject = new MyClass(42, "Hello");

        // Creating a new object using the copy constructor
        MyClass copiedObject = new MyClass(originalObject);

    }
}

// method overloading / over riding
//overloading
class shapeArea{
    public int area(int l, int b){
        return l * b;
    }

    public int area(int l, int b, int h){
        return l * b * h;
    }
}
//overriding
class Animal {
    public void makeSound(){
        System.out.println("animal sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("woof woof");
    }
}
class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Calls the method in the Animal class

        Dog dog = new Dog();
        dog.makeSound();    // Calls the overridden method in the Dog class
    }
}

// super keyword
// 1 accessing parent class methods
// 2 calling superclass constructor
class Vehicle {
    Vehicle(){
        System.out.println("parent constructor");
    }
    String type = "blueprint";
    void details(){
        System.out.println("iam blueprint");
    }
}
class Bike extends Vehicle {
    Bike(){
        super();
        System.out.println("Bike constructor");
    }
    String type = "two whealer";
    void details(){
        super.details();
    }
}

// static methods - can be overloaded but not overriden 
// static variable
class StaticClass {
    // Static variable
    static int count = 0;

    public StaticClass() {
        // Increment count each time an instance is created
        count++;
    }

    public static void main(String[] args) {
        // Accessing the static variable directly using the class name
        System.out.println("Count: " + StaticClass.count);

        // Creating instances of MyClass
        StaticClass obj1 = new StaticClass();
        StaticClass obj2 = new StaticClass();

        // Accessing the static variable through an instance
        System.out.println("Count: " + obj1.count); // Also prints 2
    }
}
//static method
class MathUtils {
    // Static method to calculate the square of a number
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        // Calling the static method directly using the class name
        int result = MathUtils.square(5);
        System.out.println("Square: " + result); // Prints 25
    }
}
// static nested class
class OuterClass {
    // Static nested class
    static class StaticNestedClass {
        void display() {
            System.out.println("Inside static nested class");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the static nested class
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();

        // Calling the method of the static nested class
        nestedObj.display(); // Prints "Inside static nested class"
    }
}

//shallow copy 
class Box {
    Toy toy;
    // default constructor
    public Box(Toy toy){
        this.toy = toy;
    }
    //shallow copy constructor
    public Box(Box original){
        this.toy = original.toy;
    }
}
class Toy {
    // some toy properties
}
// Shallow copy example
Box originalBox = new Box(new Toy());
Box shallowCopyBox = new Box(originalBox);

//deep copy
class DeepCopyBox{
    DeepCopyToy toy;
    //deep copy constructor
    public DeepCopyBox(DeepCopyBox original){
        this.toy = new DeepCopyToy(original.toy);
    }
}
class DeepCopyToy {
    // Some toy properties
}
// Deep copy example
DeepCopyBox originalDeepCopyBox = new DeepCopyBox(new DeepCopyToy());
DeepCopyBox deepCopyBox = new DeepCopyBox(originalDeepCopyBox);


// singleton class - a singleton class is a class that can have only one instance (object) at a time. 
//The primary purpose of a singleton class is to control the instantiation of the class and ensure that only one instance exists throughout the entire Java Virtual Machine (JVM) at any given time. 
// lazy loading
class SingletonClass {
    private static SingletonClass instance;
    private SingletonClass(){

    }

    public static SingletonClass getInstance() {
        if(instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }
    //other methods
}

//abstract classes 
abstract class Shape {
    //abstract
    public abstract double calculateArea();
    //regular
    public void display(){
        System.out.println("shape class");
    }
}

class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    };
}

//interface
interface iShape{
    //abstract
    public abstract double calculateArea();
    //regular
    public abstract void display();
}
class iCircle implements iShape{
    private double radius;
    public iCircle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    };
    @Override
    public void display(){
        System.out.println("this is shape interface");
    }
}

// threads in java
class MyThread extends Thread{
    public void run(){
        //code to be executed in new thread
    }
}
MyThread myThread = new MyThread();
myThread.start();

class MyRunnable implements Runnable{
    public void run(){
        //
    }
}
Thread myThread2 = new Thread(new MyRunnable());
myThread2.start();

// throw and throws
class testThrow{
    static int testException(int a, int b) throws ArithmeticException {
        if(a==0 || b==0){
            throw new ArithmeticException();
        }
        return a/b;
    }

    public static void main(String args[]){
        try{
            testException(1, 0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}

// composition over inheritance
class Car{
    private Engine engine;

    private List<Wheel> wheels;

    public Car(Engine engine){
        this.engine = engine; //composition
        this.wheels = new ArrayList<>(); //aggregation 
    }

    public void start(){
        System.out.println("car started");
    }
    public void stop(){
        System.out.println("car stopped");
    }
}
class Engine{
    public void start(){
        System.out.println("engine started");
    }
    public void stop(){
        System.out.println("engine stopped");
    }
}
class Wheel{

}

class ElectricEngine extends Engine{

}
class GasEngine extends Engine{

}

public class mCar {
    public static void main(String args[]){
        Engine elecEngine = new ElectricEngine();
        Car eleCar = new Car(elecEngine);   

        Engine gasEngine  = new GasEngine();
        Car gasCar = new Car(gasEngine);

        eleCar.start();
        eleCar.stop();

        gasCar.start();
        gasCar.stop();
    }
}


// synchronization 
// thread safety    
class Counting {
        private int increase_counter;
        public synchronized int increase(){
            increase_counter ++;
            return increase_counter;
        }
}
