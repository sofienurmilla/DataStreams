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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamToReaderDemo {
    public static void main(String[] args) {
        try{
            System.out.print("Please enter your name : ");
            InputStream input = System.in;
            InputStreamReader reader = new InputStreamReader(input);
            BufferedReader bufReader = new BufferedReader(reader);
            String name = bufReader.readLine();
            System.out.println("Pleeased to meet you, "+ name);
        }catch (IOException ioe){
            System.err.println("I/O error : "+ioe);
        }
    }
}
