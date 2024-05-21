
package BSTExample;

import javax.swing.JOptionPane;


public class BinarySearch {
    public static void main(String args[]){
        int data=42;
        int n;
        n=Integer.parseInt(JOptionPane.showInputDialog("pls enter the number of element"));
        
        //int []a={15,5,20,35,2,42,67,17};
        int []a=new int [n];
        int m;
        for(m=0;m<n;m++){
            a[m]=Integer.parseInt(JOptionPane.showInputDialog("pls Enter Element"+(m)));
            if(a[m]==data){
                System.out.println("the data you search is:"+a[m]);
                break;
            }
        }
        if(m==n){
            System.out.println("the data you find is not exist in array");
        }
    }
    
}
