class circle{
    final double pi = 3.14;
    double r;
    circle(double r){
        this.r=r;
    }
    void calc(){
        System.out.println("Area:"+(pi*r*r));
    }
}
class c1 extends circle{
    c1(double r){
        super(r);
    }
    void calc(){
        System.out.println("Cicrumference:"+(2*super.pi*r));
    }
}
class c2 extends circle{
    c2(double r){
        super(r);
    }
    void calc(){
        System.out.println("radius:"+super.r);
    }
}
public class hierarchial{
    public static void main(String a[]){
        circle c = new circle(3);
        c.calc();
        c1 obj1 = new c1(5);
        obj1.calc();
        c2 obj2 = new c2(2);
        obj2.calc();
    }
}