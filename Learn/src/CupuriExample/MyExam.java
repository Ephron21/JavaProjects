/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CupuriExample;

/**
 *
 * @author Esron
 */
import java.io.*;

class MyExam {
    public MyExam() {
        try {
            DataInputStream ds = new DataInputStream(System.in);
            System.out.print("Enter a Number: ");
            String s = ds.readLine();
            int a = Integer.parseInt(s);
            for (int i = a; i >= 1; i--) {
                for (int k = i; k >= 1; k--) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
            System.out.println(":) :)");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyExam m = new MyExam();
    }
}
