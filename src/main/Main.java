package main;

public class Main {
    
    public static void main(String[] args) {
        Mesa m = new Mesa();
        for (int i = 0; i < 5; i++) {
            Filosofo filosofo = new Filosofo(m, i);
            filosofo.start();
        }
    }
}
