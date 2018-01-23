/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import javatcpsockets.*;
/**
 *
 * @author sdist
 */
class ClientThread extends Thread {
        public ClientThread () {
	}
	public void run(){
         
            String arg[] = new String [1];
            int numero = (int) (Math.random() * 10) + 1; //Cada vez que corre genera un numero aleatorio de 1 a 10
            arg[0] = numero + "";
            TCPClient.main(arg);

          //  System.out.println("Tiempo: " + spentTime);
        }
}

