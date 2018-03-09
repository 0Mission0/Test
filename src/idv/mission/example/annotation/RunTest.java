package idv.mission.example.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RunTest {

	public static void main(String[] args) throws Exception {
		Class<Test> obj = Test.class;
		for (Method method : obj.getDeclaredMethods()) {
			if( method.isAnnotationPresent(MyAnnotation.class) ) {
				Annotation annotation = method.getAnnotation(MyAnnotation.class);
				MyAnnotation myAnnotation = (MyAnnotation) annotation;
				if( myAnnotation.enable() == true ) {
					try {
						method.invoke(obj.newInstance());
						System.out.println(method.getName() + " executed.");
					}
					catch (Throwable ex) {
						System.out.println("Execute " + method.getName() + " failed, Exception: " + ex.getCause());
					}
				}
				else {
					System.out.println(method.getName() + " will not execute.(Annotation Configure)");
				}
			}
		}
	}
	
}