/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileEXampl;


 import java.io.*;
public class NewFile {
    public static void main(String [] args) {
        try{
        File f1= new File("C:\\phone\\DCIM\\peace\\FileProgram\\mine");
                File f2= new File("C:\\phone\\DCIM\\peace\\FileProgram\\mine/mn.txt");
                 f1.mkdir();
            f2.createNewFile();
       FileWriter f = new FileWriter("C:\\phone\\DCIM\\peace\\FileProgram\\mine/mn.txt");
            f.write("Electricity Billing System\n" +
" Bill No: 32\n" +
" Customer : peace\n" +
" Unit : 5998\n" +
" Discount  : 179.9399999999996\n" +
" Amount : 5818.06\n" +
" Thank you Come Again");
           
            f.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
