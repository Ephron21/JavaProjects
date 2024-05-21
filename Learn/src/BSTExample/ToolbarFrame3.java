/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BSTExample;

/**
 *
 * @author Esron
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ToolbarFrame3 extends Frame {
 JButton cutButton, copyButton, pasteButton;
 JButton javaButton, macButton, motifButton, winButton;
 public ToolbarFrame3( ) {
 super("Toolbar Example (Swing no text)");
 setSize(450, 250);
 addWindowListener(new WindowAdapter( ) {
 @Override
 public void windowClosing(WindowEvent e) {
 System.exit(0);
 }
 });
 // JPanel works much like Panel does, so we'll use it.
 JPanel toolbar = new JPanel( );
 toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));
 CCPHandler handler = new CCPHandler( );
 cutButton = new JButton(new ImageIcon("cut.gif"));
 cutButton.setActionCommand(CCPHandler.CUT);
 cutButton.addActionListener((ActionListener) handler);
 toolbar.add(cutButton);
 copyButton = new JButton(new ImageIcon("copy.gif"));
 copyButton.setActionCommand(CCPHandler.COPY);
 copyButton.addActionListener((ActionListener) handler);
 toolbar.add(copyButton);
 pasteButton = new JButton(new ImageIcon("paste.gif"));
 pasteButton.setActionCommand(CCPHandler.PASTE);
 pasteButton.addActionListener((ActionListener) handler);
 toolbar.add(pasteButton);
 add(toolbar, BorderLayout.NORTH);
 // Add the L&F controls.
 JPanel lnfPanel = new JPanel( );
 LnFListener lnfListener;
     lnfListener = new LnFListener(this);
 macButton = new JButton("Mac");
 macButton.addActionListener((ActionListener) lnfListener);
 lnfPanel.add(macButton);
 javaButton = new JButton("Metal");
 javaButton.addActionListener((ActionListener) lnfListener);
 lnfPanel.add(javaButton);
 motifButton = new JButton("Motif");
 motifButton.addActionListener((ActionListener) lnfListener);
 lnfPanel.add(motifButton);
 winButton = new JButton("Windows");
 winButton.addActionListener((ActionListener) lnfListener);
 lnfPanel.add(winButton);
 add(lnfPanel, BorderLayout.SOUTH);
 }
 public static void main(String args[]) {
 ToolbarFrame3 tf3 = new ToolbarFrame3( );
 tf3.setVisible(true);
 }
}

