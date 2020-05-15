/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

import bt3.factory.ShapeFactory;
import bt3.shape.Shape;
import bt3.shape.ShapeType;

/**
 *
 * @author My PC
 */
public class BT3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Shape shape = ShapeFactory.createShape(ShapeType.circle);
        System.out.println(shape.draw());
    }
    
}
