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

public class FileOutputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String destination = "d:/writedocument.txt";
        OutputStream output = new FileOutputStream(destination);
        System.out.println("Opened "+ destination +" for writing");
        
        String data = "Try to write data using output stream";
        for(int i = 0; i < data.length(); i++){
            output.write((byte) data.charAt(i));
        }
        output.close();
        System.out.println("output stream closed");
    }
    
}
