import java.util.Random;

public class nv {
 
 Random random;
 int number;
 
 nv(){
  nn = new Random();
  roll();
 }
 
 void roll() {
  number = nn.nextInt(6)+1;
  System.out.println(number);
 }
}