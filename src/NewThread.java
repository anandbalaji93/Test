public class NewThread extends Thread{
    NewThread() {
        super("My Thread");
        start();
    }
    public void run() {
        System.out.println(this);
    }
}

class MultithreadedProgramming {
    public static void main(String[] args) {
        new NewThread();
    }
}
