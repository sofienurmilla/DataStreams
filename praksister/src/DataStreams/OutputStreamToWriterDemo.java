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
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamToWriterDemo {
    public static void main(String[] args) {
        try{
            OutputStream output = System.out;
            OutputStreamWriter writer = new OutputStreamWriter(output);
            writer.write("Hello World");
            writer.flush();
            writer.close();
        }catch (IOException ioe){
            System.err.println("I/O error : "+ioe);
        }
    }
}
