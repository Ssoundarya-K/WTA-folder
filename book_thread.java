public class book_thread implements Runnable{
    static int no_of_books=1;
    synchronized public void run(){
       if(no_of_books>0){
        no_of_books--;
        System.out.println("Confirmed");
       }else{
        System.out.println("Out of stock");
       }
    }

    public static void main(String a[]){
        Thread t1 = new Thread(new book_thread());
        Thread t2 = new Thread(new book_thread());
        Thread t3 = new Thread(new book_thread());
        Thread t4 = new Thread(new book_thread());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
