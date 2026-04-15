package demo;

public class DFParameter {
	public static void main(String[] args) {
		greet("An", "Hi");
		greet("An");
		greet("Hi", "An"); //sai thứ tự
		//greet(name = "An", message = "Hi"); báo lỗi
	}
	
	public static void greet(String name, String message) {
	    System.out.println(message + " " + name);
	}

	public static void greet(String name) {
	    greet(name, "Hello");
	}
}
