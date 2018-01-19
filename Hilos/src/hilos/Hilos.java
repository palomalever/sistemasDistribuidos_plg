/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author sdist
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Counter aCounter = new Counter(0);
        SynchronizedThread hilo1 = new SynchronizedThread(aCounter);
        SynchronizedThread hilo2 = new SynchronizedThread(aCounter);
        
        hilo1.start();
      //  hilo1.join();
        hilo2.start();
    }
    
}
