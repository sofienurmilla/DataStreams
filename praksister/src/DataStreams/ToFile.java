/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStreams;

/**
 *
 * @author SOFIE
 */
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ToFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String destination = "d:/try.txt";
        OutputStream output = new FileOutputStream(destination);
        System.out.println("Opened "+ destination +" for writing.\n");
        
        InputStream input = System.in;
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader bufReader = new BufferedReader(reader);
        
        System.out.println("Masukkan data !");
        
        String data = bufReader.readLine();
            for(int i = 0; i < data.length(); i++){
                output.write((byte) data.charAt(i));
            }
            output.close();
            System.out.println("\nOutput stream closed");
    }
}
