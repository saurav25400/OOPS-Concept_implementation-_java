
//making class for the students here.
public class Encap_Example {
    public int id;
    public String name;
    public int age;
    private String gf;

    Encap_Example(){}

    Encap_Example(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;

    }
    public void setGf(String gf){
        this.name=gf;

    }
    public String getGf(){
        return this.gf;
    }






}
