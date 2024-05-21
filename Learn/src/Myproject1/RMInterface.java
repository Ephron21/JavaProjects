/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Myproject1;

/**
 *
 * @author Esron
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface RMInterface extends Remote 
{
void sayHello(String name) throws 
RemoteException;
}
