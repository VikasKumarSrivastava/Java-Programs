package multithreading_examples;

// 1st Way of defining thread
class Mythread extends Thread{
    public void run(){
        for(int i =0;i<10;i++)
            System.out.println("child thread 1");
    }
}
// 2nd Way of defining thread
class myRunnable implements Runnable{
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println("child thread 2");
        }
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());//Thread[#1,main,5,main]
        System.out.println(Thread.currentThread().getName()); //main
        System.out.println(Thread.currentThread().getPriority());//5
        Runnable r = new myRunnable();
        Thread t = new Thread(r);
        Thread.currentThread().setName("Bhaskar thread");
        System.out.println(t.getName()); //Thread-0
        t.setName("Palwan kalyan");//Palwan kalyan
        System.out.println(t.getName());
        System.out.println(Thread.currentThread().getName());//Bhaskar thread
        t.start();
        Mythread t1 = new Mythread();
        t1.start();
        for(int i =0;i<10;i++) {
            System.out.println("Main thread");
        }
    }
}
//3rd way to define thread using Lambda Expression
//class Main {
//    public static void main(String[] args) {
//        Runnable r = ()->{
//            for (int i =0;i<10;i++){
//                System.out.println("Child thread");
//            }
//        };
//        Thread t = new Thread(r);
//        t.start();
//        for(int i =0;i<10;i++){
//            System.out.println("Main thread");
//        }
//    }
//}
