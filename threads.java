public class threads extends Thread{
    threads(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thread "+Thread.currentThread().getName()+" is running");
    }
    public static void main(String a[]){
        threads t1= new threads("Soundarya");
        t1.start();
        System.out.println("Current thread:"+Thread.currentThread().getName());
        t1.setPriority(MAX_PRIORITY);
        System.out.println("New thread priority is:"+t1.getPriority());
        System.out.println("Main thread priority is:"+Thread.currentThread().getPriority());
        try{
            t1.sleep(2500);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("New thread status is:"+t1.getState());
        System.out.println("Main thread state is:"+Thread.currentThread().getState());
    }
}