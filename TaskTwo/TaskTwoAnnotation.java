import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value= ElementType.TYPE)
@Retention(value= RetentionPolicy.RUNTIME)

public @interface TaskTwoAnnotation {
    String fileName() default "D:/java_work/Test_folder_to/taskTwoAnnot.txt";
}
