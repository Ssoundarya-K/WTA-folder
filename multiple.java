interface a{
    int x=8;
    void sqrt();
}
interface b{
    int y=25;
    void square();
}
class subclass implements a,b{
    public void sqrt(){
        System.out.println("Sqyare root:"+Math.sqrt(x));
    }
    public void square(){
        System.out.println("Square:"+(y*y));
    }
}
public class multiple {
   public static void main(String a[]){
        subclass obj = new subclass();
        obj.sqrt();
        obj.square();
   } 
}
