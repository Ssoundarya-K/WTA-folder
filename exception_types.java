import java.util.Scanner;
public class exception_types {
    void arithmetic(){
        try{
            int a=10/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
    void null_pointer(){
        try{
            String s = null;
            System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
    }
    void array_out(){
        int a[]=new int[4];
        try{         
           a[20] =4;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    void String_out(){
        try{
            String s="as";
            char ch=s.charAt(20);
            System.out.println(s);
            System.out.println(ch);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    void number_format(){
        try{
            String s="shalini";
            int a = Integer.parseInt(s); 
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }

    public static void main(String a[]){
        exception_types obj = new exception_types();
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the choice:1.Arithmetic\n2.Null Pointer\n3.Array out of bound\n4.String out of bound\n5.Number formatn");
        int choice = st.nextInt();
        switch(choice){
            case 1: obj.arithmetic();
            break;
            case 2: obj.null_pointer();
            break;
            case 3: obj.array_out();
            break;
            case 4: obj.String_out();
            break;
            case 5: obj.number_format();
            break;
            default: System.out.println("Enter correct choice");
            break;
        }
    }
}
