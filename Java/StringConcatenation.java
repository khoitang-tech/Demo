package demo;

public class StringConcatenation {
	public static void main(String[] args) {
		String name = "DEMO";
		int age = 36;
		String instrument = "Piano";
		String message = "My name is " + name + ", I am " + age + 
				         " years old, and I play the " + instrument + ".";
		System.out.println(message);
	}
}
