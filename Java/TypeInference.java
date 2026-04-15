package demo;

import java.util.ArrayList;

public class TypeInference {
	public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("Java");
        list2.add("Kotlin");

        System.out.println(list1);
        System.out.println(list2);
    }
}
