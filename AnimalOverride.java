package javaprgm;
class Animal {
	public void makeSound() {	
	  }
}
class Dog extends Animal {
	public void makeSound() {
			System.out.println("Dog can Bark:");
		     }		
}
class Cat extends Animal {
	  public void makeSound() {
		System.out.println("Cat can Meow:");
	   }
}
public class AnimalOverride {
	public static void main(String[] args) {
	Dog dog=new Dog();
	Cat cat=new Cat();
	 dog.makeSound();
	 cat.makeSound();
	}
}
