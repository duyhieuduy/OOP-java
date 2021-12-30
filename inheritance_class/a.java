class Cha{
    void in(){
        System.out.println("a012");
    }      
}

class Conme extends Cha{ //cant use class name con() lol 3 fk hour for this bullshit.
    @Override
    void in(){    
        super.in();      
        System.out.println("b345");          
    }   
}
class a {
    public static void main(String[] args) {
        Conme h = new Conme();
        h.in();
    }
}