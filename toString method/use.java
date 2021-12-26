public class use {
    int rollno;
    String name;
    String city;
 
    use(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }
 

    public String toString() {
        return rollno + " " + name + " " + city;
    }
 
    public static void main(String args[]) {
        use s1 = new use(101, "Viet", "HaNoi");
        use s2 = new use(102, "Nam", "DaNang");

        System.out.println(s1);

        System.out.println(s2);
    }
}