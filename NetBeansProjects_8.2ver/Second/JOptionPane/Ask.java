/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOptionPane;

/**
 *
 * @author Timot
 */
import javax.swing.*;
public class Ask {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog(null, "Enter your name:");
        JOptionPane.showMessageDialog(null, "hello " + name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are youu? "));
        JOptionPane.showMessageDialog(null, "You are " + age);
        
        String loc = JOptionPane.showInputDialog(null, "Where do you live? ");
        JOptionPane.showMessageDialog(null, "You're from " + loc);
        
        String food = JOptionPane.showInputDialog(null, "What is your fave food? ");
        JOptionPane.showMessageDialog(null, "oh "+food + " that was delicious!");
        
        JOptionPane.showMessageDialog(null, "Thank you!!");
    }
}
