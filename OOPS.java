import java.util.*;
class Pen {
    String color;
    String type; //ballpoint, gelpoint.

    public void write(){
        System.out.println("Writing Something.");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println("Name: " + this.name + ", "  + "Age: " + this.age);
    }

    //Polymosphisum - complie time - function overloading.
    public void printDetails(String name){
        System.out.println("Name: " + name);
    }

    public void printDetails(int age){
        System.out.println("Age: " + age);
    }

    public void printDetails(String name, int age){
        System.out.println("Name: " + name + ", "  + "Age: " + age);
    }

    //Constructor - parameterised - non-parametrised -- no arguments.
    // Student(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    //     System.out.println("Constructor called.");
    // }

    //Copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
        System.out.println("Strudent Constructor called.");
    }

    //due to a copy constructor default s1 constructor was not defined, we have to do that with a empty one.
    Student(){

    }
}

//Inheritance
//single level.
class  Shape { //-base class - parent class
    String color;
    public void area(){
        System.out.println("Display Area of :-");
    }
}
//single level.
class Triangle extends Shape { //-sub class - child class
    public void area(int h, int b){
            System.out.println("    Triangle: " + (h*b)/2);
    }
}
//multi level.
class EquilateralTriangle extends Triangle {
    public void area(int h, int b){
            System.out.println("    Equilateral Traingle: " + h*b*1/2);
    }
}
//heriarical level.
class Circle extends Shape {
    public void area(double r){
            System.out.println("    Circle: " + (3.14)*r*r);
    }
}
//hybrid level.
//multiple inheritance - implement by interfaces.

class Oops {
    public static void main(String args[]) {
        // Pen example
        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.type = "Gel";
        p1.write();

        Pen p2 = new Pen();
        p2.color = "Black";
        p2.type = "Ball";
        p2.write();

        p1.printColor();
        p2.printColor();

        // Student example
        Student s1 = new Student(); //parametrised constuctor - pass arguments in here.
        s1.name = "Ankit";
        s1.age = 29;

        // Polymosphisum function overloading.
        s1.printDetails(s1.age);
        s1.printDetails(s1.name);
        s1.printDetails(s1.name, s1.age);

        Student s2 = new Student(s1); //calling a copy constructor og object 1.
        s2.printInfo();

        //Shape example

        Triangle t1 = new Triangle();
        t1.area();
        t1.area(4, 2);

        EquilateralTriangle eqT1 = new EquilateralTriangle();
        eqT1.area();
        eqT1.area(10, 10);

        Circle c1 = new Circle();
        c1.area();
        c1.area(1.5);
    }
}