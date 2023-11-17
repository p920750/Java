/************************************************************************************
 * File         :AnimalInterface.java
 * Author       :Praveen Rajan
 * Description  :Java Program Use the Concept of Interface
 * Version      :1.0
 * Date         :10/11/23
 ***********************************************************************************/
package firstprog;
public class AnimalInterface {
public static void main(String[] args) {
    	
    	//fishOne
        Fish f1 = new Fish();
        System.out.println();
        System.out.println("Fish");
        f1.setName("Mimi");
        System.out.println("This Fish's Name is " + f1.getName());
        f1.eat();
        f1.walk();
        
        //fishTwo
        Fish f2 = new Fish();
        f2.setName("Momo");
        System.out.println("This Fish's Name is " + f2.getName());
        
        //cat
        System.out.println();
        System.out.println("Cat");
        Cat c1 = new Cat("Fluffy");
        System.out.println("This Cat's Name is " + c1.getName());
        c1.eat();
        c1.walk();
        Cat c2 = new Cat("Moose");
        System.out.println("This Cat's name is " + c2.getName());
        
        //spider 
        System.out.println();
        System.out.println("Spider");
        Spider s = new Spider();
        s.eat();
        s.walk();
    }
}





//Animal
abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("This Animal Walks on " + legs + " Legs");
    }
}

interface Pet {
    public String getName();
    public void setName(String n);
    public void play();
}


//Fish
class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void play() {
        System.out.println("Fish Swim in their Tanks All Day.");
    }


    public void eat() {
        System.out.println("Fish Eat Plants");
    }
}


//Cat
class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void play() {
        System.out.println(name + " Plays with a Ball of Yarn.");
    }

    public void eat() {
        System.out.println("Cat Eat fishes");
    }
}

//Spider
class Spider extends Animal {
    public Spider() {
        super(8);
    }

    public void eat() {
        System.out.println("Spider Eat Insects");
    }
}
