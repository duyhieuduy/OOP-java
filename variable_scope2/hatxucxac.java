import java.util.Random;
public class hatxucxac {
  hatxucxac(){
    Random ngaunhien = new Random();
    int sodaucham = 0;
    lac();
    }
    void lac() {
    sodaucham = ngaunhien.nextInt(6)+1;
    System.out.println(sodaucham);
    }
  }
    //local =  declared inside a method
    //visible only to that method
    //trong vi du: ngẫu nhiên và số dấu chấm
    //được khai báo trong class hatxucxac chỉ
    //chiếm dữ liệu trong class và k thể sử dụng 
    //trong method lac()
    //sửa:
    // Cách 1: vẫn sử dụng biến local
    public class hatxucxac {
      hatxucxac(){
        Random ngaunhien = new Random();
        int sodaucham = 0;
        lac(ngaunhien,sodaucham);
        }
        void lac(Random ngaunhien, int sodaucham) {
        sodaucham = ngaunhien.nextInt(6)+1;
        System.out.println(sodaucham);
        }
      }
    
    //global  = declared outside a method, but within a class
    //visible to all parts of a class
    //Cách 2: sử dụng biến global
    public class hatxucxac {
      
      Random ngaunhien;
      int sodaucham;
      
      hatxucxac(){
        ngaunhien = new Random();
        lac();
        }
        
      void lac() {
        sodaucham = ngaunhien.nextInt(6)+1;
        System.out.println(sodaucham);
        }
      }