
/**
 * Write a description of class StdDrawTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.Color;
public class StdDrawTester {
    public static void main (String [] args) {
        // set up the graphics library 
        StdDraw.setCanvasSize(800,800);
        StdDraw.setXscale (0,100);
        StdDraw.setYscale (0,100);
        StdDraw.enableDoubleBuffering();

        // change colour

        StdDraw.setPenColor(new Color(91,33,135));
        //  draw a line
        StdDraw.line(0,0,50,50);

        // draw a shape
        StdDraw.rectangle(50,50,10,30);

        StdDraw.setPenColor(new Color(0,0,0));
        // draw a filled rectangle
        StdDraw.filledRectangle(25,25,10,10);

        // do animation
        double x = 25;
        double y = 25;
        while (x < 100) {

            // clear screen
            StdDraw.setPenColor(new Color(255,255,255));

            StdDraw.filledRectangle(0,0,100,100);  
            StdDraw.setPenColor(new Color(91,33,135));
            //  draw a line
            StdDraw.line(0,0,50,50);

            // draw a shape
            StdDraw.rectangle(50,50,10,30);

            StdDraw.setPenColor(new Color(0,0,0));
            // draw a filled rectangle
            StdDraw.filledRectangle(25,25,10,10);

            x+=0.1;
            StdDraw.setPenColor(new Color(0,0,0));
            StdDraw.filledRectangle(x,y,10,10);       

            // Show my frame
            StdDraw.show();
            StdDraw.pause(1);
        }

        
    }

}
