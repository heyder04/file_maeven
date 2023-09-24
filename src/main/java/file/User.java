/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class User implements Serializable {
    public static final long serialVersionUID=1L;
    public String name;
    public transient  String password;
    public int i;
    
}
