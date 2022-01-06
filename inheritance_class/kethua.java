class hieu {
    String name;
    //1. vi du them constructor
    hieu(String name){
        this.name=name;
    }
    //....
   
    void firstly(){
        System.out.println(name  + " an com ");
    }
    void second(){
        System.out.println(name + " uong ");
    }
}

class Actives extends hieu{
    //khi ke thua class co constructor 
    //ta phai khai bao lai atribute cua constructor hieu
    //nhu sau:
    Actives(String name) {
        super(name);
        //supper giup sau khi khai bao lai cac 
        //phuong thuc va thuoc tinh cua class cha o class con
        //ma van muon dung o class con 
        //supper o day giup giu lai phuong thuc this.name=name
    }
    //....
    void third(){    
    System.out.println(name + " nam ngu ");
    /* @override 
    void second(){
        System.out.println("hieupro123"); */
    //    super.second();
    // add funtion,code that ya want rewrite
    //}
}
}

//0. ke thua: vao main chi can goi doi tuong cua class Actives()
//k can goi class hieu() de chay firstly() va second()
class kethua{
public static void main(String[] args) {
    Actives h = new Actives("hieu");
    h.firstly();
    h.second();
    h.third();

}
}
    

