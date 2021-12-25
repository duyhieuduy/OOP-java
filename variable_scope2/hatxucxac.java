import java.util.Random;

public class hatxucxac {

  hatxucxac(){
  Random ngaunhien = new Random();
  int sodaucham=0;
  lac();
  }
 
void lac() {
  sodaucham = ngaunhien.nextInt(6)+1;
  System.out.println(sodaucham);
  }
}