package demo;

public class NullSafety {
	public static void main(String[] args) {
        String name = null;
        int length = name.length(); // NullPointerException
        System.out.println(length);
    }
}
