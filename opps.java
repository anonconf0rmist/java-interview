public class opps {
    
}

// compile time polymorphism // static // method overloading
class Mathops{
    // Method with two int parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with three double parameters
    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String args[]){
        Mathops mathOps = new Mathops();
        mathOps.add(10, 20);
        mathOps.add(5.5, 2.3, 1.7);
    }
}

// run time polymorphism // dynamic // method overloading
class Animal {
    public void voice(){
        System.out.println("some sound");
    }
}

class Dog extends Animal{
    @Override
    public void voice(){
        System.out.println("woof woof");
    }
    public static void main(String args[]){
        Animal dog = new Dog();
        dog.voice(); // woof
    }
}