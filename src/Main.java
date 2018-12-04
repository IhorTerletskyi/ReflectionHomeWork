import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		try {
			SomeClass some = new SomeClass();
			Method[] methods = SomeClass.class.getDeclaredMethods();
			for (Method method : methods) {
				if (method.isAnnotationPresent(TaskOneAnnotation.class)) {
					TaskOneAnnotation toa = method.getAnnotation(TaskOneAnnotation.class);
					int a = (int)toa.a();
					int b = (int)toa.b();

					method.invoke(some, a,b );

				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}	
}
