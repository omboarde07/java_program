class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 10; i += 2)
            System.out.println("Even: " + i);
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 11; i <= 20; i += 2)
            System.out.println("Odd: " + i);
    }
}
class EvenOdd
{
public static void main(String args[])
{
EvenThread evenThread = new EvenThread();
OddThread oddThread = new OddThread();
 evenThread.start();
 oddThread.start();
}
}