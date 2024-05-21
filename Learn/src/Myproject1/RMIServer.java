/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Myproject1;

/**
 *
 * @author Esron
 */import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class RMIServer {
private void startServer(){
try {
// create on port 1099
Registry registry = LocateRegistry.createRegistry(1099);
// create a new service named myMessage
registry.rebind("myMessage", new RMImplement());
} catch (Exception e) {
e.printStackTrace();
} 
System.out.println("system is ready");
}
public static void main(String[] args) {
RMIServer main = new RMIServer();
main.startServer();
}
}
