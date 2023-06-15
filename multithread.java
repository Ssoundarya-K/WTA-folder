import java.util.Random;

class randomInteger extends Thread{
    public void run(){
    Random random = new Random();
    for(int i=0;i<5;i++){
        int a = random.nextInt(1000);
        System.out.println(a);
        if(a%2==0){
            SquareThread s = new SquareThread(a);
            s.start();
        }
        else{
            cubicThread c = new cubicThread(a);
            c.start();
        }
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
}
class SquareThread extends Thread{
    int number;
    SquareThread(int n){
        number = n;
    }
    public void run(){
        System.out.println("Square number:"+(number*number));
    }
}
class cubicThread extends Thread{
    int number;
    cubicThread(int n){
        number = n;
    }
    public void run(){
        System.out.println("Cube number:"+(number*number*number));
    }
}
public class multithread extends Thread{
    public static void main(String a[]){
    randomInteger obj = new randomInteger();
    obj.start();
    }
}
