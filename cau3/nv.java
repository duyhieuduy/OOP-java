import java.util.Random;

public class nv {
 
 Random nn;
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