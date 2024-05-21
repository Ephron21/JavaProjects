/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn;

/**
 *
 * @author Esron
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter sequences of brackets ");
        Scanner str =  new Scanner(System.in);
        String x = str.next();
//        String x = "(()()()()()()()()())()()()(())";
        int n = 0;
        char[] gfg = x.toCharArray();
        for (int i = 0; i < gfg.length; i++) {
            if(gfg[i] == '('){
                n++;
            }else if(gfg[i] == ')'){
                n--;
            }

            System.out.println(gfg[i]);
        }
        if(n == 0){
            System.out.println("very good");
        }else{
            System.out.println("Very baaad");
        }
    }
}
