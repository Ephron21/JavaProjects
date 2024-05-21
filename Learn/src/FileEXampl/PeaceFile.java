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

public class PeaceFile {
    public static void main(String args[]){
        try{
        File p=new File("C:\\phone\\DCIM\\peace\\FileProgram");//create folder
        
        File pr=new File("C:\\phone\\DCIM\\peace\\FileProgram/File1.txt");
        
        p.mkdir();
        pr.createNewFile();
        FileWriter f=new FileWriter("C:\\phone\\DCIM\\peace\\FileProgram/File3.xls");
        f.write("List of province in Rwanda kigali,south,north,west,east ");
        System.out.println("File is created now");
        
        f.close();
        }catch(Exception e){
            System.out.println("error!!!");
            e.printStackTrace();
        }
      
    }
    
}
