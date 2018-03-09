package idv.mission.example.annotation;

public class Test {
	
	@MyAnnotation(enable=true)
	public void fun1() {
		System.out.println("This is fun1!");
	}
	
	@MyAnnotation(enable=false)
	public void fun2() {
		System.out.println("This is fun2!");
	}
	
}