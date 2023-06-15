import java.io.IOException;
public class throws_throw{
    void demo()throws IOException{
        throw new IOException("Error");
    }
    public static void main(String a[]){
        try{
            throws_throw obj = new throws_throw();
            obj.demo();
        }
        catch(Exception e){
            System.out.println("Exception is handled in catch block");
        }
    }
}