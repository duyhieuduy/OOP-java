import java.io.File;

public class  Main {
    public static void main(String[] args) {
    
        File file = new File("C:/Users/HieuPham/Desktop/hieungu.txt");
        if(file.exists()){
            System.out.println("so po rai");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //file.delete();
        }
        else {
            System.out.println("nope");
        }
    }
}
