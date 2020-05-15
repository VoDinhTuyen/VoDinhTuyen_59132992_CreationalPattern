/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3.factory;

import bt3.shape.Circle;
import bt3.shape.Rectangle;
import bt3.shape.Shape;
import bt3.shape.ShapeType;
import bt3.shape.Triangle;

/**
 *
 * @author My PC
 */
public class ShapeFactory {
    
    public static Shape createShape(ShapeType type) {
        
        switch(type) {
            case rectangle: return Rectangle.createInstance();
            case triangle: return Triangle.createInstance();
            case circle: return Circle.createInstance();
        }
        return null;
    }
}
