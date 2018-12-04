import java.io.FileNotFoundException;
import java.io.PrintWriter;

@TaskTwoAnnotation
public class TextContainer {
    private String text;

    public TextContainer(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println(this.text);
    }

    @Save
    public void saveToFile(String path) {
        try (PrintWriter pw= new PrintWriter(path)) {
            pw.println(this.text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
