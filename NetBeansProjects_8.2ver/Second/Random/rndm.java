/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Random;

/**
 *
 * @author Timot
 */
import java.util.Random;
public class rndm {
    public static void main(String[] args){
        Random random = new Random();
        
        int a = random.nextInt(10)*2;
        double b = random.nextDouble();
        boolean c = random.nextBoolean();
        
        System.out.println(a);
        //System.out.println(b);
        System.out.println(c);
    }
}
