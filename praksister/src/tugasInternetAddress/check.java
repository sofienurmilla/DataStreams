/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasInternetAddress;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author SOFIE
 */
public class check {
    public static void main(String[] args) throws UnknownHostException, IOException {
        InetAddress localhost = InetAddress.getLocalHost();
        System.out.println(localhost);
        byte[] ip = localhost.getAddress();

        for (int i = 1; i <= 254; i++) {
            ip[3] = (byte) i;
            InetAddress address = InetAddress.getByAddress(ip);
            if (address.isReachable(1000)) {
                System.out.println(address.getHostAddress() + " - Active");
            } else if (!address.getHostAddress().equals(address.getHostName())) {
                System.out.println(address.getHostAddress() + " - DNS lookup known");
            } else {
                System.out.println(address.getHostAddress() + " - Not active");
            }
        }
    }
    
}
