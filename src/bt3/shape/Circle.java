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
public class Circle extends Shape{

    private static Circle instance;
    
    public static Circle createInstance() {
        
        if(instance == null) {
            instance = new Circle();
        }
        return instance;
    }

    public Circle() {
    }
    
    @Override
    public String draw() {
    
        return "Ve hinh tron.";
    }
    
}
