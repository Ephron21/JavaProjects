/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileEXampl;

/**
 *
 * @author Esron
 */

import java.io.*;
public class File1 {
    public static void main(String[] args){
        try{
        File f1=new File("E:\\Java\\cs2");
        File f2=new File("E:\\Java\\cs2\shukul.txt");
        f1.mkdir();
        
        f2.createNewFile();
        FileWriter m=new FileWriter("E:\\Java\\cs2\shukul.txt");
        m.write("hello shukul mungu");
       
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    }
    
