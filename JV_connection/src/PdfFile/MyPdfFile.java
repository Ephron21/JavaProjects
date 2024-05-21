/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PdfFile;
import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
/**
 *
 * @author Esron
 */
public class MyPdfFile {
    public static void main(String args[]){
        
        Document di=new Document();
        try{
            File fi=new File("C:\\phone\\Documents\\my documents\\documents\\Minefile.pdf");
        PdfWriter p=PdfWriter.getInstance(di,new FileOutputStream(fi));
        di.open();
        Paragraph t=new Paragraph("My journal in UR");
        di.add(t);
        
        }
        catch(Exception et){
        
        System.out.print(et);
        
        }
    }
    
}
