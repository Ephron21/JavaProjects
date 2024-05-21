/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn;

/**
 *
 * @author Esron
 */
public class TimeCoplexity {
    public static void main(String args[]){
        TimeComplexity d=new TimeComplexity();
        System.out.println(d.findsum(99999));
        System.out.println((System.currentTimemill())+"Time taken is ");
    }
    public int findsum(int n){
        return n*(n+1)/2;
        
    }
    
}
