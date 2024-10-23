package JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Timotg
 */
import javax.swing.JOptionPane;
public class joptionpane {
    public static void main(String[] args){
        
        //String name = JOptionPane.showInputDialog("Enter your name");
        //JOptionPane.showMessageDialog(null, "hello " + name);
        
        //int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        //JOptionPane.showMessageDialog(null, "you are " + age + " years old");
        
        //float number = Float.parseFloat(JOptionPane.showInputDialog("Enter your prelim grade"));
        //JOptionPane.showMessageDialog(null, "wow " + number + " you're bright");
        
        //String food = JOptionPane.showInputDialog("What is your fave food?");
        //JOptionPane.showMessageDialog(null, food + " delicioous");
        
        //JOptionPane.showConfirmDialog(null, "r u dumb?", "NOTIFICATION?", JOptionPane.YES_NO_OPTION);
        //JOptionPane.showMessageDialog(null, "haha tanga");
        
        
        String name = JOptionPane.showInputDialog("Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "hello " + name);
        JOptionPane.showMessageDialog(null, "you are " + age + " years old");
        
        System.out.println("THANK YOU");
        
    }
}
