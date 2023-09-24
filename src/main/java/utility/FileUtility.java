/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author HP
 */
public class FileUtility {
    public static void fileWrite(String fileName,String text,boolean  append) throws Exception{
        try(FileWriter fw =new FileWriter(fileName,append);
        BufferedWriter bw=new BufferedWriter(fw);){
        bw.write(text);
        }

//          FileWriter fw =new FileWriter(fileName,append);
//        BufferedWriter bw=new BufferedWriter(fw);
//        bw.write(text);
//        bw.close();
        
    }
    
    public static String readFile(String fileName) throws Exception{
       try( InputStream is=new FileInputStream(fileName);
        InputStreamReader r=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(r);){
        String line;
        String result="";
        while((line=br.readLine())!=null){
            result+=line+"\n";
        }
        return result;
       }
    }
    
    public static void writeBytes(String fileName,byte[] data) throws Exception{
        FileOutputStream fop=new FileOutputStream(fileName);
        fop.write(data);
        fop.flush();
        fop.close();
        System.out.println("done");
    }
    
    public static byte[] readBytes(String fileName) throws Exception{
       File file =new File(fileName);
       byte[] bytesArray=new byte[(int) file.length()];
       FileInputStream fileInputStream=new FileInputStream(file);
       fileInputStream.read(bytesArray);
       return bytesArray;
       
    }
    
    public static void writeBytesNio(byte[] data,String fileName)throws Exception{
        Path filePath =Paths.get(fileName);
        Files.write(filePath, data);
    }
    
    public static byte[] readBytesNio(String fileName) throws Exception{
        Path filePath =Paths.get(fileName);
        byte[] byteArray=Files.readAllBytes(filePath);
        return byteArray;
    }
    
    public static Object readFileDeserialize(String name)throws Exception{
        Object obj=null;
        FileInputStream fi=new FileInputStream(name);
        try(ObjectInputStream in =new  ObjectInputStream(fi)) {
            obj=in.readObject();
        }finally{
            return obj;
        }

    }
    
    
    public static void writeObjectToFIle(Serializable object,String name)throws Exception{
                try(FileOutputStream fout=new FileOutputStream(name);
            ObjectOutputStream oos=new ObjectOutputStream(fout);) {
                    oos.writeObject(object);
            }
        
    }    
}
