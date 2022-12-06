/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author Gopal Roy
 */
public class Decompress_algos {
    public static void gzDecompress(File file) throws IOException{
         String fileDirectory = file.getParent();
        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzipIS = new GZIPInputStream(fis);
        FileOutputStream fos = new FileOutputStream(fileDirectory + "/Decompressedfile.txt"); 
 
        byte[] buffer = new byte[1024];
  
        int len;
        
        while ((len = gzipIS.read(buffer)) != -1) {
            System.out.println(len);
            fos.write(buffer, 0, len);
        }
        
        gzipIS.close();
        fos.close();
        fis.close();
        System.out.println("It is done");
  
    }
        public static void gzDecompresspng(File file) throws IOException{
         String fileDirectory = file.getParent();
        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzipIS = new GZIPInputStream(fis);
        FileOutputStream fos = new FileOutputStream(fileDirectory + "/Decompressedfile.png"); 
 
        byte[] buffer = new byte[1024];
  
        int len;
        
        while ((len = gzipIS.read(buffer)) != -1) {
            System.out.println(len);
            fos.write(buffer, 0, len);
        }
        
        gzipIS.close();
        fos.close();
        fis.close();
        System.out.println("It is done");
  
    }
        public static void gzDecompresspdf(File file) throws IOException{
         String fileDirectory = file.getParent();
        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzipIS = new GZIPInputStream(fis);
        FileOutputStream fos = new FileOutputStream(fileDirectory + "/Decompressedfile.pdf"); 
 
        byte[] buffer = new byte[1024];
  
        int len;
        
        while ((len = gzipIS.read(buffer)) != -1) {
            System.out.println(len);
            fos.write(buffer, 0, len);
        }
        
        gzipIS.close();
        fos.close();
        fis.close();
        System.out.println("It is done");
  
    }
        public static void gzDecompressmp4(File file) throws IOException{
         String fileDirectory = file.getParent();
        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzipIS = new GZIPInputStream(fis);
        FileOutputStream fos = new FileOutputStream(fileDirectory + "/Decompressedfile.mp4"); 
 
        byte[] buffer = new byte[1024];
  
        int len;
        
        while ((len = gzipIS.read(buffer)) != -1) {
            System.out.println(len);
            fos.write(buffer, 0, len);
        }
        
        gzipIS.close();
        fos.close();
        fis.close();
        System.out.println("It is done");
  
    }
        public static void gzDecompressjpg(File file) throws IOException{
         String fileDirectory = file.getParent();
        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzipIS = new GZIPInputStream(fis);
        FileOutputStream fos = new FileOutputStream(fileDirectory + "/Decompressedfile.jpg"); 
 
        byte[] buffer = new byte[1024];
  
        int len;
        
        while ((len = gzipIS.read(buffer)) != -1) {
            System.out.println(len);
            fos.write(buffer, 0, len);
        }
        
        gzipIS.close();
        fos.close();
        fis.close();
        System.out.println("It is done");
  
    }
    public static void main(String args []){
        
    }
}
