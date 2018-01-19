
// "contenido", localhost


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaudpsockets;

import java.net.*;
import java.io.*;

public class UDPServer{
	
        public static void main(String args[]){  //La primera vez que lo corremos genera un socket
	DatagramSocket aSocket = null;
	   try{
	    	int serverPort = 6789;
                aSocket = new DatagramSocket(serverPort); 
		byte[] buffer = new byte[1000]; // buffer encapsulará mensajes
 		while(true){
                   System.out.println("Waiting for messages..."); 
 		   DatagramPacket request = new DatagramPacket(buffer, buffer.length); //prepara mi recipiente request
  		   aSocket.receive(request);     //Una vez que recibe una respuesta es un eco.
                   
                   //NO puedes vincular dos sockets al mismo puerto.
    		   DatagramPacket reply = new 
                        DatagramPacket( request.getData(), 
                                        request.getLength(),
                                        request.getAddress(),
                                        request.getPort());
                   
                   System.out.println("Server received a request from "+ request.getAddress());
		   aSocket.send(reply);
		}
	   }
           catch (SocketException e){
                System.out.println("Socket: " + e.getMessage());
	   }
           catch (IOException e) {
               System.out.println("IO: " + e.getMessage());
           }
           finally {
                if(aSocket != null) 
                    aSocket.close();
           }
    }
}
