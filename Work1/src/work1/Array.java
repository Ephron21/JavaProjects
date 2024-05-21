/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work1;
import java.util.Scanner;

/**
 *
 * @author Esron
 */
public class Array {
    public static void main(String args[]){
        int n;
       // JOptionPane.showInputDialog("Enter number of element");
        Scanner st=new Scanner(System.in);
        System.out.print("pls Enter size of array");
        n=st.nextInt();
        int []a=new int[n];
        int i,sum=0;
        float average = 0;
        System.out.print("pls Enter element ");
        for(i=0;i<n;i++){
            a[i]=st.nextInt();
            sum+=a[i];
            average=sum/n;
        }
        System.out.print("sum is \n"+sum+"average is "+ average);

    }

}
