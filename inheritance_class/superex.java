class Animal {
 
    void eat() {
      System.out.println("I can eat");
    }
 }
 
class Dog extends Animal {
      void eat() {
      super.eat();
      System.out.println("I eat dog food");
   }
 }
 
 class superex {
      public static void main(String[] args) {
       Dog dog1 = new Dog();
 
       dog1.eat();
    }
 }