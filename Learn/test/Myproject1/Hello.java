/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Myproject1;

/**
 *
 * @author Esron
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Esron
 */

/*
Group 5 Java Paradise Members

Bonheur J. IRADUKUNDA: 222005615
Izere Bugingo Vainqueur Beryl: 222019837
ICYEZA NGABO CHRISTAL: 222013903
UMUHOZA KAMANA Nadine: 222013252
Ndizeye Beza Yvan: 222002355
TUYISHIME Ephron: 222005571
Mukunzi Emmanuel: 222019777
*/

import javax.swing.JOptionPane;

class Hello {
    private String firstName;
    private String lastName;

    public void sayHello() {
        firstName = JOptionPane.showInputDialog("Enter your first name:");
        for (int i = 0; i < 5; i++) {
            System.out.println( "Hello " + firstName);
            System.out.println("*****************");
        }
    }

    public void sayHello(String ln) {
        lastName = ln;
        System.out.println( "Hello " + firstName + " " + lastName);
    }
}

class Happy {
    public void sayHello() {
        String firstName = JOptionPane.showInputDialog(null, "Enter your first name:");
        String lastName = JOptionPane.showInputDialog(null, "Enter your last name:");
        JOptionPane.showMessageDialog(null, "Welcome " +firstName +" " + lastName + " to Java Programming Paradize");
    }
}

 class Main {
    public static void main(String[] args) {
        Hello hello = new Hello();
        Happy happy = new Happy();

        // Invoking methods from Hello class
        hello.sayHello();
        hello.sayHello(JOptionPane.showInputDialog("Enter your last name:"));

        // Invoking method from Happy class
        happy.sayHello();
    }
}

