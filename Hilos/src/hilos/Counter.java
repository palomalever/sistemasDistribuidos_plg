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
public class Counter {
    private int n =0;
    
    public Counter(int n){
    
    }
    
    public synchronized void aMethod(){  //incrementa 10.
        for(int i =0; i<10; i++){
            n++;
            System.out.print(n + " ");
        }
    }
}
