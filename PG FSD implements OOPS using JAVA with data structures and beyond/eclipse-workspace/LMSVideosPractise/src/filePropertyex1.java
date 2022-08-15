/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vishnu
 */

import java.io.File;

public class filePropertyex1 {
    public static void main(String[] args){
        String filename = args[0]; // command line argument 
        // when you pass an argument to your main method 
        File f1 = new File(filename);
        System.out.println("Name of the file = " + f1.getName());
        System.out.println("Path of the file = " + f1.getPath());
        System.out.println("Absolute path of the file = " + f1.getAbsolutePath());
        System.out.println("Parent of the file = " + f1.getParent());
        System.out.println("Is file exists = " + f1.exists());
        
        if(f1.exists()){
            System.out.println("Is it writable = " + f1.canWrite());
            System.out.println("Is it readable = " + f1.canRead());
            System.out.println("Is it a directory  = " + f1.isDirectory());
            System.out.println("File size in bytes = " + f1.length());
        }
                
        
        
    }
}
