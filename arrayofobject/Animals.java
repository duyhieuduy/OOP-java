public class Animals{
    String name;
    int age;
    int iq;
    Animals(String name,int age,int iq){
        this.name=name;
        this.age=age;
        this.iq=iq;
    }
    public String toString(){
        return name + " " + age + " " + iq;
    }
    public static void main(String[] args) {
        Animals animals = new Animals("cho",1,50);
        Animals animals1 = new Animals("meo",3,60);
        Animals animals2 = new Animals("heo",5,70);
        Animals[] zoo = {animals,animals1,animals2};
        System.out.println(zoo[0]);
    }
}