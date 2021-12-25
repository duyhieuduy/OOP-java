import java.util.Random;

public class nv2 {
 
 Random random;
 int number;
 
 nv2(){
  nn = new Random();
  roll();
 }
 
 void roll() {
  number = nn.nextInt(6)+1;
  System.out.println(number);
 }
}