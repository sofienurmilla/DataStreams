/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasDataStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author SOFIE
 */
public class ToExit {
    public static void main(String[] args) {
        try{
            System.out.println("Masukkan teks. Ketik 'exit' untuk keluar");
            InputStream input = System.in;
            InputStreamReader reader = new InputStreamReader(input);
            BufferedReader bufReader = new BufferedReader(reader);
            
            String data = bufReader.readLine();
            
            for(int i = 0; i < data.length(); i++){
                System.out.println("Anda menulis, "+data+"\n");
                if(data.equalsIgnoreCase("exit")){
                    System.out.println("Terima Kasih");
                    System.exit(0);
                }else{
                    String Data = bufReader.readLine();
                    data = Data;
                }
            }
        }catch(IOException ioe){
            System.out.println("I/O error : "+ioe);
        }
    }
}
