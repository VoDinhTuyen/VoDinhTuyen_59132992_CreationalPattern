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
public class Rectangle extends Shape{

    private static Rectangle instance;
    
    public static Rectangle createInstance() {
        
        if(instance == null) {
            instance = new Rectangle();
        }
        return instance;
    }
    
    private Rectangle() {
    }

    @Override
    public String draw() {
        return "Ve hinh chu nhat.";
    }
    
}
