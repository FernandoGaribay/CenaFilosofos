package main;

class MySemaphore {
    private int permits;

    public MySemaphore(int initialPermits) {
        if (initialPermits < 0) {
            throw new IllegalArgumentException("Los permisos no deben ser negativos");
        }
        permits = initialPermits;
    }

    public synchronized void acquire() throws InterruptedException {
        while (permits <= 0) {
            wait();
        }
        permits--;
    }

    public synchronized void release() {
        permits++;
        notifyAll();
    }
}
