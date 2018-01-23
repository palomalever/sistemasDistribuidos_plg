/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author sdist
 */
public class Launcher {

    public static void main(String args[]) {
       
        int n = 1000;
        for (int i = 0; i < n; i++) {
            ClientThread clientThread = new ClientThread();
            clientThread.start();
        }

        
       
    }

}
