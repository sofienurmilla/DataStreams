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
import java.io.IOException;
import javax.swing.JOptionPane;

public class ping {
    public static void ping(String host) throws IOException {
        InetAddress ia = InetAddress.getByName(host);
        System.out.println("Coba: " + host);
        if (ia.isReachable(3000)) {
            System.out.println(ia + " is Reachable");
        } else {
            System.out.println(ia + " is Unreachable");
        }
    }
    public static void main(String[] args) throws IOException {
        String ip = JOptionPane.showInputDialog("Masukkan ip address");
        ping(ip);
    }
}
