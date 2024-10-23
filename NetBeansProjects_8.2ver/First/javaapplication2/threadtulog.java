/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Timot
 */
import javax.swing.JOptionPane;

public class threadtulog {
    
    public static void main(String[] args) {
        //JOptionPane.showConfirmDialog(null, "bopols kaba?", "Notication", JOptionPane.YES_NO_OPTION);
        //JOptionPane.showInputDialog(null, "bopols kaba?", "Notication", JOptionPane.YES_NO_OPTION);
        //JOptionPane.showMessageDialog(null, "bopols kaba?", "Notication", JOptionPane.YES_NO_OPTION);
        String dot = ".";
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                while(j<5){
                    j++;
                    System.out.print(dot.charAt(0));
                try{
                     Thread.sleep(500);
                } catch (InterruptedException e) {
                      e.printStackTrace();
                }
                }
            }
            System.out.println();
        }
    }
}
