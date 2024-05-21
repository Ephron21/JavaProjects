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
public class FileDiano {
    public static void main(String[] args) {
        try{
        File f1=new File("C:\\Users\\Esron\\javaPro");
        File f2=new File("C:\\Users\\Esron\\javaPro/Myproj.txt");
        f1.mkdir();
        f2.createNewFile();
        System.out.println("Empty file is created now");
        FileWriter fw1=new FileWriter("C:\\Users\\Esron\\javaPro/shukul.xls");
        fw1.write("ID\t"+" FirstName\t "+"LastName\t"+"PhoneNumber\t"+"Email\t"+"RegNo");
  
       BufferedWriter m=new BufferedWriter(fw1);
       m.write("021\t"+"Diano\t"+"TUYISHIME\t"+"0787846344\t"+"diano21@gmail.com\t"+"221\t");
            fw1.close();
    }catch(Exception e){
        e.printStackTrace();
        
        
    }
    }
    
}
