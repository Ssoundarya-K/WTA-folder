package calc;
import java.util.Scanner;
import subt.*;
public class calculator {
    Scanner s = new Scanner(System.in);
    addit.addition obj = new addit.addition();
    subt.subtraction obj1 = new subtraction();
    public void calculate(){
    System.out.println("Enter two numbers:");
    int a= s.nextInt();
    int b = s.nextInt();
        System.out.println("1.Addition\n2.Subtraction");
        int c = s.nextInt();
        switch(c){
            case 1:System.out.println("Addition:"+obj.addition(a, b));
            break;
            case 2:System.out.println("Difference:"+obj1.subtraction(a, b));
            break;
            default:System.out.println("Enter correct choice");
            break;
        }
    }
}
