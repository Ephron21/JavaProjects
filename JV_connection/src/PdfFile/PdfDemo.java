/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PdfFile;

/**
 *
 * @author Esron
 */
import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfDemo {
public static void main(String args[]) {
Document d=new Document();
try {
File f=new File("C:\\phone\\Documents\\mYproject.pdf");	
PdfWriter pd=PdfWriter.getInstance(d,new FileOutputStream(f));
d.open();
Paragraph p =new Paragraph("Welcome to Java PDF");
d.add(p);
d.addAuthor("Silas");
d.addTitle("Java for PDF");
for (int i=1;i<=100;i++) {
	d.add(new Paragraph(i+". I like Java"));
}
d.close();
System.out.println("PDF File Created!");
}
catch(Exception e) {
System.out.print(e);
}	
}

}