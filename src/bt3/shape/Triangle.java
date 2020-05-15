/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3.shape;

/**
 *
 * @author My PC
 */
public class Triangle extends Shape{

    private static Triangle instance;
    
    public static Triangle createInstance() {
    
        if(instance == null) {
            instance = new Triangle();
        }
        return instance;
    }

    private Triangle() {
    }
    
    @Override
    public String draw() {
    
        return "Ve hinh tam giac.";
    }
    
}
