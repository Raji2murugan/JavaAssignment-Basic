package javaAssignmentBasic;

/**
  3.Create multiple classes in single file and compile and explore how many .class files are generated.
 */

public class MultipleClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is the main method.");
	}
}

class Class2 {
	{
		System.out.println("This is Class2!");
	}
}

class Class3 {
	public static void printMessage() {
		System.out.println("This is Class3!");
	}

}
//Output:3.class file(MultipleClasses.class , Class2.class, Class3.class)