/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasInternetAddress;

/**
 *
 * @author SOFIE
 */
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class find {
    
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            //InetAddress address = InetAddress.getByName("172.16.1.8");
 
            //Ambil NetworkInterface dari host dan baca alamat hardware (MAC)nya
            NetworkInterface ni = NetworkInterface.getByInetAddress(address);
            if (ni != null) {
                byte[] mac = ni.getHardwareAddress();
                if (mac != null) {
              
                    //Ekstrak setiap array dari mac dan konversi ke hexa
                    //mengikuti format 08-00-27-DC-4A-9E.
                    System.out.print("MAC Address dari " + address + " adalah ");
                    for (int i = 0; i < mac.length; i++) {
                        System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
                    }
                    System.out.println();
                } else {
                    System.out.println("Address tidak ada atau tidak dapat diakses.");
                }
            } else {
                System.out.println("Network Interface untuk alamat tersebut tidak ditemukan.");
            }
        } catch (UnknownHostException e) {
            //e.printStackTrace();
        } catch (SocketException e) {
            //e.printStackTrace();
        }
    }
}
