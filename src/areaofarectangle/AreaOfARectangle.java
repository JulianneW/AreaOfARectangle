/*
 * Julianne Wojdak
 * 18/09/18
 * Calculate the area of a rectangle
 */

package areaofarectangle;

/**
 *
 * @author JuWoj8013
 */
public class AreaOfARectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variable declaration
        double width=5.7;
        double length=4.8;
        double area=0.0;
        // algorithm for area calc
        area = width * length;
        // system output
        System.out.println("The area of a rectangle when:");
        System.out.println("Width = "+width+"cm");
        System.out.println("Length = "+length+"cm");
        System.out.println("The area is " + area + "cm squared");
        // TODO code application logic here
    }
 }