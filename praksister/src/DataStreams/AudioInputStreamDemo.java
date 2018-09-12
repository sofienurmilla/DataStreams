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
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class AudioInputStreamDemo {
    public static void main(String[] args) throws Exception {
        String audioFile = "d:/voice.wav";
        InputStream in = new FileInputStream(audioFile);
        
        AudioStream audioStream = new AudioStream(in);
        
        AudioPlayer.player.start(audioStream);
        
    }
    
}
