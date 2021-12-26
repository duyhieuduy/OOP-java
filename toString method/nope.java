public class nope {
    int rollno;
    String name;
    String city;
 
    nope(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }
 
    public static void main(String args[]) {
        nope s1 = new nope(101, "Viet", "HaNoi");
        nope s2 = new nope(102, "Nam", "DaNang");

        System.out.println(s1); //other wise: System.out.println(s1.rollno);        
        System.out.println(s2); //            System.out.println(s1.name);
    }                           //            System.out.println(s1.city); va tuong tu voi s2
}                              