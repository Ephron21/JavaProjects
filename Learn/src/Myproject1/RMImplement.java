/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Myproject1;

/**
 *
 * @author Esron
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class RMImplement extends 
UnicastRemoteObject implements RMInterface{
public RMImplement() throws RemoteException { 
}
@Override//Annotation
public void sayHello(String name) throws 
RemoteException {
System.out.println("hello "+name);
}
}
