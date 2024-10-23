/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Timot
 */
public class Array {
    String array;
    
    public static void main(String[] args) {
        Array();
    }
    
    public static void Array()
    {
        String [][] array = {
            {"Zero","One","Two","Three","Four"},
            {"0","Uno","Dos","Tres","Kwatro"},
            {"Start","First","Second","Third","Fourth"},
            // horizontally 0 to 4 and vertically 0 to 2 //
        };
        int rows,column;
        for(rows=0; rows < 3; rows++)
        {
            for(column=0; column < 1; column++)
            {
                System.out.println(array[rows][column]);
            }
        }
    }
}
