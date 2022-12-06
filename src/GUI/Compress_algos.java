/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author Gopal Roy
 */
public class Compress_algos {
    public static void gzcompress(File file) throws IOException{
        String fileDirectory = file.getParent(); // gets parents of the testing file
        System.out.println(fileDirectory);
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(fileDirectory + "/Compressedfile.gz");    
        GZIPOutputStream gzipOS = new GZIPOutputStream(fos);
  
        byte[] buffer = new byte[1024];
//  
        int len;
//  
        while ((len = fis.read(buffer)) != -1) {
//  
            gzipOS.write(buffer, 0, len);
        }
        gzipOS.close();
        fos.close();
        fis.close();
        System.out.println("It is done");
    }
        public static void zipcompress(File file) throws IOException{
        String fileDirectory = file.getParent(); // gets parents of the testing file
        System.out.println(fileDirectory);
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(fileDirectory + "/Compressedfile.zip");    
        GZIPOutputStream gzipOS = new GZIPOutputStream(fos);
  
        byte[] buffer = new byte[1024];
//  
        int len;
//  
        while ((len = fis.read(buffer)) != -1) {
//  
            gzipOS.write(buffer, 0, len);
        }
        gzipOS.close();
        fos.close();
        fis.close();
        System.out.println("It is done");
    }
    public static void main(String args []){
    
    }
}

