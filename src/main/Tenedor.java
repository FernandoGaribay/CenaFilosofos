/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

class Tenedor {
    private MySemaphore semaphore;
    private int id;

    public Tenedor(int id) {
        this.id = id;
        this.semaphore = new MySemaphore(1);
    }

    public void tomar() throws InterruptedException {
        semaphore.acquire();
    }

    public void dejar() {
        semaphore.release();
    }

    @Override
    public String toString() {
        return "Tenedor " + id;
    }
}