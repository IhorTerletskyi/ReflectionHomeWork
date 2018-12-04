import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        TextContainer tc = new TextContainer("text to save");
        try {
           Class cls = tc.getClass();
           if (cls.isAnnotationPresent(TaskTwoAnnotation.class)) {
               TaskTwoAnnotation tta = (TaskTwoAnnotation) cls.getAnnotation(TaskTwoAnnotation.class);
               String path = (String)tta.fileName();
               Method[] methods = cls.getMethods();
               for (Method method:methods) {
                   if (method.isAnnotationPresent(Save.class)) {
                       method.invoke(tc, path);
                   }
               }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
