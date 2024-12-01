package compile_time_folder;

public class Main {

	public static void main(String[] args) {
		MathOperations mathOps = new MathOperations();

        // Demonstrate method overloading (compile-time binding)
        System.out.println("Adding two integers: " + mathOps.add(10, 20));
        System.out.println("Adding three integers: " + mathOps.add(10, 20, 30));
        System.out.println("Adding two doubles: " + mathOps.add(5.5, 4.5));
	}

}
