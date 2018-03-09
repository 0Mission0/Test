package idv.mission.example;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeTest {

	public static void main(String[] args) {
		List<Object> input1 = new ArrayList<Object>();
		List<String> input2 = new ArrayList<String>();
		
		input1.add("123");
		input2.add("123");

//		fun1(input1);
//		fun2(input1);
//		fun3(input1);
//		fun4(input1, Object.class);
		
		//fun1(input2);	// compile error
		fun2(input2);
		fun3(input2);
		fun4(input2, String.class);
	}
	
	public static void fun1(List<Object> input) {
		Object entry = input.get(0);
		System.out.println(entry.getClass().getName());
	}

	public static <T> void fun2(List<T> input) {
		T entry = input.get(0);
		System.out.println(entry.getClass().getName());
	}

	public static void fun3(List<?> input) {
		Object entry = input.get(0);
		System.out.println(entry.getClass().getName());
	}

	public static void fun4(List<?> input, Class<?> classType) {
		Object entry = input.get(0);
		System.out.println(entry.getClass().getName());
	}
	
}
