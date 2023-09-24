/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package file;

import java.io.Serializable;
import utility.FileUtility;

/**
 *
 * @author HP
 */
public class File {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
//        FileUtility.fileWrite("firstFile2", "Salamm Heyder");
//          String a=FileUtility.readFile("firstFile2");
//          System.out.println('a'+a);
//         byte[] arr=FileUtility.readBytes("forcv.jpg");
//         FileUtility.writeBytes("photo2.jpg",arr);
//       User u = new User();
//       u.name="Heyder";
//       u.password="Heyder04";
//       FileUtility.writeObjectToFIle( u,"objectfile");
       User u2=(User)FileUtility.readFileDeserialize("objectfile");
        System.out.println(u2.name);
        System.out.println(u2.password);   
    }
    
    
}
