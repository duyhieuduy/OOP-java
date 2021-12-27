class A {
    private A() {
    }//private constructor
 
    public void msg() {
        System.out.println("Hello java");
    }
}
public class Private_constructor {
    public static void main(String args[]) {
        A obj = new A();//Compile Time Error
    }
}
/* Private Access Modifier chỉ được truy cập trong phạm vi lớp. */
