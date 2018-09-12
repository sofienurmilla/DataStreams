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
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
//import javax.swing.JOptionPane;

public class pencarian {
    public static void main(String[] args) throws UnknownHostException, java.lang.SecurityException,IOException {
        System.out.println("Looking up host address : ");
        try{
            String host = "www.google.com";
            
            InetAddress[] ia = InetAddress.getAllByName(host);
            System.out.println("host name : "+ host);
            System.out.println("host address : ");
            for(int ip = 0;ip < ia.length;ip++){
                System.out.println(ia[ip]);
            }
        }catch (UnknownHostException e){
            System.out.println(e);
        }
        
    }
}
