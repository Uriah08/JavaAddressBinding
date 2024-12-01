package run_tim_folder;

public class Main {

	public static void main(String[] args) {
		// Create parent reference for Dog
        Animal dog = new Dog();
        // Create parent reference for Cat
        Animal cat = new Cat();

        // Runtime binding (method determined at runtime)
        dog.makeSound(); // Dog barks
        cat.makeSound(); // Cat meows

        // Direct call on the parent class
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound(); // Animal makes a sound
	}

}
