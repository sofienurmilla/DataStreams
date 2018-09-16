/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasDataStreams;

/**
 *
 * @author SOFIE
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class NewFile {
    String awal = "D:/input.txt";
    String akhir = "D:/tugas1.txt";
    
    public void buat() throws IOException
    {
        System.out.println("Masukkan tulisan anda : ");
        InputStream halo = System.in;
        InputStreamReader reader = new InputStreamReader(halo);
        
        BufferedReader hai = new BufferedReader(reader);
        String baca = hai.readLine();
        OutputStream output1 = new FileOutputStream(awal);
        for (int i = 0 ; i < baca.length();i++)
        {
            output1.write((byte)baca.charAt(i));
        }
        output1.close();
    }
    
    public static void main(String[] args) throws IOException {
        NewFile a = new NewFile();
        a.buat();
        a.copy();
    }
    
    public void copy() throws FileNotFoundException, IOException
    {
        InputStream fileinput = new FileInputStream(awal);
        InputStreamReader reader = new InputStreamReader(fileinput);
        
        BufferedReader bufer = new BufferedReader(reader);
        String bacaa = bufer.readLine();
        OutputStream output2 = new FileOutputStream(akhir);
        for (int i = 0 ; i < bacaa.length(); i++)
        {
            output2.write((byte)bacaa.charAt(i));
        }
        output2.close();
    }
}
