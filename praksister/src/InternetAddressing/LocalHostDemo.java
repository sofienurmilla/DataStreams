/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternetAddressing;

/**
 *
 * @author SOFIE
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalHostDemo {

    public static void main(String[] args) throws UnknownHostException {
        System.out.println("Looking up local host");
        InetAddress localAddress = InetAddress.getLocalHost();
        System.out.println("Name : "+ InetAddress.getLocalHost());
        System.out.println("IP Address : "+ localAddress.getHostAddress());
        System.out.println(localAddress);
    }
    
}
