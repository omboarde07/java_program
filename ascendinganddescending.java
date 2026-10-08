class Ascending extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Ascending: " + i);
        }
    }
}

class Descending extends Thread {
    public void run() {
        for (int i = 50; i >= 1; i--) {
            System.out.println("Descending: " + i);
        }
    }
}
class Main {
    public static void main(String[] args) {
        new Ascending().start();
        new Descending().start();
    }
}
