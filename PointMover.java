
/**
 * Write a description of class PointMover here.
 * 
 * @author: Luis Acevedo-Arreguin 
 * @version: Apr 15, 2014
 */

import javafx.geometry.Point2D;

public class PointMover
{
    public static void main(String[] args) {
        System.out.println("Point2D(0,0),x=1,y=1 moves to" + move(new Point2D(0,0),1,1));
        System.out.println("Point2D(1,2),x=10,y=100 moves to" + move(new Point2D(1,2),10,100));
    }

    public static Point2D move(Point2D pt, double x, double y) {
        double newX = pt.getX()+x;
        double newY = pt.getY()+y;
        return new Point2D(newX, newY);
    }
}
