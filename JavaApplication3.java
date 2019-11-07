/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication3;

/**
 *
 * @author asus
 */

import javax.swing.*;
import java.awt.event.*;

public abstract class JavaApplication3 implements ActionListener{
    
    private static void createAndShowGUI(){
        // make frame..
        JFrame frame = new JFrame("I am a JFrame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,30,300,100);
        frame.setContentPane().setLayout(null);
        
        JButton but=new JButton("Click me");
        frame.getContentPane().add(but);
        butt.setBounds(20, 20, 200,20);
        
        JavaApplication3 app = new AJavaApplication3() {};
        // make the label
        app.label = new JLabel("nama saya merupakan");
        app.label.setBounds(20,40, 200,20);
        frame.getContentPane().add(app.label);
        
        butt.addActionListener(app);
        frame.setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent e){
        label.setText("ahyar ganteng sekali");
        
    }
    
    public static void main(String[] args){
        
        SwingUtilities.invokeLater(new Runnable(){
        //Memulai Swing GUI
        public void run() {
            CrateAndShowGUI();
            
        }
    });
}
    JLambel label;
}
