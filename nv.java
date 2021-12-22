public class nv {
    String name;
    String hair;
    double chieucao;
    int iq;
    String face;
    String skill;
    nv(String name, String hair, double chieucao
    , int iq, String face,String skill){
        this.name = name;
        this.hair = hair;
        this.chieucao = chieucao;
        this.iq = iq;
        this.face = face;
        this.skill = skill;
    }
    void hisskill(){
        System.out.println(this.name+" are going to show you the "+this.skill);
    }
}
