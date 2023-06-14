class animal{
    animal(){
        System.out.println("Animal class constructor called");
    }
}
class Lion extends animal{
    Lion(){
        System.out.println("Lion class constructor called");
    }
}
class Species extends Lion{
    Species(){
        System.out.println("Species class constructor called");
    }

    public void close() {
    }
}
public class multilevel {
    public static void main(String a[]){
        Species obj = new Species();
        obj.close();
    }
}
