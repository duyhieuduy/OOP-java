import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        try (FileWriter hieuviet = new FileWriter("file")) {
            hieuviet.write("hieu \t hieungu \t hieupro \t hieungu");
            hieuviet.append("\n byhieu");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}