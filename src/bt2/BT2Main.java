/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author My PC
 */
public class BT2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyStringBuilder s = new MyStringBuilder.Builder("abc").addString("xyz").addFloat(3).addBool(true).build();
        s.xuatChuoi();
        
    }
    
}
